package org.multiThread;

public class ThreadDemo {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MyThread mt1 = new MyThread("Thread-1");
		Thread t1 = new Thread(mt1);
		t1.start();
		
		MyThread mt2 = new MyThread("Thread-2");
		Thread t2= new Thread(mt2);
		t2.start();
		
		MyThread mt3 = new MyThread("Thread-3");
		Thread t3= new Thread(mt3);
		t3.start();
		t1.join();
		}
}
