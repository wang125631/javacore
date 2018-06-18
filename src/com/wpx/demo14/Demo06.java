package com.wpx.demo14;

import java.io.File;

/**
 * 文件夹相关：
	staic File[] listRoots()	列出所有的根目录（Window中就是所有系统的盘符）
	list()						返回目录下的文件或者目录名，包含隐藏文件。对于文件这样操作会返回null。
	listFiles()					返回目录下的文件或者目录对象（File类实例），包含隐藏文件。对于文件这样操作会返回null。


	list(FilenameFilter filter)	返回指定当前目录中符合过滤条件的子文件或子目录。对于文件这样操作会返回null。
	listFiles(FilenameFilter filter)	返回指定当前目录中符合过滤条件的子文件或子目录。对于文件这样操作会返回null。
 * 
 * @author wangpx
 */
public class Demo06 {

	public static void main(String[] args) {
		File[] listRoots = File.listRoots();
		for (File file : listRoots) {
			System.out.println(file);
		}
		//把 当前文件夹下面的所有子文件名与子文件夹名 存储到一个String类型 的数组中 返回。
		File file=new File("D:\\nodejs\\javacore\\src\\com/wpx/");
		File[] listFiles = file.listFiles();
		for (File file2 : listFiles) {
			System.out.println(file2.getName());
		}
	}
}
