package com.wpx.demo15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


/**
 *  转换流:
 
	输入字节流的转换流：InputStreamReader 是字节流通向字符流的桥
	 	InputStreamReader
	 
	输出字节流的转换流：
		OutputStreamWriter   可以把输出字节流转换成输出字符流 。  
	 	
	转换流的作用：
		1. 如果目前所 获取到的是一个字节流需要转换字符流使用，这时候就可以使用转换流。  字节流----> 字符流
	 	2. 使用转换流可以指定编码表进行读写文件。
	 	
 * 
 * @author wangpx
 */
public class Demo08 {

	public static void main(String[] args) throws Exception {
		readFile();
	}
	
	public static void writerFile() throws Exception{
		File file=new File("D:/demo08.java");
		FileOutputStream os=new FileOutputStream(file);
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(os, "utf-8");
		outputStreamWriter.write("汉字");
		outputStreamWriter.close();
	}
	
	@SuppressWarnings("all")
	public static void readFile() throws Exception{
		File file=new File("D:/demo08.java");
		FileInputStream in=new FileInputStream(file);
		InputStreamReader inputStreamReader = new InputStreamReader(in, "utf-8");
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String line=null;
		while((line=bufferedReader.readLine())!=null) {
			System.out.println(line);
		}
		inputStreamReader.close();
	}
}
