package com.wpx.demo02;
/**
 * 赋值运算符：
	=  (赋值运算符)
	+= 
	-=
	*=
	/=
	%=
 * 
 * @author wangpx
 */
public class demo05 {

	public static void main(String[] args) {
	
		int i = 1;  //1 -> i
		i+=2;       //i = i+2;
		System.out.println(i);
		
		byte b1=1;
		byte b2=2;
		//b2=(byte) (b1+b2);
		b2+=b1;
		System.out.println(b2);
		
		
}
}
