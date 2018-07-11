package com.wpx.demo37;

import java.util.concurrent.CountDownLatch;

/**
 * 闭锁
 * 
 * {@link CountDownLatch}
 * 
 * @author wangpx
 */
class CountDownlatchTest implements Runnable{

	private CountDownLatch latch;
	
	public CountDownlatchTest(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
		
		synchronized (this) {
			try {
				for(int x=0,y=1;y<5000;x++,y=y+2) {
					if(x %2 ==0) {
						System.out.println("x的值是" +x +"  y的值是"+y);
					}
				}
			}finally {
				latch.countDown();
			}
		}
		
	}
	
	
}

public class Demo05 {

	public static void main(String[] args) {
		final  CountDownLatch latch =new CountDownLatch(10);
	
		CountDownlatchTest countDownlatchTest = new CountDownlatchTest(latch);
		long start  = System.currentTimeMillis();
	
		for(int i=0;i<10;i++) {
			new Thread(countDownlatchTest).start();
		}
		try {
			latch.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long end  = System.currentTimeMillis();
		System.out.println(end -start);
	}
}
