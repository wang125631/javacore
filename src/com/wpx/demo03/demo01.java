package com.wpx.demo03;
/**
 * 控制流程语句之----switch选择判断语句 

switch语句的格式：
	
	switch(你的选择){
		
		case 值1：
			符合值1执行的代码
			break;
		case 值2：
			符合值 2执行的代码
			break;
		case 值3：
			符合值 3执行的代码
			break;
		case 值4：
			符合值 4执行的代码
			break;
		......

		default: 
			你的选择都符合上述的选项时执行的代码;
			break;
	}


switch语句要注意的事项：
	1. switch语句使用的变量只能是byte、 char、 short、int、 String数据类型，String数据类型是从jdk7.0的时候开始支持的。
	2. case后面跟 的数据必须是一个常量。	
	3. switch的停止条件：
		switch语句一旦匹配上了其中的一个case语句，那么就会执行对应的case中的语句代码，执行完毕之后如果没有
		遇到break关键字或者是结束switch语句的大括号，那么switch语句不会再判断，按照代码的顺序从上往下执行
		所有的代码。直到遇到break或者是结束siwitch语句的大括号为止。

	4. 在switch语句中不管代码的顺序如何，永远都是会先判断case语句，然后没有符合的情况下才会执行default语句。

 * @author wangpx
 */
public class demo01 {
	public static void main(String[] args) 
	{
		
		int option = 13;	//定义一个变量存储你的选择
		switch(option){
			
			case 1:
				System.out.println("java");
				
			case 2:
				System.out.println("C#");
				
			case 3:
				System.out.println("javascript");
				
			case 4:
				System.out.println("android");
			default:
				System.out.println("你的选择有误");
	
			
				
		}
	}
}
