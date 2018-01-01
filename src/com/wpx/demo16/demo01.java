package com.wpx.demo16;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 网络编程： 网络编程主要用于解决计算机与计算机（手机、平板..）之间的数据传输问题。
 * 计算机网络： 分布在不同地域 的计算机通过外部设备链接起来达到了消息互通、资源共享的效果就称作为一个计算机网络
 * 网络通讯的三要素：
	1. IP
	2. 端口号。
	3. 协议.
IP地址：	IP地址的本质就是一个由32位的二进制数据组成的数据。 后来别人为了方便我们记忆IP地址，就把IP地址切成了4份，每份8bit.  
 			2^8 = 0~255
      00000000-00000000-00000000-00000000	
 IP地址的分类：
	A类地址 = 一个网络号 + 三个主机号     2^24   政府单位
	B类地址 =  两个网络号+ 两个主机号   2^16 事业单位（学校、银行..）
	C类地址= 三个网络号+ 一个主机号  2^8    私人使用..
InetAddress(IP类)

常用的方法：
	getLocalHost();  获取本机的IP地址
	getByName("IP或者主机名") 根据一个IP地址的字符串形式或者是一个主机名生成一个IP地址对象。 (用于获取别人的IP地址对象)

	getHostAddress()  返回一个IP地址的字符串表示形式。
	getHostName()  返回计算机的主机名。
	
端口号	
			从0到1023，系统紧密绑定于一些服务。 
		1024~65535  我们可以使用....
 
 * @author wangpx
 */


public class demo01 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws UnknownHostException {
		InetAddress localHost = InetAddress.getLocalHost();
		System.out.println("LocalHost is "+localHost.getHostAddress());
		System.out.println("LocalHost Name is  "+localHost.getHostName());
		
		//可以根据一个IP地址的字符串形式或者是一个主机名生成一个IP地址对象。
		InetAddress byName = localHost.getByName("AEPCH7EKKOOTFJ3");
		System.out.println(byName.getHostAddress());
		
		InetAddress[]  arr = InetAddress.getAllByName("www.baidu.com");//域名
		for (InetAddress inetAddress : arr) {
			System.out.println(inetAddress.getHostName());
		}
		
		
	}
}
