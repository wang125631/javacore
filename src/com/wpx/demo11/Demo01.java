package com.wpx.demo11;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合：集合是存储对象数据的集合容器。
 
集合比数组的优势：
	1. 集合可以存储任意类型的对象数据，数组只能存储同一种数据类型 的数据。
	2. 集合的长度是会发生变化的，数组的长度是固定的。
	
 
-------| Collection  单例集合的跟接口。 
 ----------| List  如果是实现了List接口的集合类，具备的特点： 有序，可重复。
 ----------| Set   如果是实现了Set接口的集合类，具备特点： 无序，不可重复。

Collection接口中的方法：
	
	增加
		add(E e)  添加成功返回true，添加 失败返回false.
		addAll(Collection c)  把一个集合 的元素添加到另外一个集合中去。
	
	删除
		clear() 
		remove(Object o) 
		
		removeAll(Collection  c) 
		retainAll(Collection  c) 
	
	查看
		size() 

	
	判断
		isEmpty() 
		contains(Object o) 
		containsAll(Collection<?> c) 
	
	迭代
		toArray() 
		iterator() 

 * @author wangpx
 */
public class demo01 {

	public static void main(String[] args) {
		Collection c =new ArrayList<String>();
		c.add("TreeSet");
		c.add("HashSet");
		
		Collection c2 =new ArrayList<String>();
		c2.add("ArrayList");
		c2.add("LinkedList");
		c2.add("Vector");
		
		c.addAll(c2);// 把c2的元素的添加到c集合 中去。
		 //删除方法:
		//c.clear(); //clear()清空集合中的元素
		c.removeAll(c2); //删除c集合中与c2的交集元素。
		
		c.retainAll(c2); //保留c集合与c2的交集元素，其他的元素一并删除。
		System.out.println(c.size());
		}
	
}
