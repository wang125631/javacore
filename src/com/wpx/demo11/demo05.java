package com.wpx.demo11;

import java.util.ArrayList;
import java.util.List;

/**
 * List接口中特有方法：
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
	
	List接口中特有的方法具备的特点： 操作的方法都存在索引值。	
	
	只有List接口下面的集合类才具备索引值。其他接口下面的集合类都没有索引值。

 * @author wangpx
 */
public class demo05 {

	public static void main(String[] args) {
		List list =new ArrayList<String>();
		list.add("wpx01");
		list.add("wpx02");
		list.add("wpx03");
		
		List list2 =new ArrayList<String>();
		list.add("wpx11");
		list.add("wpx12");
		list.add("wpx13");
		
		list.add(3, "wpx04");
		list.add(4, list2);
		
		System.out.println(list.get(5));
		System.out.println(list.indexOf("wpx13"));
		
		List subList = list.subList(1, 5);
		
		list.set(1, "WANGPX");
		
	}
}
