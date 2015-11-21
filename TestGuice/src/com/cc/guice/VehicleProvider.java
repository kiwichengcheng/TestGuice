package com.cc.guice;

import com.google.inject.Provider;

public class VehicleProvider implements Provider<Vehicle>{

	@Override
	public Vehicle get() {
		// TODO Auto-generated method stub
		Vehicle vehicle;
		
		if(Math.random()>.5)
			vehicle = new FrogMobile();
		else
			vehicle = new WeaselCopter();
		return vehicle;
	}

}
