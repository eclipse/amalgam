/**
 * <copyright>
 * </copyright>
 *
 * $Id: RequirementItemProvider.java,v 1.1 2008/11/14 17:36:05 rgronback Exp $
 */
package org.eclipse.amalgam.examples.requirements.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.amalgam.examples.requirements.Requirement;
import org.eclipse.amalgam.examples.requirements.RequirementsFactory;
import org.eclipse.amalgam.examples.requirements.RequirementsPackage;
import org.eclipse.amalgam.examples.requirements.Version;
import org.eclipse.amalgam.examples.scenario.ScenarioFactory;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;


/**
 * This is the item provider adapter for a {@link org.eclipse.amalgam.examples.requirements.Requirement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RequirementItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addTitlePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addPriorityPropertyDescriptor(object);
			addAuthorPropertyDescriptor(object);
			addCreatedPropertyDescriptor(object);
			addDependenciesPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addStatePropertyDescriptor(object);
			addResolutionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Requirement_title_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Requirement_title_feature", "_UI_Requirement_type"),
				 RequirementsPackage.Literals.REQUIREMENT__TITLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Requirement_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Requirement_description_feature", "_UI_Requirement_type"),
				 RequirementsPackage.Literals.REQUIREMENT__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Requirement_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Requirement_type_feature", "_UI_Requirement_type"),
				 RequirementsPackage.Literals.REQUIREMENT__TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Priority feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPriorityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Requirement_priority_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Requirement_priority_feature", "_UI_Requirement_type"),
				 RequirementsPackage.Literals.REQUIREMENT__PRIORITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Author feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuthorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Requirement_author_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Requirement_author_feature", "_UI_Requirement_type"),
				 RequirementsPackage.Literals.REQUIREMENT__AUTHOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Created feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreatedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Requirement_created_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Requirement_created_feature", "_UI_Requirement_type"),
				 RequirementsPackage.Literals.REQUIREMENT__CREATED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dependencies feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDependenciesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Requirement_dependencies_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Requirement_dependencies_feature", "_UI_Requirement_type"),
				 RequirementsPackage.Literals.REQUIREMENT__DEPENDENCIES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Requirement_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Requirement_id_feature", "_UI_Requirement_type"),
				 RequirementsPackage.Literals.REQUIREMENT__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Requirement_state_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Requirement_state_feature", "_UI_Requirement_type"),
				 RequirementsPackage.Literals.REQUIREMENT__STATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resolution feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResolutionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Requirement_resolution_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Requirement_resolution_feature", "_UI_Requirement_type"),
				 RequirementsPackage.Literals.REQUIREMENT__RESOLUTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(RequirementsPackage.Literals.REQUIREMENT__CHILDREN);
			childrenFeatures.add(RequirementsPackage.Literals.REQUIREMENT__COMMENTS);
			childrenFeatures.add(RequirementsPackage.Literals.REQUIREMENT__VERSION);
			childrenFeatures.add(RequirementsPackage.Literals.REQUIREMENT__SCENARIO);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Requirement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Requirement"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * Modified to show id (major.minor.service) : title
	 * 
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		StringBuilder sb = new StringBuilder();
		sb.append(((Requirement)object).getId());
		sb.append(" (");
		Version version = ((Requirement)object).getVersion();
		if (version != null) {
			sb.append(((Requirement)object).getVersion().getMajor());
			sb.append(".");
			sb.append(((Requirement)object).getVersion().getMinor());
			sb.append(".");
			sb.append(((Requirement)object).getVersion().getService());
		} else {
			sb.append("0.0.0");
		}
		sb.append(") : ");
		sb.append(((Requirement)object).getTitle());
		String label = sb.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_Requirement_type") : label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Requirement.class)) {
			case RequirementsPackage.REQUIREMENT__TITLE:
			case RequirementsPackage.REQUIREMENT__DESCRIPTION:
			case RequirementsPackage.REQUIREMENT__TYPE:
			case RequirementsPackage.REQUIREMENT__PRIORITY:
			case RequirementsPackage.REQUIREMENT__AUTHOR:
			case RequirementsPackage.REQUIREMENT__CREATED:
			case RequirementsPackage.REQUIREMENT__ID:
			case RequirementsPackage.REQUIREMENT__STATE:
			case RequirementsPackage.REQUIREMENT__RESOLUTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case RequirementsPackage.REQUIREMENT__CHILDREN:
			case RequirementsPackage.REQUIREMENT__COMMENTS:
			case RequirementsPackage.REQUIREMENT__VERSION:
			case RequirementsPackage.REQUIREMENT__SCENARIO:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.REQUIREMENT__CHILDREN,
				 RequirementsFactory.eINSTANCE.createRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.REQUIREMENT__COMMENTS,
				 RequirementsFactory.eINSTANCE.createComment()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.REQUIREMENT__VERSION,
				 RequirementsFactory.eINSTANCE.createVersion()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.REQUIREMENT__SCENARIO,
				 ScenarioFactory.eINSTANCE.createProcess()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return requirementsEditPlugin.INSTANCE;
	}

}
