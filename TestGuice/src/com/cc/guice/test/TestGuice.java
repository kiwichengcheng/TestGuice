package com.cc.guice.test;

import org.junit.Test;

import com.cc.guice.Hero;
import com.cc.guice.HeroProvider;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class TestGuice {

/*	@Test
	public void test() {
	//	Injector injector = Guice.createInjector(new HelloGuiceModule());
		
		Injector injector = Guice.createInjector();
		HelloGuice helloGuice = injector.getInstance(HelloGuice.class);
		helloGuice.sayHello();
		
	}
	
	@Test
	public void testvehicle(){
		Injector injector = Guice.createInjector(new HelloGuiceModule());
		FrogMan hero = injector.getInstance(FrogMan.class);
		WeaselGirl weaselGirl = injector.getInstance(WeaselGirl.class);
		System.out.println("=======hero=========");
		hero.fightCrime();
		System.out.println("======weaselgirl========");
		weaselGirl.fightCrime();
		
	}
	*/
	@Test
	public void providerTest(){
		Injector injector = Guice.createInjector();
		HeroProvider heroProvider = injector.getInstance(HeroProvider.class);
		Hero hero = heroProvider.get();
		hero.fightCrime();
	}

}
