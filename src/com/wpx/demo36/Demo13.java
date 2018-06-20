package com.wpx.demo36;
/**
 * 接口中的默认方法和静态方法
 * 
 * @author wangpx
 */
public interface Demo13 {
	
	default String say() {
		System.out.println("say method invoke....");
		return "Hello Java8";
	}
	
	static void show() {
		System.out.println("Java8 static method invoke...");
	}
}
