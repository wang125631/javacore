package com.wpx.demo17;
/**
 * ¾²Ì¬ÄÚ²¿Àà static inner class
 * 
 * @author wangpx
 */
public class demo04 {

	private static final class Single{
		private static  demo04 d=new demo04();
	}
	public static demo04 getInstance() {
		return Single.d;
	}
	
}
