package com.wpx.demo36;

public interface Demo132 {
	default String say() {
		System.out.println("Interface method 2 invoke");
		return "interface 2";
	}
}
