package com.wpx.demo09;

import java.util.Random;

/**
 * 编写一个函数随机产生四位的验证码。
 * @author wangpx
 */
public class demo08 {

	public static void main(String[] args) {
	
		Random r=new Random();
		int nextInt = r.nextInt(10); //0-9
		System.out.println(nextInt);
		
	char[] arr = {'王','刘','张','杨','钱','皮'};
	StringBuffer sb=new StringBuffer();
	Random random=new Random();
	//需要四个随机数，通过随机数获取字符数组中的字符，
	for(int i  = 0 ; i< 4 ; i++) {
		int index= random.nextInt(arr.length);
		sb.append(arr[index]);
	}
	System.out.println("验证码："+ sb);
	}
}
