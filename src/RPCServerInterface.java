public interface RPCServerInterface extends java.rmi.Remote 
{	
	public String Put(String key, String value) throws java.rmi.RemoteException;
	public String Get(String key) throws java.rmi.RemoteException;
	public String Delete(String key) throws java.rmi.RemoteException;
}

