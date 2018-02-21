package com.wpx.demo19;

public abstract class AbstractClass {

	//抽象类定义整个流程骨架
	public void CalculationTime() {
		long startTime = System.currentTimeMillis();
		run();
		long endTime = System.currentTimeMillis();
		System.out.println("程序运行时间累计 :"+(endTime - startTime));
	}
	abstract void run();
}
