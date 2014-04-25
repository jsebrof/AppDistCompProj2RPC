/**********************************************************************************************
*											      *
*	Code: Thread Client								      *
*											      *
*	Filename: threadsclient.java							      *
*											      *
*	Date: 29th October 2000								      *
*											      *
*	Description: Simple client program that remotely calls one of the looping methods     *
*	provided by the remote service, depending on the command line argument.		      *
*											      *
***********************************************************************************************/

import java.rmi.Naming;			// Import rmi naming - so you can lookup remote objects
import java.rmi.RemoteException;	// Import exceptions
import java.net.MalformedURLException;	
import java.rmi.NotBoundException;	

public class threadsclient {

    public static void main(String[] args) {
        
	try {

	    // Create the reference to the remote object through the rmiregistry			
            threads c = (threads)
                           Naming.lookup("rmi://localhost/ThreadsService");
            
	    // Now use the reference c to call remote method
	    if (args[0].equals("one"))
	    	c.MethodOne();
	    else if (args[0].equals("two"))
		c.MethodTwo();
	    else
		System.out.println("Error: correct usage - treadsclient {one|Two}"); 		
        }

        // Catch the exceptions - rubbish URL, Remote exception or Not bound exception.
	catch (MalformedURLException murle) {
            System.out.println("MalformedURLException"+murle);
        }
        catch (RemoteException re) {
            System.out.println("RemoteException"+re);
        }
        catch (NotBoundException nbe) {
            System.out.println("NotBoundException"+nbe);
        }
    }
}

