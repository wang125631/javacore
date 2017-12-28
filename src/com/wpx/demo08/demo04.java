package com.wpx.demo08;

import java.util.Date;

/**
 *  下面的信息是通过printStackTrace方法打印出来，那么异常对象从何而来呢？ 
	Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Demo10.div(Demo10.java:10)
        at Demo10.main(Demo10.java:5)
	
jvm运行到a/b这个语句的时候，发现b为0，除数为0在我们现实生活中是属于
不正常的情况，jvm一旦发现了这种不正常的情况时候，那么jvm就会马上创建
一个对应的异常对象，并且会调用这个异常对象 的printStackTrace的方法来处理。


异常的处理：

	 方式一：捕获处理

	  捕获处理的格式：
			
			try{
				可能发生异常的代码；

			}catch(捕获的异常类型 变量名){
				处理异常的代码....
			}
	
		
		捕获处理要注意的细节：
			1. 如果try块中代码出了异常经过了处理之后，那么try-catch块外面的代码可以正常执行。
			2. 如果try块中出了异常的代码，那么在try块中出现异常代码后面的代码是不会执行了。
			3. 一个try块后面是可以跟有多个catch块的，也就是一个try块可以捕获多种异常的类型。
			4. 一个try块可以捕获多种异常的类型,但是捕获的异常类型必须从小到大进行捕获，否则编译报错。
 * @author wangpx
 */
class tryCatch{
	public void sleep() {
		try {
			Thread.sleep(1000*60*60*24);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(new Date());
	}
}

public class demo04 {
	
public static void main(String[] args) throws Exception{
	System.out.println(1/0);
}
}
