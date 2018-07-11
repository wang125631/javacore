package com.wpx.demo38;

/**
 * 
 * == 和 equals的区别
 * 
 * @author wangpx
 */
public class Demo05 {

	public static void main(String[] args) {
		// 1. 对于基本数据类型 只能用== 不能用equals
		// 对于基本类型比较其值是够相等
		System.out.println(1 == 1);
		// System.out.println(1 .equals(1));

		Demo05 d1 = new Demo05();
		Demo05 d2 = new Demo05();
		Demo05 d3 = d1;
		// 2. == 用于比较对象时,比较其 地址引用是否相等
		System.out.println(d1 == d2);
		System.out.println(d1 == d3);

		// 3. equals 比较对象时也比较其地址引用是否相等
		/**
		 * public boolean equals(Object obj) { return (this == obj); }
		 */
		System.out.println(d1.equals(d2));
		System.out.println(d1.equals(d3));
		
		// 4.对于字符串 底层重写equals方法 他会先判断是否为一个对象 再判断是否值相等
		/*
	    public boolean equals(Object anObject) {
	        if (this == anObject) {
	            return true;
	        }
	        if (anObject instanceof String) {
	            String anotherString = (String)anObject;
	            int n = value.length;
	            if (n == anotherString.value.length) {
	                char v1[] = value;
	                char v2[] = anotherString.value;
	                int i = 0;
	                while (n-- != 0) {
	                    if (v1[i] != v2[i])
	                        return false;
	                    i++;
	                }
	                return true;
	            }
	        }
	        return false;
	    }
	    */
		String s1 = new String("wpx");
		String s2 = new String("wpx");
		System.out.println(s1.equals(s2));
		
		//5. equals 和hashCode 的问题
		/**
		 * 对象底层数据的存储采用hash算法 给对象一个哈希值
		 * 哈希值决定存在哪个数组中
		 * 之后通过equals来判断是否为一个对象(你可以像string那样重写,也必须有个默认规则)
		 * 相同则返回,不同则添加到链表
		 * jdk1.8 之后在 链表大于8 时采用红黑树存储
		 * 
		 * 数组    链表
		 * 1    对象1 - 对象2-
		 * 2
		 * 3
		 * ..
		 * 16
		 * 
		 */
		
		
		
	}
}
