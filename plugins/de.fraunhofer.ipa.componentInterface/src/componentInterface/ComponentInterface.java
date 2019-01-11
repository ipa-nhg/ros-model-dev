/**
 */
package componentInterface;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link componentInterface.ComponentInterface#getRospublisher <em>Rospublisher</em>}</li>
 *   <li>{@link componentInterface.ComponentInterface#getRossubscriber <em>Rossubscriber</em>}</li>
 *   <li>{@link componentInterface.ComponentInterface#getRosserviceserver <em>Rosserviceserver</em>}</li>
 *   <li>{@link componentInterface.ComponentInterface#getRosserviceclient <em>Rosserviceclient</em>}</li>
 *   <li>{@link componentInterface.ComponentInterface#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see componentInterface.ComponentInterfacePackage#getComponentInterface()
 * @model
 * @generated
 */
public interface ComponentInterface extends EObject {
	/**
	 * Returns the value of the '<em><b>Rospublisher</b></em>' containment reference list.
	 * The list contents are of type {@link componentInterface.RosPublisher}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rospublisher</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rospublisher</em>' containment reference list.
	 * @see componentInterface.ComponentInterfacePackage#getComponentInterface_Rospublisher()
	 * @model containment="true"
	 * @generated
	 */
	EList<RosPublisher> getRospublisher();

	/**
	 * Returns the value of the '<em><b>Rossubscriber</b></em>' containment reference list.
	 * The list contents are of type {@link componentInterface.RosSubscriber}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rossubscriber</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rossubscriber</em>' containment reference list.
	 * @see componentInterface.ComponentInterfacePackage#getComponentInterface_Rossubscriber()
	 * @model containment="true"
	 * @generated
	 */
	EList<RosSubscriber> getRossubscriber();

	/**
	 * Returns the value of the '<em><b>Rosserviceserver</b></em>' containment reference list.
	 * The list contents are of type {@link componentInterface.RosServiceServer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rosserviceserver</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rosserviceserver</em>' containment reference list.
	 * @see componentInterface.ComponentInterfacePackage#getComponentInterface_Rosserviceserver()
	 * @model containment="true"
	 * @generated
	 */
	EList<RosServiceServer> getRosserviceserver();

	/**
	 * Returns the value of the '<em><b>Rosserviceclient</b></em>' containment reference list.
	 * The list contents are of type {@link componentInterface.RosServiceClient}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rosserviceclient</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rosserviceclient</em>' containment reference list.
	 * @see componentInterface.ComponentInterfacePackage#getComponentInterface_Rosserviceclient()
	 * @model containment="true"
	 * @generated
	 */
	EList<RosServiceClient> getRosserviceclient();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see componentInterface.ComponentInterfacePackage#getComponentInterface_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link componentInterface.ComponentInterface#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ComponentInterface
