package com.wpx.demo02;
/**
 * 算术运算符:
	+ (正数、加法、连接符)
	连接符的作用： 让任何的数据都可以与字符串进行拼接。
	如果+号用于字符串的时候，那么+号就是一个连接符，并不是 做加法功能了。

	连接符要注意：任何类型的数据与字符串使用连接符连接，那么结果都是字符串类型的数据。
	-
	*
	/ (除法)
	%(取模、取余数)

 * @author wangpx
 */
public class Demo03 {

	public static void main(String[] args) {
	
		System.out.println("加法"+ ( 1+2));
		System.out.println("连接"+"符号");
		
		System.out.println("减法"+ (1-2));
		System.out.println("乘法"+ (1*2));
		System.out.println("除法"+ (2/2));
		System.out.println("求余"+ (1%2));
	
}
}
