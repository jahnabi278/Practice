package test.main;

import java.util.List;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		MyProducer producer = new MyProducer();
		System.out.println("Started .....");
		Thread t1 = new Thread(producer);
		t1.start();
		
		System.out.println("..............processing .....");
		List<Integer> producedList = producer.getTheIntegerList();

		System.out.println("size of list :"+producedList.size());

		Thread t2 = new Thread(new MyConsumer(producedList));
		t2.start();
		t2.sleep(4000);
		
		t1.wait();
		
	}

}
