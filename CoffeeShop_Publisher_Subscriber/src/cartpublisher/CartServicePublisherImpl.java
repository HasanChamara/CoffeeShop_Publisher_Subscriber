package cartpublisher;
import java.util.HashMap;

public class CartServicePublisherImpl implements CartServicePublisher{
	
	public void cart(HashMap<Integer, Integer> itemList){
		double totalPrice = 0.0;
		System.out.println("\n\n");
	    for(int x = 1; x <= itemList.size(); x++){
	      if(itemList.get(x) > 0){
	        totalPrice = totalPrice +  (itemList.get(x) * this.typeselect1(x));
	        System.out.println(" X " + itemList.get(x));
	      }
	      
	    }
	    System.out.println("\n\nTotal Price\t\t : " + totalPrice);
	   
	}

	@Override
	public double typeselect1(int selector) {
		double amount = 0; 
		
		HashMap<Integer ,Double> priceChart = new HashMap<Integer, Double>();
		priceChart.put(1, 120.00);
		priceChart.put(2, 130.00);
		priceChart.put(3, 110.00);
		priceChart.put(4, 140.00);
		priceChart.put(5, 125.00);
		priceChart.put(6, 150.00);

		
			switch (selector) {
	
			case 1:
				amount = (Double)priceChart.get(1);
				System.out.print("Black Coffee\t : "+ priceChart.get(1));
				break;
	
			case 2:
				amount = (Double)priceChart.get(2);
				System.out.print("Instant Coffee\t : "+ priceChart.get(2));
				break;
	
			case 3:
				amount = (Double)priceChart.get(3);
				System.out.print("Cappuccino\t : "+ priceChart.get(3));
				break;
	
			case 4:
				amount = (Double)priceChart.get(4);
				System.out.print("Americano\t\t : "+ priceChart.get(4));
				break;
			case 5:
				amount = (Double)priceChart.get(5);
				System.out.print("Espresso\t\t : "+ priceChart.get(5));
				break;
	
			case 6:
				amount = (Double)priceChart.get(6);
				System.out.print("Mocha\t\t : "+ priceChart.get(6));
				break;
	
			default:
				break;
			}
		
		return amount;
	}
}
