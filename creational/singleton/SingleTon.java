package com.shrajan.creational.singleton;

import java.io.Serializable;

public class SingleTon implements Serializable,Cloneable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static SingleTon instance;
	
	
	private SingleTon() throws Exception {
		if(instance!=null){
	        throw new Exception(">>> Tumse na Ho Pai");
	    }
	}
	
	//Used block level synchronization to have protection against multiple Threads
	public static SingleTon getInstance() throws Exception {
		synchronized(SingleTon.class) {if(instance==null) {
			instance = new SingleTon();
		}}
		
		
		
		return instance;
	}
	 protected Object readResolve() { 
		 return instance; 
		 
	 }
	
	    @Override
	    protected Object clone()
	        throws CloneNotSupportedException
	    {
	        throw new CloneNotSupportedException(">>> Bro Singleton Hai, Kyu Bekar mein");
	    }
	
	
}
