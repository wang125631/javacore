package com.wpx.demo14;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 输出字节流
	--------| OutputStream  所有输出字节流的基类  抽象类
	------------| FileOutputStream 向文件 输出数据 的输出字节流
	------------| Bufferedoutputstream  缓冲输出字节流    BufferedOutputStream出现的目的是为了提高写数据的效率。 
	        						内部也是维护了一个8kb的字节数组而已。
	 
	 使用BufferedOutputStream的步骤：
	 	1. 找到目标文件
	 	2. 建立数据的输出通道
	
	 
	BufferedOutputStream 要注意的细节
		1. 使用BufferedOutStream写数据的时候，它的write方法是是先把数据写到它内部维护的字节数组中。
	 	2. 使用BufferedOutStream写数据的时候，它的write方法是是先把数据写到它内部维护的字节数组中，如果需要把数据真正的写到硬盘上面，需要
	 	调用flush方法或者是close方法、 或者是内部维护的字节数组已经填满数据的时候。
	 
 * @author wangpx
 */
public class Demo11 {

	public static void main(String[] args) throws IOException {
		//创建目标文件
		File file=new File("D:/demo11.java");
		//建立数据的输出通道
		FileOutputStream  fileOutputStream = new FileOutputStream(file);
		//建立缓冲输出字节流对象
		BufferedOutputStream bufferedOutputStream  = new BufferedOutputStream(fileOutputStream);
		//把数据写出
		bufferedOutputStream.write("hello bufferedOutputStream".getBytes()); 
		//把缓冲数组中内部的数据写到硬盘上面。
		bufferedOutputStream.flush();
		bufferedOutputStream.close();
	}
}
