package com.wpx.demo06;
/**
 * main函数的详解：
	
	public ： 公共的。 权限是最大，在任何情况下都可以访问。 private  
		原因： 为了保证让jvm在任何情况下都可以访问到main方法。

	static:  静态。静态可以让jvm调用main函数的时候更加的方便。不需要通过对象调用。
		
	void:  没有返回值。 因为返回的数据是 给 jvm，而jvm使用这个数据是没有意义的。所以就不要了。
	

	main: 函数名。   注意： main并不是关键字,只不过是jvm能识别的一个特殊的函数名而已。
	
	
	arguments ：担心某些程序在启动需要参数。

 * @author wangpx
 */
public class demo01 {

}
