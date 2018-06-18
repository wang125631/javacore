package com.wpx.demo11;

import java.util.ArrayList;
import java.util.List;

/**
 * 有序： 集合的有序不是指自然顺序，而是指添加进去的顺序与元素出来的顺序是一致的。

List接口中特有方法：
	
	添加
		add(int index, E element) 
		addAll(int index, Collection<? extends E> c) 
	获取：
		get(int index) 
		indexOf(Object o) 
		lastIndexOf(Object o) 
		subList(int fromIndex, int toIndex) 
	修改：
		set(int index, E element) 

	迭代
		listIterator()
 * @author wangpx
 */
public class Demo04 {

	public static void main(String[] args) {
	List list =new ArrayList<String>();
	list.add("wpx");
	list.add("wpx");
	list.add("wpx");
	
	System.out.println(list.size());
}
}
