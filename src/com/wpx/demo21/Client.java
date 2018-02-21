package com.wpx.demo21;

public class Client {

	public static void main(String[] args) {
		//组装责任链
		ConcreateHandler handler1 = new ConcreateHandler();
		ConcreateHandler handler2 = new ConcreateHandler();
		handler1.setSuccessor(handler2);
		//提交请求
		handler1.handlerRequest();
	}
}
