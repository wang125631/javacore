package com.wpx.demo07;
/**
 * 局部内部类： 在一个类 的方法内部定义另外一个类，那么另外一个类就称作为局部内部类。

	局部内部类要注意的细节：
	1. 如果局部 内部类访问了一个局部变量，那么该局部变量必须使用final修饰、
	
	jdk1.8以后不需要显示的表明
 * @author wangpx
 */

public class Demo08 {

	public static void main(String[] args) {
		Outer2 o=new Outer2();
		o.show();
}	
}
class Outer2{
	String name= "外部类的name";
	
	public void show() {
		final int y = 100;
		//局部内部类
		class Inner8{
			
			int x =10;
			public void print(){
				System.out.println(y);
			}
		}
		Inner8 inner=new Inner8();
		inner.print();	
	}

}