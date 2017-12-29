package com.wpx.demo07;
/**
 * 内部类：一个类定义在另外一个类的内部，那么该类就称作为内部类。

内部类的class文件名： 外部类$内部类.  好处：便于区分该class文件是属于哪个外部类的。

内部类的类别：

	1. 成员内部类:
			
			成员内部类的访问方式：
					
					方式一：在外部类提供一个方法创建内部类的对象进行访问。
					
					方式2二：在其他类直接创建内部类的对象。 格式：外部类.内部类  变量名 = new 外部类().new 内部类();
			
			注意： 如果是一个静态内部类，那么在其他类创建 的格式：
					外部类.内部类  变量名 = new 外部类.内部类();


		   内部类的应用场景： 我们在描述A事物的时候，发现描述的A事物内部还存在另外一个比较
		   复杂的事物B时候，而且这个比较复杂事物B还需要访问A事物的属性等数据，那么这时候
		   我们就可以使用内部类描述B事物。

		   比如： 人--->心脏

		   class 人{
			
			血

			氧气

			等....

			class 心脏{
			
			}		

		   }

		   内部类的好处：内部类可以直接访问外部类的所有成员。

			

			内部类要注意的细节：
				1. 如果外部类与内部类存在同名的成员变量时，在内部类中默认情况下是访问内部类的成员变量。
				   可以通过"外部类.this.成员变量名" 指定访问外部类的 成员。
				2. 私有的成员内部类只能在外部类提供一个方法创建内部类的对象进行访问，不能在其他类创建对象了。
				3. 成员内部类一旦出现了静态的成员，那么该类也必须 使用static修饰。

	局部内部类：
 * @author wangpx
 */
//外部类
class Outer{
	//static 
	int x=1;//成员变量 
	//成员内部类
	static class Inner{
		static int i =2;
		private void print() {
			//System.out.println(x);
			System.out.println(i);
		}
	}

	//在外部的方法中创建了内部类的对象，然后调用内部 方法。
	public void instance(){
		Inner inner = new Inner();
		inner.print();
	}
}

public class demo07 {
public static void main(String[] args) {
	Outer o=new Outer();
	o.instance();
}
}
