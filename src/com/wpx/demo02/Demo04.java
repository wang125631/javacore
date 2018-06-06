package com.wpx.demo02;
/**
 * 	++ （自增） :  自增就是相当于操作数+1.

	前自增：++位于操作数的前面。  比如： ++a；
	
	前自增：先自增，后使用。
				

	后自增： 先使用，后自增。
	
	
	自减： 操作数-1.

	前自减: --位于操作数的前面。  --操作数
	
	前自减： 先自减，后使用。
	

	
	后自减：--位于操作数的后面。 操作数--；
	
	后自减： 先使用，后自减。
	
 * @author wangpx
 */
public class Demo04 {

	public static void main(String[] args) {
	int a=0;
	
	int sum=a++;
	//int sum=++a;
	System.out.println(sum +" "+a);
	
	int b=5;
	int result=b--;
	//int result=--b;
	System.out.println(sum +" "+b );


	
}
}
