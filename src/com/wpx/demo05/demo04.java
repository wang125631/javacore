package com.wpx.demo05;
/**
 * 面向对象三大特征：
	1. 封装
	2. 继承
	3  多态。
	权限修饰符：权限修饰符就是控制变量可见范围的。

public :  公共的。 public修饰的成员变量或者方法任何人都可以直接访问。

private ： 私有的， private修饰的成员变量或者方法只能在本类中进行直接访问。


封装的步骤：
	1. 使用private修饰需要被封装的属性。
	2. 提供一个公共的方法设置或者获取该私有的成员属性。
			 命名规范：
				set属性名();
				get属性名(); 

疑问： 封装一定要提供get或者set方法吗？
		不一定， 根据需求而定的。

规范 ： 在现实开发中一般实体类的所有成员属性（成员变量）都要封装起来。

实体类：实体类就是用于描述一类 事物的就称作为实体类。


工具类(Arrays数组的工具类):


封装的好处：
	1. 提高数据的安全性。
	2. 操作简单。 
	3. 隐藏了实现。
	
 * @author wangpx
 */
class Student4{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
public class demo04 {

	public static void main(String[] args) {
		Student4 s=new Student4();
		s.setName("王鹏霄");
		s.setAge(21);
		System.out.println(s.getName());
}
}
