package com.wpx.demo19;

public class Client {
	
	public static void main(String[] args) {
		new AbstractClass() {
			
			@Override
			void run() {
				for(int i=0;i<1000;i++) {
					System.out.println( );
				}
			}
		}.CalculationTime();
	}
}
