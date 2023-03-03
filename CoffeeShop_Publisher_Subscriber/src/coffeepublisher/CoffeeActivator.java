package coffeepublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class CoffeeActivator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;

	public void start(BundleContext bundleContext) throws Exception {
//		System.out.println("IceCreamPublisher Start");
		CoffeePublisher publisherService = new CoffeePublisherImpl();
		publishServiceRegistration = bundleContext.registerService(CoffeePublisher.class.getName(), publisherService, null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		
//		System.out.println("IceCreamPublisher Stop");
		publishServiceRegistration.unregister();
		
		
	}

}
