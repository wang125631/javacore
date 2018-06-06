package com.wpx.demo17;
/**
 * ¾²Ì¬ÄÚ²¿Àà static inner class
 * 
 * @author wangpx
 */
public class Demo04 {

	private static final class Single{
		private static  Demo04 d=new Demo04();
	}
	public static Demo04 getInstance() {
		return Single.d;
	}
	
}
