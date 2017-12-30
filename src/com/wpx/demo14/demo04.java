package com.wpx.demo14;

import java.io.File;

/**
 * 
 * 删除：
	delete()		删除文件或一个空文件夹，如果是文件夹且不为空，则不能删除，成功返回true，失败返回false。
	deleteOnExit()	在虚拟机终止时，请求删除此抽象路径名表示的文件或目录，保证程序异常时创建的临时文件也可以被删除
	
	
		判断：
			exists()		文件或文件夹是否存在。
			isFile()		是否是一个文件，如果不存在，则始终为false。
			isDirectory()	是否是一个目录，如果不存在，则始终为false。
			isHidden()		是否是一个隐藏的文件或是否是隐藏的目录。
			isAbsolute()	测试此抽象路径名是否为绝对路径名。

 * @author wangpx
 */
public class demo04 {

	public static void main(String[] args) {
		File file =new File("D:/javacore");
		//delete方法会马上删除一个文件。 delete方法不能用于删除非空的文件夹。
		System.out.println("is delete success "+file.delete());
		file.deleteOnExit();  //jvm退出的时候删除文件。  一般用于删除临时 文件
		
		//是否      是true
		System.out.println("exist ?"+ file.exists()); 
		System.out.println("is File ? "+file.isFile());
		System.out.println("is Directoty ?"+file.isDirectory());
		System.out.println("is Hidden File ? "+file.isHidden());
		System.out.println("is absolute Path? "+file.isAbsolute());
	}
}
