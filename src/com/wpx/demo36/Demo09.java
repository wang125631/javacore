package com.wpx.demo36;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * 排序
 * 自然排序(Comparable)
 * 定制排序(Comparator)
 * 
 * @author wangpx
 */

class Student09{
	private int id;
	private String name;
	private String className;
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
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	@Override
	public String toString() {
		return "Student08 [id=" + id + ", name=" + name + ", className=" + className + "]";
	}
	public Student09(int id, String name, String className) {
		super();
		this.id = id;
		this.name = name;
		this.className = className;
	}
	
}
public class Demo09 {

	 List<Student06> studentList = Arrays.asList(
			new Student06(1, "wpx", 111),
			new Student06(1, "wpx", 111),
			new Student06(1, "wpx", 111),
			new Student06(2, "may", 211),
			new Student06(3, "dzq", 311),
			new Student06(4, "wyz", 411),
			new Student06(5, "qkn", 511));
	 
	 List<String> strList = Arrays.asList("a","b","c","ba","ab");
	/**
	 * 自然排
	 */
	@Test
	public void test01() {
		strList.stream()
			   .sorted()
			   .forEach(System.out::println);
	}
	/**
	 * 自定义排序
	 */
	@Test
	public void test02() {
		studentList.stream()
				   .sorted( (x,y) -> -y.getName().compareTo(x.getName()))
				   .forEach(System.out::println);
	}	
	
}
