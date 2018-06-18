package com.wpx.demo14;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;


/**
 *  
	输入字节流体系： 
	----| InputStream  输入字节流的基类。 抽象
	----------| FileInputStream 读取文件数据的输入字节流
	----------| BufferedInputStream 缓冲输入字节流    缓冲输入字节流的出现主要是为了提高读取文件数据的效率。    
	其实该类内部只不过是维护了一个8kb的字节数组而已。 
	
	注意： 凡是缓冲流都不具备读写文件的能力。
	
	使用BufferedInputStream的步骤	:
		1. 找到目标文件。
		2. 建立数据 的输入通道
		3. 建立缓冲 输入字节流流
		4. 关闭资源
 
 * @author wangpx
 */
public class Demo10 {

	public static void main(String[] args) {
	

	}
	//读取文件的时候我们都是使用缓冲数组读取。效率会更加高
	public static void readFile01() throws Exception{
	File file=new File("D:/demo11.java");	
	//建立数组通道
	FileInputStream inputStream = new FileInputStream(file);
	//通过BufferedInputStream对读入
	BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
	//读取文件
	int content=0;
	while((content=bufferedInputStream.read())!=-1) {
		System.out.println((char)content);
	}
	//关闭资源
	bufferedInputStream.close();
	}
}
