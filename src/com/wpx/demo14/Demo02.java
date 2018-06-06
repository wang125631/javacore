package com.wpx.demo14;

import java.io.File;

/**
 * 路径问题： 

	绝对路径： 该文件在硬盘上 的完整路径。绝对路径一般都是以盘符开头的。
	
	相对路径:  相对路径就是资源文件相对于当前程序所在的路径。
	
	 . 当前路径
	 
	 .. 上一级路径
	 
	注意： 如果程序当前所在的路径与资源文件不是在同一个盘下面，是没法写相对路径 的。

 * @author wangpx
 */
public class demo02 {

	public static void main(String[] args) {
	File file =new File(".");
	//绝对路径
	System.out.println("file absolutePath is "+file.getAbsolutePath());
	//    javacore/demo14为路径
	System.out.println("./demo02.java");  // ->  javacore/demo14/demo02.java
	System.out.println("../demo02'");     // ->  javacore/demo02
	}
}
