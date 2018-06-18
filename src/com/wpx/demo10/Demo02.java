package com.wpx.demo10;

import java.util.MissingFormatArgumentException;

/**
 *  线程常用的方法：
 	 Thread(String name)     初始化线程的名字
	 setName(String name)    设置线程对象名
	 getName()             返回线程的名字
	 
	 
	 sleep()                 线程睡眠指定的毫秒数。 静态的方法， 那个线程执行了sleep方法代码那么就是那个线程睡眠。
	 
	 currentThread()      返回当前的线程对象，该方法是一个静态的方法， 注意： 那个线程执行了currentThread()代码就返回那个线程 的对象。
	 
	 getPriority()             返回当前线程对象的优先级   默认线程的优先级是5
	 
	 setPriority(int newPriority) 
	 设置线程的优先级    虽然设置了线程的优先级，但是具体的实现取决于底层的操作系统的实现（最大的优先级是10 ，最小的1 ， 默认是5）。
 * @author wangpx
 */
public class Demo02 extends Thread {

	@Override
	public void run() {
		try {
			Thread.currentThread().setName("wpx");
			System.out.println(Thread.currentThread().getName());
			Thread.currentThread().setPriority(8);
			System.out.println(Thread.currentThread().getPriority());
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
	
	}
	public static void main(String[] args) {
		Demo02 d=new Demo02();
		d.start();
}
}