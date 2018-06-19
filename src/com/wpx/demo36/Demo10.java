package com.wpx.demo36;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.Test;

/**
 * Stream终止操作
 * @author wangpx
 */

class Student10{
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
	public Student10(int id, String name, String className) {
		super();
		this.id = id;
		this.name = name;
		this.className = className;
	}
	
}
public class Demo10 {

	 List<Student06> studentList = Arrays.asList(
			new Student06(1, "wpx", 111),
			new Student06(1, "wpx", 111),
			new Student06(1, "wpx", 111),
			new Student06(2, "may", 211),
			new Student06(3, "dzq", 311),
			new Student06(4, "wyz", 311),
			new Student06(5, "qkn", 511));
	 
	 List<String> strList = Arrays.asList("a","b","c","ba","ab");
	/**
	 * allMatch
	 *  全匹配
	 *  是否所有学生ClassId大于2
	 */
	@Test
	public void test01() {
		boolean allMatch = studentList.stream()
				   .allMatch( (e) -> e.getClassId() > 2);
		System.out.println(allMatch);  
			
	}
	/**
	 * anyMatch
	 * 至少一
	 * 是否存在名为wpx的学生
	 */
	@Test
	public void test02() {
		boolean anyMatch = studentList.stream()
				   .anyMatch((e) -> e.getName().equals("wpx") );
		System.out.println(anyMatch);
	}	
	/**
	 * noneMatch
	 * 不存在
	 * 是否不存在名为wpx的学生
	 */
	@Test
	public void test03() {
		boolean noneMatch = studentList.stream()
				   .noneMatch((e) -> e.getName().equals("wpx") );
		System.out.println(noneMatch);
	}	
	/**
	 * findFirst
	 * 查找第一个对象
	 * 
	 * 有可能为空的对象封装到Optional中
	 * 
	 */
	@Test
	public void test04() {
		Optional<Student06> findFirst = studentList.stream()
				    .filter( (s)->s.getId()<1 )
					.findFirst();
		System.out.println(findFirst.get());
	}
	/**
	 * findAny查找任何一个
	 * ClassId等于311的学生
	 */
	@Test
	public void test05() {
			Optional<Student06> findAny = studentList.stream()
					   .filter( (s) -> s.getClassId()==311)
					   .findAny();
			System.out.println(findAny.get());
	}	
	/**
	 * max 返回流中最大值
	 */
	@Test
	public void test06() {
			 Optional<Student06> max = studentList.stream()
					    .max( (s1,s2) -> s1.getName().compareTo(s2.getName()));
			 System.out.println(max.get());
	}	
	/**
	 * min 返回流中最小值
	 */
	@Test
	public void test07() {
			 Optional<Student06> min = studentList.stream()
					    .min( (s1,s2) -> Integer.compare(s1.getId(), s2.getId()));
			 System.out.println(min.get());
	}	
}
