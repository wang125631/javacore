package com.wpx.demo20;

import java.util.Hashtable;
/**
 * 
 * 使用线程安全的 hashtable 作为存储
 * 对于请求的对象,如果已经存在则取出
 * 如果不存在则创建返回,并将其存储在hashtable中
 * 
 * @author wangpx
 */
public class FlyweightFactory {
	//创建hashtable用于存储各个对象
	private Hashtable flyweights = new Hashtable();
	public FlyweightFactory() {
		
	}
	public Flyweight getFlyweight(Object obj) {
		Flyweight flyweight = (Flyweight) flyweights.get(obj);
		if(flyweight == null) {
			flyweight = new CurrrentFlyweight((String)obj);
			flyweights.put(obj, flyweight);
		}
		return flyweight;
	}
	
	public  int getFlyWeightSize() {
		return flyweights.size();
	}
	
}
