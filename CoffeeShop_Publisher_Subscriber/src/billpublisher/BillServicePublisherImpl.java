package billpublisher;
import java.util.Scanner;

import com.res1.Strings;

public class BillServicePublisherImpl implements BillServicePublisher {
	
	Strings STRING = new Strings();

	@Override
	public boolean billingMethod() {
		int method,card_number,security_code;
	    boolean isvalid = false;
	    String expire_date;
	    
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.println(STRING.BILLING_METHOD);
	    method = scanner.nextInt();
	    
	    if(method == 1){
	      isvalid = true;
	      
	      return isvalid;
	    }
	    else if(method == 2){
	  
	      while (!isvalid) {
				System.out.print(STRING.CARD_NUMBER_PROMPT);
		        card_number = scanner.nextInt();
	            System.out.println(card_number);

	            System.out.print(STRING.EXPIRY_DATE_PROMPT);
		        expire_date = scanner.next();
	            System.out.println(expire_date);

	            System.out.print(STRING.SECURITY_CODE_PROMPT);
		        security_code = scanner.nextInt();
	            System.out.println(security_code);
	        
				if (Integer.toString(card_number).length() == 6) {
					isvalid = true;
	                break;
				} else {
					System.out.println(STRING.INVALID_CARD_NUMBER);
					continue;
				}
			}
			
	     }
	    
	    return isvalid;
	}

}
