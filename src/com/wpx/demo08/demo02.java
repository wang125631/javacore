package com.wpx.demo08;
/**
 * final(最终、修饰符)  
	
final关键字的用法：
	1. final关键字修饰一个基本类型的变量时，该变量不能重新赋值，第一次的值为最终的。
	2. fianl关键字修饰一个引用类型变量时，该变量不能重新指向新的对象。
	3. final关键字修饰一个函数的时候，该函数不能被重写。
	4. final关键字修饰一个类的时候，该类不能被继承。


常量 的修饰符一般为： public static final 
 * @author wangpx
 */

// extends com.wpx.demo08.demo02
public class demo02{

}

/**
 * 圆
 * @author wangpx
 */
class Circle{
	double r;//半径
	
	public static final double pi=3.14;//固定不变的
	
}