/**
 */
package rossystem.impl;

import componentInterface.ComponentInterface;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rossystem.NameSpacedComponent;
import rossystem.RossystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Name Spaced Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rossystem.impl.NameSpacedComponentImpl#getRosComponent <em>Ros Component</em>}</li>
 *   <li>{@link rossystem.impl.NameSpacedComponentImpl#getNameSpace <em>Name Space</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NameSpacedComponentImpl extends MinimalEObjectImpl.Container implements NameSpacedComponent {
	/**
	 * The cached value of the '{@link #getRosComponent() <em>Ros Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRosComponent()
	 * @generated
	 * @ordered
	 */
	protected ComponentInterface rosComponent;

	/**
	 * The default value of the '{@link #getNameSpace() <em>Name Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameSpace()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_SPACE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getNameSpace() <em>Name Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameSpace()
	 * @generated
	 * @ordered
	 */
	protected String nameSpace = NAME_SPACE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NameSpacedComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RossystemPackage.Literals.NAME_SPACED_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInterface getRosComponent() {
		if (rosComponent != null && rosComponent.eIsProxy()) {
			InternalEObject oldRosComponent = (InternalEObject)rosComponent;
			rosComponent = (ComponentInterface)eResolveProxy(oldRosComponent);
			if (rosComponent != oldRosComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RossystemPackage.NAME_SPACED_COMPONENT__ROS_COMPONENT, oldRosComponent, rosComponent));
			}
		}
		return rosComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInterface basicGetRosComponent() {
		return rosComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRosComponent(ComponentInterface newRosComponent) {
		ComponentInterface oldRosComponent = rosComponent;
		rosComponent = newRosComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RossystemPackage.NAME_SPACED_COMPONENT__ROS_COMPONENT, oldRosComponent, rosComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameSpace() {
		return nameSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameSpace(String newNameSpace) {
		String oldNameSpace = nameSpace;
		nameSpace = newNameSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RossystemPackage.NAME_SPACED_COMPONENT__NAME_SPACE, oldNameSpace, nameSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RossystemPackage.NAME_SPACED_COMPONENT__ROS_COMPONENT:
				if (resolve) return getRosComponent();
				return basicGetRosComponent();
			case RossystemPackage.NAME_SPACED_COMPONENT__NAME_SPACE:
				return getNameSpace();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RossystemPackage.NAME_SPACED_COMPONENT__ROS_COMPONENT:
				setRosComponent((ComponentInterface)newValue);
				return;
			case RossystemPackage.NAME_SPACED_COMPONENT__NAME_SPACE:
				setNameSpace((String)newValue);
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
			case RossystemPackage.NAME_SPACED_COMPONENT__ROS_COMPONENT:
				setRosComponent((ComponentInterface)null);
				return;
			case RossystemPackage.NAME_SPACED_COMPONENT__NAME_SPACE:
				setNameSpace(NAME_SPACE_EDEFAULT);
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
			case RossystemPackage.NAME_SPACED_COMPONENT__ROS_COMPONENT:
				return rosComponent != null;
			case RossystemPackage.NAME_SPACED_COMPONENT__NAME_SPACE:
				return NAME_SPACE_EDEFAULT == null ? nameSpace != null : !NAME_SPACE_EDEFAULT.equals(nameSpace);
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
		result.append(" (NameSpace: ");
		result.append(nameSpace);
		result.append(')');
		return result.toString();
	}

} //NameSpacedComponentImpl
