package com.wpx.demo15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

/**
 * SequenceInputStream(序列流)
 * 
 * 合并文件
 * 
 * @author wangpx
 */
public class demo03 {

	public static void main(String[] args) {
	

	}
	//传统方式
	public static void merge01() throws IOException {
		//找到(或创建)目标文件
		File inFile1=new File("D:/demo01.java"); 
		File inFile2=new File("D:/demo02.java");
		File outFile=new  File("D:/demo03.java");
		//建立数据的输入/输出通道
		FileInputStream fileInputStream1 = new FileInputStream(inFile1);
		FileInputStream fileInputStream2 = new FileInputStream(inFile2);
		FileOutputStream fileOutputStream = new FileOutputStream(outFile);
		//把输入流存储到集合中，然后再从集合中读取
		ArrayList<FileInputStream> arrayList = new ArrayList<FileInputStream>();
		arrayList.add(fileInputStream1);
		arrayList.add(fileInputStream2);
		//准备一个缓冲数组
		byte[] buf=new byte[1024];
		int length=0;
		for(int i=0;i<arrayList.size();i++) {
			FileInputStream fileInputStream = arrayList.get(i);
			while((length=fileInputStream.read(buf))!=-1) {
				fileOutputStream.write(buf, 0, length);
			}
			fileInputStream.close();
		}
		fileOutputStream.close();
	}
	
	@SuppressWarnings("all")
	//	使用SequenceInputStream合并文件。
	public static void merge02()throws IOException {
		//找到(或创建)目标文件
		File inFile1=new File("D:/demo01.java"); 
		File inFile2=new File("D:/demo02.java");
		File outFile=new  File("D:/demo03.java");
		//建立数据的输入/输出通道
		FileInputStream fileInputStream1 = new FileInputStream(inFile1);
		FileInputStream fileInputStream2 = new FileInputStream(inFile2);
		FileOutputStream fileOutputStream = new FileOutputStream(outFile);
		//建立序列流对象
		SequenceInputStream sequenceInputStream = new SequenceInputStream(fileInputStream1, fileInputStream2);
		byte[] buf=new byte[1024];
		int length=0;
		while((length=sequenceInputStream.read(buf))!=-1) {
			fileOutputStream.write(buf, 0, length);
		}
		sequenceInputStream.close();
		fileOutputStream.close();
	}
	
	//把三个文件合并成一个文件
	@SuppressWarnings("all")
	public static void merge03() throws IOException {
		//找到(或创建)目标文件
		File inFile1=new File("D:/demo01.java"); 
		File inFile2=new File("D:/demo02.java");
		File inFile3=new  File("D:/demo03.java");
		File outFile=new  File("D:/demo04.java");
		//建立对应 的输入输出流对象
		FileInputStream fileInputStream1 = new FileInputStream(inFile1);
		FileInputStream fileInputStream2 = new FileInputStream(inFile2);
		FileInputStream fileInputStream3 = new FileInputStream(inFile3);
		FileOutputStream fileOutputStream = new FileOutputStream(outFile);
		//创建序列流对象
		Vector<FileInputStream> vector = new Vector<FileInputStream>();
		vector.add(fileInputStream1);
		vector.add(fileInputStream2);
		vector.add(fileInputStream3);
		Enumeration<FileInputStream> e = vector.elements();
		SequenceInputStream sequenceInputStream = new  SequenceInputStream(e);
		//读取文件数据
		byte[] buf=new byte[1024];
		int length = 0;
		while((length=sequenceInputStream.read())!=-1) {
			fileOutputStream.write(buf, 0, length);
		}
		sequenceInputStream.close();
		fileOutputStream.close();
	}
	
}

