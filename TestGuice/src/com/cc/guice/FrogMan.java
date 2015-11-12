package com.cc.guice;

import com.google.inject.Inject;
import com.google.inject.ProvidedBy;
import com.google.inject.name.Named;

@ProvidedBy(HeroProvider.class)
public class FrogMan implements Hero{
	private Vehicle vehicle;
	
	@Inject
	public FrogMan(@Named("Slow") Vehicle vehicle){
		this.vehicle = vehicle;
	}
	
	@Override
	public void  fightCrime(){
		System.out.println("FrogMan:"+this.vehicle.zoom());
	}
}
