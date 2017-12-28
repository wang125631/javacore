package com.wpx.demo02;
/**
 * 数据交换
 * @author wangpx
 */
public class demo09 {

	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		
		/*
		第一种方式： 定义第三方变量。
		int temp = a;  //3 
		a = b; //a = 5 
		b = temp; 
		
		方式2：相加法， 缺点： 两个int类型的数据相加，有可能会出现超出int的表示范围。
		
		a = a+b;  // a =8
		b = a-b; //b = 8 - 5 = 3
		a = a-b; // a = 8 - 3 = 5
		
		方式3： 可以使用异或。 缺点： 逻辑不清晰。
		*/
		a = a^b;  // a = 3^5
		b = a^b;  // b = (3^5)^5 = 3
		a = a^b; //  a = (5^3)^3 = 5 
		System.out.println("a = "+ a+" b="+b);
}
}
