package com.wpx.demo07;
/**
 * 接口：

	接口：拓展功能的。  
	
	
	接口的定义格式：
		
		interface 接口名{
		
		}
	
	接口要注意的事项 ：
		1. 接口是一个特殊的类。
		2. 接口的成员变量默认的修饰符为： public static final 。那么也就是说接口中的成员变量都是常量。
		3. 接口中 的方法都是抽象的方法，默认的修饰符为： public abstract。
		4. 接口不能创建对象。
		5. 接口是没有构造方法的。
		6. 接口是给类去实现使用的，非抽象类实现一个接口的时候，必须要把接口中所有方法全部实现。
	
	
	实现接口的格式：
	
		class  类名 implements 接口名{
		
		}
 * @author wangpx
 */
interface action{
	void say();
}
public class demo02 implements action{

	@Override
	public void say() {
		System.out.println("hello");
	}

}
