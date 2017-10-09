/**
 */
package ros1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ros1.PackageSet#getPackage <em>Package</em>}</li>
 * </ul>
 *
 * @see ros1.Ros1Package#getPackageSet()
 * @model
 * @generated
 */
public interface PackageSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Package</b></em>' containment reference list.
	 * The list contents are of type {@link ros1.Package}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' containment reference list.
	 * @see ros1.Ros1Package#getPackageSet_Package()
	 * @model containment="true"
	 * @generated
	 */
	EList<ros1.Package> getPackage();

} // PackageSet
