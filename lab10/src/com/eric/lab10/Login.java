package com.eric.lab10;
/*
 * a) Create a Login interface which extends from “Remote” and have three methods
	int verifyLogin (String username, String password)
	
	It return 0 if username or password is wrong and returns 1 if it’s correct.
	void modifyLogin (String username, String password)
	
	It modify the default username and password and return nothing.
	String getPassword ()
	It returns the updated password.
 * 
 * */

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Login extends Remote {
	
	int verifyLogin(String username, String password) throws RemoteException;
	
	void modifyLogin(String usrname, String password) throws RemoteException;
	
	String getPassword() throws RemoteException;
}
