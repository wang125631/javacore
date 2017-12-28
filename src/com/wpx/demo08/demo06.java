package com.wpx.demo08;

import java.util.Date;

/**
 * 导包语句作用：简化书写。 (误区： 把一个类导入到内存中)
	
	导包语句的格式：
				 import 包名.类名;   （导入xxx包中某个类）
	
	导包语句要注意的细节：
		 1. 一个java文件中可以出现多句导包语句。
		 2. "*"是 导包语句的通配符。可以匹配任何 的类名。
		 3. import aa.*; 是不会作用于aa包下面的子包的。
		
	推荐使用：import 包名.类名;   因为使用*通配符会导致结构不清晰。
	
	什么时候使用import语句: 
		1. 相互访问的两个类不是在同一个包下面，这时候就需要使用到导包语句。
		2. java.lang 是默认导入 的，不需要我们自己导入。
 * @author wangpx
 */
public class demo06 {

	public static void main(String[] args) {
		System.out.println(new Date());
	}
}
