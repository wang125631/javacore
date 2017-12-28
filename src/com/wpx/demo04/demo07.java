package com.wpx.demo04;
/**
 * 定义一个函数接收一个int类型的数组对象，找出数组对象中 的最大元素返回给调用者。
 * @author wangpx
 */
public class demo07 {

	public static void main(String[] args) {
		int[] arr = {12,14,5,-26,14};
		int max = getMax(arr);
		System.out.println("最大值："+ max); 
	}
	public static int getMax(int[] arr) {
		int max=arr[0];
		int length=arr.length;
		for(int i = 1;i < length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}
