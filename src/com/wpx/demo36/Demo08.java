package com.wpx.demo36;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.Test;

/**
 * 映射
 * @author wangpx
 */

class Student08{
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
	public Student08(int id, String name, String className) {
		super();
		this.id = id;
		this.name = name;
		this.className = className;
	}
	
}
public class Demo08 {

	private List<Student06> list = Arrays.asList(
			new Student06(1, "wpx", 111),
			new Student06(1, "wpx", 111),
			new Student06(1, "wpx", 111),
			new Student06(2, "may", 211),
			new Student06(3, "dzq", 311),
			new Student06(4, "wyz", 411),
			new Student06(5, "qkn", 511));
	/**
	 * map 接受Lambda,将元素转化为其他形式或提取信息
	 * 
	 * 完成Student06的classId 到Student08的ClassName 的映射
	 */
	@Test
	public void test01() {
		list.stream()
			.map((e) -> {
				return new Student08(e.getId(), e.getName(), "班级"+e.getId());
			})
			.forEach(System.out::println);
	}
	
	/**
	 * flatMap接受一个函数作为参数,将该流中的每个值转化为另一个流
	 * 然后把所有的流连接成一个流
	 */ 
	@Test
	public void test02() {
		Arrays.asList("a","b","c").stream()
								  .map(Demo08::filterCharacter)
								  .forEach( (e) -> {
									  e.forEach(System.out::println);
								  });
		
		Arrays.asList("a","b","c").stream()
		  .flatMap(Demo08::filterCharacter)
		  .forEach(System.out::println);

	}

	public static Stream<Character> filterCharacter(String str){
		List<Character> list = new ArrayList<>();
		for (Character character : str.toCharArray()) {
			list.add(character);
		}
		return  list.stream();
	}
	
}
