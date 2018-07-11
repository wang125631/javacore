package com.wpx.demo37;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 
 * <h2>多线程存在问题  读 改 写 </h2>
 * 可见性 保证读问题{@link Demo01}<br>
 * 不能保证原子性问题 {@link Demo02}<br>
 * 解决办法:使用jdk1.5以后的原子变量{@see java.util.concurrent.atomic}包下提供原子变量<br>
 *  
 *  原子变量:<br>
 *  	1.volatile保证内存可见性<br>
 *  	2.CAS(Compare And Swap) 算法保证数据的原子性<br>
 *  	CAS算法是硬件对于并发操作共享数据的支持<br>
 *  	<h4>CAS包含三个操作数:</h4><br>
 *  	内存值 V <br>
 *  	预估值 A <br>
 *  	更新值 B <br>
 *    当且仅当V == A 时,V = B,否则将不做任何操作		
 *  
 *  	
 * @author wangpx
 */
public class Demo02 implements Runnable{
	
	//private volatile int serialNumber ;
	private AtomicInteger serialNumber=new AtomicInteger();
	
	@Override
	public void run() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " : "+ getSerialNumber());
	}

	public int getSerialNumber() {
		return serialNumber.getAndAdd(1);
	}
	public static void main(String[] args) {
		Demo02 demo02 = new Demo02();
		for (int i = 0; i < 10; i++) {
			new Thread(demo02).start();;
		}
	}

	
	
}
