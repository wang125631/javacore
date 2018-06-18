package com.wpx.demo36;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import org.junit.Test;

/**
 * Java8内置四大核心函数式接口
 * 
 * 
 * 
 * @author wangpx
 */
public class Demo03 {

	/**
	 * Consumer<T> 消费型接口
	 * 	void accept(T t);
	 */
	@Test
	public void test01() {
		Consumer<String> con = x -> System.out.println(x);;
		con.accept("Hello Java8");
	}
	/**
	 * Supplier<T> 消费型接口
	 * 	T get();
	 */
	@Test
	public void test02() {
		Supplier<String> sup = () -> "Hello Java8";
		System.out.println(sup.get());
	}
	/**
	 * Function<T,R>函数式接口
	 * R apply(T t);
	 */
	@Test
	public void test03() {
		Function<String,Integer> fun= (x) -> x.length();
		System.out.println(fun.apply("Hello Java8"));
	}
	/**
	 * Predicate<T> 断言式接口
	 * 	boolean test(T t);
	 */
	@Test
	public void test04() {
		Predicate<String> pre = (x) -> x.equals("Hello Java8");
		System.out.println(pre.test("Hello Java8"));
		System.out.println(pre.test("Hello World"));
	}
}
