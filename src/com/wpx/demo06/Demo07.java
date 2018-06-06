package com.wpx.demo06;
/**
 * instanceof 关键字

	instanceof关键字的作用：判断一个对象是否属于指定的类别。
	
	instanceof关键字的使用前提：判断的对象与指定的类别必须要存在继承或者实现的关系。
	
	instanceof关键字的使用格式：
			
			对象  instanceof 类别
	
	instanceof关键字的作用： 
	做强制类型转换之前都会使用该关键字先判断，然后在进行转换的。

 * @author wangpx
 */
class Person7{
	
}
class Student7 extends Person7{
	
}
class Teacher7 extends Person7{
	
}
public class Demo07 {

	public static void main(String[] args) {
	
		Student7 s=new  Student7();
		Teacher7 t=new Teacher7();
		System.out.println("Student is Person ? "+(s instanceof Person7));
		System.out.println("Teacher is Person ? "+(t instanceof Person7));
		Person7 p=new Person7();
		System.out.println("Persion is Teacher ? "+(p instanceof Teacher7));
}
}
