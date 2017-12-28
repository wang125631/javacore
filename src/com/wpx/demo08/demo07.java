package com.wpx.demo08;
/**
 * 权限修饰符： 权限修饰符就是控制被修饰的成员的范围可见性。

			public(公共)        protected(受保护)           default(缺省)       private (大到小)

		同一个类      true                 true                        true                   true
		
		
		同一个包      true                 true                        true                   false
		
		  
		子父类        true                 true                        false                  false
		
		
		不同包        true                 false                       false                  false


注意： 在不同包下面只有public 与 protected 可以访问，而且protected必须是在继承关系下才能够访问。
 * @author wangpx
 */
public class demo07 {
	
	int age;
	
	private String name;
	
	protected void name() {
		
	}
	public void say() {
		
	}
}
