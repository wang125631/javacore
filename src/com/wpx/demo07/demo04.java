package com.wpx.demo07;
/**
 * 类与接口之间关系： 实现关系。

类与接口要注意的事项：
	1. 非抽象类实现一个接口时，必须要把接口中所有方法全部实现。
	2. 抽象类实现一个接口时，可以实现也可以不实现接口中的 方法。
	3. 一个类可以实现多个接口 。
		
	接口与接口之间关系： 继承关系。
	
	接口与接口之间要注意事项：
		1. 一个接口是可以继承多个接口的。
	 * 
 * @author wangpx
 */
interface A{
	void A();
}
interface B{
	void B();
}
interface C extends A,B{
	void C();
}
public class demo04 implements C{

	@Override
	public void A() {
		 System.out.println("A");
	}

	@Override
	public void B() {
		 System.out.println("B");
	}

	@Override
	public void C() {
		 System.out.println("C");
	}

}
