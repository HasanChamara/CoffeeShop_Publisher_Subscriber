package cartpublisher;

import java.util.HashMap;

public interface CartServicePublisher {
	public void cart(HashMap<Integer, Integer> itemList);

	double typeselect1(int selector);
}
