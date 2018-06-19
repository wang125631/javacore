package com.wpx.demo36;

import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

import org.junit.Test;

/**
 * 方法引用
 * 
 * 
 * @author wangpx
 */
class TestMethod{
	public String say() {
		return "Hello World";
	}
	
	public static String show() {
		return "Hello Java8";
	}
}

public class Demo04 {

	/**
	 * 方法引用
	 * 对象::实例方法名
	 */
	@Test
	public void test01() {
		TestMethod testMethod = new TestMethod();
		Supplier<String> sup = testMethod::say;
		System.out.println(sup.get());
	}

	/**
	 * 方法引用
	 * 类::静态方法名
	 */
	@Test
	public void test02() {
		
		Supplier<String> sup = TestMethod::show;
		System.out.println(sup.get());
		
		BiPredicate<String, String> bip = (x,y) -> x.equals(y);
		BiPredicate<String, String> bip2 = String::equals;
	}
	/**
	 * 方法引用
	 * 类::实例方法名
	 * 
	 * 第一个参数为实例方法的的调用者,第二个参数为实例方法的参数
	 */
	@Test
	public void test03() {
		
		Function<TestMethod, String> fun = TestMethod::say;
		System.out.println(fun.apply(new TestMethod()));
		
	
	}
	

	
	
}
