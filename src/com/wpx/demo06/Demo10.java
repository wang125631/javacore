package com.wpx.demo06;
/**
 * Öµ´«µÝ
 * 
 * @author wangpx
 */

class Person10{
	private String name;
	private int age;
	public Person10(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
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
public class Demo10 {

	public static void main(String[] args) {
		add(1,2);
		Person10 person10 = new Person10("wpx", 12);
		update(person10);
		System.out.println(person10.getAge());
	}
	public static void add(int a,int b) {
		System.out.println(a+b);
	}
	public static void update(Person10 p) {
		p.setAge(20);
	}
	
}
