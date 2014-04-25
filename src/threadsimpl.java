/************************************************************************
*	Code: ThreadsImpl remote object					*
*	Filename: threadsimpl.java					*
*									*
*	Date: 29th October 2000						*
*									*
*	Description: The remote object implementation of the threads    *
*	interface's described behaviour.				*
*									*
*************************************************************************/

import java.rmi.*;
import java.lang.*;

public class threadsimpl
    extends java.rmi.server.UnicastRemoteObject implements threads {

    // Constructor
    public threadsimpl()
        throws RemoteException {
        super();
    }
 
   /***********************************************************************
    * Method: MethodOne 						  *
    * Description: Displays 25 messages to the screen indicating it is	  * 
    *		   currently executing.					  *
    * Parameters: None							  *
    * Returns:	  Nothing 						  *
    **********************************************************************/
 
    public void MethodOne()
	throws RemoteException {
	
	long TimeOne = System.currentTimeMillis();

	for(int index=0;index<25;index++){
		System.out.println("Method ONE executing");
		
		// Insert a half-second (approx.) delay
		do{
		}while ((TimeOne+500)>System.currentTimeMillis());
		
		TimeOne = System.currentTimeMillis();
	}
    }

   /***********************************************************************
    * Method: MethodTwo 						  *
    * Description: Displays 25 messages to the screen indicating it is	  * 
    *		   currently executing.					  *
    * Parameters: None							  *
    * Returns:	  Nothing 						  *
    **********************************************************************/ 

    public void MethodTwo()
	throws RemoteException {

	long TimeTwo = System.currentTimeMillis();

	for(int index=0;index<25;index++){
		System.out.println("Method TWO executing");
		
		// Insert a half-second (approx.) delay
		do{
		}while ((TimeTwo+500)>System.currentTimeMillis());
		
		TimeTwo = System.currentTimeMillis();
	}
    }
}

