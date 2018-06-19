package com.wpx.demo36;



import java.util.HashMap;
import java.util.Optional;

import org.junit.Test;

public class Demo12 {

	@Test
	public void test01() {
		String str ="asfsdfdsfsafdfs";
		HashMap<Object, Integer> hashMap = new HashMap<>();
		for (char c : str.toCharArray()) {
			if(!hashMap.containsKey(c)) {
				hashMap.put(c, 1);
			}else {
				Integer i = hashMap.get(c);
				i++;
				hashMap.put(c, i);
			}
		}
		Optional<Integer> min = hashMap.values()
			   .stream()
			   .min( (s1,s2) -> Integer.compare(s1, s2));
 		System.out.println(min.get());
	}
}
