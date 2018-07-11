package com.wpx.demo38;
/**
 * 
 * {@linkArrayList}底层是数组对象
 * 
 * 与{@LinkedList}相比查找快 ,LinkedList为寻址查找
 * 	
 * 删除和添加较慢
 * 
 * 内存空间连续
 * 
 * @author wangpx
 */
class MyArrayList<E>{

	//默认数组大小
	private static final int DEFAULT_CAPACITY=2 << 3;
	//一个空的数组对象
	private static final Object[] EMPTY_ARRAYLIST= {};
	//元素对象
	transient  Object elementData;
	//数组大小
	private int size=2<<3;
	/**
	 *无参 
	 */
	MyArrayList(){
		this.elementData= new Object[DEFAULT_CAPACITY];
	}
	MyArrayList(int initalCapacity){
		if(initalCapacity<0)
			throw new RuntimeException("初始值大小不能小于0");
		this.elementData=new Object[initalCapacity];
		this.size=initalCapacity;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	public int size() {
		return size;
	}
	
	public void add(Object object) {
		this.elementData=object;
	}
	
	
}
public class Demo02 {

	public static void main(String[] args) {
		MyArrayList<Object> myArrayList = new MyArrayList<Object>(2);
		System.out.println(myArrayList.size());
		myArrayList.add("ad");
		System.out.println(myArrayList.elementData);
		
		MyArrayList<Object> myArrayList2 = new MyArrayList<Object>();
		System.out.println(myArrayList2.size());
	}
	
	
}
