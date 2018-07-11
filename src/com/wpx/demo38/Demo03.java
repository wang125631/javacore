package com.wpx.demo38;

import java.util.Collection;

/**
 * 
 * {@link LinkedList}底层为链表结构 查找较ArrayList慢 插入删除快 内存空间不连续
 * 
 * @author wangpx
 * @param <E>
 */
class MyLinkedList<E> {
	// 初始值
	transient int size = 0;
	//头结点
	transient Node<E> first;
	
	//无参构造
	 public MyLinkedList() {
	    
	 }
	 //......
    public void MyLinkedList(Collection<? extends E> c) {
        //添加Collecion的子集
    }
	
  private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
	

}

public class Demo03 {
	public static void main(String[] args) {
		MyLinkedList myLinkedList = new MyLinkedList();
	}
}
