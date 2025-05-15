package com.example.demo;

public class RunnableMain {

	public static void main(String[] args) {
		
		System.out.println("Current thtread is - "+Thread.currentThread().getName());
		Thread demoThread = new Thread(new RunnableMain().new RunnableDemo());
		demoThread.start();
		Thread t2 = new Thread();
		System.out.println(t2.getState());
		System.out.println(t2.getPriority());
		System.out.println(t2.isAlive());
		System.out.println(t2.interrupted());
	}
	private class RunnableDemo implements Runnable{

		@Override
		public void run() {
			System.out.println("Current thread is -"+ Thread.currentThread().getName());
			
		}
		
	}

}
