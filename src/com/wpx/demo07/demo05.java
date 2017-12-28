package com.wpx.demo07;
/**
 * 多态：一个对象具备多种形态。(父类的引用类型变量指向了子类的对象)

	或者是接口 的引用类型变量指向了接口实现类的对象)
	
	多态的前提：必须存在继承或者实现 关系。
	
	    动物  a  = new   狗();
	
	多态要注意 的细节：
		1.  多态情况下，子父类存在同名的成员变量时，访问的是父类的成员变量。
		2.  多态情况下，子父类存在同名的非静态的成员函数时，访问的是子类的成员函数。
		3.  多态情况下，子父类存在同名的静态的成员函数时，访问的是父类的成员函数。
	
		4.  多态情况下，不能访问子类特有的成员。
	
	总结：多态情况下，子父类存在同名的成员时，访问的都是父类的成员，除了在同名非静态函数时才是访问子类的。

 * @author wangpx
 */
abstract class Animal{
	String name;
	public abstract void run();
	
}
class Mouse extends Animal{

	@Override
	public void run() {
		System.out.println("Mouse run....");
	}
	//特有方法
	public void dig() {
		System.out.println("Mouse dig...");
	}
	
}
public class demo05 {

	public static void main(String[] args) {
		//多态： 父类的引用类型变量指向子类的对象
	Animal a = new Mouse();
	a.run();
	}
}
