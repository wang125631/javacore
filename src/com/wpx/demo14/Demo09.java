package com.wpx.demo14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *  输出字节流：
 
 --------| OutputStream 是所有输出字节流 的父类。  抽象类
 -----------| FileOutStream 向文件输出数据的输出字节流。
 
	FileOutputStream如何使用呢？
		1. 找到目标文件
		2. 建立数据的输出通道。
		3. 把数据转换成字节数组写出。
		4. 关闭资源
	
	FileOutputStream要注意的细节：
		1. 使用FileOutputStream 的时候，如果目标文件不存在，那么会自动创建目标文件对象。 
		2. 使用FileOutputStream写数据的时候，如果目标文件已经存在，那么会先清空目标文件中的数据，然后再写入数据。
		3.使用FileOutputStream写数据的时候, 如果目标文件已经存在，需要在原来数据基础上追加数据的时候应该使用new FileOutputStream(file,true)构造函数，第二参数为true。
		4.使用FileOutputStream的write方法写数据的时候，虽然接收的是一个int类型的数据，但是真正写出的只是一个字节的数据，只是
		把低八位的二进制数据写出，其他二十四位数据全部丢弃。
		 
		 00000000-000000000-00000001-11111111   511
	 
	 
	 11111111---> -1 

 * 
 * @author wangpx
 */
public class demo09 {

	public static void main(String[] args) throws IOException {
		writerFile02();
	}
	public static void writerFile01() throws IOException {
		/**
		 *	1. 找到目标文件
			2. 建立数据的输出通道。
			3. 把数据转换成字节数组写出。
			4. 关闭资源
		 */
		File file=new File("D:/deme09.txt");
		FileOutputStream os=new  FileOutputStream(file);
		os.write("Hello IO".getBytes());
		os.close();
	}
	
	//使用字节数组把数据写出。
	public static void writerFile02() throws IOException {
		File file=new File("D:/deme09.txt");
		FileOutputStream os=new  FileOutputStream(file);
		//将数据加入缓存
		String data="Hello Wolrd! ?IO";
		byte[] buf=data.getBytes();
		os.write(buf, 0, buf.length);
		os.close();
	}
	
}
