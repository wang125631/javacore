package com.wpx.demo36;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.Test;

/**
 * Stream终止操作
 * 
 * @author wangpx
 */

class Student11 {
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

	public Student11(int id, String name, String className) {
		super();
		this.id = id;
		this.name = name;
		this.className = className;
	}

}

public class Demo11 {

	List<Student06> studentList = Arrays.asList(
			new Student06(1, "wpx", 111),
			new Student06(1, "wpx", 111),
			new Student06(1, "wpx", 111),
			new Student06(2, "may", 211),
			new Student06(3, "dzq", 311),
			new Student06(4, "wyz", 311),
			new Student06(5, "qkn", 511));

	List<String> strList = Arrays.asList("a", "b", "c", "ba", "ab");

	/**
	 * 规约 reduce(T identity,BinaryOperator)/reduce(BinaryOperator)
	 * 可以将流中元素反复结合起来得到一个值
	 */
	@Test
	public void test01() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		//0作为x的初始值
		Integer sum = list.stream().reduce(0, (x, y) -> x + y);
		System.out.println(sum);
		Integer mutli = list.stream().reduce(0, (x,y) -> x*y);
		System.out.println(mutli);
	}
	/**
	 * 收集到集合中
	 */
	@Test
	public void test02() {
			//收集到list中
			List<String> collect = studentList.stream()
										      .map(Student06::getName)
										      .collect(Collectors.toList());
			collect.forEach(System.out::print);
			//收集到set中
		   Set<String> collect2 = studentList.stream()
										     .map(Student06::getName)
										     .collect(Collectors.toSet());
		   collect2.forEach(System.out::print);
		   //特殊
		   ArrayList<String> collect3 = studentList.stream()
											       .map(Student06::getName)
											       //.collect(Collectors.toCollection( () ->  new ArrayList<>()));
		   										   .collect(Collectors.toCollection(ArrayList::new));
	}
	/**
	 * 其他类型的收集
	 */
	@Test
	public void test03() {
		//总数
		Long collect = studentList.stream()
								  .map(Student06::getId)
								  .collect(Collectors.counting());
		System.out.println(collect);
		//平均值
		 Double collect2 = studentList.stream()
				                      .collect(Collectors.averagingDouble(Student06::getId));
		 System.out.println(collect2);
		 //总和
		 Integer collect3 = studentList.stream()
				                       .collect(Collectors.summingInt(Student06::getId));
		 System.out.println(collect3);
		 //最大值
		 Optional<Student06> collect4 = studentList.stream()
				  							       .collect(Collectors.maxBy( (s1,s2) -> Integer.compare(s1.getId(), s2.getId())));
		 System.out.println(collect4);
	}
	/**
	 * 分组
	 */
	@Test
	public void test04() {
		Map<Integer, List<Student06>> collect = studentList.stream()
				   .collect(Collectors.groupingBy(Student06::getClassId));
		collect.entrySet().forEach(System.out::println);
	}
}
