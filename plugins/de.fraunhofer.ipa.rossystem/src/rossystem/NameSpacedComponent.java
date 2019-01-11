/**
 */
package rossystem;

import componentInterface.ComponentInterface;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name Spaced Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rossystem.NameSpacedComponent#getRosComponent <em>Ros Component</em>}</li>
 *   <li>{@link rossystem.NameSpacedComponent#getNameSpace <em>Name Space</em>}</li>
 * </ul>
 *
 * @see rossystem.RossystemPackage#getNameSpacedComponent()
 * @model
 * @generated
 */
public interface NameSpacedComponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Ros Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ros Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ros Component</em>' reference.
	 * @see #setRosComponent(ComponentInterface)
	 * @see rossystem.RossystemPackage#getNameSpacedComponent_RosComponent()
	 * @model required="true"
	 * @generated
	 */
	ComponentInterface getRosComponent();

	/**
	 * Sets the value of the '{@link rossystem.NameSpacedComponent#getRosComponent <em>Ros Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ros Component</em>' reference.
	 * @see #getRosComponent()
	 * @generated
	 */
	void setRosComponent(ComponentInterface value);

	/**
	 * Returns the value of the '<em><b>Name Space</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Space</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Space</em>' attribute.
	 * @see #setNameSpace(String)
	 * @see rossystem.RossystemPackage#getNameSpacedComponent_NameSpace()
	 * @model default=""
	 * @generated
	 */
	String getNameSpace();

	/**
	 * Sets the value of the '{@link rossystem.NameSpacedComponent#getNameSpace <em>Name Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Space</em>' attribute.
	 * @see #getNameSpace()
	 * @generated
	 */
	void setNameSpace(String value);

} // NameSpacedComponent
