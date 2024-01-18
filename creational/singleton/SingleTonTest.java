package com.shrajan.creational.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class SingleTonTest {

	public static void main(String[] args) throws Exception {
		SingleTon instannceOne = SingleTon.getInstance();

		SingleTon instanceTwo = SingleTon.getInstance();
		
		System.out.println(instannceOne.equals(instanceTwo));
		
		
		// Reflection Attack
		
		
		/*
		 * Constructor[] constructors = SingleTon.class.getDeclaredConstructors();
		 * 
		 * for(Constructor construct: constructors) { construct.setAccessible(true);
		 * instanceTwo = (SingleTon)construct.newInstance(); }
		 * 
		 * System.out.println(instannceOne.equals(instanceTwo));
		 */
		
		
		
		
		// Serialization Attack
		
		/*
		 * ObjectOutput out = new ObjectOutputStream( new
		 * FileOutputStream("file.text")); out.writeObject(instannceOne); out.close();
		 * 
		 * // deserialize from file to object ObjectInput in = new ObjectInputStream(
		 * new FileInputStream("file.text"));
		 * 
		 * SingleTon instance2 = (SingleTon)in.readObject(); in.close();
		 * 
		 * System.out.println("instance1 hashCode:- " + instannceOne.hashCode());
		 * System.out.println("instance2 hashCode:- " + instanceTwo.hashCode());
		 * 
		 */
		
		
		
		
		// Cloning Attack
		
	          instannceOne.clone();
		
		
	}

}
