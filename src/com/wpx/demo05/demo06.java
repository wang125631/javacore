package com.wpx.demo05;
/**
 * 构造代码块：

	构造代码块的作用：给对象进行统一的初始化。
	
	构造函数的作用： 给对应的对象进行初始化。
	
	
	构造代码块的格式：
		
		{
			构造代码块
		}
	
	注意： 构造代码块的大括号必须位于成员 位置上。
	
	代码块的类别：
	1. 构造代码块。
	2. 局部代码块.   大括号位于方法之内。  作用：缩短局部 变量 的生命周期，节省一点点内存。
	3. 静态代码块  static 
 * @author wangpx
 */
class Student6{
	private int age;
	private String name;
	//构造代码块...
	{
		System.out.println("构造代码块执行了");
	}
	static {
		System.out.println("静态构造代码块执行了");
	}
}
public class demo06 {

	public static void main(String[] args) {
		Student6 s=new Student6();
}
}
