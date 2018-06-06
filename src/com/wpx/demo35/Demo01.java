package com.wpx.demo35;
class Fu{
	public void say() {
		System.out.println("Fu");
	}
}
class Zi extends Fu{
	@Override
	public void say() {
		System.out.println("Zi");
	}
}
public class Demo01 {
	public static void main(String[] args) {
		new Zi().say();
	}
}
