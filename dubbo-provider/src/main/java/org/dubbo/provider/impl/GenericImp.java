package org.dubbo.provider.impl;

public class GenericImp implements GenericTestInterface {

	@Override
	public String sayHello(Integer id) {
		return "the genericImp: Hello " + id;
	}

}
