package com.wpx.demo04;
/**
 * 如果一个函数的返回值类型是具体的数据类型，那么该函数就必须要保证在任意情况下都保证有返回值。（除了返回值类型是void以外）

return 关键字的作用：
	1. 返回数据给函数的调用者。
	2. 函数一旦执行到了return关键字，那么该函数马上结束。 (能结束一个函数)

注意：一个函数的返回值类型 是void，那么也可以出现return关键字，但是return关键字的后面不能有数据。

break关键字与return关键字的区别：
	1.break关键字是结束一个循环。
	2. return关键字是结束一个函数。

 * @author wangpx
 */
public class demo02 {

	public static void main(String[] args) {
	add(0,2);
	add(1,2);
		
}
	public static void add(int a,int b) {
		if(a == 0) {
			return;
		}
		System.out.println(a+b);
	}
}
