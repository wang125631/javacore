package com.wpx.demo14;

import java.io.File;
import java.io.FilenameFilter;
//// 自定义一个文件名过滤器
class MyFilter implements FilenameFilter{

	@Override
	public boolean accept(File dir, String name) {
		return name.endsWith(".java");
	}
}

public class demo07 {

	public static void main(String[] args) {
	File f1=new File("D:\\nodejs\\javacore\\src\\com\\wpx");
	listFile(f1);
	File f2=new File("D:\\nodejs\\javacore\\src\\com\\wpx\\demo01");
	listJava(f2);
	
	listJavaWithFilter(f2);
	}
	
	public static void listFile(File dir) {
		//所有文件
		File[] files = dir.listFiles();
		System.out.println("File: ");
		for (File file : files) {
			if(file.isFile()) {
				System.out.println("\t"+file.getName());
			}
		}
		System.out.println("Dir ");
		for (File file : files) {
			if(file.isDirectory()) {
				System.out.println(file.getName());
			}
		}
	}
	//列出所有的java文件
	public static void  listJava(File file) {
		File[] listFiles = file.listFiles();
		for (File file2 : listFiles) {
			String name = file2.getName();
			if(file2.isFile()&&name.endsWith(".java")) {
				System.out.println(name);
			}
		}
	}
	//列出所有的java文件
	public static void listJavaWithFilter(File file) {
		File[] list = file.listFiles(new MyFilter());
		for (File file2 : list) {
			System.out.println(file2.getName());
		}
	}
	
	
}
