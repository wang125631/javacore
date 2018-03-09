package com.wpx.demo30;

public class StartContext implements IState{

	@Override
	public void doAction(Context context) {
		System.out.println("Player is in start state");
		context.setState(this);
		
	}

	@Override
	public String toString() {
		return "Start Context";
	}
	

}
