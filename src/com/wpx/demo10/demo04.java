package com.wpx.demo10;
/**
 * java中同步机制解决了线程安全问题，但是也同时引发死锁现象。

	死锁现象：
	
	死锁现象出现 的根本原因：
		1. 存在两个或者两个以上的线程。
		2. 存在两个或者两个以上的共享资源。
		
	死锁现象的解决方案： 没有方案。只能尽量避免发生而已。

 * @author wangpx
 */
class DeadLock extends Thread{
	//两根筷子
	static	final Object k1 =new Object();
 	static final Object k2 =new Object();
 	
	public DeadLock(String name){
		super(name);
	}

	@Override
	public void run() {

	
		if("person1".equals(Thread.currentThread().getName())) {
			synchronized (k1) {
				System.out.println("person1 get k1");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (k2) {
					System.out.println("person1 get k1 and k2 ,can eat something");
				}
			}
		}else if("person2".equals(Thread.currentThread().getName())){
			synchronized (k2) {
				System.out.println("person2 get k2");
				synchronized (k1) {
					System.out.println("person2 get k1 and k2 ,can eat something");
				}
			}
		}
	}
	
}
public class demo04 {

	public static void main(String[] args) {
		DeadLock thread1 = new DeadLock("person1");
		DeadLock thread2 = new DeadLock("person2");
		//开启线程
		thread1.start();
		
		thread2.start();
}
}
