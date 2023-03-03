package coffeepublisher;

import java.util.HashMap;

public class Coffee {
	
	String buyOrNo;
	HashMap<Integer, Integer> itemList;
	
	
	
	public Coffee(String buyOrNo, HashMap<Integer, Integer> itemList) {
		super();
		this.buyOrNo = buyOrNo;
		this.itemList = itemList;
	}
	public String getBuyOrNo() {
		return buyOrNo;
	}
	public void setBuyOrNo(String buyOrNo) {
		this.buyOrNo = buyOrNo;
	}
	public HashMap<Integer, Integer> getItemList() {
		return itemList;
	}
	public void setItemList(HashMap<Integer, Integer> itemList) {
		this.itemList = itemList;
	}
	

	

}
