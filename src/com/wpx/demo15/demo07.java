package com.wpx.demo15;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * 编码与解码 
 
	 编码： 把看得懂的字符变成看不懂码值这个过程我们称作为编码。
	 
	解码： 把码值查找对应的字符，我们把这个过程称作为解码。

 * @author wangpx
 */
public class demo07 {

	public static void main(String[] args) throws UnsupportedEncodingException {
	
		String str="汉字";
		byte[] bytes = str.getBytes("utf-8");
		System.out.println(Arrays.toString(bytes));
		str =new String(bytes, "utf-8");
		System.out.println(str);
		
		
	}
}
