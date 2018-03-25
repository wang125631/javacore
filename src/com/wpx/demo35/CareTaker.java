package com.wpx.demo35;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

	private List<Memento> mementoList =new ArrayList<Memento>();

	public void add(Memento memento) {
		mementoList.add(memento);
	}
	public Memento get(int index) {
		return mementoList.get(index);
	}
	
}
