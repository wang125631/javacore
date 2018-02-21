package com.wpx.demo22;

public class Decorator2 implements IThridParty{

	private IThridParty thridParty;
	
	
	public Decorator2(IThridParty thridParty) {

		this.thridParty = thridParty;
	}


	@Override
	public String say() {
		return "##2"+thridParty.say()+"##2";
	}

}
