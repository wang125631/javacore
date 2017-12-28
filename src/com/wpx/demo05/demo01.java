package com.wpx.demo05;
/**
 * java面向对象的语言

对象：真实存在唯一的事物。

类： 实际就是对某种类型事物的共性属性与行为的抽取。  抽象的概念....   车

我们从小的时候就不断的接触很多的对象，我们的大脑就会把
这些具备相同属性与行为的事物进行分类。

在现实生活中就存在对象与类这两种事物。计算机是服务于人类，为了让计算机更加接近我们的
生活，这时候就出现了面向对象的计算机语言。

	
		面向过程（C）                  面向对象（java）


现实生活中 : 对象---------类

在java中： 类------------>对象


面向对象的计算机语言核心思想： 找适合的对象做适合的事情。


如何找适合的对象：
	1. sun已经定义好了很多的类，我们只需要认识这些类，我们就可以通过这些类创建对象使用。 
	2. 自定义类，通过自定义类来创建对象使用。


自定义类创建对象的三步骤：
	1. 自定义类。
			格式：
				class 类名{
					
					事物的公共属性使用成员变量描述。
					
					事物的公共行为使用函数描述。
				}

	2. 通过自定义类创建对象。
			格式： 
				类名 变量名 =  new 类名();
			
	3. 访问(设置)对象的属性或者调用对象的功能。
		1.访问对象属性的格式：
			对象.属性名.
		2.设置对象的属性：
			对象.属性名 = 数据。
		3. 调用对象的功能
			对象.函数名();
	
 * @author wangpx
 */

class Car{
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car() {
	}

	public Car(String name) {
		super();
		this.name = name;
	}


	public void run() {
		System.out.println(" car is running");
	}
}
public class demo01 {
	public static void main(String[] args) {
		Car c=new Car("BMW");
		c.run();
		System.out.println("car name is   " +c.getName());
	}
}
