package com.wpx.demo03;
/**
 * 控制流程语句----do while循环语句

格式：
	do{
	
	}while(判断条件);

需求： 在控制上打印五句hello world.


while循环语句与do-while循环语句的区别：
	while循环语句是先判断后执行循环语句的，do-while循环语句
	是先执行，后判断。不管条件是否满足至少会执行一次。
 * @author wangpx
 */
public class demo05 {
public static void main(String[] args) {
	int count = 0;
	do
	{
		System.out.println("hello world");
		count++;
	}while(count<5);

}
}
