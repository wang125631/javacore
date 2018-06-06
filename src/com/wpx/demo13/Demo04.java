package com.wpx.demo13;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * TreeMap   TreeMap也是基于红黑树（二叉树）数据结构实现 的， 特点：会对元素的键进行排序存储。

	TreeMap 要注意的事项：
		1.  往TreeMap添加元素的时候，如果元素的键具备自然顺序，那么就会按照键的自然顺序特性进行排序存储。
		2.  往TreeMap添加元素的时候，如果元素的键不具备自然顺序特性， 那么键所属的类必须要实现Comparable接口，把键
		的比较规则定义在CompareTo方法上。
		
		3. 往TreeMap添加元素的时候，如果元素的键不具备自然顺序特性，而且键所属的类也没有实现Comparable接口，那么就必须
		在创建TreeMap对象的时候传入比较器。
		
 * @author wangpx
 */
class Person {
	int age;
	String name;
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
}
class Student4 implements Comparable<Student4>{
	int age;
	String name;
	
	public Student4(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public int compareTo(Student4 o) {
		return this.age-o.age;
	}
	
}
class MyComparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		return o1.age-o2.age;
	}

	
}
public class demo04 {

	public static void main(String[] args) {
		//传入比较器
		MyComparator myComparator=new MyComparator();
		TreeMap<Person, String> treeMap=new TreeMap<>(myComparator);		
		treeMap.put(new Person(1, "name1"), "value1");
		treeMap.put(new Person(2, "name2"), "value2");
		treeMap.put(new Person(3, "name3"), "value3");
		
		//实现comparable接口
		TreeMap<Student4, Object> treeMap2 = new TreeMap<>();
		treeMap2.put(new Student4(3,"name3"), "value3");
		treeMap2.put(new Student4(2,"name2"), "value2");
		treeMap2.put(new Student4(1,"name1"), "value1");
	
		System.out.println(treeMap);
		System.out.println(treeMap2);
	}
}
