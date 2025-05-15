package test.main;

import java.util.ArrayList;
import java.util.List;

public class MyProducer implements Runnable {
	List<Integer> listOfInt = new ArrayList<>();

	@Override
	public void run() {

		// // producer keep producinh tilll say stop
		// consumer consumes till list is empty

		int n = 10;
		for (int i = 1; i <= n; i++) {
			listOfInt.add(i);
		}
		System.out.println(listOfInt.toString());

	}

	public List<Integer> getTheIntegerList() {
		return listOfInt;
	}

}
