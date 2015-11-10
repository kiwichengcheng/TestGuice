package com.cc.guice;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class WeaselGirl implements Hero{
	private Vehicle vehicle;
	
	@Inject
	public WeaselGirl(@Named("Fast") Vehicle vehicle){
		this.vehicle = vehicle;
	}
	
	@Override
	public void fightCrime(){
		System.out.println(this.vehicle.zoom());
	}
}
