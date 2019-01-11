/*
 * generated by Xtext 2.12.0
 */
package de.fraunhofer.ipa.componentInterface.serializer;

import com.google.inject.Inject;
import componentInterface.ComponentInterface;
import componentInterface.ComponentInterfacePackage;
import componentInterface.RosPublisher;
import componentInterface.RosServiceClient;
import componentInterface.RosServiceServer;
import componentInterface.RosSubscriber;
import de.fraunhofer.ipa.componentInterface.services.ComponentInterfaceGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;

@SuppressWarnings("all")
public class ComponentInterfaceSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ComponentInterfaceGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ComponentInterfacePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ComponentInterfacePackage.COMPONENT_INTERFACE:
				sequence_ComponentInterface(context, (ComponentInterface) semanticObject); 
				return; 
			case ComponentInterfacePackage.ROS_PUBLISHER:
				sequence_RosPublisher(context, (RosPublisher) semanticObject); 
				return; 
			case ComponentInterfacePackage.ROS_SERVICE_CLIENT:
				sequence_RosServiceClient(context, (RosServiceClient) semanticObject); 
				return; 
			case ComponentInterfacePackage.ROS_SERVICE_SERVER:
				sequence_RosServiceServer(context, (RosServiceServer) semanticObject); 
				return; 
			case ComponentInterfacePackage.ROS_SUBSCRIBER:
				sequence_RosSubscriber(context, (RosSubscriber) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ComponentInterface returns ComponentInterface
	 *
	 * Constraint:
	 *     (
	 *         name=EString | 
	 *         (name=EString (rosserviceclient+=RosServiceClient rosserviceclient+=RosServiceClient*)) | 
	 *         (
	 *             name=EString 
	 *             rospublisher+=RosPublisher 
	 *             rospublisher+=RosPublisher* 
	 *             (
	 *                 ((rossubscriber+=RosSubscriber rossubscriber+=RosSubscriber*)? (rosserviceclient+=RosServiceClient rosserviceclient+=RosServiceClient*)) | 
	 *                 (rosserviceclient+=RosServiceClient rosserviceclient+=RosServiceClient*)
	 *             )?
	 *         ) | 
	 *         (
	 *             name=EString 
	 *             rossubscriber+=RosSubscriber 
	 *             rossubscriber+=RosSubscriber* 
	 *             (rosserviceclient+=RosServiceClient rosserviceclient+=RosServiceClient*)
	 *         ) | 
	 *         (
	 *             (
	 *                 name=EString | 
	 *                 (name=EString rospublisher+=RosPublisher rospublisher+=RosPublisher* (rossubscriber+=RosSubscriber rossubscriber+=RosSubscriber*)?) | 
	 *                 (name=EString rossubscriber+=RosSubscriber rossubscriber+=RosSubscriber*)
	 *             ) 
	 *             rosserviceserver+=RosServiceServer 
	 *             rosserviceserver+=RosServiceServer* 
	 *             (rosserviceclient+=RosServiceClient rosserviceclient+=RosServiceClient*)
	 *         )
	 *     )?
	 */
	protected void sequence_ComponentInterface(ISerializationContext context, ComponentInterface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RosPublisher returns RosPublisher
	 *
	 * Constraint:
	 *     (name=EString? ns=EString? publisher=[Publisher|EString])
	 */
	protected void sequence_RosPublisher(ISerializationContext context, RosPublisher semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RosServiceClient returns RosServiceClient
	 *
	 * Constraint:
	 *     (name=EString? ns=EString? srvclient=[ServiceClient|EString])
	 */
	protected void sequence_RosServiceClient(ISerializationContext context, RosServiceClient semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RosServiceServer returns RosServiceServer
	 *
	 * Constraint:
	 *     (name=EString? ns=EString? srvserver=[ServiceServer|EString])
	 */
	protected void sequence_RosServiceServer(ISerializationContext context, RosServiceServer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RosSubscriber returns RosSubscriber
	 *
	 * Constraint:
	 *     (name=EString? ns=EString? subscriber=[Subscriber|EString])
	 */
	protected void sequence_RosSubscriber(ISerializationContext context, RosSubscriber semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
