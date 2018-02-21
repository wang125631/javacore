package com.wpx.demo22;

public class Client {

	public static void main(String[] args) {
		//原生对象
		IThridParty thridPartyOne = new ThridParty();
		//第一次装饰(增强)
	IThridParty decorator1 = new Decorator1(thridPartyOne);
		//第二次增强
	IThridParty decorator2 = new Decorator2(decorator1);
	
	System.out.println(decorator2.say());
	}
}
