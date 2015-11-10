package com.cc.guice;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.name.Names;

public class HelloGuiceModule implements Module {

	@Override
	public void configure(Binder binder) {
		// TODO Auto-generated method stub

		binder.bind(HelloGuice.class).to(HelloGuiceImpl.class);
		binder.bind(Vehicle.class).annotatedWith(Names.named("Fast")).to(WeaselCopter.class);
		binder.bind(Vehicle.class).annotatedWith(Names.named("Slow")).to(FrogMobile.class);
	}
	

}
