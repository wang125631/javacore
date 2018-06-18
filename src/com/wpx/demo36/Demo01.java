package com.wpx.demo36;

import java.util.Comparator;
import java.util.function.Consumer;

import org.junit.Test;

/**
 * Lambda表达式基础语法  "->" 箭头操作符和Lambda操作符
 * Lambda表达式可以对参数类型进行类型推断
 * 左侧:Lambda表达式的参数列表
 * 右侧:Lambda锁需执行的功能 
 * 
 * @author wangpx
 */
public class Demo01 {
	
	/**
	 *  语法格式一:
	 * 	() -> syso("hello world");
	 */
	@Test
	public void test01() {
		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("匿名内部类");
			}
		};
		r.run();
		System.out.println("---------");
		Runnable r2 = () -> System.out.println("Lambda");
		r2.run();
	}
	
	/**
	 * 语法格式二:有一个参数,无返回值
	 * (a) -> syso(a);
	 * 
	 */
	@Test
	public void test02() {
		Consumer<String> con = (a) -> System.out.println(a);
		con.accept("Hello Java8");
	}
	
	/**
	 * 语法格式三:若只有一个参数参数小括号可以不写
	 * (a) -> syso(a);
	 * 
	 */
	@Test
	public void test03() {
		Consumer<String> con = a -> System.out.println(a);
		con.accept("Hello Java8");
	}
	/**
	 * 语法格式四:多参多体有返
	 * (a) -> { return x;};
	 * 
	 */
	@Test
	public void test04() {
		Comparator<Integer> com= (x,y) -> {
			System.out.println("多参多体多返");
			return Integer.compare(x, y);};
			int compare = com.compare(8, 2);
			System.out.println(compare);
	}
	/**
	 * 语法格式五:多参一体有返
	 * 大括号和return均可省略
	 * (a) -> { return x;};
	 */
	@Test
	public void test05() {
		Comparator<Integer> com= (x,y) -> Integer.compare(x, y);
	}
	

}
