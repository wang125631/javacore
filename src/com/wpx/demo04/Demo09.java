package com.wpx.demo04;
/**
 * 
冒泡排序：冒泡排序的思想就是使用相邻的两个 元素挨个比较一次，符合条件交换位置。
 * @author wangpx
 */
public class Demo09 {

	public static void main(String[] args) {
		int[] arr = {2,5,37,8,96,16,49}; 
		bubbleSort(arr);
}
	public static void bubbleSort(int[] arr) {
		for(int i = 0;i < arr.length-1; i++) {
			for(int j = 0;j < arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp= arr[j];
					arr[j] =arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		//遍历数组，查看效果
				System.out.print("目前的元素：");
				for (int i = 0 ; i<arr.length  ;i++){
					System.out.print(arr[i]+",");
				}
	}
}
