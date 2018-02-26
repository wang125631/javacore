package com.wpx.demo24;

public abstract class ColdDrink implements Item{

	@Override
	public Packing packing() {
		return new Bottle();
	}
	@Override
	public abstract Float price();
	
}
