package com.wpx.demo37;
/**
 * 模拟CAS算法
 * @author wangpx
 */

class CAS{
	private int value;
	
	//获取内存值
	public synchronized int get() {
		return value;
	}
	
	//比较
	public synchronized int compareAndSwap(int expectedValue,int newValue) {
		int oldValue = value;
		if(oldValue == expectedValue) {
			this.value = newValue;
		}
		return oldValue;
	}
	//设置
	public synchronized boolean compareAndSet(int expectedValue,int newValue) {
		return expectedValue == compareAndSwap(expectedValue,newValue);
	}
	
}
public class Demo03 {

	public static void main(String[] args) {
		final CAS cas =new CAS();	
		for(int i=0;i<10;i++) {
		new Thread( () ->  {
			int expectedValue = cas.get();
			boolean b = cas.compareAndSet(expectedValue, (int)Math.random());
			System.out.println(b);
		}).start();
	}
}
}
