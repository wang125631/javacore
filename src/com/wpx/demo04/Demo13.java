package com.wpx.demo04;
/**
 * 二维数组： 二维数组就是数组中的数组。
 * 二维数组 的定义格式：
	
	数据类型[][] 变量名 = new 数据类型[长度1][长度2];
	
	二维数组 的初始化方式：
	
	动态初始化:
		
		数据类型[][] 变量名 = new 数据类型[长度1][长度2];


	静态初始化：

		数据类型[][]  变量名 = {{元素1,元素2...},{元素1,元素2...},{元素1,元素2...} ..}
 * @author wangpx
 */
public class Demo13 {

	public static void main(String[] args) {
	//定义一个二维数组
		int [][] arr =new int[3][25];
		//二维数组的错误定义
		//int [] [] aa =new int[][2];
		arr[1][20]=5;
		System.out.println(arr.length);
		System.out.println(arr[1].length);
		System.out.println(arr[1][20]);
		
	
		
		
}
}
