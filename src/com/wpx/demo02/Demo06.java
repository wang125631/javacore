package com.wpx.demo02;

/**
 * 比较运算符： 比较运算符的结果都是返回一个布尔值的。
 * 
 * == (判断是否等于) ==用于比较两个基本数据类型数据的时候，比较的是两个变量所存储的值是否一致. ==用于比较两个引用类型变量的数据时候，比较的是两个
 * 引用类型变量所记录的内存地址是否一致.
 * 
 * 
 * != (不等于) > (大于) < (小于) >= (大于等于) <= (小于等于)
 * 
 * @author wangpx
 */
public class Demo06 {
	private static String c1 = "你好";
	private static String c2 = "你好";

	public static void main(String[] args) {

		String a1 = new String("hello");
		String a2 = new String("hello");
		System.out.println(a1 == a2);

		String b1 = "world";
		String b2 = "world";
		System.out.println(b1 == b2);

		System.out.println(c1 == c2);

		System.out.println(1 != 2);
		System.out.println(1 >= 2);
		System.out.println(1 <= 2);
		System.out.println(1 > 2);
		System.out.println(1 < 2);

	}

}
