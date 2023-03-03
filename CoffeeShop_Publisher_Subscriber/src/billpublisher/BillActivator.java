package billpublisher;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import com.res1.Strings;

public class BillActivator implements BundleActivator {

	ServiceRegistration publishServiceRegistrion;
	Strings STRING = new Strings();

	public void start(BundleContext context) throws Exception {
		BillServicePublisher BillServicePublish = new BillServicePublisherImpl();
		publishServiceRegistrion = context.registerService(BillServicePublisher.class.getName(), BillServicePublish, null);
//		System.out.println(STRING.BILL_SERVICE_START);
	}

	public void stop(BundleContext context) throws Exception {
		publishServiceRegistrion.unregister();
//		System.out.println(STRING.BILL_SERVICE_STOP);
	}

}
