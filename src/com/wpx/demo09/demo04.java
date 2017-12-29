package com.wpx.demo09;

import java.util.Arrays;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * System  系统类 主要用于获取系统的属性数据。
 	
	System类常用的方法：
 	arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 一般
 		src - 源数组。
		srcPos - 源数组中的起始位置。
		dest - 目标数组。
		destPos - 目标数据中的起始位置。
		length - 要复制的数组元素的数量。
		
	currentTimeMillis()  获取当前系统系统。       重点
	exit(int status)  退出jvm  如果参数是0表示正常退出jvm，非0表示异常退出jvm。    一般

	gc()    建议jvm赶快启动垃圾回收期回收垃圾。
	getenv(String name) 根据环境变量的名字获取环境变量。
	getProperty(key) 
	
 * @author wangpx
 */
class Student4{
	String name;

	public Student4(String name) {
		super();
		this.name = name;
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("gc is run....");
	}
	
}
public class demo04 {

	public static void main(String[] args) {
	 int[] srcArr = {1,4,45,67,9};
	//把srcArr的数组元素拷贝 到destArr数组中。
	 int[] destArr =new int[3];
	 System.arraycopy(srcArr, 2, destArr, 0, 3);
	 
	// System.exit(0);
	 System.out.println(Arrays.toString(destArr));
	 System.out.println(System.currentTimeMillis());
	 System.out.println("环境变量："+System.getenv("JAVA_HOME"));
	 
	AtomicInteger a=new AtomicInteger(1);
	while(a.intValue() < 5) {
		Student4 s=new Student4(null);
		System.gc();
		a.incrementAndGet();
		
	}

	//Properties properties = System.getProperties();  //获取系统的所有属性。
	//properties.list(System.out);
	
	String value = System.getProperty("java.vm.name");//根据系统的属性名获取对应的属性值
	System.out.println(value);
	}
}
