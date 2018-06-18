package com.wpx.demo14;

import java.io.File;
import java.io.IOException;

/**
 * 创建：
	createNewFile()	在指定位置创建一个空文件，成功就返回true，如果已存在就不创建然后返回false
	mkdir()			在指定位置创建目录，这只会创建最后一级目录，如果上级目录不存在就抛异常。
	mkdirs()		在指定位置创建目录，这会创建路径中所有不存在的目录。
	renameTo(File dest)	
	重命名文件或文件夹，也可以操作非空的文件夹，文件不同时相当于文件的剪切,剪切时候不能操作非空的文件夹。移动/重命名成功则返回true，失败则返回false。
 * 
 * @author wangpx
 */
public class Demo03 {

	public static void main(String[] args) throws IOException {
	
		File f1=new File("D:/javacore.txt");
		//创建一个指定的文件，如果该文件存在了，则不会再创建，如果还没有存在则创建。创建成功返回true，否则返回false。
		System.out.println(" is exist "+f1.createNewFile());
		
		File f2=new File("D:/javacore");
		//创建单层目录
		System.out.println("is make dir success "+f2.mkdir());
		
		File f3=new File("D:/javacore/demo01");
		System.out.println("is make dirs success "+f3.mkdirs());
		
		//renameTo() 
		//如果目标文件与源文件是在同一个路径下，那么renameTo的作用是重命名，
		//如果目标文件与源文件不是在同一个路径下，那么renameTo的作用就是剪切，而且还不能操作文件夹。 
		File destFile=new File("D:/java");
		System.out.println(destFile.renameTo(f2));
	}
}
