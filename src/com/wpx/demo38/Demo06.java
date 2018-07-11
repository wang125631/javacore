package com.wpx.demo38;

import java.util.Arrays;

/**
 * 反转数组
 * @author wangpx
 */
public class Demo06 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		int length = arr.length;
		int[] arr2 = new int[length];
		for(int i=0,j=length-1;i<length;i++,j--) {
			arr2[i]=arr[j];
			System.out.println(arr2[i]);
		}
		
	}
}
