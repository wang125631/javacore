package com.wpx.demo12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Linkedlist特有的方法：
	1：方法介绍
	            addFirst(E e) 
				addLast(E e) 
		
				getFirst() 
				getLast() 
				
				removeFirst() 
				removeLast() 
	
	2：数据结构
				1：栈 （1.6）  : 主要是用于实现堆栈数据结构的存储方式。
					先进后出
					push() 
					pop()
				2：队列（双端队列1.5）： 主要是为了让你们可以使用LinkedList模拟队列数据结构的存储方式。
					先进先出
					offer()
					poll()
					
	3：返回逆序的迭代器对象      
			descendingIterator()   返回逆序的迭代器对象
			
 * @author wangpx
 */
public class Demo01 {

	public static void main(String[] args) {
		LinkedList list =new LinkedList<String>();
		list.add("wpx01");
		list.add("wpx02");
		list.add("wpx03");
		
		list.addFirst("wpx00"); //把元素添加到集合的首位置上。
		list.addLast("wpx04");  //把元素添加到集合的末尾处。
		
		System.out.println("获取集合中首位置的元素:"+list.getFirst());
		System.out.println("获取集合中末尾的元素："+ list.getLast());
	
		System.out.println("删除集合中的首位置元素并返回："+ list.removeFirst());
		System.out.println("删除集合中的末尾素并返回："+ list.removeLast());
		
		list.push("压栈");
		Object pop = list.pop();//弹栈
		
		list.offer("排队");
		list.poll();//出队
		
	}
}
