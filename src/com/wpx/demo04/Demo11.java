package com.wpx.demo04;
/**
 * 定义 一个函数接收一个char类型的数组对象,然后翻转数组中的元素
 * @author wangpx
 */
public class Demo11 {

	public static void main(String[] args) {
		char[] arr = { 'a', 'b', 'c', 'd', 'e' };
		reverse(arr);
	}

	public static void reverse(char[] arr) {
		int length = arr.length;
		for (int startIndex = 0, endIndex = length - 1; startIndex < endIndex; startIndex++, endIndex--) {
			char temp = arr[startIndex];
			arr[startIndex] = arr[endIndex];
			arr[endIndex] = temp;
		}
		// 遍历数组，查看效果
		System.out.print("目前的元素：");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
	}
}
