package com.wpx.demo12;

import java.util.Comparator;
import java.util.TreeSet;

/**
 *  treeSet添加自定义元素:

 treeSet要注意的事项：
 	1. 往TreeSet添加元素的时候，如果元素本身具备了自然顺序的特性，那么就按照元素自然顺序的特性进行排序存储。
 	2. 往TreeSet添加元素的时候，如果元素本身不具备自然顺序的特性，那么该元素所属的类必须要实现Comparable接口，把元素
 	的比较规则定义在compareTo(T o)方法上。 
 	3. 如果比较元素的时候，compareTo方法返回 的是0，那么该元素就被视为重复元素，不允许添加.(注意：TreeSet与HashCode、equals方法是没有任何关系。)
 	4. 往TreeSet添加元素的时候, 如果元素本身没有具备自然顺序 的特性，而元素所属的类也没有实现Comparable接口，那么必须要在创建TreeSet的时候传入一个
 	比较器。
 	5.  往TreeSet添加元素的时候，如果元素本身不具备自然顺序的特性，而元素所属的类已经实现了Comparable接口， 在创建TreeSet对象的时候也传入了比较器
 	那么是以比较器的比较规则优先使用。
 	如何自定义定义比较器： 自定义一个类实现Comparator接口即可，把元素与元素之间的比较规则定义在compare方法内即可。	
 		自定义比较器的格式 ：
 			class  类名  implements Comparator{
 			
 			}
 	推荐使用：使用比较器(Comparator)。 

 * @author wangpx
 */



class Student8 implements Comparable<Student8>{

	int age;
	String  name;
	
	public Student8(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student8 o) {
		return this.age-o.age;
	}
	
}
class MyComparator implements Comparator<Student8>{

	@Override
	public int compare(Student8 o1, Student8 o2) {
		return o2.age-o1.age;
	}
	
}
public class Demo08 {

	public static void main(String[] args) {
	
	TreeSet treeSet=new TreeSet<Student8>();
	treeSet.add(new Student8(19, "wpx1"));
	treeSet.add(new Student8(14, "wpx2"));
	treeSet.add(new Student8(21, "wpx3"));
	
	System.out.println(treeSet);
	
	MyComparator myComparator=new MyComparator();
	TreeSet treeSet2=new TreeSet(myComparator);
	treeSet2.add(new Student8(19, "wpx1"));
	treeSet2.add(new Student8(14, "wpx1"));
	treeSet2.add(new Student8(21, "wpx1"));
	System.out.println(treeSet2);
	}
}
