package com.cc.guice;

import com.google.inject.ProvidedBy;

@ProvidedBy(HeroProvider.class)
public interface Hero {

	public void fightCrime();
}
