package com.wpx.demo04;
/**
 * 静态初始化：
         数据类型[][]  变量名 = {{元素1,元素2...},{元素1,元素2...},{元素1,元素2...} ..}
 * @author wangpx
 */
public class demo14 {

	public static void main(String[] args) {
		
	int[][] arr = {{122,111,92},{67,12,323,12,2,4,6,7},{3,335,39,40}};
	//遍历二维数组
	for(int i = 0;  i <arr.length ; i++){
		for(int j = 0 ; j<arr[i].length ; j++){
			System.out.print(arr[i][j]+" ");
		}
		//换行
		System.out.println();
	}
}
}
