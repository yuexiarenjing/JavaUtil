package concurrent;

public class RunnableSample implements Runnable{

	private Thread t;
	private String threadName;
	
	public RunnableSample(String name) {
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
	
	public void start() {
		System.out.println("Starting " +  threadName );
		if(t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}
	
	public static void main(String[] args) {
		RunnableSample r1 = new RunnableSample("Task-1");
		r1.start();
		RunnableSample r2 = new RunnableSample("Task-2");
		r2.start();
	}
}
