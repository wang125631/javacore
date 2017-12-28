package com.wpx.demo04;
/**
 *  定义一个函数做加法功能。

函数的重载：在一个类中出现两个或者两个以上的同名函数，这个称作为函数的重载。

函数重载的作用： 同一个函数名可以出现了不同的函数，以应对不同个数或者不同数据类型的参数。

函数重载的要求：
	1. 函数名一致。
	2. 形参列表不一致。（形式参数的个数或者是对应的数据类型不一致）
	3. 与函数的返回值类型是无关的。
 * @author wangpx
 */
public class demo03 {

	public static void main(String[] args) {
	System.out.println(add(1,3,4,5));
	System.out.println(add("hello","world"));
}
	public static int add(int a,int b) {
		return a+b;
	}
	public static String add(String a,String b) {
		return a+b;
	}
	public static int add(int a,int...b) {
		int sum = 0;
		for(int c:b) {
			sum=sum+c;
		}
		return sum+a;
	}
	
	
}
