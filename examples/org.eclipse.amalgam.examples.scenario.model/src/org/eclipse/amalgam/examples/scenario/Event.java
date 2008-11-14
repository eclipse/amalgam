/**
 * <copyright>
 * </copyright>
 *
 * $Id: Event.java,v 1.1 2008/11/14 17:38:46 rgronback Exp $
 */
package org.eclipse.amalgam.examples.scenario;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.examples.scenario.Event#getEventType <em>Event Type</em>}</li>
 *   <li>{@link org.eclipse.amalgam.examples.scenario.Event#getTriggerType <em>Trigger Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.examples.scenario.ScenarioPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends Element {
	/**
	 * Returns the value of the '<em><b>Event Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.amalgam.examples.scenario.EventType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Type</em>' attribute.
	 * @see org.eclipse.amalgam.examples.scenario.EventType
	 * @see #setEventType(EventType)
	 * @see org.eclipse.amalgam.examples.scenario.ScenarioPackage#getEvent_EventType()
	 * @model
	 * @generated
	 */
	EventType getEventType();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.examples.scenario.Event#getEventType <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Type</em>' attribute.
	 * @see org.eclipse.amalgam.examples.scenario.EventType
	 * @see #getEventType()
	 * @generated
	 */
	void setEventType(EventType value);

	/**
	 * Returns the value of the '<em><b>Trigger Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.amalgam.examples.scenario.TriggerType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger Type</em>' attribute.
	 * @see org.eclipse.amalgam.examples.scenario.TriggerType
	 * @see #setTriggerType(TriggerType)
	 * @see org.eclipse.amalgam.examples.scenario.ScenarioPackage#getEvent_TriggerType()
	 * @model
	 * @generated
	 */
	TriggerType getTriggerType();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.examples.scenario.Event#getTriggerType <em>Trigger Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Type</em>' attribute.
	 * @see org.eclipse.amalgam.examples.scenario.TriggerType
	 * @see #getTriggerType()
	 * @generated
	 */
	void setTriggerType(TriggerType value);

} // Event
