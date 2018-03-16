package com.wpx.demo31;

public class Stock {
	
	private String name ="ABC";
	private int quantity=10;
	
	public void sell() {
		System.out.println("Stock[Name "+name+",Quantity : "+quantity+"] sell");
	}
	public void buy() {
		System.out.println("Stock[Name "+name+" ,Quantity :"+quantity+" ] buy");
	}
}
