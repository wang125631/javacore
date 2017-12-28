package com.wpx.demo04;
/**
 * 选择排序(直接排序)：使用一个元素与其他 的元素挨个比较一次，符合条件交换位置。
 * @author wangpx
 */
public class demo08 {

	public static void main(String[] args) {
		int[] arr = {2,5,37,8,96,16,49}; 
		selectSort(arr);
	
}
	public static void selectSort(int[] arr) {
		//把最大值放在首位置。
		for(int j = 0; j<arr.length-1; j++){  //  控制的是轮数。
			for(int i = j+1 ; i<arr.length ; i++){ // 找出最大值
				if(arr[i]>arr[j]){
					//交换位置
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
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
