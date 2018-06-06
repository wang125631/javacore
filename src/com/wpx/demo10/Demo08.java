package com.wpx.demo10;
/**
 *  守护线程（后台线程）:在一个进程中如果只剩下 了守护线程，那么守护线程也会死亡。
 *  
 *   一个线程默认都不是守护线程。
 * @author wangpx
 */
public class demo08 extends Thread {

	public demo08(String name) {
		super(name);
	}
	@Override
	public void run() {
	
		for(int i = 1 ; i<=100 ; i++){
			System.out.println("更新包目前下载"+i+"%");
			if(i==100){
				System.out.println("更新包下载完毕,准备安装..");
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		demo08 d=new demo08("守护线程");
		//d.setDaemon(true);//setDaemon() 设置线程是否为守护线程，true为守护线程， false为非守护线程。
		System.out.println(d.isDaemon());
		d.start();
		
	}
}
