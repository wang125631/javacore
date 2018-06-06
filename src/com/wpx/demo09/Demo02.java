package com.wpx.demo09;
/**
 *  字符串特点：字符串是常量；它们的值在创建之后不能更改.
 
	 字符串的内容一旦发生了变化，那么马上会创建一个新 的对象。
	 
	 注意： 字符串的内容不适宜频繁修改，因为一旦修改马上就会创建一个新的对象。
	 
 * @author wangpx
 */
public class Demo02 {
	public static void main(String[] args) {
		String str1="hello";
		char[] str2= {'h','e','l','l','o'};
		System.out.println(str1 == new String(str2));
		System.out.println(str1.equals(new String(str2)));
		
		System.out.println(str1.hashCode());
		System.out.println(new String(str2).hashCode());
		
		String str3="hello";
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str2));
	}
}
