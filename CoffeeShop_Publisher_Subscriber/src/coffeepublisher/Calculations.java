package coffeepublisher;

import java.util.HashMap;

public class Calculations {

	public static double typeselect(int selector) {
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
				amount = amount + (Double)priceChart.get(1);
				System.out.println("Coffee Price : "+ priceChart.get(1));
				break;
	
			case 2:
				amount = amount + (Double)priceChart.get(2);
				System.out.println("Coffee Price : "+ priceChart.get(2));
				break;
	
			case 3:
				amount = amount + (Double)priceChart.get(3);
				System.out.println("Coffee Price : "+ priceChart.get(3));
				break;
	
			case 4:
				amount = amount + (Double)priceChart.get(4);
				System.out.println("Coffee Price : "+ priceChart.get(4));
				break;
			case 5:
				amount = amount + (Double)priceChart.get(5);
				System.out.println("Coffee Price : "+ priceChart.get(5));
				break;
	
			case 6:
				amount = amount + (Double)priceChart.get(6);
				System.out.println("Coffee Price : "+ priceChart.get(6));
				break;
	
			default:
				System.out.print("Invalid number. Please enter valid number: ");
				break;
			}
		
		return amount;
	}
	
//	public static double getTotal(int number, double price) {
//		return number*price;
//	}
}
