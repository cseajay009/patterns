package com.shrajan.creational.factory;

public class MotorCycleFactory implements VehicleFactory {

	@Override
	public Vehicle createVehicle() {
		// TODO Auto-generated method stub
		return new MotorCycle();
	}

}
