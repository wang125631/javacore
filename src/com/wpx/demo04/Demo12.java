package com.wpx.demo04;

import java.util.Arrays;

/**
 * toString();
排序（sort）
找元素在数组中的位置(二分查找法)  binarySearch

数组的工具类（Arrays）：
 * @author wangpx
 */
public class Demo12 {

	public static void main(String[] args) {
		int[] arr = {12,34,54,76,34,66,78};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println(Arrays.binarySearch(arr,123));
	}
}
