package com.wpx.demo25;

public class Client {

	public static void main(String[] args) {
		ShapeCache.loadCache();
		
		Shape shape1 = ShapeCache.getShape("1");
		System.out.println(shape1.type);
		
		Shape shape2 = ShapeCache.getShape("2");
		System.out.println(shape2.type);
		
		Shape shape3 = ShapeCache.getShape("3");
		System.out.println(shape3.type);
	}
}
