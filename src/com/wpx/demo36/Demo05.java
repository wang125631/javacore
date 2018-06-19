package com.wpx.demo36;

import java.util.function.Function;
import java.util.function.Supplier;

import org.junit.Test;

/**
 * 构造器引用 
 * @author wangpx
 */
class Student{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Student() {
	}
	public Student( String name) {
		this.name = name;
	}
	
}


public class Demo05 {
	/**
	 * 构造器引用方式
	 */
	@Test
	public void test01() {
		Supplier<Student> s = () -> new Student("wpx");
		Supplier<Student> s2 = Student::new;
	}
	/**
	 *参数类型决定调用那个构造器
	 */
	@Test
	public void test02() {
		Function<String, Student> f = Student::new;	
		Student apply = f.apply("wpx");
		System.out.println(apply.getName());
	}
}
