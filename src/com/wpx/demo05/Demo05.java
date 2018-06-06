package com.wpx.demo05;
/**
 * java是 面向对象的语言： "万物皆对象": 任何事物都可以使用类进行描述。
 * 
 * 构造函数：

	构造函数的作用： 给对应的对象进行初始化。
	
	
	构造函数的定义的格式：
	
	修饰符  函数名(形式参数){
		函数体...
	}

构造函数要注意的细节：
	1. 构造函数 是没有返回值类型的。
	2. 构造函数的函数名必须要与类名一致。
	3. 构造函数并不是由我们手动调用的，而是在创建对应的对象时，jvm就会主动调用到对应的构造函数。
	4. 如果一个类没有显式的写上一个构造方法时，那么java编译器会为该类添加一个无参的构造函数的。
	5. 如果一个类已经显式的写上一个构造方法时,那么java编译器则 不会再为该类添加 一个无参 的构造方法。
	6. 构造函数是 可以在一个类中以函数重载 的形式存在多个 的。
	
构造函数与普通 函数的区别：	
	1. 返回值类型的区别：
		1. 构造函数是没有返回值类型 的，
		2. 普通函数是有返回值类型的，即使函数没有返回值，返回值类型也要写上void。
	2. 函数名的区别：
		1. 构造函数的函数名必须要与类名一致，
		2. 普通函数的函数名只要符合标识符的命名规则即可。
	3. 调用方式的区别：
		1. 构造函数是 在创建对象的时候由jvm调用的。
		2. 普通函数是由我们使用对象调用的，一个对象可以对象多次普通 的函数，
	4. 作用上的区别：
		1. 构造函数 的作用用于初始化一个对象。
		2. 普通函数是用于描述一类事物的公共行为的。

 * @author wangpx
 */
class Student5{
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Student5(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}
}
public class Demo05 {
	public static void main(String[] args) {
		Student5 s=new Student5(21,"王鹏霄");
		System.out.println(s.getName());
	}
}
