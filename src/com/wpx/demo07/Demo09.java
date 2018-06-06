package com.wpx.demo07;
/**
 * 匿名内部类：没有类名的类就称作为匿名内部类。
	
	匿名内部类的好处：简化书写。
	
	匿名内部类的使用前提：必须存在继承或者实现关系才能使用。
	
	
	匿名内部类一般是用于实参。

 * @author wangpx
 */
public class Demo09 {

}
abstract class Animal9{
	public abstract Animal9 run();
	
	public abstract void sleep();
}
class Outer9{
	public void print() {
		Animal9 a=new  Animal9() {
			
			@Override
			public void sleep() {
				System.out.println("sleep..");
			}
			
			@Override
			public Animal9 run() {
				System.out.println("run...");
				return null;
			}
		};
	}

}