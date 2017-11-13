package com.eric.lab10C;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.eric.lab10.Login;

/*
 * The default username is “RMI” and password is “DIT” for login.
 * 
c) Create a Client class, which will call all three methods.
 * 
 * 
 * */

public class Client{

	public static void main(String[] args)  {
	
			
			try {
				Registry registry = LocateRegistry.getRegistry("localhost");
				Login stub = (Login) registry.lookup("Login");
				System.out.println("current password: " + stub.getPassword());
				System.out.println("login attempt: (1 means its successful)" + stub.verifyLogin("RMI", "DIT"));
				stub.modifyLogin("eric", "eric");
				System.out.println("update pasword: to username:eric password:eric");
				System.out.println("login attempt: (1 means its successful)" + stub.verifyLogin("RMI", "DIT"));
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
			
			
	
		
	}

}
