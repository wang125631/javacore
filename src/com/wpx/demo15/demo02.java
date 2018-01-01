package com.wpx.demo15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * 
输入字符流:
---------| Reader   所有输入字符流的基类。  抽象类。
----------------| FileReader 读取文件数据的输入字符流。 
----------------| BufferedReader 缓冲输入字符流     
      该类出现的目的是为了提高读取文件数据的效率与拓展FileReader的(readLine)功能。  这个类的也只不过是在内部维护了一个8kb的字符数组而已。

 * @author wangpx
 */
public class demo02 {

	public static void main(String[] args) throws IOException {
		readFile02();
	}

	public static void readFile01() throws IOException {
		//创建文件
		File file=new File("D:/demo01.java");
		//新建文件输出字符流管道
		FileReader fr=new FileReader(file);
		//读取数据
		int content=0;
		while((content=fr.read())!=-1) {
			System.out.print((char)content);
		}
		//关闭资源
		fr.close();	
	}

	public static void readFile02() throws IOException {
		//创建文件
		File file=new File("D:/demo01.java");
		//新建文件输出字符流管道
		FileReader fr=new FileReader(file);
		//使用缓冲字符流提高效率
		BufferedReader br=new BufferedReader(fr);
		//读取数据
		int content=0;
		while((content=br.read())!=-1) {
			System.out.print((char)content);
		}
		//关闭资源
		fr.close();	
	}

}