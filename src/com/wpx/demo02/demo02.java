package com.wpx.demo02;

import java.util.Scanner;

/**
 * 通过键盘标准输入流输入成绩判断水平
 * @author wangpx
 */
public class demo02 {

	public static void main(String[] args) {
		//创建一个扫描器
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入分数");
		
		int score = scanner.nextInt();
			if(score >100|| score <0) {
				System.out.println("输入错误");
			}else if(score >60 ){
				System.out.println("及格");
			}else {
				System.out.println("不及格");
			}
		
	}
}
