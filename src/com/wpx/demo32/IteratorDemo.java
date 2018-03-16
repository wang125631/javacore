package com.wpx.demo32;

public class IteratorDemo {

	public static void main(String[] args) {
	
		NameList nameList = new NameList();
		Iterator iterator = nameList.getIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
