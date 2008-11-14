/**
 * <copyright>
 * </copyright>
 *
 * $Id: RequirementsPackage.java,v 1.1 2008/11/14 17:35:37 rgronback Exp $
 */
package org.eclipse.amalgam.examples.requirements;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.eclipse.amalgam.examples.requirements.RequirementsFactory
 * @model kind="package"
 * @generated
 */
public interface RequirementsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "requirements";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/2008/requirements";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "requirements";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RequirementsPackage eINSTANCE = org.eclipse.amalgam.examples.requirements.impl.RequirementsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.examples.requirements.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.examples.requirements.impl.ModelImpl
	 * @see org.eclipse.amalgam.examples.requirements.impl.RequirementsPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__GROUPS = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.examples.requirements.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.examples.requirements.impl.RequirementImpl
	 * @see org.eclipse.amalgam.examples.requirements.impl.RequirementsPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CHILDREN = 3;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__PRIORITY = 4;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__AUTHOR = 5;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CREATED = 6;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__COMMENTS = 7;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__VERSION = 8;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DEPENDENCIES = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ID = 10;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__PARENT = 11;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__STATE = 12;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__RESOLUTION = 13;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__SCENARIO = 14;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = 15;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.examples.requirements.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.examples.requirements.impl.CommentImpl
	 * @see org.eclipse.amalgam.examples.requirements.impl.RequirementsPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 2;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__SUBJECT = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__BODY = 1;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__AUTHOR = 2;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__CREATED = 3;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__CHILDREN = 4;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.examples.requirements.impl.VersionImpl <em>Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.examples.requirements.impl.VersionImpl
	 * @see org.eclipse.amalgam.examples.requirements.impl.RequirementsPackageImpl#getVersion()
	 * @generated
	 */
	int VERSION = 3;

	/**
	 * The feature id for the '<em><b>Major</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__MAJOR = 0;

	/**
	 * The feature id for the '<em><b>Minor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__MINOR = 1;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__SERVICE = 2;

	/**
	 * The number of structural features of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.examples.requirements.impl.RequirementGroupImpl <em>Requirement Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.examples.requirements.impl.RequirementGroupImpl
	 * @see org.eclipse.amalgam.examples.requirements.impl.RequirementsPackageImpl#getRequirementGroup()
	 * @generated
	 */
	int REQUIREMENT_GROUP = 4;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_GROUP__REQUIREMENTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_GROUP__NAME = 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_GROUP__CHILDREN = 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_GROUP__PARENT = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_GROUP__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_GROUP__ID = 5;

	/**
	 * The number of structural features of the '<em>Requirement Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_GROUP_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.examples.requirements.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.examples.requirements.Type
	 * @see org.eclipse.amalgam.examples.requirements.impl.RequirementsPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.examples.requirements.Priority <em>Priority</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.examples.requirements.Priority
	 * @see org.eclipse.amalgam.examples.requirements.impl.RequirementsPackageImpl#getPriority()
	 * @generated
	 */
	int PRIORITY = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.examples.requirements.State <em>State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.examples.requirements.State
	 * @see org.eclipse.amalgam.examples.requirements.impl.RequirementsPackageImpl#getState()
	 * @generated
	 */
	int STATE = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.examples.requirements.Resolution <em>Resolution</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.examples.requirements.Resolution
	 * @see org.eclipse.amalgam.examples.requirements.impl.RequirementsPackageImpl#getResolution()
	 * @generated
	 */
	int RESOLUTION = 8;


	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.examples.requirements.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.eclipse.amalgam.examples.requirements.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.examples.requirements.Model#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.amalgam.examples.requirements.Model#getTitle()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.amalgam.examples.requirements.Model#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see org.eclipse.amalgam.examples.requirements.Model#getGroups()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Groups();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.examples.requirements.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see org.eclipse.amalgam.examples.requirements.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.examples.requirements.Requirement#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.amalgam.examples.requirements.Requirement#getTitle()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.examples.requirements.Requirement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.amalgam.examples.requirements.Requirement#getDescription()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.examples.requirements.Requirement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.amalgam.examples.requirements.Requirement#getType()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.amalgam.examples.requirements.Requirement#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.eclipse.amalgam.examples.requirements.Requirement#getChildren()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Children();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.examples.requirements.Requirement#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see org.eclipse.amalgam.examples.requirements.Requirement#getPriority()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Priority();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.examples.requirements.Requirement#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see org.eclipse.amalgam.examples.requirements.Requirement#getAuthor()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Author();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.examples.requirements.Requirement#getCreated <em>Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created</em>'.
	 * @see org.eclipse.amalgam.examples.requirements.Requirement#getCreated()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Created();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.amalgam.examples.requirements.Requirement#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comments</em>'.
	 * @see org.eclipse.amalgam.examples.requirements.Requirement#getComments()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Comments();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.examples.requirements.Requirement#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Version</em>'.
	 * @see org.eclipse.amalgam.examples.requirements.Requirement#getVersion()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Version();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.amalgam.examples.requirements.Requirement#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependencies</em>'.
	 * @see org.eclipse.amalgam.examples.requirements.Requirement#getDependencies()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Dependencies();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.examples.requirements.Requirement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.amalgam.examples.requirements.Requirement#getId()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Id();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.amalgam.examples.requirements.Requirement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.eclipse.amalgam.examples.requirements.Requirement#getParent()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.examples.requirements.Requirement#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.eclipse.amalgam.examples.requirements.Requirement#getState()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_State();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.examples.requirements.Requirement#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution</em>'.
	 * @see org.eclipse.amalgam.examples.requirements.Requirement#getResolution()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Resolution();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.examples.requirements.Requirement#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scenario</em>'.
	 * @see org.eclipse.amalgam.examples.requirements.Requirement#getScenario()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Scenario();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.examples.requirements.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see org.eclipse.amalgam.examples.requirements.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.examples.requirements.Comment#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject</em>'.
	 * @see org.eclipse.amalgam.examples.requirements.Comment#getSubject()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Subject();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.examples.requirements.Comment#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see org.eclipse.amalgam.examples.requirements.Comment#getBody()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Body();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.examples.requirements.Comment#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see org.eclipse.amalgam.examples.requirements.Comment#getAuthor()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Author();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.examples.requirements.Comment#getCreated <em>Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created</em>'.
	 * @see org.eclipse.amalgam.examples.requirements.Comment#getCreated()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Created();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.amalgam.examples.requirements.Comment#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.eclipse.amalgam.examples.requirements.Comment#getChildren()
	 * @see #getComment()
	 * @generated
	 */
	EReference getComment_Children();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.examples.requirements.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version</em>'.
	 * @see org.eclipse.amalgam.examples.requirements.Version
	 * @generated
	 */
	EClass getVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.examples.requirements.Version#getMajor <em>Major</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Major</em>'.
	 * @see org.eclipse.amalgam.examples.requirements.Version#getMajor()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Major();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.examples.requirements.Version#getMinor <em>Minor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minor</em>'.
	 * @see org.eclipse.amalgam.examples.requirements.Version#getMinor()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Minor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.examples.requirements.Version#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service</em>'.
	 * @see org.eclipse.amalgam.examples.requirements.Version#getService()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Service();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.examples.requirements.RequirementGroup <em>Requirement Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Group</em>'.
	 * @see org.eclipse.amalgam.examples.requirements.RequirementGroup
	 * @generated
	 */
	EClass getRequirementGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.amalgam.examples.requirements.RequirementGroup#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirements</em>'.
	 * @see org.eclipse.amalgam.examples.requirements.RequirementGroup#getRequirements()
	 * @see #getRequirementGroup()
	 * @generated
	 */
	EReference getRequirementGroup_Requirements();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.examples.requirements.RequirementGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.amalgam.examples.requirements.RequirementGroup#getName()
	 * @see #getRequirementGroup()
	 * @generated
	 */
	EAttribute getRequirementGroup_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.amalgam.examples.requirements.RequirementGroup#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.eclipse.amalgam.examples.requirements.RequirementGroup#getChildren()
	 * @see #getRequirementGroup()
	 * @generated
	 */
	EReference getRequirementGroup_Children();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.amalgam.examples.requirements.RequirementGroup#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.eclipse.amalgam.examples.requirements.RequirementGroup#getParent()
	 * @see #getRequirementGroup()
	 * @generated
	 */
	EReference getRequirementGroup_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.examples.requirements.RequirementGroup#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.amalgam.examples.requirements.RequirementGroup#getDescription()
	 * @see #getRequirementGroup()
	 * @generated
	 */
	EAttribute getRequirementGroup_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.examples.requirements.RequirementGroup#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.amalgam.examples.requirements.RequirementGroup#getId()
	 * @see #getRequirementGroup()
	 * @generated
	 */
	EAttribute getRequirementGroup_Id();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.amalgam.examples.requirements.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see org.eclipse.amalgam.examples.requirements.Type
	 * @generated
	 */
	EEnum getType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.amalgam.examples.requirements.Priority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Priority</em>'.
	 * @see org.eclipse.amalgam.examples.requirements.Priority
	 * @generated
	 */
	EEnum getPriority();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.amalgam.examples.requirements.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>State</em>'.
	 * @see org.eclipse.amalgam.examples.requirements.State
	 * @generated
	 */
	EEnum getState();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.amalgam.examples.requirements.Resolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resolution</em>'.
	 * @see org.eclipse.amalgam.examples.requirements.Resolution
	 * @generated
	 */
	EEnum getResolution();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RequirementsFactory getRequirementsFactory();

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
		 * The meta object literal for the '{@link org.eclipse.amalgam.examples.requirements.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.examples.requirements.impl.ModelImpl
		 * @see org.eclipse.amalgam.examples.requirements.impl.RequirementsPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__TITLE = eINSTANCE.getModel_Title();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__GROUPS = eINSTANCE.getModel_Groups();

		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.examples.requirements.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.examples.requirements.impl.RequirementImpl
		 * @see org.eclipse.amalgam.examples.requirements.impl.RequirementsPackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__TITLE = eINSTANCE.getRequirement_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__DESCRIPTION = eINSTANCE.getRequirement_Description();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__TYPE = eINSTANCE.getRequirement_Type();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__CHILDREN = eINSTANCE.getRequirement_Children();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__PRIORITY = eINSTANCE.getRequirement_Priority();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__AUTHOR = eINSTANCE.getRequirement_Author();

		/**
		 * The meta object literal for the '<em><b>Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__CREATED = eINSTANCE.getRequirement_Created();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__COMMENTS = eINSTANCE.getRequirement_Comments();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__VERSION = eINSTANCE.getRequirement_Version();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__DEPENDENCIES = eINSTANCE.getRequirement_Dependencies();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__ID = eINSTANCE.getRequirement_Id();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__PARENT = eINSTANCE.getRequirement_Parent();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__STATE = eINSTANCE.getRequirement_State();

		/**
		 * The meta object literal for the '<em><b>Resolution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__RESOLUTION = eINSTANCE.getRequirement_Resolution();

		/**
		 * The meta object literal for the '<em><b>Scenario</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__SCENARIO = eINSTANCE.getRequirement_Scenario();

		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.examples.requirements.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.examples.requirements.impl.CommentImpl
		 * @see org.eclipse.amalgam.examples.requirements.impl.RequirementsPackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__SUBJECT = eINSTANCE.getComment_Subject();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__BODY = eINSTANCE.getComment_Body();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__AUTHOR = eINSTANCE.getComment_Author();

		/**
		 * The meta object literal for the '<em><b>Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__CREATED = eINSTANCE.getComment_Created();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMENT__CHILDREN = eINSTANCE.getComment_Children();

		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.examples.requirements.impl.VersionImpl <em>Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.examples.requirements.impl.VersionImpl
		 * @see org.eclipse.amalgam.examples.requirements.impl.RequirementsPackageImpl#getVersion()
		 * @generated
		 */
		EClass VERSION = eINSTANCE.getVersion();

		/**
		 * The meta object literal for the '<em><b>Major</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__MAJOR = eINSTANCE.getVersion_Major();

		/**
		 * The meta object literal for the '<em><b>Minor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__MINOR = eINSTANCE.getVersion_Minor();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__SERVICE = eINSTANCE.getVersion_Service();

		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.examples.requirements.impl.RequirementGroupImpl <em>Requirement Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.examples.requirements.impl.RequirementGroupImpl
		 * @see org.eclipse.amalgam.examples.requirements.impl.RequirementsPackageImpl#getRequirementGroup()
		 * @generated
		 */
		EClass REQUIREMENT_GROUP = eINSTANCE.getRequirementGroup();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_GROUP__REQUIREMENTS = eINSTANCE.getRequirementGroup_Requirements();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_GROUP__NAME = eINSTANCE.getRequirementGroup_Name();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_GROUP__CHILDREN = eINSTANCE.getRequirementGroup_Children();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_GROUP__PARENT = eINSTANCE.getRequirementGroup_Parent();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_GROUP__DESCRIPTION = eINSTANCE.getRequirementGroup_Description();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_GROUP__ID = eINSTANCE.getRequirementGroup_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.examples.requirements.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.examples.requirements.Type
		 * @see org.eclipse.amalgam.examples.requirements.impl.RequirementsPackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.examples.requirements.Priority <em>Priority</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.examples.requirements.Priority
		 * @see org.eclipse.amalgam.examples.requirements.impl.RequirementsPackageImpl#getPriority()
		 * @generated
		 */
		EEnum PRIORITY = eINSTANCE.getPriority();

		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.examples.requirements.State <em>State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.examples.requirements.State
		 * @see org.eclipse.amalgam.examples.requirements.impl.RequirementsPackageImpl#getState()
		 * @generated
		 */
		EEnum STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.examples.requirements.Resolution <em>Resolution</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.examples.requirements.Resolution
		 * @see org.eclipse.amalgam.examples.requirements.impl.RequirementsPackageImpl#getResolution()
		 * @generated
		 */
		EEnum RESOLUTION = eINSTANCE.getResolution();

	}

} //RequirementsPackage
