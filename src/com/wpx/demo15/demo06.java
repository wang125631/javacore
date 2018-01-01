package com.wpx.demo15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * 
 * 打印流（printStream）  打印流可以打印任意类型的数据，
 * 而且打印数据之前都会先把数据转换成字符串再进行打印。
 * 
 * @author wangpx
 */
class Student6{
	int id;
	String  name;
	public int getId() {
		return id;
	}
	public Student6(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class demo06 {

	@SuppressWarnings("all")
	public static void main(String[] args) throws FileNotFoundException {
		
		File file=new File("D:/demo06.txt");
		PrintStream printStream = new PrintStream(file);
		printStream.println(" PrintStream ----");
		//打印流可以打印任何类型的数据，而且打印数据之前都会先把数据转换成字符串再进行打印。
		Student6 s=new Student6(1, "wpx");
		printStream.println(s);
	}
}
