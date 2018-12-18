/**
 */
package rossystem.impl;

import componentInterface.ComponentInterface;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rossystem.RosSystem;
import rossystem.RossystemPackage;
import rossystem.ServiceConnection;
import rossystem.TopicConnection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ros System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rossystem.impl.RosSystemImpl#getTopicConnections <em>Topic Connections</em>}</li>
 *   <li>{@link rossystem.impl.RosSystemImpl#getServiceConnections <em>Service Connections</em>}</li>
 *   <li>{@link rossystem.impl.RosSystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link rossystem.impl.RosSystemImpl#getRosComponent <em>Ros Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RosSystemImpl extends MinimalEObjectImpl.Container implements RosSystem {
	/**
	 * The cached value of the '{@link #getTopicConnections() <em>Topic Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopicConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<TopicConnection> topicConnections;

	/**
	 * The cached value of the '{@link #getServiceConnections() <em>Service Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceConnection> serviceConnections;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRosComponent() <em>Ros Component</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRosComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentInterface> rosComponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RosSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RossystemPackage.Literals.ROS_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TopicConnection> getTopicConnections() {
		if (topicConnections == null) {
			topicConnections = new EObjectContainmentEList<TopicConnection>(TopicConnection.class, this, RossystemPackage.ROS_SYSTEM__TOPIC_CONNECTIONS);
		}
		return topicConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceConnection> getServiceConnections() {
		if (serviceConnections == null) {
			serviceConnections = new EObjectContainmentEList<ServiceConnection>(ServiceConnection.class, this, RossystemPackage.ROS_SYSTEM__SERVICE_CONNECTIONS);
		}
		return serviceConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RossystemPackage.ROS_SYSTEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentInterface> getRosComponent() {
		if (rosComponent == null) {
			rosComponent = new EObjectResolvingEList<ComponentInterface>(ComponentInterface.class, this, RossystemPackage.ROS_SYSTEM__ROS_COMPONENT);
		}
		return rosComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RossystemPackage.ROS_SYSTEM__TOPIC_CONNECTIONS:
				return ((InternalEList<?>)getTopicConnections()).basicRemove(otherEnd, msgs);
			case RossystemPackage.ROS_SYSTEM__SERVICE_CONNECTIONS:
				return ((InternalEList<?>)getServiceConnections()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RossystemPackage.ROS_SYSTEM__TOPIC_CONNECTIONS:
				return getTopicConnections();
			case RossystemPackage.ROS_SYSTEM__SERVICE_CONNECTIONS:
				return getServiceConnections();
			case RossystemPackage.ROS_SYSTEM__NAME:
				return getName();
			case RossystemPackage.ROS_SYSTEM__ROS_COMPONENT:
				return getRosComponent();
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
			case RossystemPackage.ROS_SYSTEM__TOPIC_CONNECTIONS:
				getTopicConnections().clear();
				getTopicConnections().addAll((Collection<? extends TopicConnection>)newValue);
				return;
			case RossystemPackage.ROS_SYSTEM__SERVICE_CONNECTIONS:
				getServiceConnections().clear();
				getServiceConnections().addAll((Collection<? extends ServiceConnection>)newValue);
				return;
			case RossystemPackage.ROS_SYSTEM__NAME:
				setName((String)newValue);
				return;
			case RossystemPackage.ROS_SYSTEM__ROS_COMPONENT:
				getRosComponent().clear();
				getRosComponent().addAll((Collection<? extends ComponentInterface>)newValue);
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
			case RossystemPackage.ROS_SYSTEM__TOPIC_CONNECTIONS:
				getTopicConnections().clear();
				return;
			case RossystemPackage.ROS_SYSTEM__SERVICE_CONNECTIONS:
				getServiceConnections().clear();
				return;
			case RossystemPackage.ROS_SYSTEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RossystemPackage.ROS_SYSTEM__ROS_COMPONENT:
				getRosComponent().clear();
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
			case RossystemPackage.ROS_SYSTEM__TOPIC_CONNECTIONS:
				return topicConnections != null && !topicConnections.isEmpty();
			case RossystemPackage.ROS_SYSTEM__SERVICE_CONNECTIONS:
				return serviceConnections != null && !serviceConnections.isEmpty();
			case RossystemPackage.ROS_SYSTEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RossystemPackage.ROS_SYSTEM__ROS_COMPONENT:
				return rosComponent != null && !rosComponent.isEmpty();
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RosSystemImpl
