package com.wpx.demo25;

public class Circle extends Shape{

	public Circle() {
		type = "Circle";
	}
	
	@Override
	void draw() {
		System.out.println(" Circle draw method invoke ... ");
	}

}
