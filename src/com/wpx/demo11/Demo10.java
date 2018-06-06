package com.wpx.demo11;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 清除集合中重复元素。 如果书号是一样就视为重复元素
 * 
 * @author wangpx
 */
public class demo10 {

	public static void main(String[] args) {
		ArrayList list=  new ArrayList();
		list.add(new Book(11,"java编程思想"));
		list.add(new Book(22,"软装设计"));
		list.add(new Book(33,"家装设计"));
		list.add(new Book(11,"论建筑的矛盾性"));
		ArrayList list2 = clearRepeat(list);
		System.out.println("新集合的元素是："+ list2.size());
	}

	public static ArrayList clearRepeat(ArrayList list){
		
		//创建一个新的集合
				ArrayList newList = new ArrayList();
				//获取迭代器
				Iterator it = list.iterator();
				while(it.hasNext()){
					Book book = (Book) it.next();  //从旧集合中获取的元素
					if(!newList.contains(book)){
						//如果新集合没有包含该书籍，那么就存储到新集合中
						newList.add(book);
					}
				}
				return newList;
	}
}
class Book{
	int id;
	
	String name;// 名字

	public Book(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "{ 书号："+ this.id+" 书名："+ this.name+" }";
	
	}
	
	@Override
	public boolean equals(Object obj) {
		Book book =(Book)obj;
		return this.id==book.id;
	}
}