/**
 */
package rossystem.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import rossystem.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RossystemFactoryImpl extends EFactoryImpl implements RossystemFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RossystemFactory init() {
		try {
			RossystemFactory theRossystemFactory = (RossystemFactory)EPackage.Registry.INSTANCE.getEFactory(RossystemPackage.eNS_URI);
			if (theRossystemFactory != null) {
				return theRossystemFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RossystemFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RossystemFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RossystemPackage.ROS_SYSTEM: return createRosSystem();
			case RossystemPackage.TOPIC_CONNECTION: return createTopicConnection();
			case RossystemPackage.SERVICE_CONNECTION: return createServiceConnection();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RosSystem createRosSystem() {
		RosSystemImpl rosSystem = new RosSystemImpl();
		return rosSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopicConnection createTopicConnection() {
		TopicConnectionImpl topicConnection = new TopicConnectionImpl();
		return topicConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceConnection createServiceConnection() {
		ServiceConnectionImpl serviceConnection = new ServiceConnectionImpl();
		return serviceConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RossystemPackage getRossystemPackage() {
		return (RossystemPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RossystemPackage getPackage() {
		return RossystemPackage.eINSTANCE;
	}

} //RossystemFactoryImpl
