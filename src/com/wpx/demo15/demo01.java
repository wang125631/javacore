package com.wpx.demo15;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 * 输出字符流:
---------| Writer 所有输出字符流的基类。  抽象类
----------------| FileWriter 向文件输出数据的输出字符流  
----------------| BufferedWriter 缓冲输出字符流
        该类出现的目的是为了提高写文件数据的效率与拓展FileWriter的(newLine)功能.


 * @author wangpx
 */
public class demo01 {

	public static void main(String[] args) throws IOException {
		writerFile02();
	}
	public static void writerFile01() throws IOException{
		//创建文件
		File file=new File("D:/demo01.java");
		//新建文件输出字符流管道
		FileWriter fw=new FileWriter(file);
		//写入数据
		fw.write("你好 IO");
		//关闭资源
		fw.close();
	}
	
	public static void writerFile02() throws IOException{
		//创建文件
		File file=new File("D:/demo01.java");
		//新建文件输出字符流管道
		FileWriter fw=new FileWriter(file);
		//使用缓冲输出字符流提高效率
		BufferedWriter bw=new BufferedWriter(fw);
		//写入数据
		bw.write("你好 IO02");
		//刷新缓存
		bw.flush();
		//关闭资源
		fw.close();
	}
}
