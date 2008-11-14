package org.eclipse.amalgam.examples.dnc.diagram.providers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.AttributeEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.part.DncVisualIDRegistry;
import org.eclipse.amalgam.examples.oocore.Attribute;
import org.eclipse.amalgam.examples.oocore.Datatype;
import org.eclipse.amalgam.examples.oocore.OocorePackage;
import org.eclipse.amalgam.examples.oocore.PackageableElement;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserEditStatus;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserEditStatus;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ISemanticParser;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;

public class AttributeParserProvider extends AbstractProvider implements IParserProvider {

	private IParser myParser;

	public IParser getParser(IAdaptable hint) {
		if (myParser == null) {
			myParser = new ISemanticParser() {

				public IContentAssistProcessor getCompletionProcessor(IAdaptable element) {
					return null;
				}

				public String getEditString(IAdaptable element, int flags) {
					Attribute attribute = getAttribute(element);
					return attribute.getName() != null ? attribute.getName() + ":" + (attribute.getDataType() != null ? attribute.getDataType().getName() : "") : "";
				}

				public ICommand getParseCommand(IAdaptable element, final String newString, int flags) {
					int index = newString.indexOf(":");
					final String name;
					final String typeName;
					if (index == 0) {
						name = "";
						typeName = newString.substring(index + 1);
					} else if (index > 0) {
						name = newString.substring(0, index).trim();
						typeName = newString.substring(index + 1).trim();
					} else if (index == -1 && newString.length() > 0) {
						name = newString;
						typeName = "";
					} else {
						name = "";
						typeName = "";
					}

					final Attribute attribute = getAttribute(element);
					final Datatype dataType = findType(typeName, attribute);

					TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(attribute);
					return new AbstractTransactionalCommand(editingDomain, "", Collections.singletonList(WorkspaceSynchronizer.getFile(attribute.eResource()))) {

						@Override
						protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
							if (newString.length() == 0) {
								return CommandResult.newErrorCommandResult("Invalid input");
							}
							attribute.setName(name);
							attribute.setDataType(dataType);
							return CommandResult.newOKCommandResult();
						}

					};
				}

				private Datatype findType(final String typeName, final Attribute attribute) {
					Datatype type = null;
					if (typeName.length() > 0) {
						EList<Resource> resources = attribute.eResource().getResourceSet().getResources();
						for (Resource resource : resources) {
							for (EObject object : resource.getContents()) {
								if (object instanceof org.eclipse.amalgam.examples.oocore.Package) {
									type = findInPackage((org.eclipse.amalgam.examples.oocore.Package) object, typeName);
									if (type != null)
										return type;
								}
							}
						}
					}
					return type;
				}

				private Datatype findInPackage(org.eclipse.amalgam.examples.oocore.Package pkg, String typeName) {
					for (PackageableElement element : pkg.getContents()) {
						if (element instanceof Datatype && typeName.equals(element.getName())) {
							return (Datatype) element;
						}
						if (element instanceof org.eclipse.amalgam.examples.oocore.Package) {
							return findInPackage((org.eclipse.amalgam.examples.oocore.Package) element, typeName);
						}
					}
					return null;
				}

				public String getPrintString(IAdaptable element, int flags) {
					String printString = getEditString(element, flags);
					return printString.length() == 0 ? "<<...>>" : printString;
				}

				public boolean isAffectingEvent(Object event, int flags) {
					if (event instanceof Notification) {
						Notification emfNotification = (Notification) event;
						return !emfNotification.isTouch()
								&& (emfNotification.getFeature() == OocorePackage.eINSTANCE.getNamedElement_Name() || emfNotification.getFeature() == OocorePackage.eINSTANCE.getAttribute_DataType());
					}
					return false;
				}

				public IParserEditStatus isValidEditString(IAdaptable element, String editString) {
					return ParserEditStatus.EDITABLE_STATUS;
				}

				private Attribute getAttribute(IAdaptable adaptable) {
					return (Attribute) adaptable.getAdapter(EObject.class);
				}

				public boolean areSemanticElementsAffected(EObject listener, Object notification) {
					if (notification instanceof Notification) {
						Notification emfNotification = (Notification) notification;
						return !emfNotification.isTouch()
								&& (emfNotification.getFeature() == OocorePackage.eINSTANCE.getAttribute() || emfNotification.getFeature() == OocorePackage.eINSTANCE.getDatatype());
					}
					return false;
				}

				public List<EObject> getSemanticElementsBeingParsed(EObject element) {
					List<EObject> result = new ArrayList<EObject>();
					if (element instanceof Attribute) {
						result.add(element);
					}
					return result;
				}

			};
		}
		return myParser;
	}

	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			String visualID = (String) hint.getAdapter(String.class);
			return AttributeEditPart.VISUAL_ID == DncVisualIDRegistry.getVisualID(visualID) && hint.getAdapter(EObject.class) instanceof Attribute;
		}
		return false;
	}
}
