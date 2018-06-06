package com.wpx.demo11;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * 
 *  迭代器在变量元素的时候要注意事项： 在迭代器迭代元素 的过程中，不允许使用集合对象改变集合中的元素 个数，
 *  如果需要添加或者删除只能使用迭代器的方法进行操作。
 	如果使用过了集合对象改变集合中元素个数那么就会出现ConcurrentModificationException异常。	
 	迭代元素 的过程中: 迭代器创建到使用结束的时间。
 * @author wangpx
 */
public class demo08 {

	public static void main(String[] args) {
		List list =new ArrayList<String>();
		list.add("wpx01");
		list.add("wpx02");
		list.add("wpx03");
		
		ListIterator it = list.listIterator();	//获取到迭代器
		while(it.hasNext()) {
			System.out.println(it.next());
			list.add("wpx05");
			
		}
	}
}
