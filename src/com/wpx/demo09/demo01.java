package com.wpx.demo09;
/**
 * Object类是所有类的终极父类。 任何一个类都继承了Object类。


Object类：


Object类常用的方法：
	toString();     返回该对象的字符串表示。 返回一个字符串用于描述该对象的。
	
	equals(Object obj)   用于比较两个对象的内存地址，判断两个对象是否为同一个对象。
	
	hashCode()   返回该对象的哈希码值(大家可以把哈希码就 理解成是对象的内存地址)
	
 * @author wangpx
 */
class Student{
	String name;
	int age;
	
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

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
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
public class demo01 {

	public static void main(String[] args) {
		Student s1=new Student("wpx", 21);
		Student s2=new Student("wangpx", 21);
		System.out.println(s1.equals(s2));
		
		System.out.println("s1 hashCode "+s1.hashCode());
		System.out.println("s1 hashCode "+s2.hashCode());
		
		System.out.println(s1);
		
}
}
