class ThreadDemo extends Thread {
	private Thread t;
	private String threadName;
	public Integer count;

	ThreadDemo(String name, Integer this_count){
		count = this_count;
		threadName = name;
		System.out.println("Creating " +  threadName );
	}

	public void start ()
	{
		System.out.println("Starting " +  threadName );
		if (t == null)
		{
			t = new Thread (this, threadName);
			t.start ();
		}
	}

	public void run() {
		System.out.println("Running " +  threadName );
		try {
			for(int i = 5; i > 0; i--) {
				count--;
				System.out.println("Thread: " + threadName + ", " + count);
				// Let the thread sleep for a while.
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Thread " +  threadName + " interrupted.");
		}
		System.out.println("Thread " +  threadName + " exiting.");
	}
}

public class TestThread {
	public static void main(String args[]) {
		Integer count = new Integer(14);

		ThreadDemo T1 = new ThreadDemo( "Thread-1", count);
		T1.start();

		ThreadDemo T2 = new ThreadDemo( "Thread-2", count);
		T2.start();
	}   
}