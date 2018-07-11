package com.wpx.demo38;

/**
 * 使用java实现二叉树
 * 
 * 左右节点值 树为递归的方式
 * 
 * @author wangpx
 */

class Node{
	private int value;
	private Node left;
	private Node right;

	// 存储
	public void store(int value) {
		//排除默认初始值为0 第一个数据为根节点 否则根节点一直为0
		if(this.value == 0)
			this.value=value;
		//判断当前值大小
		if( value < this.value ) {
			//若左节点为空
			if( left == null) {
				left = new Node();
				left.value = value;
			}else{
				left.store(value);
			}
		}else if(value > this.value) {
			if(right == null) {
				right = new Node();
				right.value=value;
				
			}else {
				right.store(value);
			}
		}
	
	}
	
	// 查找值
	public boolean find(int value) {
		System.out.println("当前值为: "+this.value);
		if(value == this.value) {
			return true;
		}else if(value > this.value) {
			if(right ==null)
				return false;
			return right.find(value);
		}else {
			if(left == null)
				return false;
			return left.find(value);
		}
	}
	
	//前序遍历
	public void perList() {
		System.out.println(this.value + ",");
		if(left != null)
			left.perList();
		if(right != null)
			right.perList();
	}
	//中序遍历
	public void middleList() {
		if(left !=null)
			left.middleList();
		System.out.println(this.value + ",");
		if(right != null) {
			right.middleList();
		}
	}
	//后序遍历
	public void afterList() {
		if(left != null)
			left.afterList();
		if(right != null) {
			right.afterList();
		}
		System.out.println(this.value+ ",");
	}
}
public class Demo07 {

	public static void main(String[] args) {
		Node root = new Node();
		int j=2;
		for(int i=0;i<3;i++) {
			root.store(j);
			j=j+2;
		}
		/**
		 * 2 
		 * 	 4
		 *     6
		 */
		System.out.println("前序遍历 : 预期值 2 4 6");
		root.perList();
		
		System.out.println("中序遍历 : 预期值 2 4 6 ");
		root.middleList();
		
		System.out.println("后序遍历 : 预期值 6 4 2");
		root.afterList();
		System.out.println(root.find(5));
	}
}
