public class CounterThread extends Thread{
	private String name;
	protected Counter counter = null;

	public CounterThread(String the_name, Counter counter){
		name = the_name;
		System.out.println("Thread " + name + " started");
		this.counter = counter;
	}

	public void run() {
		for(int i=0; i<30; i++){
			counter.add(name, 1);
		}
	}
}