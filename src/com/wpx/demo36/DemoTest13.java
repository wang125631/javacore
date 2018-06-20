package com.wpx.demo36;
/**
 * 接口一{@link Demo13}和接口二{@link Demo132}具有相同的默认方法<br>
 * 类{@link DemoClass13}也有相同的方法<br>
 * 
 * 类方法和接口默认方法相同采
 * 			用类优先的原则<br>
 * 
 * 接口方法冲突必须
 * 		通过重写的方式来解决<br>
 * 
 * 可以通过接口.方法的方式调用静态方法
 *<br> 	 <code>Demo13.show</code>
 * 
 * @author wangpx
 */
public class DemoTest13 extends DemoClass13 implements Demo13,Demo132{

	public static void main(String[] args) {
		
		DemoTest13 demoTest13 = new DemoTest13();
		String say = demoTest13.say();
		System.out.println(say);
	
		Demo13.show();
	}

	@Override
	public String say() {
		return Demo132.super.say();
	}

	
}
