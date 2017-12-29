package com.wpx.demo10;
/**
 * 自定义线程的创建方式:

	方式一 ： 
		1. 自定义一个类继承Thread类。
		2. 重写Thread类的run方法，把自定义线程的任务代码写在run方法上。
		3. 创建Thread的子类对象，并且调用start方法启动一个线程。 
			
		注意：千万不要直接调用run方法，调用start方法的时候线程就会开启，线程一旦开启就会执行run方法中代码，如果直接调用
		run方法，那么就 相当于调用了一个普通的方法而已。
	
	方式二：
		1. 自定义一个类实现Runnable接口。
		2. 实现Runnable接口 的run方法，把自定义线程的任务定义在run方法上。
		3. 创建Runnable实现类对象。
		4. 创建Thread类 的对象，并且把Runnable实现类的对象作为实参传递。
		5. 调用Thread对象 的start方法开启一个线程。
 * 
 * @author wangpx
 */
public class demo05 implements Runnable{

	@Override
	public void run() {
		System.out.println("Current Thread is "+Thread.currentThread().getName());
		
	}
	public static void main(String[] args) {
		demo05 d=new demo05();
		Thread t1=new Thread(d, "t1");
		Thread t2=new  Thread(() ->  {
			System.out.println("t2 is runing.... ");
		});
		t1.start();
		t2.start();
		
	}	
}
