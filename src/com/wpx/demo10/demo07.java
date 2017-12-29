package com.wpx.demo10;
/**
 *  
 *  线程的停止：
 	1. 停止一个线程 我们一般都会通过一个变量去控制的。
 	2. 如果需要停止一个处于等待状态下的线程，那么我们需要通过变量配合notify方法或者interrupt()来使用。
 	
 * @author wangpx
 */
public class demo07 extends Thread {

	boolean flag = true;
	
	public demo07(String name) {
		super(name);
	}
	
	@Override
	public synchronized void run() {
	
		int i = 0;
		
		while(flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				System.err.println("Exception....");
			}
			System.out.println(Thread.currentThread().getName()+"  "+i);
			i++;
		}
	}
	public static void main(String[] args) {
		demo07 d=new demo07("wpx");
		d.setPriority(10);
		d.start();
		
		for(int i = 0 ; i<100 ; i++){
			System.out.println(Thread.currentThread().getName()+":"+i);

			if(i==80){
				d.flag = false;
				d.interrupt(); //把线程的等待状态强制清除，被清除状态的线程会接收到一个InterruptedException。 
				synchronized (d) {					
					d.notify();
				}
				
				
			}
			
		}
		
	}

}
