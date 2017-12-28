package com.wpx.demo03;
/**
 *  在控制台上打印一个正立的直角三角形 。

*
**
***
****
*****

多行多列的图形。

行数 5行

列数： 会发生变化 的.

分析列数:
	
	i = 0 ; i<5; j=0 ; j<=i 	1个星号
	i = 1 ; i<5 ;j=0 ; j<=1 	2个星号
	i = 2 ; i<5; j=0 ; j<=2    3个星号
	.....

 * @author wangpx
 */
public class demo07 {
	public static void main(String[] args) {
	for(int i = 0 ; i< 5 ; i++){
		for(int j = 0 ; j<=i ; j++){ //控制列数 
			System.out.print("*");
		}
		//换行
		System.out.println();
	}
}
}
