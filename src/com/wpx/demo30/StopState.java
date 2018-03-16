package com.wpx.demo30;

public class StopState implements IState{

	@Override
	public void doAction(Context context) {
		System.out.println("player is stop state ");
		context.setiState(this);
	}

	@Override
	public String toString() {
		return "Stop State ";
	}

	
}
