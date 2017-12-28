package com.wpx.demo07;
/**
 * 多态的应用：
  1. 多态用于形参类型的时候，可以接收更多类型的数据 。
  2. 多态用于返回值类型的时候，可以返回更多类型的数据。
多态的好处： 提高了代码的拓展性。
 * @author wangpx
 */

//图形类
abstract class MyShape{
	public abstract void getArea();

	public abstract void getLength();	
}
//圆形
class Circle extends MyShape{
	public static final double PI = 3.14;

	double r;
	public Circle(double r){
		this.r =r ;	
	}
	@Override
	public void getArea() {	 
		System.out.println(PI*r*r);
	}

	@Override
	public void getLength() {
		System.out.println(2*PI*r);
	}
	
}
//矩阵
class Rect extends MyShape{

	int width;

	int height;

	public Rect(int width , int height){
		this.width = width;
		this.height = height;
	}
	@Override
	public void getArea() { 
		System.out.println(width*height);
	}

	@Override
	public void getLength() {
		 System.out.println((width+height)*2);

	}
	
}
public class demo06 {

	public static void show(MyShape s) {
		s.getArea();
		s.getLength();
	}
	public static void main(String[] args) {
		show(new Circle(2));
		show(new Rect(2, 3));
}
}
