package com.wpx.demo05;
/**
 * 统计一个类被使用了多少次创建对象，该类对外显示被创建的次数
 * @author wangpx
 */
class Student10{
	static int count = 0; //计数器
	{
		count++;	
	}
	public void show() {
		System.out.println("Object "+count);
	}
	}
public class demo10 {

	public static void main(String[] args) {
		Student10 s1=new Student10();
		s1.show();
		Student10 s2=new Student10();
		s2.show();
	}
}
