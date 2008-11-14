/**
 * <copyright>
 * </copyright>
 *
 * $Id: RequirementImpl.java,v 1.1 2008/11/14 17:35:37 rgronback Exp $
 */
package org.eclipse.amalgam.examples.requirements.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.amalgam.examples.requirements.Comment;
import org.eclipse.amalgam.examples.requirements.Priority;
import org.eclipse.amalgam.examples.requirements.Requirement;
import org.eclipse.amalgam.examples.requirements.RequirementsPackage;
import org.eclipse.amalgam.examples.requirements.Resolution;
import org.eclipse.amalgam.examples.requirements.State;
import org.eclipse.amalgam.examples.requirements.Type;
import org.eclipse.amalgam.examples.requirements.Version;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.examples.requirements.impl.RequirementImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.amalgam.examples.requirements.impl.RequirementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.amalgam.examples.requirements.impl.RequirementImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.amalgam.examples.requirements.impl.RequirementImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.eclipse.amalgam.examples.requirements.impl.RequirementImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.eclipse.amalgam.examples.requirements.impl.RequirementImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.eclipse.amalgam.examples.requirements.impl.RequirementImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.eclipse.amalgam.examples.requirements.impl.RequirementImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.eclipse.amalgam.examples.requirements.impl.RequirementImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.amalgam.examples.requirements.impl.RequirementImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.eclipse.amalgam.examples.requirements.impl.RequirementImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.amalgam.examples.requirements.impl.RequirementImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.amalgam.examples.requirements.impl.RequirementImpl#getState <em>State</em>}</li>
 *   <li>{@link org.eclipse.amalgam.examples.requirements.impl.RequirementImpl#getResolution <em>Resolution</em>}</li>
 *   <li>{@link org.eclipse.amalgam.examples.requirements.impl.RequirementImpl#getScenario <em>Scenario</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequirementImpl extends EObjectImpl implements Requirement {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final Type TYPE_EDEFAULT = Type.FUNCTIONAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> children;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final Priority PRIORITY_EDEFAULT = Priority.HIGH;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected Priority priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected Date created = CREATED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> comments;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected Version version;

	/**
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> dependencies;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final State STATE_EDEFAULT = State.NEW;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected State state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected static final Resolution RESOLUTION_EDEFAULT = Resolution.INVALID;

	/**
	 * The cached value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected Resolution resolution = RESOLUTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getScenario() <em>Scenario</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenario()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.amalgam.examples.scenario.Process scenario;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENT__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getChildren() {
		if (children == null) {
			children = new EObjectContainmentWithInverseEList<Requirement>(Requirement.class, this, RequirementsPackage.REQUIREMENT__CHILDREN, RequirementsPackage.REQUIREMENT__PARENT);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Priority getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(Priority newPriority) {
		Priority oldPriority = priority;
		priority = newPriority == null ? PRIORITY_EDEFAULT : newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENT__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENT__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreated(Date newCreated) {
		Date oldCreated = created;
		created = newCreated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENT__CREATED, oldCreated, created));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comment> getComments() {
		if (comments == null) {
			comments = new EObjectContainmentEList<Comment>(Comment.class, this, RequirementsPackage.REQUIREMENT__COMMENTS);
		}
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersion(Version newVersion, NotificationChain msgs) {
		Version oldVersion = version;
		version = newVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENT__VERSION, oldVersion, newVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(Version newVersion) {
		if (newVersion != version) {
			NotificationChain msgs = null;
			if (version != null)
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RequirementsPackage.REQUIREMENT__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RequirementsPackage.REQUIREMENT__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENT__VERSION, newVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getDependencies() {
		if (dependencies == null) {
			dependencies = new EObjectResolvingEList<Requirement>(Requirement.class, this, RequirementsPackage.REQUIREMENT__DEPENDENCIES);
		}
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement getParent() {
		if (eContainerFeatureID != RequirementsPackage.REQUIREMENT__PARENT) return null;
		return (Requirement)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Requirement newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, RequirementsPackage.REQUIREMENT__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Requirement newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID != RequirementsPackage.REQUIREMENT__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, RequirementsPackage.REQUIREMENT__CHILDREN, Requirement.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENT__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(State newState) {
		State oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENT__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resolution getResolution() {
		return resolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolution(Resolution newResolution) {
		Resolution oldResolution = resolution;
		resolution = newResolution == null ? RESOLUTION_EDEFAULT : newResolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENT__RESOLUTION, oldResolution, resolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.amalgam.examples.scenario.Process getScenario() {
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScenario(org.eclipse.amalgam.examples.scenario.Process newScenario, NotificationChain msgs) {
		org.eclipse.amalgam.examples.scenario.Process oldScenario = scenario;
		scenario = newScenario;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENT__SCENARIO, oldScenario, newScenario);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScenario(org.eclipse.amalgam.examples.scenario.Process newScenario) {
		if (newScenario != scenario) {
			NotificationChain msgs = null;
			if (scenario != null)
				msgs = ((InternalEObject)scenario).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RequirementsPackage.REQUIREMENT__SCENARIO, null, msgs);
			if (newScenario != null)
				msgs = ((InternalEObject)newScenario).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RequirementsPackage.REQUIREMENT__SCENARIO, null, msgs);
			msgs = basicSetScenario(newScenario, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENT__SCENARIO, newScenario, newScenario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RequirementsPackage.REQUIREMENT__CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Requirement)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RequirementsPackage.REQUIREMENT__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__COMMENTS:
				return ((InternalEList<?>)getComments()).basicRemove(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__VERSION:
				return basicSetVersion(null, msgs);
			case RequirementsPackage.REQUIREMENT__PARENT:
				return basicSetParent(null, msgs);
			case RequirementsPackage.REQUIREMENT__SCENARIO:
				return basicSetScenario(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case RequirementsPackage.REQUIREMENT__PARENT:
				return eInternalContainer().eInverseRemove(this, RequirementsPackage.REQUIREMENT__CHILDREN, Requirement.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequirementsPackage.REQUIREMENT__TITLE:
				return getTitle();
			case RequirementsPackage.REQUIREMENT__DESCRIPTION:
				return getDescription();
			case RequirementsPackage.REQUIREMENT__TYPE:
				return getType();
			case RequirementsPackage.REQUIREMENT__CHILDREN:
				return getChildren();
			case RequirementsPackage.REQUIREMENT__PRIORITY:
				return getPriority();
			case RequirementsPackage.REQUIREMENT__AUTHOR:
				return getAuthor();
			case RequirementsPackage.REQUIREMENT__CREATED:
				return getCreated();
			case RequirementsPackage.REQUIREMENT__COMMENTS:
				return getComments();
			case RequirementsPackage.REQUIREMENT__VERSION:
				return getVersion();
			case RequirementsPackage.REQUIREMENT__DEPENDENCIES:
				return getDependencies();
			case RequirementsPackage.REQUIREMENT__ID:
				return getId();
			case RequirementsPackage.REQUIREMENT__PARENT:
				return getParent();
			case RequirementsPackage.REQUIREMENT__STATE:
				return getState();
			case RequirementsPackage.REQUIREMENT__RESOLUTION:
				return getResolution();
			case RequirementsPackage.REQUIREMENT__SCENARIO:
				return getScenario();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RequirementsPackage.REQUIREMENT__TITLE:
				setTitle((String)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__TYPE:
				setType((Type)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Requirement>)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__PRIORITY:
				setPriority((Priority)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__AUTHOR:
				setAuthor((String)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__CREATED:
				setCreated((Date)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__COMMENTS:
				getComments().clear();
				getComments().addAll((Collection<? extends Comment>)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__VERSION:
				setVersion((Version)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection<? extends Requirement>)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__ID:
				setId((String)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__PARENT:
				setParent((Requirement)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__STATE:
				setState((State)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__RESOLUTION:
				setResolution((Resolution)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__SCENARIO:
				setScenario((org.eclipse.amalgam.examples.scenario.Process)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RequirementsPackage.REQUIREMENT__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case RequirementsPackage.REQUIREMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case RequirementsPackage.REQUIREMENT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case RequirementsPackage.REQUIREMENT__CHILDREN:
				getChildren().clear();
				return;
			case RequirementsPackage.REQUIREMENT__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case RequirementsPackage.REQUIREMENT__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case RequirementsPackage.REQUIREMENT__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case RequirementsPackage.REQUIREMENT__COMMENTS:
				getComments().clear();
				return;
			case RequirementsPackage.REQUIREMENT__VERSION:
				setVersion((Version)null);
				return;
			case RequirementsPackage.REQUIREMENT__DEPENDENCIES:
				getDependencies().clear();
				return;
			case RequirementsPackage.REQUIREMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case RequirementsPackage.REQUIREMENT__PARENT:
				setParent((Requirement)null);
				return;
			case RequirementsPackage.REQUIREMENT__STATE:
				setState(STATE_EDEFAULT);
				return;
			case RequirementsPackage.REQUIREMENT__RESOLUTION:
				setResolution(RESOLUTION_EDEFAULT);
				return;
			case RequirementsPackage.REQUIREMENT__SCENARIO:
				setScenario((org.eclipse.amalgam.examples.scenario.Process)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RequirementsPackage.REQUIREMENT__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case RequirementsPackage.REQUIREMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case RequirementsPackage.REQUIREMENT__TYPE:
				return type != TYPE_EDEFAULT;
			case RequirementsPackage.REQUIREMENT__CHILDREN:
				return children != null && !children.isEmpty();
			case RequirementsPackage.REQUIREMENT__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case RequirementsPackage.REQUIREMENT__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case RequirementsPackage.REQUIREMENT__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case RequirementsPackage.REQUIREMENT__COMMENTS:
				return comments != null && !comments.isEmpty();
			case RequirementsPackage.REQUIREMENT__VERSION:
				return version != null;
			case RequirementsPackage.REQUIREMENT__DEPENDENCIES:
				return dependencies != null && !dependencies.isEmpty();
			case RequirementsPackage.REQUIREMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case RequirementsPackage.REQUIREMENT__PARENT:
				return getParent() != null;
			case RequirementsPackage.REQUIREMENT__STATE:
				return state != STATE_EDEFAULT;
			case RequirementsPackage.REQUIREMENT__RESOLUTION:
				return resolution != RESOLUTION_EDEFAULT;
			case RequirementsPackage.REQUIREMENT__SCENARIO:
				return scenario != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (title: ");
		result.append(title);
		result.append(", description: ");
		result.append(description);
		result.append(", type: ");
		result.append(type);
		result.append(", priority: ");
		result.append(priority);
		result.append(", author: ");
		result.append(author);
		result.append(", created: ");
		result.append(created);
		result.append(", id: ");
		result.append(id);
		result.append(", state: ");
		result.append(state);
		result.append(", resolution: ");
		result.append(resolution);
		result.append(')');
		return result.toString();
	}

} //RequirementImpl
