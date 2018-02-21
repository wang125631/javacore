package com.wpx.demo22;

public class Decorator1 implements IThridParty{

	private IThridParty thridParty;

	public Decorator1(IThridParty thridParty) {
		this.thridParty = thridParty;
	}

	@Override
	public String say() { 		
		return "##1"+thridParty.say()+"##1";
	}
	

}
