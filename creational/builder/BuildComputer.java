package com.shrajan.creational.builder;

public class BuildComputer {

	public static void main(String[] args) {
		//Using builder to get the object in a single line of code and 
        //without any inconsistent state or arguments management issues		
         Computer comp = new ComputerBuilder(
		"500 GB", "2 GB").setBluetoothEnabled(true)
		.setGraphicsCardEnabled(true).build();
	}

}
