package com.cc.guice;

import com.google.inject.ProvidedBy;

@ProvidedBy(VehicleProvider.class)
public interface Vehicle {
	public String zoom();
}
