package com.wpx.demo10;
/**
 * 需求： 模拟3个窗口同时在售50张 票 。
 
问题1 ：为什么50张票被卖出了150次？

出现 的原因： 因为num是非静态的，非静态的成员变量数据是在每个对象中都会维护一份数据的,三个线程对象就会有三份。

解决方案：把num票数共享出来给三个线程对象使用。使用static修饰。

问题2： 出现了线程安全问题 ?

线程 安全问题的解决方案：sun提供了线程同步机制让我们解决这类问题的。
	
	java线程同步机制的方式：
	
		方式一：同步代码块
			
			同步代码块的格式：
				
				synchronized(锁对象){
					需要被同步的代码...
				}

	同步代码块要注意事项：
			1. 任意的一个对象都可以做为锁对象。
			2. 在同步代码块中调用了sleep方法并不是释放锁对象的。
			3. 只有真正存在线程安全问题的时候才使用同步代码块，否则会降低效率的。
			4. 多线程操作的锁 对象必须 是唯一共享 的。否则无效。
			
	
			
	
			
			方式二：同步函数
	
	出现线程安全问题的根本原因：
		1. 存在两个或者两个以上 的线程对象,而且线程之间共享着一个资源。
		2. 有多个语句操作了共享资源。
		
		推荐使用： 同步代码块。
		原因：
			1. 同步代码块的锁对象可以由我们随意指定，方便控制。同步函数的锁对象是固定 的，不能由我们来指定。
			2. 同步代码块可以很方便控制需要被同步代码的范围，同步函数必须是整个函数 的所有代码都被同步了。
	
 * @author wangpx
 */
class SaleTicket extends Thread{
	static int num = 50;//票数  非静态的成员变量,非静态的成员变量数据是在每个对象中都会维护一份数据的。
	
	static Object o =new Object();
	
	 public SaleTicket(String name) {
			super(name);
		}
	@Override
	public void run() {
		while(true){
			//同步代码块
			synchronized (o) {				
				if(num>0){
					System.out.println(Thread.currentThread().getName()+"售出了第"+num+"号票");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					num--;
				}else{
					System.out.println("售罄了..");
					break;
				}
			}
			
		}
	}
	
}

public class demo03 {
	public static void main(String[] args) {
		//创建三个线程对象，模拟三个窗口
		SaleTicket thread1 = new SaleTicket("窗口1");
		SaleTicket thread2 = new SaleTicket("窗口2");
		SaleTicket thread3 = new SaleTicket("窗口3");
		//开启线程售票
		thread1.start();
		thread2.start();
		thread3.start();
		
	}
}
