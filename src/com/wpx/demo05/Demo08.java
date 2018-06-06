package com.wpx.demo05;
/**
 * this关键字：

	this关键字代表了所属函数的调用者对象。

	
	this关键字作用：
		1. 如果存在同名成员变量与局部变量时，在方法内部默认是访问局部变量的数据，可以通过this关键字指定访问成员变量的数据。
		2. 在一个构造函数中可以调用另外一个构造函数初始化对象。
	
	
	this关键字调用其他的构造函数要注意的事项：
		1. this关键字调用其他的构造函数时，this关键字必须要位于构造函数中 的第一个语句。
		2. this关键字在构造函数中不能出现相互调用 的情况，因为是一个死循环。
	
	this关键字要注意事项：
		1. 存在同名的成员变量与局部变量时，在方法的内部访问的是局部变量(java 采取的是“就近原则”的机制访问的。)
		2. 如果在一个方法中访问了一个变量，该变量只存在成员变量的情况下，那么java编译器会在该变量的 前面添加this关键字。

 * @author wangpx
 */
class Student8{
	
	
	private String  name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
public class Demo08 {
	
	public static void main(String[] args) {
		
	}
	

}
