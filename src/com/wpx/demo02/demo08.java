package com.wpx.demo02;
/**
 * 位运算符：位运算符就是直接操作二进制位的。
	& (与)
	| (或)
	^ (异或)
	规律： 如果操作数A连续异或同一个操作数两次，那么结果还是操作数A。
	
	应用： 对数据加密.
	
	
		~  (取反)
 * @author wangpx
 */
public class demo08 {
	
	public static void main(String[] args) {
		System.out.println(6&3); // 2 
		System.out.println(6|3); // 7
		System.out.println(6^3); //  5

		System.out.println(~7);  // -8
}
}
