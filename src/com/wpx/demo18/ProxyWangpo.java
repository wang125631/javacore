package com.wpx.demo18;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理王婆
 * 
 * @author wangpx
 */
public class ProxyWangpo implements InvocationHandler{

	private PanjinlianDao panjinlianDao;
	
	public ProxyWangpo(PanjinlianDao panjinlianDao) {
		this.panjinlianDao = panjinlianDao;
	}

	public PanjinlianDao createProxy() {
		PanjinlianDao Instance = (PanjinlianDao) Proxy.newProxyInstance(panjinlianDao.getClass().getClassLoader(), panjinlianDao.getClass().getInterfaces(), this);
		return Instance;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		//方法执行前
		System.out.println("让潘金莲给客户show身材...");
		Object object = method.invoke(panjinlianDao, args);
		//方法执行后
		System.out.println("王婆收钱....");
		return object;
	}

}
