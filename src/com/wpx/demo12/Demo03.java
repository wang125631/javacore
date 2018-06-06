package com.wpx.demo12;
/**
 * 自定义泛型：  自定义泛型就是一个数据类型的占位符或者是一个数据类型的变量。
 
 方法上自定义泛型：
 	
 	修饰符  	<声明自定义的泛型>返回值类型    函数名(使用自定义泛型 ...){
 	
 	}

	 
	在泛型中不能使用基本数据类型，如果需要使用基本数据类型，那么就使用基本数据类型对应的包装类型。
	
	 byte----> Byte
	 short---> Short 
	 int----> Integer
	 long----> Long 
	 
	 double ----> Double 
	 float -----> Float
	 
	 boolean-----Boolean
	 
	 char-------》 Character 
	 
	 
	 方法泛型注意的事项：
	 	1. 在方法上自定义泛型，这个自定义泛型的具体数据类型是在调用该 方法的时候传入实参时确定具体的数据类型的。
	 	2. 自定义泛型只要符合标识符 的命名规则即可, 但是自定义泛型我们一般都习惯使用一个大写字母表示。  T Type  E Element

 * @author wangpx
 */
public class demo03 {

	public static void main(String[] args) {
	

	}
	public static <gen> gen function(gen g) {
		return g;	
	}
}
