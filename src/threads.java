/**************************************************************************
*	Code: Threads Interface						  *
*									  *	
*	Filename: threads.java						  *
*									  *
*	Date: 29th October 2000						  *
*									  *
*	Description: The Threads interface provides 2 remote	 	  *
*	looping methods available as part of the service provided	  *
*	by the remote object ThreadsImpl				  *
*									  *
**************************************************************************/	


public interface threads
          extends java.rmi.Remote {	
    
   /***********************************************************************
    * Method: MethodOne 						  *
    * Description: Displays 25 messages to the screen indicating it is	  * 
    *		   currently executing.					  *
    * Parameters: None							  *
    * Returns:	  Nothing 						  *
    **********************************************************************/
    public void MethodOne()
        throws java.rmi.RemoteException;

    /**********************************************************************
    * Method: MethodTwo	 						  *
    * Description: Displays 25 messages to the screen indicating it is	  * 
    *		   currently executing.					  *
    * Parameters: None							  *
    * Returns:	  Nothing 						  *
    **********************************************************************/
    public void MethodTwo()
        throws java.rmi.RemoteException;

}

