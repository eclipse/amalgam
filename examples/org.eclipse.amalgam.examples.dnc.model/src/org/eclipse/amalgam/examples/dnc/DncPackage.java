/**
 * <copyright>
 * </copyright>
 *
 * $Id: DncPackage.java,v 1.1 2008/11/14 17:31:42 rgronback Exp $
 */
package org.eclipse.amalgam.examples.dnc;

import org.eclipse.amalgam.examples.oocore.OocorePackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;


/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.amalgam.examples.dnc.DncFactory
 * @model kind="package"
 * @generated
 */
public interface DncPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dnc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/2008/dnc";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dnc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DncPackage eINSTANCE = org.eclipse.amalgam.examples.dnc.impl.DncPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.examples.dnc.impl.ArchetypeImpl <em>Archetype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.examples.dnc.impl.ArchetypeImpl
	 * @see org.eclipse.amalgam.examples.dnc.impl.DncPackageImpl#getArchetype()
	 * @generated
	 */
	int ARCHETYPE = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__ANNOTATIONS = OocorePackage.CLASS__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__NAME = OocorePackage.CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__PACKAGE = OocorePackage.CLASS__PACKAGE;

	/**
	 * The feature id for the '<em><b>Superclasses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__SUPERCLASSES = OocorePackage.CLASS__SUPERCLASSES;

	/**
	 * The feature id for the '<em><b>Subclasses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__SUBCLASSES = OocorePackage.CLASS__SUBCLASSES;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__FEATURES = OocorePackage.CLASS__FEATURES;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__ABSTRACT = OocorePackage.CLASS__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__INTERFACE = OocorePackage.CLASS__INTERFACE;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__OPERATIONS = OocorePackage.CLASS__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__DESCRIPTION = OocorePackage.CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Archetype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_FEATURE_COUNT = OocorePackage.CLASS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.examples.dnc.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.examples.dnc.impl.AssociationImpl
	 * @see org.eclipse.amalgam.examples.dnc.impl.DncPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ANNOTATIONS = OocorePackage.REFERENCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__NAME = OocorePackage.REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__UPPER_BOUND = OocorePackage.REFERENCE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__LOWER_BOUND = OocorePackage.REFERENCE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TYPE = OocorePackage.REFERENCE__TYPE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__VISIBILITY = OocorePackage.REFERENCE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__REQUIRED = OocorePackage.REFERENCE__REQUIRED;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OWNER = OocorePackage.REFERENCE__OWNER;

	/**
	 * The feature id for the '<em><b>Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__CONTAINMENT = OocorePackage.REFERENCE__CONTAINMENT;

	/**
	 * The feature id for the '<em><b>Bidirectional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__BIDIRECTIONAL = OocorePackage.REFERENCE__BIDIRECTIONAL;

	/**
	 * The feature id for the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OPPOSITE = OocorePackage.REFERENCE__OPPOSITE;

	/**
	 * The feature id for the '<em><b>Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__AGGREGATION = OocorePackage.REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = OocorePackage.REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.examples.dnc.impl.MomentIntervalImpl <em>Moment Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.examples.dnc.impl.MomentIntervalImpl
	 * @see org.eclipse.amalgam.examples.dnc.impl.DncPackageImpl#getMomentInterval()
	 * @generated
	 */
	int MOMENT_INTERVAL = 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOMENT_INTERVAL__ANNOTATIONS = ARCHETYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOMENT_INTERVAL__NAME = ARCHETYPE__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOMENT_INTERVAL__PACKAGE = ARCHETYPE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Superclasses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOMENT_INTERVAL__SUPERCLASSES = ARCHETYPE__SUPERCLASSES;

	/**
	 * The feature id for the '<em><b>Subclasses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOMENT_INTERVAL__SUBCLASSES = ARCHETYPE__SUBCLASSES;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOMENT_INTERVAL__FEATURES = ARCHETYPE__FEATURES;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOMENT_INTERVAL__ABSTRACT = ARCHETYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOMENT_INTERVAL__INTERFACE = ARCHETYPE__INTERFACE;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOMENT_INTERVAL__OPERATIONS = ARCHETYPE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOMENT_INTERVAL__DESCRIPTION = ARCHETYPE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Moment Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOMENT_INTERVAL_FEATURE_COUNT = ARCHETYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.examples.dnc.impl.MIDetailImpl <em>MI Detail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.examples.dnc.impl.MIDetailImpl
	 * @see org.eclipse.amalgam.examples.dnc.impl.DncPackageImpl#getMIDetail()
	 * @generated
	 */
	int MI_DETAIL = 3;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MI_DETAIL__ANNOTATIONS = ARCHETYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MI_DETAIL__NAME = ARCHETYPE__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MI_DETAIL__PACKAGE = ARCHETYPE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Superclasses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MI_DETAIL__SUPERCLASSES = ARCHETYPE__SUPERCLASSES;

	/**
	 * The feature id for the '<em><b>Subclasses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MI_DETAIL__SUBCLASSES = ARCHETYPE__SUBCLASSES;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MI_DETAIL__FEATURES = ARCHETYPE__FEATURES;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MI_DETAIL__ABSTRACT = ARCHETYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MI_DETAIL__INTERFACE = ARCHETYPE__INTERFACE;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MI_DETAIL__OPERATIONS = ARCHETYPE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MI_DETAIL__DESCRIPTION = ARCHETYPE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>MI Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MI_DETAIL_FEATURE_COUNT = ARCHETYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.examples.dnc.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.examples.dnc.impl.RoleImpl
	 * @see org.eclipse.amalgam.examples.dnc.impl.DncPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 4;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ANNOTATIONS = ARCHETYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = ARCHETYPE__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__PACKAGE = ARCHETYPE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Superclasses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__SUPERCLASSES = ARCHETYPE__SUPERCLASSES;

	/**
	 * The feature id for the '<em><b>Subclasses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__SUBCLASSES = ARCHETYPE__SUBCLASSES;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__FEATURES = ARCHETYPE__FEATURES;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ABSTRACT = ARCHETYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__INTERFACE = ARCHETYPE__INTERFACE;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__OPERATIONS = ARCHETYPE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__DESCRIPTION = ARCHETYPE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = ARCHETYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.examples.dnc.impl.DescriptionImpl <em>Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.examples.dnc.impl.DescriptionImpl
	 * @see org.eclipse.amalgam.examples.dnc.impl.DncPackageImpl#getDescription()
	 * @generated
	 */
	int DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__ANNOTATIONS = ARCHETYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__NAME = ARCHETYPE__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__PACKAGE = ARCHETYPE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Superclasses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__SUPERCLASSES = ARCHETYPE__SUPERCLASSES;

	/**
	 * The feature id for the '<em><b>Subclasses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__SUBCLASSES = ARCHETYPE__SUBCLASSES;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__FEATURES = ARCHETYPE__FEATURES;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__ABSTRACT = ARCHETYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__INTERFACE = ARCHETYPE__INTERFACE;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__OPERATIONS = ARCHETYPE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__DESCRIPTION = ARCHETYPE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_FEATURE_COUNT = ARCHETYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.examples.dnc.impl.PartyImpl <em>Party</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.examples.dnc.impl.PartyImpl
	 * @see org.eclipse.amalgam.examples.dnc.impl.DncPackageImpl#getParty()
	 * @generated
	 */
	int PARTY = 6;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__ANNOTATIONS = ARCHETYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__NAME = ARCHETYPE__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__PACKAGE = ARCHETYPE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Superclasses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__SUPERCLASSES = ARCHETYPE__SUPERCLASSES;

	/**
	 * The feature id for the '<em><b>Subclasses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__SUBCLASSES = ARCHETYPE__SUBCLASSES;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__FEATURES = ARCHETYPE__FEATURES;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__ABSTRACT = ARCHETYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__INTERFACE = ARCHETYPE__INTERFACE;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__OPERATIONS = ARCHETYPE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__DESCRIPTION = ARCHETYPE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Party</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_FEATURE_COUNT = ARCHETYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.examples.dnc.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.examples.dnc.impl.PlaceImpl
	 * @see org.eclipse.amalgam.examples.dnc.impl.DncPackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 7;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__ANNOTATIONS = ARCHETYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NAME = ARCHETYPE__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__PACKAGE = ARCHETYPE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Superclasses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__SUPERCLASSES = ARCHETYPE__SUPERCLASSES;

	/**
	 * The feature id for the '<em><b>Subclasses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__SUBCLASSES = ARCHETYPE__SUBCLASSES;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__FEATURES = ARCHETYPE__FEATURES;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__ABSTRACT = ARCHETYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__INTERFACE = ARCHETYPE__INTERFACE;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__OPERATIONS = ARCHETYPE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__DESCRIPTION = ARCHETYPE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = ARCHETYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.examples.dnc.impl.ThingImpl <em>Thing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.examples.dnc.impl.ThingImpl
	 * @see org.eclipse.amalgam.examples.dnc.impl.DncPackageImpl#getThing()
	 * @generated
	 */
	int THING = 8;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__ANNOTATIONS = ARCHETYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__NAME = ARCHETYPE__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__PACKAGE = ARCHETYPE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Superclasses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__SUPERCLASSES = ARCHETYPE__SUPERCLASSES;

	/**
	 * The feature id for the '<em><b>Subclasses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__SUBCLASSES = ARCHETYPE__SUBCLASSES;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__FEATURES = ARCHETYPE__FEATURES;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__ABSTRACT = ARCHETYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__INTERFACE = ARCHETYPE__INTERFACE;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__OPERATIONS = ARCHETYPE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__DESCRIPTION = ARCHETYPE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_FEATURE_COUNT = ARCHETYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.examples.dnc.impl.PluginPointImpl <em>Plugin Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.examples.dnc.impl.PluginPointImpl
	 * @see org.eclipse.amalgam.examples.dnc.impl.DncPackageImpl#getPluginPoint()
	 * @generated
	 */
	int PLUGIN_POINT = 9;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_POINT__ANNOTATIONS = ARCHETYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_POINT__NAME = ARCHETYPE__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_POINT__PACKAGE = ARCHETYPE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Superclasses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_POINT__SUPERCLASSES = ARCHETYPE__SUPERCLASSES;

	/**
	 * The feature id for the '<em><b>Subclasses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_POINT__SUBCLASSES = ARCHETYPE__SUBCLASSES;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_POINT__FEATURES = ARCHETYPE__FEATURES;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_POINT__ABSTRACT = ARCHETYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_POINT__INTERFACE = ARCHETYPE__INTERFACE;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_POINT__OPERATIONS = ARCHETYPE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_POINT__DESCRIPTION = ARCHETYPE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Plugin Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_POINT_FEATURE_COUNT = ARCHETYPE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.examples.dnc.Archetype <em>Archetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Archetype</em>'.
	 * @see org.eclipse.amalgam.examples.dnc.Archetype
	 * @generated
	 */
	EClass getArchetype();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.examples.dnc.Archetype#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.amalgam.examples.dnc.Archetype#getDescription()
	 * @see #getArchetype()
	 * @generated
	 */
	EAttribute getArchetype_Description();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.examples.dnc.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see org.eclipse.amalgam.examples.dnc.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.examples.dnc.Association#isAggregation <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aggregation</em>'.
	 * @see org.eclipse.amalgam.examples.dnc.Association#isAggregation()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_Aggregation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.examples.dnc.MomentInterval <em>Moment Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Moment Interval</em>'.
	 * @see org.eclipse.amalgam.examples.dnc.MomentInterval
	 * @generated
	 */
	EClass getMomentInterval();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.examples.dnc.MIDetail <em>MI Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MI Detail</em>'.
	 * @see org.eclipse.amalgam.examples.dnc.MIDetail
	 * @generated
	 */
	EClass getMIDetail();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.examples.dnc.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see org.eclipse.amalgam.examples.dnc.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.examples.dnc.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description</em>'.
	 * @see org.eclipse.amalgam.examples.dnc.Description
	 * @generated
	 */
	EClass getDescription();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.examples.dnc.Party <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Party</em>'.
	 * @see org.eclipse.amalgam.examples.dnc.Party
	 * @generated
	 */
	EClass getParty();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.examples.dnc.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see org.eclipse.amalgam.examples.dnc.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.examples.dnc.Thing <em>Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thing</em>'.
	 * @see org.eclipse.amalgam.examples.dnc.Thing
	 * @generated
	 */
	EClass getThing();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.examples.dnc.PluginPoint <em>Plugin Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plugin Point</em>'.
	 * @see org.eclipse.amalgam.examples.dnc.PluginPoint
	 * @generated
	 */
	EClass getPluginPoint();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DncFactory getDncFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.examples.dnc.impl.ArchetypeImpl <em>Archetype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.examples.dnc.impl.ArchetypeImpl
		 * @see org.eclipse.amalgam.examples.dnc.impl.DncPackageImpl#getArchetype()
		 * @generated
		 */
		EClass ARCHETYPE = eINSTANCE.getArchetype();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHETYPE__DESCRIPTION = eINSTANCE.getArchetype_Description();

		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.examples.dnc.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.examples.dnc.impl.AssociationImpl
		 * @see org.eclipse.amalgam.examples.dnc.impl.DncPackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '<em><b>Aggregation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__AGGREGATION = eINSTANCE.getAssociation_Aggregation();

		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.examples.dnc.impl.MomentIntervalImpl <em>Moment Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.examples.dnc.impl.MomentIntervalImpl
		 * @see org.eclipse.amalgam.examples.dnc.impl.DncPackageImpl#getMomentInterval()
		 * @generated
		 */
		EClass MOMENT_INTERVAL = eINSTANCE.getMomentInterval();

		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.examples.dnc.impl.MIDetailImpl <em>MI Detail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.examples.dnc.impl.MIDetailImpl
		 * @see org.eclipse.amalgam.examples.dnc.impl.DncPackageImpl#getMIDetail()
		 * @generated
		 */
		EClass MI_DETAIL = eINSTANCE.getMIDetail();

		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.examples.dnc.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.examples.dnc.impl.RoleImpl
		 * @see org.eclipse.amalgam.examples.dnc.impl.DncPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.examples.dnc.impl.DescriptionImpl <em>Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.examples.dnc.impl.DescriptionImpl
		 * @see org.eclipse.amalgam.examples.dnc.impl.DncPackageImpl#getDescription()
		 * @generated
		 */
		EClass DESCRIPTION = eINSTANCE.getDescription();

		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.examples.dnc.impl.PartyImpl <em>Party</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.examples.dnc.impl.PartyImpl
		 * @see org.eclipse.amalgam.examples.dnc.impl.DncPackageImpl#getParty()
		 * @generated
		 */
		EClass PARTY = eINSTANCE.getParty();

		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.examples.dnc.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.examples.dnc.impl.PlaceImpl
		 * @see org.eclipse.amalgam.examples.dnc.impl.DncPackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.examples.dnc.impl.ThingImpl <em>Thing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.examples.dnc.impl.ThingImpl
		 * @see org.eclipse.amalgam.examples.dnc.impl.DncPackageImpl#getThing()
		 * @generated
		 */
		EClass THING = eINSTANCE.getThing();

		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.examples.dnc.impl.PluginPointImpl <em>Plugin Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.examples.dnc.impl.PluginPointImpl
		 * @see org.eclipse.amalgam.examples.dnc.impl.DncPackageImpl#getPluginPoint()
		 * @generated
		 */
		EClass PLUGIN_POINT = eINSTANCE.getPluginPoint();

	}

} //DncPackage
