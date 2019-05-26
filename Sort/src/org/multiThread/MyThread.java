package org.multiThread;

public class MyThread implements Runnable{
	//private Thread t;
	String threadName ;
	public final static Object obj = new Object();

	public MyThread(String name){
		threadName= name;
	}
	/*public void start () {
	      System.out.println("Starting " +  threadName );
	      if (t == null) {
	         t = new Thread (this, threadName);
	         t.start ();
	      }
	   }*/
	@Override
	public void run() {
		// TODO Auto-generated method stub
	    System.out.println(" start of "+ threadName);
	    synchronized (obj) {
	    	for (int t =0; t<4 ; t++) {
				System.out.println(threadName +" "+ t);
				try {
					Thread.sleep(2000);
					if (t==1 ) obj.wait(4000);
					if (t>2)
						obj.notifyAll();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
