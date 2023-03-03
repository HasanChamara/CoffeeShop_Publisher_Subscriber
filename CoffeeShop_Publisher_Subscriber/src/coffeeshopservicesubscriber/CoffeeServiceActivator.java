package coffeeshopservicesubscriber;
import java.util.Scanner;

import coffeepublisher.Coffee;
import coffeepublisher.CoffeePublisher;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import billpublisher.BillServicePublisher;
import cartpublisher.CartServicePublisher;



public class CoffeeServiceActivator implements BundleActivator {

	ServiceReference serviceReference,serviceReference2,serviceReference3;
	Scanner qtsc = new Scanner(System.in);
	public void start(BundleContext context) throws Exception {

//		System.out.println("Start Subscriber Service");
		serviceReference = context.getServiceReference(CoffeePublisher.class.getName());
		CoffeePublisher coffeePublisher = (CoffeePublisher) context.getService(serviceReference);
		String qt = "N";
		
		while("N".equalsIgnoreCase(qt)) {
			Coffee coffee = coffeePublisher.menu();
			
			if("Y".equalsIgnoreCase(coffee.getBuyOrNo())) {
				
				serviceReference2 = context.getServiceReference(CartServicePublisher.class.getName());
				CartServicePublisher cartServicePublisher = (CartServicePublisher) context.getService(serviceReference2);
				
				
				cartServicePublisher.cart(coffee.getItemList());
				
				
				serviceReference3 = context.getServiceReference(BillServicePublisher.class.getName());
				BillServicePublisher billPublisher = (BillServicePublisher) context.getService(serviceReference3);
				
				boolean isTrue = billPublisher.billingMethod();
				if(isTrue) {
					System.out.println("Transaction Complete!");
				}
			}else {
				System.out.println("!!ERROR!!");
				
			}
			
			System.out.println("Do you want to quit ? (Y/N)");
			qt =  qtsc.next().toString();
			if(qt.equalsIgnoreCase("Y")) {
				System.out.println("thank you and come agian!");
				break;
			}		
		
		}

	

	}

	public void stop(BundleContext context) throws Exception {

//		System.out.println("Stop Subscriber Service, Good Byee!");
		context.ungetService(serviceReference);
	}

}
