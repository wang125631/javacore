package com.wpx.demo16;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
	    TCP通讯协议特点：
		1. tcp是基于IO流进行数据 的传输 的，面向连接。
	 	2. tcp进行数据传输的时候是没有大小限制的。
	 	3. tcp是面向连接，通过三次握手的机制保证数据的完整性。 可靠协议。
	 	4. tcp是面向连接的，所以速度慢。
	 	5. tcp是区分客户端与服务端 的。
	 	
	 	比如： 打电话、 QQ的文件传输、 迅雷下载.... 
	 	
	tcp协议下的Socket：
		Socket(客户端) , tcp的客户端一旦启动马上要与服务端进行连接。
		ServerSocket(服务端类)
	
	tcp的客户端使用步骤：
		1. 建立tcp的客户端服务。
		2. 获取到对应的流对象。
		3.写出或读取数据
		4. 关闭资源。

 * @author wangpx
 */
public class Demo02Server {

	public static void main(String[] args) throws IOException {
		//建立Tcp的服务端,并且监听一个端口。
		ServerSocket ss=new ServerSocket(8888);
		//接受客户端的连接
		Socket socket  =  ss.accept(); 
		//accept()  接受客户端的连接 该方法也是一个阻塞型的方法，没有客户端与其连接时，会一直等待下去。
		InputStream inputStream = socket.getInputStream();
		int length=0;
		byte[] buf=new byte[1024];
		while((length=inputStream.read(buf))!=-1) {
			System.out.println(new String(buf, 0, length));
		}
		inputStream.close();
		ss.close();
	}
	
}
