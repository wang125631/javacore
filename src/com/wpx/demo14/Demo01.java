package com.wpx.demo14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * IO流(Input Output) ：

	IO技术主要的作用是解决设备与设备之间 的数据传输问题。 比如： 硬盘--->内存          内存的数据---->硬盘上            把键盘的数据------->内存中
	
	IO技术的应用场景：
		 导出报表 ， 上传大头照   、 下载 、 解释xml文件 ... 
	
	数据保存到硬盘上，该数据就可以做到永久性的保存。   数据一般是以文件的形式保存到硬盘上
	
	sun使用了一个File类描述了文件或者文件夹的。
	
	File类可以描述一个文件或者一个文件夹。
	
	
	File类的构造方法：
	
		File(String pathname)  指定文件或者文件夹的路径创建一个File文件。
		
		File(File parent, String child)   根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。 
	
		File(String parent, String child) 
	
	目录分隔符：  在windows机器上 的目录分隔符是 \  ,在linux机器上的目录分隔符是/ .
	
	注意：  在windows上面\ 与 / 都可以使用作为目录分隔符。 而且，如果写/ 的时候只需要写一个即可。

 * @author wangpx
 */
public class Demo01 {

	public static void main(String[] args) throws IOException {
	
	File file = new File("F:/demo01.java");
	FileOutputStream o=new FileOutputStream(file);
	o.write("hello IO".getBytes());
	System.out.println("is exist "+file.exists());
	System.out.println("is a File "+file.isFile());
	
	//...
	System.out.println("file separator "+file.separator);
	
	File file2 = new File("D:\\demo01.txt");
	System.out.println(file2.exists());
	}
}
