package com.wpx.demo06;
/**
 * 生物学概述继承:
 * 龙湖僧龙凤省份,老鼠生来会打洞
 * 
 * 继承：继承是通过关键字extends体现的。

	继承的格式：
	
		class 类名1 extends 类名2{
		
		}


继承要注意的事项：
	1. 千万不要为了减少重复代码而去继承，只有真正存在着继承关系的时候才去继承。
	2. 父类私有的成员不能被继承。
	3. 父类的构造函数不能被继承。
	4. 创建子类对象时默认会先调用父类无参的构造函数。
 * @author wangpx
 */
class Person{
	String name;
	int age;
	public Person() {
		System.out.println("Person 无参构造");
	}
	public void eat() {
		System.out.println("eating... ");
	}
	
}
class Student extends Person{
	public void study() {
		System.out.println("studying...");
	}
}
public class demo03 {

	public static void main(String[] args) {
		Student s=new Student();
		s.eat();
		s.study();
}
	
}
