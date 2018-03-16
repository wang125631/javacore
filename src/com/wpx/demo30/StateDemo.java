package com.wpx.demo30;

public class StateDemo {
	
	public static void main(String[] args) {
	Context context = new Context();	
	
	StartState startContext = new StartState();
	startContext.doAction(context);
	System.out.println(context.getiState().toString());
	
	StopState stopState = new StopState();
	stopState.doAction(context);
	System.out.println(context.getiState().toString());
	}
}
