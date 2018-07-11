package com.wpx.demo37;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * 创建线程的四种方式
 * @author wangpx
 */
class Thread01 implements Runnable{
	public void run() {
		System.out.println("实现接口 实现");
	}
}

class Thread02 extends Thread{
	@Override
	public void run() {
		System.out.println("继承 Thread类");
	}
}
class Thread03 implements Callable<String>{

	@Override
	public String call() throws Exception {
		return "Callable接口";
	}
	Callable<String> task= () ->  "Callable接口";
}

class Thread04{
	
	public void run() {
		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(1);
		newFixedThreadPool.submit(() -> System.out.println("线程池"));
		
		//关闭线程池
		newFixedThreadPool.shutdown();
	}
}

public class Demo06 {

	public static void main(String[] args) {
		Thread01 thread01 = new Thread01();  new Thread(thread01).start();
		Thread02 thread02 = new Thread02(); thread02.start();
		Thread03 thread03 = new Thread03();
		//Callable方式需要FutureTask实现类的支持
		FutureTask<String> result = new FutureTask<>(thread03);
		new Thread(result).start();
		
		new Thread04().run();
		try {
			String string = result.get();
			System.out.println(string);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		
		
	}
}
