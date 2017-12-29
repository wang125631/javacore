package com.wpx.demo09;

import java.io.IOException;

/**
 *  RunTime   该类类主要代表了应用程序运行的环境。
 	
 	getRuntime()  返回当前应用程序的运行环境对象。
 	exec(String command)  根据指定的路径执行对应的可执行文件。
 	freeMemory()   返回 Java 虚拟机中的空闲内存量。。 以字节为单位
 	maxMemory()    返回 Java 虚拟机试图使用的最大内存量。
 	totalMemory()    返回 Java 虚拟机中的内存总量
 	
 * @author wangpx
 */
public class demo05 {

	public static void main(String[] args) throws IOException, InterruptedException {
	Runtime r=Runtime.getRuntime();
	
	System.out.println("freeMemory is " +r.freeMemory());
	System.out.println("maxMemory is "+ r.maxMemory());
	System.out.println("totalMemory is "+r.totalMemory());
	
	System.out.println(r.getRuntime());
    Process exec = r.exec("C://Program Files//锐捷网络//Ruijie Supplicant");
    Thread.sleep(1000*4);
    exec.destroy();
	}
}
