package com.wpx.demo05;
/**
 * 匿名对象：没有引用类型变量指向的对象称作为匿名对象。
 * 匿名对象要注意的事项：
	1. 我们一般不会给匿名对象赋予属性值，因为永远无法获取到。
	2. 两个匿名对象永远都不可能是同一个对象。

	
	匿名对象好处：简化书写。
	
	
	匿名对象的应用场景：
		1. 如果一个对象需要调用一个方法一次的时候，而调用完这个方法之后，该对象就不再使用了，这时候可以使用
		匿名对象。
		
		2. 可以作为实参调用一个函数。
	 * @author wangpx
	 */
class Student3{
	
	public void study() {
		System.out.println("What? How? ");
	}
}
public class Demo03 {


	public static void main(String[] args) {
	
		new Student3().study();
}	
}
