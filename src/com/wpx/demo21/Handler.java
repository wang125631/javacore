package com.wpx.demo21;
/**
 * 
 *抽象处理角色
 * 通常为java抽象类或java接口
 * @author wangpx
 */
public abstract class Handler {
	/**
	 * 持有后继的责任对象
	 */
	protected  Handler successor;
	/**
	 * 示意处理请求的方法
	 */
	public abstract void handlerRequest();
	/**
	 * 取值方法
	 */
	public Handler getSuccessor() {
		return successor;
	}
	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}
	

}
