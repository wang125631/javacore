package com.wpx.demo04;
/**
 * 折半查找法(二分法): 使用前提必需是有序的数组
 * @author wangpx
 */
public class demo10 {

	public static void main(String[] args) {
	
		int [] arr= {2,5,8,16,37,49,96};
		int index = halfSearch(arr,49);
		System.out.println("元素所在的索引值是："+ index);
}
	public static int halfSearch(int[] arr,int target) {
		//定义三个变量分别记录最大、最小、中间的查找范围索引值
		int max = arr.length-1;
		int min = 0;
		int mid = (max+min)/2;
		while(true) {
			
			if(target>arr[mid]){
				min = mid+1;
			}else if(target<arr[mid]){
				max = mid -1;
			}else{
				//找到了元素
				return mid;
			}
			//没有找到的情况
			if (max<min){
				return -1;
			}
			//重新计算中间索引值
			mid = (min+max)/2;
		}
	}
	
	
	
}
