package com.wpx.demo35;

public class Client {

	public static void main(String[] args) {
	
		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();
		
		originator.setState("state #1");
		//存放在集合中
		careTaker.add(originator.saveStateToMemento());
		originator.setState("state #2");
		System.out.println(" [ Current State :]"+originator.getState());
		
		System.out.println(" [ Saved State ] "+careTaker.get(0).getState());
		
	}
}
