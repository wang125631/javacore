package com.wpx.demo17;
/**
 * 
 * @author wangpx
 */
public class demo02 {

	//将其私有化
	private demo02(){
	}
	//声明实例变量.与饿汉式不同的是在需要是创建
	public static demo02 d=null;
	//获取实例对象的方法
	public static demo02 getInstance() {
		//判断d是否为空,如果为空则创建对象,多线程下要通过锁来确保单例
		if(d == null) {
			synchronized (demo02.class) {
				if(d == null) {
					return d=new demo02();
				}
			}
		}
		return d;
	}
	
}
