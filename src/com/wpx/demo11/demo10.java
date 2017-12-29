package com.wpx.demo11;

import java.util.ArrayList;

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
	}

	public static ArrayList clearRepeat(ArrayList list){
		
		
		return list;
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