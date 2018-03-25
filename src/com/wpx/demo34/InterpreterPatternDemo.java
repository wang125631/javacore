package com.wpx.demo34;

public class InterpreterPatternDemo {

	public static Expression getMaleExpression() {
		Expression wangpx = new TerminalExpression("wangpx");
		Expression qkn = new TerminalExpression("qkn");
		return new OrExpression(wangpx, qkn);
	}
	
	public static Expression getGoodManExpression() {
		Expression wangpx = new TerminalExpression("wangpx");
		Expression goodMan = new TerminalExpression("Good Man");
		return new AndExpression(wangpx, goodMan);
	}
	public static void main(String[] args) {
		Expression isMale = getMaleExpression();
		System.out.println("[ wangpx is Male ? ]"+isMale.interpret("wangpx"));
		System.out.println("[ dzq is Male ? ]"+isMale.interpret("dzq"));
		Expression isGoodMan = getGoodManExpression();
		System.out.println("[ wangpx is Good Man ? ]"+isGoodMan.interpret("wangpx Good Man"));
	}
}
