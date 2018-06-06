package com.wpx.demo12;
/**
 * 泛型接口
	 
	泛型接口的定义格式: 
	
		interface 接口名<声明自定义泛型>{
		
		}
	
	泛型接口要注意的事项：
		1. 接口上自定义的泛型的具体数据类型是在实现一个接口的时候指定 的。
		2. 在接口上自定义的泛型如果在实现接口的时候没有指定具体的数据类型，那么默认为Object类型。
		
	需求： 目前我实现一个接口的时候，我还不明确我目前要操作的数据类型，我要等待创建接口实现类 对象的时候我才能指定泛型的具体数据类型。
		
		如果要延长接口自定义泛型 的具体数据类型，那么格式如下：
		格式：  
			public class demo05<T> implements Dao<T>{
			
			}
			
 * @author wangpx
 */
interface Dao<T>{
	public void add(T t);
}
public class demo05<T>  implements Dao<T>{

	public static void main(String[] args) {
		demo05<String> d = new demo05<String>();
		d.add("Hello Wolrd! ");
	}
	@Override
	public void add(T t) {
		System.out.println("新添加的元素为   "+t);
	}


}
