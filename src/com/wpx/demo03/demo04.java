package com.wpx.demo03;
/**
 * 计算1+2+3+....+ 100的总和。
 * @author wangpx
 */
public class demo04 {

	public static void main(String[] args) {
	
		int num = 1 ;
		int sum = 0;
		while(num < 101) {
			sum = sum +num;
			num ++ ;
		}
		System.out.println(sum);
	}
}
