package com.wpx.demo13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 	迭代：
		keySet() 
		values() 
		entrySet() 

 * @author wangpx
 */
public class Demo02 {

	public static void main(String[] args) {
	
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "map1");
		hashMap.put(2, "map2");
		hashMap.put(3, "map3");
		
		//map集合中遍历方式一： 使用keySet方法进行遍历       缺点： keySet方法只是返回了所有的键，没有值。
		Set<Integer> keySet = hashMap.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			//System.out.println(iterator.next());
			System.out.println(hashMap.get(iterator.next()));
		}	
		
		//map集合的遍历方式二： 使用values方法进行 遍历。    缺点： values方法只能返回所有 的值，没有键。
		Collection<String> values = hashMap.values();
		Iterator<String> iterator2 = values.iterator();
			while(iterator2.hasNext()) {
				System.out.println(iterator2.next());
			}
		//map集合的遍历方式三： entrySet方法遍历。
			Set<Entry<Integer, String>> entrySet = hashMap.entrySet();
			Iterator<Entry<Integer, String>> iterator3 = entrySet.iterator();
			while(iterator3.hasNext()) {
				System.out.println(iterator3.next());
			}
	}
	
	
}
