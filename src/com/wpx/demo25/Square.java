package com.wpx.demo25;

public class Square extends Shape{

	public Square() {
		type = "Square";
	}
	
	@Override
	void draw() {
		System.out.println(" Square draw method invoke ...");
	}

}
