package com.wpx.demo36;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.Test;

/**
 * Stream是数据的渠道,用于操作数据源(集合,数组等)所生成的元素序列
 * 集合将的是数据,流讲的是计算
 * 1.Stream自己不会存储元素
 * 2.Straam不会改变源对象,他们会返回一个持有结果的新Stream
 * 3.Stream是延时操作
 * 
 * @author wangpx
 */
class Student06{
	private int id;
	private String name;
	private int classId;
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
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public Student06() {
		
	}
	public Student06(int id, String name, int classId) {

		this.id = id;
		this.name = name;
		this.classId = classId;
	}
	
	@Override
	public String toString() {
		return "Student06 [id=" + id + ", name=" + name + ", classId=" + classId + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + classId;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student06 other = (Student06) obj;
		if (classId != other.classId)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
public class Demo06 {

	private List<Student06> list = Arrays.asList(
			new Student06(1, "wpx", 111),
			new Student06(2, "may", 211),
			new Student06(3, "dzq", 311),
			new Student06(4, "wyz", 411),
			new Student06(5, "qkn", 511));
	/**
	 * 创建Stream对象
	 * 
	 */
	@Test
	public void test01() {
		//一.通过Collection系列集合提供的
		// 		1.串行流 stream()
		// 		2.并行流 paralleStream() 
		Stream<Student06> stream = list.stream();
		//二.通过Arrays中的静态方法
		IntStream stream2 = Arrays.stream(new int[10]);
		//三.通过Stream类中的静态方法
		Stream<String> stream3 = Stream.of("aa","bb","cc");
		//四.创建无限流
		//迭代 
		Stream<Integer> stream4 = Stream.iterate(0, (x) -> x+2 );
		stream4
			   .limit(4)
			   .forEach(System.out::println);
		
		//生成
		Stream.generate( () -> Math.random())
			  .limit(5)
			  .forEach(System.out::println);
	}
	
	
}
