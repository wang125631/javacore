package com.wpx.demo11;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * 迭代
	listIterator() 
	

	ListIterator特有的方法：
		
		添加：
			hasPrevious()  判断是否存在上一个元素。
			previous()    当前指针先向上移动一个单位，然后再取出当前指针指向的元素。
			
			next();  先取出当前指针指向的元素，然后指针向下移动一个单位。
			
	---------------------------	
		
			add(E e)   把当前有元素插入到当前指针指向的位置上。
			set(E e)   替换迭代器最后一次返回的元素。
			
	 * @author wangpx
 */
public class demo06 {

	public static void main(String[] args) {
		List list =new ArrayList<String>();
		list.add("wpx01");
		list.add("wpx02");
		list.add("wpx03");
		
		ListIterator it = list.listIterator();
		
		while(it.hasNext()) {
			System.out.println(it.hasPrevious());
			System.out.println(it.next());
		}
		
	}
}
