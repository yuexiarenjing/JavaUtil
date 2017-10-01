package concurrent;

public class ThreadSample extends Thread {
	private Thread t;
	private String threadName;
	
	public ThreadSample(String name) {
		threadName = name;
		System.out.println("Creating " +  threadName );
	}
	
	@Override
	public void run() {
      System.out.println("Running " +  threadName );
      try {
         for(int i = 4; i > 0; i--) {
            System.out.println("Thread: " + threadName + ", " + i);
            // 让线程睡眠一会
            Thread.sleep(50);
         }
      }catch (InterruptedException e) {
         System.out.println("Thread " +  threadName + " interrupted.");
      }
      System.out.println("Thread " +  threadName + " exiting.");
	}
	
	@Override
	public void start() {
		System.out.println("Starting " +  threadName );
		if(t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}
	
	public static void main(String[] args) {
		ThreadSample r1 = new ThreadSample("Task-1");
		r1.start();
		ThreadSample r2 = new ThreadSample("Task-2");
		r2.start();
	}
}
