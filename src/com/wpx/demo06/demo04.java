package com.wpx.demo06;
/**
 * 调用父类 的构造方法是可以初始化从父类继承下去的属性的。
 * @author wangpx
 */
class Fu{
	int age = 10;
	String name;
	public Fu(){
		System.out.println("Fu类的无参构造...");
	}
	public Fu(String name) {
		this.name=name;
		System.out.println("Fu类带参构造...");
	}
}
class Zi extends Fu{
	int x = 20;

	public Zi(String name){
		super(name); //指定调用父类一个参数的构造函数。
	}

	public void print(){
		System.out.println(x);
	}
}
public class demo04 {
	public static void main(String[] args) {
		Zi z=new Zi("wpx");
		System.out.println(z.name);
	}

}
