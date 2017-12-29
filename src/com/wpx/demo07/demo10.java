<<<<<<< HEAD
package com.wpx.demo07;
/**
 * 实现关系下匿名内部类
 * @author wangpx
 */
public class demo10 {

	public static void main(String[] args) {
	new Dao() {
		
		@Override
		public void say() {
			System.out.println("hello wolrd");
		}
	}.say();
}
}
interface Dao{
	public void say();
}
class Outer10{
	public void show() {
		new Dao() {

			@Override
			public void say() {
				System.out.println("say");

			}
			
		}.say();
	}
=======
package com.wpx.demo07;
/**
 * 实现关系下匿名内部类
 * @author wangpx
 */
public class demo10 {

	public static void main(String[] args) {
	new Dao() {
		
		@Override
		public void say() {
			System.out.println("hello wolrd");
		}
	}.say();
}
}
interface Dao{
	public void say();
}
class Outer10{
	public void show() {
		new Dao() {

			@Override
			public void say() {
				System.out.println("say");

			}
			
		}.say();
	}
>>>>>>> d128562b8b5099957eb34bce2139a4cb6dc7e90e
}