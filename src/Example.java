public class Example {

	public static void main(String[] args){
		Counter counter = new Counter();
		Thread  threadA = new CounterThread("A", counter);
		Thread  threadB = new CounterThread("B", counter);
		Thread  threadC = new CounterThread("C", counter);
		Thread  threadD = new CounterThread("D", counter);
		Thread  threadE = new CounterThread("E", counter);
		Thread  threadF = new CounterThread("F", counter);

		threadA.start();
		threadB.start();
		threadC.start();
		threadD.start();
		threadE.start();
		threadF.start();
	}
}