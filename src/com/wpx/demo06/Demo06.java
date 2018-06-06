package com.wpx.demo06;
/**
 * 父类的功能无法满足子类的需求。

	方法重写的前提： 必须要存在继承的关系。
	
	方法的重写: 子父类出了同名的函数，这个我们就称作为方法的重写。
	
	什么是时候要使用方法的重写：父类的功能无法满足子类的需求时。
	
	方法重写要注意的事项：
		1.方法重写时， 方法名与形参列表必须一致。
		2.方法重写时，子类的权限修饰符必须要大于或者等于父类的权限修饰符。
		3.方法重写时，子类的返回值类型必须要小于或者 等于父类的返回值类型。
		4.方法重写时， 子类抛出的异常类型要小于或者等于父类抛出的异常类型。
				Exception(最坏)
				RuntimeException(小坏)
	
	方法的重载：在一个类中 存在两个或者两个 以上的同名函数,称作为方法重载。
	
	方法重载的要求
		1. 函数名要一致。
		2. 形参列表不一致（形参的个数或形参 的类型不一致）
		3. 与返回值类型无关。
 * @author wangpx
 */

//重写
class Fu6{
	String name;
	
	public void eat() {
		System.out.println("新鲜蔬菜");
	}
}
class Zi6 extends Fu6{
	
	public void eat() {
		System.out.println("农药蔬菜");
		
	}
}

public class Demo06 {

	//重载

	public static String add(String a,String b) {
		return a+b;
	}
	public static  int add(int a,int b) {
		return a+b;
	}
	public static void main(String[] args) {
	Zi6 z=new  Zi6();
	z.eat();
	
	System.out.println(add("hello ","world"));
	System.out.println(add(1,4));
}
}
