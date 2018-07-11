package com.wpx.demo37;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * {@link Lock} Õ¨≤ΩÀ¯
 * 
 * @author wangpx
 */
class Ticket implements Runnable{

	private int tick =100; 
	
	private  Lock lock =new ReentrantLock();
	
	@Override
	public void run() {
		while(true) {
			lock.lock();
			try {
				if(tick > 0) {
					System.out.println(Thread.currentThread().getName() +" €∆±,   £”‡" + --tick);
					}
			}finally {
				lock.unlock();
			}
		}
	}
	
}
public class Demo07 {

	public  static void main(String[] args) {
	
		Ticket ticket = new Ticket();
		for(int i=0;i<10;i++) {
			new Thread(ticket).start();
		}
		
	}
}
