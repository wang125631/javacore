package com.wpx.demo03;
/**
 * continue关键字

continue的适用范围： continue只能用于循环语句。

continue的作用：continue的作用是跳过本次的循环体内容。继续下一次。

continue要注意的事项：
	1. 在一种情况下，continue后面不能跟有其他语句，因为是永远都无法执行到。
	2. continue 也可以配合标记使用的。
 * @author wangpx
 */
public class demo10 {

	public static void main(String[] args) {

		for(int i = 1;i < 100;i++) {
			if(i%2!=0) {
				continue;
			}
			System.out.println(i);
		}
}
}
