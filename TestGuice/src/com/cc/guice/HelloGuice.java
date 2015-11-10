package com.cc.guice;

import com.google.inject.ImplementedBy;

@ImplementedBy(HelloGuiceImpl.class)
public interface HelloGuice {
	public void sayHello();
}
