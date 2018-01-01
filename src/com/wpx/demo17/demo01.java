package com.wpx.demo17;
/**
 * 
 * @author wangpx
 */
public class demo01 {

	//将其私有化
	 private demo01() {
	 }
	 //在内部自己创建实例
	 private static  demo01 d=new demo01();
	 //获取实例的方法
	 public static demo01 getInstance() {
		 return d;
	 }
	 public static void main(String[] args) {
		 demo01 instance01 = demo01.getInstance();
		demo01 instance02 = demo01.getInstance();
		System.out.println(instance01 == instance02);
	 }
	
}
