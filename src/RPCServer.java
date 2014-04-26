import java.rmi.registry.LocateRegistry;
import java.rmi.Naming;		//Import naming classes to bind to rmiregistry
import java.rmi.RemoteException;
import java.util.HashMap;

public class RPCServer
{
	public static void main(String args[]) throws RemoteException
	{
		long timestart = System.currentTimeMillis();
		int port;
		if (args.length < 1) // If there isn't at least one command line argument
		{
			System.out.println("Server will use default port 1099 at " + (System.currentTimeMillis()-timestart) + " milliseconds");
			port = 1099;
		}
		else
		{
			port = Integer.parseInt(args[0]); // Port # to listen for messages at
		}
		HashMap<String, String> store = new HashMap<String, String>(); // Map for storing key/value pairs
		System.out.println("Server Start at " + (System.currentTimeMillis()-timestart) + " milliseconds");
		LocateRegistry.createRegistry(port); // start the rmiregistry at the specificed port
		try
		{
			RPCServerInterface c = new RPCServerImplementation(store, timestart); // use a new thread to provide each service
       		Naming.rebind("rmi://localhost:" + port + "/ThreadsService", c); // bind the service to the machine the server program is being run on
		} 
		catch (Exception e)
		{
			System.out.println("Server Error: " + e);
			e.printStackTrace();
		}
	}
}
