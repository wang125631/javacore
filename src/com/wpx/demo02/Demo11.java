package com.wpx.demo02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 使用异或对图片数据进行加密.
 * @author wangpx
 */
public class Demo11 {
	public static void main(String[] args) throws Exception {
		// 找到图片文件
		File inFile = new File("e:\\加密的图片.jpg");
		File outFile = new File("e:\\解密的图片.jpg");

		// 建立数据通道，让图片的二进制数据流入
		FileInputStream input = new FileInputStream(inFile);
		FileOutputStream output = new FileOutputStream(outFile);
		// 边读，把读到的数据异或一个数据，把把数据写出

		int content = 0; // 该变量是用于存储读取到的数据
		while ((content = input.read()) != -1) { // 如果没有到文件的末尾，那么继续读取数据，读取到的数据已经存储到content变量中了。
			output.write(content ^ 2);
		}

		// 关闭资源
		output.close();
		input.close();

	}
}
