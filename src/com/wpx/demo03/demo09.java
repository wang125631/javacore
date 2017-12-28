package com.wpx.demo03;
/**
 * break、 

break适用范围：只能用于switch或者是循环语句中。

break作用：
	1. break用于switch语句的作用是结束一个switch语句。
	2. break用于循环语句中的作用是结束当前所在的循环语句。

笔试题目：break目前位于内层的for循环，如何才能让break作用于外层 的for循环。
	可以标记解决


标记的命名只要符合标识符的命名规则即可。
 * @author wangpx
 */
public class demo09 {
	
	public static void main(String[] args) {
	aaa:for(int a= 0;a < 10;a++) {
		bbb:for(int b=0;b<2;b++) {
			System.out.println("hello world");
			//break bbb;
			break aaa;
		}
	}
}

}
