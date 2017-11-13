package com.eric.lab10;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/*
 *The default username is “RMI” and password is “DIT” for login.
b) Create a Server class implements Login interface and contains the implementation
of above three methods i.e. verifyLogin, modifyLogin and getPassword. 
 * 
 * */

public class Server implements Login{


	public String username = "RMI"; //default username
	public String password = "DIT"; //default password
	
	public int verifyLogin(String username, String password) {
		// It return 0 if username or password is wrong and returns 1 if it’s correct. 
		if(!username.equals(this.username) || !password.equals(this.password)) {
			return 0;
		}
		else {
			return 1;
		}
		
	}


	public void modifyLogin(String usrname, String password) {
		// It modify the default username and password and return nothing.
		this.username = usrname;
		this.password = password;
		System.out.println("Password and Username updated");
		
		
	}


	public String getPassword() {
		// It returns the updated password.
		return this.password;
	}
	
	public static void main(String[] args)  {
		
		try {
			Server obj = new Server();
			Login stub = (Login) UnicastRemoteObject.exportObject(obj,0);
			Registry registry = LocateRegistry.getRegistry();
			registry.bind("Login", stub);
			System.out.println("Server is Running");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
