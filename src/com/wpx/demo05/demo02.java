package com.wpx.demo05;
/**
 * 成员变量与局部变量的区别:
	
	定义的位置上区别：	
		1. 成员变量是定义在方法之外，类之内的。
		2. 局部变量是定义在方法之内。
	
	作用上的区别：
		1. 成员变量的作用是用于描述一类事物的公共 属性的。
		2. 局部变量的作用就是提供一个变量给方法内部使用而已。
	
	生命周期区别：
		1. 随着对象 的创建而存在，随着对象的消失而消失。
		2. 局部变量在调用了对应的方法时执行到了创建该变量的语句时存在，局部变量一旦出了自己的作用域
		那么马上从内存中消失。
	
	初始值的区别：
		1. 成员变量是有默认的初始值。
				数据类型     默认的初始值
				int                0
				float              0.0f
				double              0.0
				boolean            false
				char                 ' '
				String（引用数据类型） null


		2. 局部变量是没有默认的初始值的，必须要先初始化才能使用。

 * @author wangpx
 */
class Student{
	private String name;//成员变量
	
	public void grade() {
		int age = 0;
		System.out.println(name);
		System.out.println(age);
	}
}
public class demo02 {

	
}
