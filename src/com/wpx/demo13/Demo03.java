package com.wpx.demo13;

import java.util.HashMap;

/**
 * 双列集合：
	-------------| Map  如果是实现了Map接口的集合类，具备的特点： 存储的数据都是以键值对的形式存在的，键不可重复，值可以重复。
	----------------| HashMap  底层也是基于哈希表实现 的。
	HashMap的存储原理：
	
		往HashMap添加元素的时候，首先会调用键的hashCode方法得到元素 的哈希码值，然后经过运算就可以算出该
		元素在哈希表中的存储位置。 
		情况1： 如果算出的位置目前没有任何元素存储，那么该元素可以直接添加到哈希表中。
		
		情况2：如果算出 的位置目前已经存在其他的元素，那么还会调用该元素的equals方法与这个位置上的元素进行比较
		，如果equals方法返回 的是false，那么该元素允许被存储，如果equals方法返回的是true，那么该元素被视为
		重复元素，不允存储。
	
	----------------| TreeMap
	----------------| Hashtable 
 * 
 * @author wangpx
 */
class Student{
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int hashCode() {
		return this.id;
	}
	@Override
	public boolean equals(Object obj) {
		Student s=(Student) obj;
		return this.id==s.id;
	}
	
}
public class demo03 {

	public static void main(String[] args) {
	
		HashMap<Student, Object> hashMap = new HashMap<>();
		hashMap.put(new Student(1, "wpx"), "王鹏霄1");
		hashMap.put(new Student(1, "wangpx"), "王鹏霄2");
		hashMap.put(new Student(1, "wpxpx"), "王鹏霄1");
		System.out.println(hashMap.size());
	}
}
