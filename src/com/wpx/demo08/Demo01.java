package com.wpx.demo08;
/**
 * 异常：

我们的java程序也是会存在某些不正常 的情况的，这些不正常的 情况我们就统称异常。


	异常体系：
	--------| Throwable
	------------| Error
	------------| Exception
	
	
	Throwable常用的方法：
		toString()  返回当前异常对象的完整类名+病态信息。
		getMessage() 返回的是创建Throwable传入的字符串信息。
		printStackTrace() 打印异常的栈信息。
		
 * @author wangpx
 */
public class Demo01 {

	public static void main(String[] args) {
		test();
	}
	public static void test() {
		Throwable t=new Throwable();
		//t.toString();
		//t.getMessage();
		t.printStackTrace();
	}

}
