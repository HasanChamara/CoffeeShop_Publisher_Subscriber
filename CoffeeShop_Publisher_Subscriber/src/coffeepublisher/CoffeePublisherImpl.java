package coffeepublisher;

import java.util.HashMap;
import java.util.Scanner;
import com.res3.Strings;

public class CoffeePublisherImpl implements CoffeePublisher {
	
	/*
	 * displays the menu to buy ice cream
	 * 	> asks user to select a flavor
	 *  > asks user to input number of items
	 *  > calculate total
	 *  > asks user if they want to proceed to buy
	 *  > returns an IceCream object with response for buy and total  
	 */
	@Override
	public Coffee menu() {
		
		Strings STRING = new Strings();
		String another= "N";
		String buyOrNO;
		
		HashMap<Integer, Integer> itemList = new HashMap<Integer, Integer>();
		
		itemList.put(1,0);
		itemList.put(2,0);
		itemList.put(3,0);
		itemList.put(4,0);
		itemList.put(5,0);
		itemList.put(6,0);
		
		double amount = 0;
		double total = 0.0;
		int count = 1;
		int type;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(STRING.BANNER);
		System.out.println();
		System.out.println(STRING.COFFEE_MENU);
		
		do {
			do {
				System.out.print(STRING.SELECT_COFFEE);
				type = sc.nextInt();
				amount = Calculations.typeselect(type);
			}while(amount == 0);		
			
			System.out.print(STRING.NO_OF_ITEMS);
			count = sc.nextInt();
			
			itemList.put(type,count);
			
//			total += Calculations.getTotal(count,amount); 
			
			System.out.println(STRING.ANOTHER);
			another = sc.next().toString();
			
		}while(!another.equalsIgnoreCase("N"));
		
		System.out.println(STRING.BUY_RESPONSE);
		buyOrNO = sc.next().toString();
		
//		for(int i=0;i<=5;i++) {
//			
//		}
//		sc.close();
		Coffee coffee = new Coffee(buyOrNO, itemList);
		return coffee;
	}

}
