import java.rmi.RemoteException;
import java.util.HashMap;

public class RPCServerImplementation extends java.rmi.server.UnicastRemoteObject implements RPCServerInterface {
	private static final long serialVersionUID = -3503888069129478963L;
	private HashMap<String, String> store;
	private long timestart;

	// Constructor
	public RPCServerImplementation(HashMap<String, String> the_store, long the_time) throws RemoteException
	{
		super();
		store = the_store;
		timestart = the_time;
	}

	public synchronized String Put(String key, String value) throws RemoteException // synchronized means thread safety
	{
		String return_string;
		if (store.containsKey(key))
		{
			return_string = "Replaced Value \"" + store.containsKey(key) + "\" for Value \"" + value + "\" for Key \"" + key + "\"";
		}
		else
		{
			return_string = "Placed Key \"" + key + "\" and Value \"" + value + "\" into the Key/Value store";
		}
		store.put(key, value); // place key/value into the Map
		System.out.println(return_string + " at " + (System.currentTimeMillis()-timestart) + " milliseconds");
		return return_string;
	}

	public synchronized String Get(String key) throws RemoteException
	{
		String return_string = "Value for Key \"" + key + "\" not found in Key/Value store";
		if (store.containsKey(key))
		{
			return_string = "Value for Key \"" + key + "\" is \"" + store.get(key) + "\"";
			System.out.println(return_string + " retrieved at " + (System.currentTimeMillis()-timestart) + " milliseconds");
		}
		else
		{
			System.out.println(return_string + " at " + (System.currentTimeMillis()-timestart) + " milliseconds");
		}
		return return_string;
	}

	public synchronized String Delete(String key) throws RemoteException
	{
		String return_string;
		if (store.containsKey(key))
		{
			return_string = "Key \"" + key + "\" Value \"" + store.get(key) + "\" deleted";
			System.out.println(return_string + " at " + (System.currentTimeMillis()-timestart) + " milliseconds");
			store.remove(key); // delete key/value from the Map
		}
		else
		{
			return_string = "No value found in store for Key \"" + key + "\"";
			System.out.println(return_string + " at " + (System.currentTimeMillis()-timestart) + " milliseconds");
		}
		return return_string;
	}
}

