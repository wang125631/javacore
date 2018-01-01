package com.wpx.demo16;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;


/**
 * 
 *  接收端的使用步骤
 	1. 建立udp的服务
 	2. 准备空 的数据 包接收数据。
 	3. 调用udp的服务接收数据。
 	4. 关闭资源
 * @author wangpx
 */
public class Demo03Receive {

	@SuppressWarnings("all")
	public static void main(String[] args) throws IOException {
		//建立udp的服务 ，并且要监听一个端口。
		DatagramSocket datagramSocket = new DatagramSocket(8888);
		//准备空的数据包用于存放数据。
		byte[] buf=new byte[1024];
		DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length);
		//调用udp的服务接收数据,receive是一个阻塞型的方法，没有接收到数据包之前会一直等待
		datagramSocket.receive(datagramPacket);
		
		System.out.println(new String(buf, 0, buf.length));
		//关闭资源
		datagramSocket.close();
	}
}
