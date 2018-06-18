package com.wpx.demo14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


/**
 * IO流分类：
	如果是按照数据的流向划分：	
		输入流	
		输出流	
	如果按照处理的单位划分	
		字节流: 字节流读取得都是文件中二进制数据，读取到二进制数据不会经过任何的处理。
		字符流： 字符流读取的数据是以字符为单位的 。 字符流也是读取文件中的二进制数据，不过会把这些二进制数据转换成我们能 识别的字符。  
					字符流 = 字节流 + 解码				
	输入字节流：
	--------| InputStream 所有输入字节流的基类  抽象类
	------------| FileInputStream  读取文件数据的输入字节流 
				
	使用FileInputStream读取文件数据的步骤：
		1. 找到目标文件
		2. 建立数据的输入通道。
		3. 读取文件中的数据。
		4. 关闭 资源.
 * @author wangpx
 */
public class Demo08 {

	public static void main(String[] args) throws Exception {
		readFile04();
}
	//最基本读取文件方式    
	public static void readFile01() throws IOException{
		// 找到目标文件
		File file=new File("D:\\nodejs\\javacore\\src\\com\\wpx\\demo01/demo01.java");
		//建立数据的输入通道。
		FileInputStream in=new FileInputStream(file);
		//读取文件中的数据
		int read = in.read();// read() 读取一个字节的数据，把读取的数据返回。
		System.out.println("read data is  "+(char)read);
		//关闭资源
		in.close();
	}
	//循环读取完整文件    read读取完标志返回-1
	public static void readFile02() throws Exception{
		// 找到目标文件
		File file=new File("D:\\nodejs\\javacore\\src\\com\\wpx\\demo01/demo01.java");
		//建立数据的输入通道。
		FileInputStream in=new FileInputStream(file);
		int content=0;
		while((content=in.read())!=-1) {
			System.out.print((char)content);
		}
		//关闭资源
		in.close();
	}
	
	//使用缓冲 数组 读取  
	public static void readFile03() throws IOException{
		// 找到目标文件
		File file=new File("D:\\nodejs\\javacore\\src\\com\\wpx\\demo01/demo01.java");
		//建立数据的输入通道。
		FileInputStream in=new FileInputStream(file);
		//建立缓冲字节数组，读取文件的数据。
		byte[] buf=new byte[1024];
		//读取文件中的数据
		//如果使用read读取数据传入字节数组，那么数据是存储到字节数组中的，而这时候read方法的返回值是表示的是本次读取了几个字节数据到字节数组中。
		int read = in.read(buf);
		//使用字节数组构建字符串
		String string = new String(buf,0,read);
		System.out.println(string);
		//关闭资源
		in.close();
	}
	
	//使用缓冲 数组 读取 完整文件 
		public static void readFile04() throws IOException{
			// 找到目标文件
			File file=new File("D:\\nodejs\\javacore\\src\\com\\wpx\\demo01/demo01.java");
			//建立数据的输入通道。
			FileInputStream in=new FileInputStream(file);
			//建立缓冲字节数组，读取文件的数据    存储读取到的数据 
			byte[] buf=new byte[1024];
			//保存每次读取到的字节个数。
			int length=0;
			//读取文件中的数据
			while((length = in.read(buf))!=-1) {
				System.out.println(new String(buf, 0, length));
			}
			//关闭资源
			in.close();
		}
		
}
