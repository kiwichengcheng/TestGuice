package com.cc.guice;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;

@Singleton
public class HeroProvider implements Provider<Hero> {

	@Inject private Vehicle vehicle;
	@Override
	public Hero get() {
		// TODO Auto-generated method stub
		Hero hero = new FrogMan(vehicle);
		return hero;
	}

}
