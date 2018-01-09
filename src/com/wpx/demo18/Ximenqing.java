package com.wpx.demo18;
/**
 * 西门庆通过代理王婆找到被代理的潘金莲
 * 
 * @author wangpx
 */
public class Ximenqing {

	public static void main(String[] args) {
		//初始化被代理对象潘金莲
		PanjinlianDao panjinlian = new PanjinlianDaoImpl();
		//找到王婆
		ProxyWangpo proxyWangpo=new ProxyWangpo(panjinlian);
		//王婆将创建代理
		PanjinlianDao panjinlianProxy = proxyWangpo.createProxy();
		//潘金莲show身材,王婆在此前后
		panjinlianProxy.showFigure();
		
	}
}
