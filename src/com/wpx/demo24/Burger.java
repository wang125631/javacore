package com.wpx.demo24;

public abstract class Burger implements Item{

	@Override
	public Packing packing() {
		return new Warpper();
	}

	@Override
	public abstract Float price();
	
}
