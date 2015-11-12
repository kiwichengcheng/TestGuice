package com.cc.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Injector injector = Guice.createInjector(new HelloGuiceModule());
		Hero hero = injector.getInstance(Hero.class);
		hero.fightCrime();
	
		
	/*	Injector injector = Guice.createInjector(new HelloGuiceModule());
		FrogMan hero = injector.getInstance(FrogMan.class);
		hero.fightCrime();
		*/
	}

}
