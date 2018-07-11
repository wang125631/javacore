package com.wpx.demo37;
/**
 * 不使用volatile关键字
 * 存在勺子尝汤,锅里加盐的问题
 * volatile关键字使线程可见
 * synchronized关键字使线程可见,同步
 * 
 * 
 * @author wangpx
 */
public class Demo01 implements Runnable{

	private volatile boolean flag = false;

	public static void main(String[] args) {
		Demo01 demo01 = new Demo01();
		new Thread(demo01).start();
		
		while(true) {
			//synchronized(demo01) {
				if(demo01.isFlag()) {
					System.out.println("true");
					break;
				}
			//}
		}
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		flag =true;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	
}
