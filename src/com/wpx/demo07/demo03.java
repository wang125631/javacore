package com.wpx.demo07;
/**
 * 
接口的作用：
	1. 程序的解耦。  （低耦合）
	2. 定义约束规范。
	3. 拓展功能。
 * @author wangpx
 */
class Student{
	
}
interface action3{
	void study();
}
public class demo03 extends Student implements action3
{

	@Override
	public void study() {
		System.out.println("study....");
		
	}

}
