package com.wpx.demo33;

public class Client {

	public static void main(String[] args) {
		
		User wangpx = new User("wangpx");
		User qkn = new User("qkn");
		
		wangpx.sendMessage("Hello qkn!");
		qkn.sendMessage("Hello wangpx!");
	}
}
