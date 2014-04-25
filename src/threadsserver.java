/*************************************************************************
*	Code: Threads Server						 *
*									 *
*	Filename: threadsserver.java					 *
*									 *
*	Date: 29th October 2000						 *
*									 *
*	Description: Server code for hosting the threadsimpl object.	 *
*									 *
**************************************************************************/


import java.rmi.Naming;		//Import naming classes to bind to rmiregistry

public class threadsserver {

   //threadsserver constructor

   public threadsserver() {
     
   	//Construct a new threadsimpl object and bind it to the local rmiregistry
   
   	try {
       		threads c = new threadsimpl();
       		Naming.rebind("rmi://localhost/ThreadsService", c);
   	} 
     	catch (Exception e) {
       		System.out.println("Server Error: " + e);
     	}
   }

   public static void main(String args[]) {
     	
	//Create the new threads server
	new threadsserver();
   }
}
