package com.wpx.demo08;
/**
 * 模板模式 ：解决某类事情的步骤有些是固定的，有些是会发生变化的，那么这时候我们可以
	为这类事情提供一个模板代码，从而提高效率 。
	
	
	需求；编写一个计算程序运行时间 的模板。
	
	模板模式的步骤：
		1. 先写出解决该类事情其中 的一件的解决方案。
		2. 分析代码，把会发生变化的代码抽取出来独立成一个方法。把该方法描述成一个抽象的方法。
		3. 使用final修饰模板方法，防止别人 重写你的模板方法。
		
 * @author wangpx
 */
abstract class CodeRuntime{
	public abstract void code();
	public final void getTime(){
		long start = System.currentTimeMillis();
		code();
		long endTime = System.currentTimeMillis();
		System.out.println("Runtime "+(endTime - start));
	}
}
public class demo10 extends CodeRuntime{

	public static void main(String[] args) {
		demo10 d=new demo10();
		d.getTime();
	}
	@Override
	public void code() {
		int i=0;
		while(i<5000) {
			System.out.println(i);
			i++;
		}
	}

}
