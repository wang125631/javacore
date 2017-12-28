package com.wpx.demo04;
/**
 * 数组中最常见的问题：
	
	1. NullPointerException 空指针异常
	原因： 引用类型变量没有指向任何对象，而访问了对象的属性或者是调用了对象的方法。\

	2. ArrayIndexOutOfBoundsException 索引值越界。
	原因：访问了不存在的索引值。
 * @author wangpx
 */
public class demo05 {

	public static void main(String[] args) {
/*		int[] arr = new int[2];
		arr = null ;  //null 让该变量不要引用任何的对象。 不要记录任何 的内存地址。
		arr[1] = 10;
		System.out.println(arr[1]);*/
		int[] arr = new int[2];
		arr[0] = 10;
		arr[1] = 30;
		System.out.println(arr[4]); //访问索引值为4的内存空间存储的值
}
}
