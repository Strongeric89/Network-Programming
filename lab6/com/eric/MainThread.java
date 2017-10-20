package com.eric;

public class MainThread extends Thread{
	public void run() {
		System.out.println("Main thread running");
		
		SinThread sin = new SinThread("Sin");
		sin.start();
		
		CosThread cos = new CosThread("Cos");
		cos.start();
		
		TanThread tan = new TanThread("Tan");
		tan.start();
		
		try {
			sin.join();
			cos.join();
			tan.join();
			
			double p = sin.x + cos.y + tan.z;
			System.out.println(p);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
		
		
		
		
	}
	
	public MainThread(String name) {
		super(name);
	}
	
	
	public static void main(String[] args) {
		
		MainThread mainthread = new MainThread("Main thread");
		mainthread.start();
		
		
		
		
		
		
		
		
		
	}//end main method
}

class SinThread extends Thread{
	double x;
	public void run() {
		System.out.println(getName() + " is running");
		double x = Math.sin(Math.toRadians(45));
		this.x = x;
		
	}
	
	public SinThread(String name) {
		super(name);
	}
	
}

class TanThread extends Thread{
	double z;
	public void run() {
		System.out.println(getName() + " is running");
		double z = Math.tan(Math.toRadians(30));
		this.z = z;
	}
	
	public TanThread(String name) {
		super(name);
	}
	
}

class CosThread extends Thread{
	
	double y;
	
	public void run() {
		System.out.println(getName() + " is running");
		double y = Math.cos(Math.toRadians(60));
		this.y = y;
	}
	public CosThread(String name) {
		super(name);
	}
	
}
