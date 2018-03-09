package com.wpx.demo28;

public class Cilent {

	public static void main(String[] args) {
		
		Context context = new Context(new OperationAdd());
		int execute = context.execute(1, 2);
		System.out.println("context execute method "+execute);
		
		Context context2 = new Context(new OperationMultiply());
		int execute2 = context2.execute(1, 2);
		System.out.println("context2 execute method "+execute2);
		
		Context context3 = new Context(new OperationSubstract());
		int execute3 = context3.execute(1, 2);
		System.out.println("context2 execute method "+execute3);
	}
}
