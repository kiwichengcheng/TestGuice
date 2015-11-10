package com.cc.guice;

import com.google.inject.ImplementedBy;

@ImplementedBy(WeaselCopter.class)
public interface Vehicle {
	public String zoom();
}
