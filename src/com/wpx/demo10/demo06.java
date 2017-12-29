package com.wpx.demo10;
/**
 * 线程通讯： 一个线程完成了自己的任务时，要通知另外一个线程去完成另外一个任务.
	 
	生产者与消费者
	
	
	wait():  等待   如果线程执行了wait方法，那么该线程会进入等待的状态，等待状态下的线程必须要被其他线程调用notify方法才能唤醒。
	notify()： 唤醒    唤醒线程池等待线程其中的一个。
	notifyAll() : 唤醒线程池所有等待 线程。
	
	
	wait与notify方法要注意的事项：
		1. wait方法与notify方法是属于Object对象 的。
		2. wait方法与notify方法必须要在同步代码块或者是同步函数中才能 使用。
		3. wait方法与notify方法必需要由锁对象调用。
		
		wait 会释放锁,notify不会释放锁
 * 
 * @author wangpx
 */
class Product{
	String name;  //名字
	
	boolean flag = false; //产品是否生产完毕的标识，默认情况是没有生产完成。
}
class Producer extends Thread{
	Product  p ;  	//产品
	
	public Producer(Product p) {
		this.p  = p ;
	}

	@Override
	public void run() {
		while(true) {
		 synchronized (p) {
			if(p.flag == false) {
				System.out.println("生产...");
				p.flag=true;
				p.notify();
			}else {
				try {
					p.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	 }	
	}
	
}
class Customer extends Thread{
	Product  p ;  	//产品
	
	public Customer(Product p) {
		this.p  = p ;
	}

	@Override
	public void run() {
		while(true) {
			synchronized (p) {
				if(p.flag == true) { //产品
					System.out.println("消费.... ");
					p.flag=false;
					p.notifyAll();
				}else {
					try {
						p.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
	
	
}
public class demo06 {

	public static void main(String[] args) {
		Product p=new Product();
		Producer producer=new Producer(p);
		Customer customer=new Customer(p);
		producer.start();
		customer.start();
	}
}
