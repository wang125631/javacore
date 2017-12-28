package com.wpx.demo04;
/**
 * 函数： 

函数的作用： 为了提高功能代码的复用性。

函数的定义格式:
	
	修饰符  返回值类型  变量名(形式参数){
		函数体
	}

函数的特点：
	1. 函数是把一个功能的代码 封装起来以达到提高功能 代码的复用性。
	2. 函数定义好之后，需要调用才能执行的。
	3. 如果一个函数没有返回值类型，那么就使用void关键字表示。

需求: 定义一个函数判断分数的等级，然后返回分数对应的等级。
 * @author wangpx
 */
public class demo01 {
	public static void main(String[] args) {
	System.out.println(	getGrade(123));;
}
	public static String  getGrade(int score){	//未知的参数定义在形参中， 由函数的调用者确定。
		if(score>=90&&score<=100){
			return "A等级";
		}else if(score>=80&&score<=89){
			return "B等级";
		}else if(score>=70&&score<=79){
			return "C等级";
		}else if(score>=60&&score<=69){
			return "D等级";
		}else if(score>=0&&score<=59){
			return "E等级";
		}else
		return "输入错误";		
	}
}
