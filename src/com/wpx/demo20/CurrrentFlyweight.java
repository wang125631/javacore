package com.wpx.demo20;

public class CurrrentFlyweight extends Flyweight{

	private String str;

	public CurrrentFlyweight(String str) {
		this.str = str;
	}

	@Override
	public void show() {
		System.out.println(" CurrentFlyweight :  "+str);
	}

}
