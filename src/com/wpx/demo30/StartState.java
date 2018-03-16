package com.wpx.demo30;

public class StartState implements IState{

	@Override
	public void doAction(Context context) {
		System.out.println("Player is in start state");
		context.setiState(this);
		
	}

	@Override
	public String toString() {
		return "Start Context";
	}
	

}
