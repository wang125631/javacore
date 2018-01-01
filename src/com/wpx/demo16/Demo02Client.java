package com.wpx.demo16;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Demo02Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		//建立tcp的服务
		Socket s=new Socket("127.0.0.1",8888);
		//获取到Socket的输出流对象
		OutputStream outputStream = s.getOutputStream();
		//向客户端发送消息
		outputStream.write("你好客户端".getBytes());
		outputStream.flush();
		outputStream.close();
		s.close();
	}
}
