public class Counter{

	long count = 0;

	public synchronized void add(String name, long value){
//	public void add(String name, long value){ // leads to inconsistency
		long temp = count;
		this.count += value;
		System.out.println(name + " added " + value + " to " + temp + " to equal " + count);
	}
}