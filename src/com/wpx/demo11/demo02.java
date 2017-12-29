package com.wpx.demo11;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 判断
	isEmpty() 
	contains(Object o) 
	containsAll(Collection<?> c) 

 * @author wangpx
 */

public class demo02 {

public static void main(String[] args) {
	Collection c=new ArrayList<Student>();
	c.add(new Student(12, "wpx"));
	c.add(new Student(12, "wpx"));
	c.add(new Student(12, "wpx"));
	
	Collection c2=new ArrayList<Student>();
	c.add(new Student(12, "wpx"));
	c.add(new Student(12, "wpx"));
	c.add(new Student(21, "wpx"));
	
	System.out.println(c.containsAll(c2));
	//contains方法内部是依赖于equals方法进行比较的。
	System.out.println(c.contains(new Student(12, "wpx")));
	
	}
}
class Student{
	int age;
	String name;
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
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
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
	
}