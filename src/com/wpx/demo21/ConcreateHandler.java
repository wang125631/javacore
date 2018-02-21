package com.wpx.demo21;
/**
 * 
 * 具体处理器
 * 
 * @author wangpx
 */
public class ConcreateHandler extends Handler{

	@Override
	public void handlerRequest() {
		/**
		 * 通过判断是否有后继的责任对象
		 * 如果有,就转发请求给后继对象
		 * 如果没有,则处理请求
		 */
		if(getSuccessor() != null) {
			System.out.println("放过请求");
			getSuccessor().handlerRequest();
		}else {
			System.out.println("处理请求");
		}
		
	}

}
