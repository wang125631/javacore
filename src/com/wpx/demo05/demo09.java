package com.wpx.demo05;
/**
 * static(静态)
 * 静态的成员变量只会在数据共享区中维护一份，而非静态成员变量的数据会在每个对象中都维护一份的。。
 * 
 * @author wangpx
 */
class Student9{
	static String clazz = "14信息";
	private String  name;
	public Student9(String name) {
		this.name = name;
	}

	
}
public class demo09 {
	public static void main(String[] args) {
		Student9 s1=new Student9("王鹏霄");
		Student9 s2=new Student9("wpx");
		System.out.println(s1.clazz);
		System.out.println(s2.clazz);
	}
}
