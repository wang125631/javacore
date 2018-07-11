package com.wpx.demo38;

import java.util.HashMap;

/**
 * 统计数组对象出现次数
 * 
 * @author wangpx
 */
public class Demo01 {

	public static void main(String[] args) {

		int[] arr=  {1,2,4,5,8,0,1,2,2,1,5};
		HashMap<Object, Integer> hashMap = new HashMap<Object, Integer>();
		for (int i = 0; i < arr.length; i++) {
			//遍历 尝试通过值获取对象
			Integer integer = hashMap.get(arr[i]);
			//为从零开始
			if(integer == null) {
				integer=0;
				hashMap.put(arr[i], integer);
			}
			//否则加1
			integer++;
			hashMap.put(arr[i], integer);
		}
		System.out.println(hashMap);
	}
}
	

