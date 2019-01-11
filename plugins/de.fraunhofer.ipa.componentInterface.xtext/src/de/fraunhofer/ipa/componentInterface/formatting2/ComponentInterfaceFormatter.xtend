/*
 * generated by Xtext 2.13.0
 */
package de.fraunhofer.ipa.componentInterface.formatting2

import com.google.inject.Inject
import componentInterface.ComponentInterface
import componentInterface.RosPublisher
import componentInterface.RosServiceClient
import componentInterface.RosServiceServer
import componentInterface.RosSubscriber
import de.fraunhofer.ipa.componentInterface.services.ComponentInterfaceGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class ComponentInterfaceFormatter extends AbstractFormatter2 {
	
	@Inject extension ComponentInterfaceGrammarAccess

	def dispatch void format(ComponentInterface componentInterface, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		//componentInterface.getNamespace.format;
		for (RosPublisher rosPublisher : componentInterface.getRospublisher()) {
			rosPublisher.format;
		}
		for (RosSubscriber rosSubscriber : componentInterface.getRossubscriber()) {
			rosSubscriber.format;
		}
		for (RosServiceServer rosServiceServer : componentInterface.getRosserviceserver()) {
			rosServiceServer.format;
		}
		for (RosServiceClient rosServiceClient : componentInterface.getRosserviceclient()) {
			rosServiceClient.format;
		}
	}
	
	// TODO: implement for 
}
