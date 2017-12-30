package com.wpx.demo14;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 获取：
	getName()		获取文件或文件夹的名称，不包含上级路径。
	getPath()       返回绝对路径，可以是相对路径，但是目录要指定
	getAbsolutePath()	获取文件的绝对路径，与文件是否存在没关系
	length()		获取文件的大小（字节数），如果文件不存在则返回0L，如果是文件夹也返回0L。
	getParent()		返回此抽象路径名父目录的路径名字符串；如果此路径名没有指定父目录，则返回null。
	lastModified()	获取最后一次被修改的时间。
	
 * @author wangpx
 */
public class demo05 {

	public static void main(String[] args) {
		
	File file =new File("D:/javacore/demo01");
	System.out.println("File Name " +file.getName());
	System.out.println("Path "+file.getPath());
	System.out.println("absolute Path "+file.getAbsolutePath());
	System.out.println("file size (/byte)" +file.length());
	System.out.println("file parent path "+file.getParent());
	
	//使用毫秒值转换成Date对象
	long lastModified = file.lastModified();
	Date date = new Date(lastModified);	
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss");
	System.out.println("获取最后一次的修改时间(毫秒值)："+ dateFormat.format(date) );
	
	}
}
