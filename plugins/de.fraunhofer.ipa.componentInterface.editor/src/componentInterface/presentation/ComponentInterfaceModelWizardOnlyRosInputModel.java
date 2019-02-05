/**
 */
package componentInterface.presentation;


import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardSelectionPage;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.viewpoint.DAnalysis;
import org.eclipse.sirius.viewpoint.DView;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

import componentInterface.ComponentInterface;
import componentInterface.RosPublisher;
import componentInterface.RosServiceClient;
import componentInterface.RosServiceServer;
import componentInterface.RosSubscriber;
import componentInterface.impl.RosPublisherImpl;
import componentInterface.impl.RosServiceClientImpl;
import componentInterface.impl.RosServiceServerImpl;
import componentInterface.impl.RosSubscriberImpl;
import ros.Artifact;
import ros.Node;
import ros.Package;
import ros.PackageSet;
import ros.Publisher;
import ros.ServiceClient;
import ros.ServiceServer;
import ros.Subscriber;
import rossystem.RosSystem;

/**
 * This is a simple wizard for creating a new model file.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentInterfaceModelWizardOnlyRosInputModel extends Wizard implements INewWizard {

	public static final List<String> FILE_EXTENSIONS =
		Collections.unmodifiableList(Arrays.asList(ComponentInterfaceEditorPlugin.INSTANCE.getString("_UI_ComponentInterfaceEditorFilenameExtensions").split("\\s*,\\s*")));
	public static final String FORMATTED_FILE_EXTENSIONS =
		ComponentInterfaceEditorPlugin.INSTANCE.getString("_UI_ComponentInterfaceEditorFilenameExtensions").replaceAll("\\s*,\\s*", ", ");
	protected SelectinputFile getInputFileCreationPage;
	protected IStructuredSelection selection;
	protected IWorkbench workbench;
	public FileDialog fDialog;
	public String ComponentName;
	public String ComponentNameSpace;
	public String NameSpaceInterfaces;
	//public ComponentInterface CI_input;
	public IProject project;
	public EObject eobject;


	public void init(IWorkbench workbench, IStructuredSelection selection, Collection<? extends EObject> CI, Map<String, Object> nameSpace) {
		this.workbench = workbench;
		this.selection = selection;
		//@SuppressWarnings("unchecked")
		//Collection <ComponentInterface> ci_collection = (Collection<ComponentInterface>) CI;
		//new ComponentInterfaceStandaloneSetup().createInjectorAndDoEMFRegistration();
		//CI_input = ci_collection.iterator().next();
		//ComponentName = CI_input.getName();
		//ComponentNameSpace = CI_input.getNameSpace();
		ComponentName = CI.toString().substring(CI.toString().indexOf("name:")+6,CI.toString().indexOf(","));
		ComponentNameSpace = CI.toString().substring(CI.toString().indexOf("NameSpace:")+11,CI.toString().indexOf(")]"));
		if (ComponentNameSpace.equalsIgnoreCase("null"))
			ComponentNameSpace="";
		project = workbench.getActiveWorkbenchWindow().getActivePage().getActiveEditor().getEditorInput().getAdapter(IResource.class).getProject();
	    setWindowTitle(ComponentInterfaceEditorPlugin.INSTANCE.getString("_UI_Wizard_label"));
		setDefaultPageImageDescriptor(ExtendedImageRegistry.INSTANCE.getImageDescriptor(ComponentInterfaceEditorPlugin.INSTANCE.getImage("full/wizban/NewComponentInterface")));
	}

	@Override
	public boolean performFinish() {
		try {
			final String Inputpath = getInputFileCreationPage.getPath();
			//TODO: this only works if the ros model is in the same eclipse project
			String RelativePath = Inputpath.replace(project.getLocation().toString(), project.getName());
			ResourceSet rs = new ResourceSetImpl();
			//Injector injector = Guice.createInjector(new RosRuntimeModule());
			//XtextResourceSet rs = injector.getInstance(XtextResourceSet.class);
			//rs.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
			//new RosStandaloneSetup().createInjectorAndDoEMFRegistration();
			Resource resource = rs.getResource(URI.createPlatformResourceURI(RelativePath,true),true);			
			PackageSet packageSet_model = (PackageSet) resource.getContents().get(0);
			EList<Package> package_model= (EList<Package>) packageSet_model.getPackage();
			EList<Artifact> artifact = (EList<Artifact>) package_model.get(0).getArtifact();
			Node rosnode = (Node) artifact.get(0).getNode();

			EList <Publisher> pubs = (EList<Publisher>) rosnode.getPublisher();
			EList <Subscriber> subs = (EList<Subscriber>) rosnode.getSubscriber();
			EList <ServiceClient> scls = (EList<ServiceClient>) rosnode.getServiceclient();
			EList <ServiceServer> ssrs = (EList<ServiceServer>) rosnode.getServiceserver();

			WorkspaceModifyOperation operation =
				new WorkspaceModifyOperation() {
					@Override
					protected void execute(IProgressMonitor progressMonitor) {
						try {
							Collection<Session> sessions = SessionManager.INSTANCE.getSessions(); 
							String representation_name = workbench.getActiveWorkbenchWindow().getActivePage().getActiveEditor().getEditorInput().getName();
							 for (Session session:sessions) {
								 DAnalysis slaveAnalysis=(DAnalysis)session.getSessionResource().getContents().get(0);
								 EList<DView> owned_views = slaveAnalysis.getOwnedViews();
								 for (DView view:owned_views) {
									 if (view.getOwnedRepresentationDescriptors().toString().contains(representation_name)) {
										for (EObject rossystem:view.getModels()) {
											for (ComponentInterface component:((RosSystem) rossystem).getRosComponent()) {
												if (component.getName().equalsIgnoreCase(ComponentName)) {
													NameSpaceInterfaces = "";
													if (!(ComponentNameSpace.length()==0))
														NameSpaceInterfaces = ComponentNameSpace + "/";
													for (Publisher pub:pubs) {
														RosPublisher rospub = new RosPublisherImpl();
														rospub.setName(NameSpaceInterfaces+pub.getName());
														rospub.setNs(ComponentNameSpace);
														rospub.setPublisher(pub);
														component.getRospublisher().add(rospub);
													}
													for (Subscriber sub:subs) {
														RosSubscriber rossub = new RosSubscriberImpl();
														rossub.setName(NameSpaceInterfaces+sub.getName());
														rossub.setNs(ComponentNameSpace);
														rossub.setSubscriber(sub);
														component.getRossubscriber().add(rossub);
													}
													for (ServiceClient scl:scls) {
														RosServiceClient rosscl = new RosServiceClientImpl();
														rosscl.setName(NameSpaceInterfaces+scl.getName());
														rosscl.setNs(ComponentNameSpace);
														rosscl.setSrvclient(scl);
														component.getRosserviceclient().add(rosscl);
													}
													for (ServiceServer ssr:ssrs) {
														RosServiceServer rosssr = new RosServiceServerImpl();
														rosssr.setName(NameSpaceInterfaces+ssr.getName());
														rosssr.setNs(ComponentNameSpace);
														rosssr.setSrvserver(ssr);
														component.getRosserviceserver().add(rosssr);
													}				 
					}}}}}}}catch (Exception exception) {
						ComponentInterfaceEditorPlugin.INSTANCE.log(exception);
					}
					finally {
						progressMonitor.done();
					}
					}};
			getContainer().run(false, false, operation);
			return true;
		}catch (Exception exception) {
			ComponentInterfaceEditorPlugin.INSTANCE.log(exception);
			return false;
		}
	}

	public class SelectinputFile extends WizardSelectionPage{
	    private Composite container;
	    private Text locationPathField;
		private Button browseButton;
		private String path;
		protected SelectinputFile(String pageId) {
			super(pageId);
		}
		@Override
		public void createControl(Composite parent) {
	        container = new Composite(parent, SWT.NONE);
			GridLayout layout = new GridLayout(2, false);
			container.setLayout(layout);
			locationPathField = new Text(container, SWT.BORDER | SWT.SINGLE);
			GridData gd = new GridData (GridData.FILL_HORIZONTAL);
			gd.grabExcessHorizontalSpace = true;
			gd.horizontalAlignment = GridData.FILL;
			locationPathField.setLayoutData(gd);
			browseButton = new Button(container, SWT.PUSH);
			browseButton.setText("Browse...");
			browseButton.addSelectionListener(new SelectionListener() {
				public void widgetDefaultSelected(SelectionEvent e) {
				}
					public void widgetSelected(SelectionEvent e) {
						FileDialog dlg = new FileDialog(getShell(),  SWT.OPEN  );
						dlg.setText("Open");
						dlg.setFilterExtensions(new String[] { "*.ros" } );
						dlg.setFilterPath(project.getLocation().toString());
						path = dlg.open();
						if (path == null) return;
						locationPathField.setText(path);
					}
			});
	        setControl(container);
	        setPageComplete(true);
			}

		public String getPath() {
			return path;
		}
	}

	@Override
	public void addPages() {
		getInputFileCreationPage = new SelectinputFile("Whatever4");
		getInputFileCreationPage.setTitle("Select ROS model input");
		getInputFileCreationPage.setDescription("Select ROS model input");
		addPage(getInputFileCreationPage);
	}


	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub
		
	}

}
