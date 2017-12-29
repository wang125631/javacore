package com.wpx.demo11;

import java.util.ArrayList;
import java.util.Collection;

/**
 * µü´ú
	toArray() 
 * @author wangpx
 */
public class demo03 {

	public static void main(String[] args) {
		Collection c=new ArrayList<Student>();
		c.add(new Student(12, "wpx"));
		c.add(new Student(12, "wpx"));
		c.add(new Student(12, "wpx"));
		
		Object[] array = c.toArray();
		//TODO ±éÀú
	}
}
