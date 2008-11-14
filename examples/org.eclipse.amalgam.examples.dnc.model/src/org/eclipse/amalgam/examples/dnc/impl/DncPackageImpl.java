/**
 * <copyright>
 * </copyright>
 *
 * $Id: DncPackageImpl.java,v 1.1 2008/11/14 17:31:42 rgronback Exp $
 */
package org.eclipse.amalgam.examples.dnc.impl;

import org.eclipse.amalgam.examples.dnc.Archetype;
import org.eclipse.amalgam.examples.dnc.Association;
import org.eclipse.amalgam.examples.dnc.Description;
import org.eclipse.amalgam.examples.dnc.DncFactory;
import org.eclipse.amalgam.examples.dnc.DncPackage;
import org.eclipse.amalgam.examples.dnc.MIDetail;
import org.eclipse.amalgam.examples.dnc.MomentInterval;
import org.eclipse.amalgam.examples.dnc.Party;
import org.eclipse.amalgam.examples.dnc.Place;
import org.eclipse.amalgam.examples.dnc.PluginPoint;
import org.eclipse.amalgam.examples.dnc.Role;
import org.eclipse.amalgam.examples.dnc.Thing;
import org.eclipse.amalgam.examples.oocore.OocorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DncPackageImpl extends EPackageImpl implements DncPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass archetypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass momentIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass miDetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pluginPointEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.amalgam.examples.dnc.DncPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DncPackageImpl() {
		super(eNS_URI, DncFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DncPackage init() {
		if (isInited) return (DncPackage)EPackage.Registry.INSTANCE.getEPackage(DncPackage.eNS_URI);

		// Obtain or create and register package
		DncPackageImpl theDncPackage = (DncPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof DncPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new DncPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		OocorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDncPackage.createPackageContents();

		// Initialize created meta-data
		theDncPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDncPackage.freeze();

		return theDncPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArchetype() {
		return archetypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchetype_Description() {
		return (EAttribute)archetypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociation() {
		return associationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociation_Aggregation() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMomentInterval() {
		return momentIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMIDetail() {
		return miDetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescription() {
		return descriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParty() {
		return partyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlace() {
		return placeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThing() {
		return thingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPluginPoint() {
		return pluginPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DncFactory getDncFactory() {
		return (DncFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		archetypeEClass = createEClass(ARCHETYPE);
		createEAttribute(archetypeEClass, ARCHETYPE__DESCRIPTION);

		associationEClass = createEClass(ASSOCIATION);
		createEAttribute(associationEClass, ASSOCIATION__AGGREGATION);

		momentIntervalEClass = createEClass(MOMENT_INTERVAL);

		miDetailEClass = createEClass(MI_DETAIL);

		roleEClass = createEClass(ROLE);

		descriptionEClass = createEClass(DESCRIPTION);

		partyEClass = createEClass(PARTY);

		placeEClass = createEClass(PLACE);

		thingEClass = createEClass(THING);

		pluginPointEClass = createEClass(PLUGIN_POINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		OocorePackage theOocorePackage = (OocorePackage)EPackage.Registry.INSTANCE.getEPackage(OocorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		archetypeEClass.getESuperTypes().add(theOocorePackage.getClass_());
		associationEClass.getESuperTypes().add(theOocorePackage.getReference());
		momentIntervalEClass.getESuperTypes().add(this.getArchetype());
		miDetailEClass.getESuperTypes().add(this.getArchetype());
		roleEClass.getESuperTypes().add(this.getArchetype());
		descriptionEClass.getESuperTypes().add(this.getArchetype());
		partyEClass.getESuperTypes().add(this.getArchetype());
		placeEClass.getESuperTypes().add(this.getArchetype());
		thingEClass.getESuperTypes().add(this.getArchetype());
		pluginPointEClass.getESuperTypes().add(this.getArchetype());

		// Initialize classes and features; add operations and parameters
		initEClass(archetypeEClass, Archetype.class, "Archetype", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArchetype_Description(), ecorePackage.getEString(), "description", null, 0, 1, Archetype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associationEClass, Association.class, "Association", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssociation_Aggregation(), ecorePackage.getEBoolean(), "aggregation", null, 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(momentIntervalEClass, MomentInterval.class, "MomentInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(miDetailEClass, MIDetail.class, "MIDetail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(descriptionEClass, Description.class, "Description", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(partyEClass, Party.class, "Party", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(placeEClass, Place.class, "Place", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(thingEClass, Thing.class, "Thing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pluginPointEClass, PluginPoint.class, "PluginPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //DncPackageImpl
