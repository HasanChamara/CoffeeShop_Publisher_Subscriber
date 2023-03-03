package cartpublisher;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import com.res2.Strings;

import cartpublisher.CartServicePublisher;
import cartpublisher.CartServicePublisherImpl;

public class CartActivator implements BundleActivator {

	ServiceRegistration publishServiceRegistrion;
	Strings STRING = new Strings();

	public void start(BundleContext context) throws Exception {
		CartServicePublisher BillServicePublish = new CartServicePublisherImpl();
		publishServiceRegistrion = context.registerService(CartServicePublisher.class.getName(), BillServicePublish, null);
//		System.out.println(STRING.CART_SERVICE_START);
	}

	public void stop(BundleContext context) throws Exception {
		publishServiceRegistrion.unregister();
//		System.out.println(STRING.CART_SERVICE_STOP);
	}

}
