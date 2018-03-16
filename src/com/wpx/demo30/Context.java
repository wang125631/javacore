package com.wpx.demo30;

public class Context {
	
	private IState iState;

	public Context() {
		iState = null;
	}

	public IState getiState() {
		return iState;
	}

	public void setiState(IState iState) {
		this.iState = iState;
	}
	
	
	

	

}
