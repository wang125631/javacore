package com.wpx.demo03;

import java.util.Scanner;

/**
 *  接受键盘录入一个月份， 根据对应的月份输出对应的季节。
	
	345  春天
	678 夏天
	9 10 11 秋天
	1 2 12 冬天

 * @author wangpx
 */
public class demo02 {
	public static void main(String[] args) 
	{
		System.out.println("请输入一个月份：");
		//创建一个扫描器
		Scanner scanner = new Scanner(System.in);
		//调用扫描器的nextInt方法
		int month = scanner.nextInt();
		switch(month){
			case 3:
			case 4:
			case 5:
				System.out.println("春天");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("夏天");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("秋天");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("冬天");
				break;
			default:
				System.out.println("没有对应的季节");
				break;
		}
		

	}
}
