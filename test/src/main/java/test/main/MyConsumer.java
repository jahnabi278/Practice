package test.main;

import java.util.List;

public class MyConsumer implements Runnable {
	List<Integer> intList;

	public MyConsumer(List<Integer> producedList) {
		this.intList = producedList;
	}

	@Override
	public void run() {
		System.out.println("size of list :"+intList.size());
		for (Integer integer : intList) {
			intList.remove(integer);
			
		}
		System.out.println("size of list :"+intList.size());

	}

}
