package com.wpx.demo13;

import java.util.HashMap;

/**
 *  双列集合：
-------------| Map  如果是实现了Map接口的集合类，具备的特点： 存储的数据都是以键值对的形式存在的，键不可重复，值可以重复。
----------------| HashMap 
----------------| TreeMap
----------------| Hashtable 
 
 Map接口的方法：
 	
 	添加：
 		put(K key, V value) 
 		putAll(Map<? extends K,? extends V> m) 
 	
 	删除
 		remove(Object key) 
 		clear() 

 	获取：
 		get(Object key) 
 		size() 
 	
 	判断：
 		containsKey(Object key) 
 		containsValue(Object value) 
 		isEmpty() 


 * @author wangpx
 */
public class demo01 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "map1");
		hashMap.put(2, "map2");
		hashMap.put(3, "map3");
		//如果之前没有存在该键，那么返回的是null，如果之前就已经存在该键了，那么就返回该键之前对应 的值。
		System.out.println(hashMap.put(1, "map11"));
	
		HashMap<Integer, String> map = new HashMap<>();
		map.put(11, "map11");
		hashMap.putAll(map);
		
		System.out.println("remove ..."+hashMap.remove(1));
		System.out.println("map size is  "+hashMap.size());
		System.out.println("exist key 1" +hashMap.containsKey(1));
		System.out.println("exist value map3 "+hashMap.containsValue("map3"));
		System.out.println("is empty  "+hashMap.isEmpty());
		
	}
}
