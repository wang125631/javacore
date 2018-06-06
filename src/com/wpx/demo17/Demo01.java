package com.wpx.demo17;
/**
 * 
 * @author wangpx
 */
public class Demo01 {

	//将其私有化
	 private Demo01() {
	 }
	 //在内部自己创建实例
	 private static  Demo01 d=new Demo01();
	 //获取实例的方法
	 public static Demo01 getInstance() {
		 return d;
	 }
	 public static void main(String[] args) {
		 Demo01 instance01 = Demo01.getInstance();
		Demo01 instance02 = Demo01.getInstance();
		System.out.println(instance01 == instance02);
	 }
	
}
