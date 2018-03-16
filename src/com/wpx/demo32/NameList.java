package com.wpx.demo32;

public class NameList implements Container{

	public String names[] = {"wangpx","zjk","qkn","ct","dzq"};
	
	@Override
	public Iterator getIterator() {
		return new NameIterator();
	}
	
	private class NameIterator implements Iterator {

		int index;
		
		@Override
		public boolean hasNext() {
			int length = names.length;
			if(index < length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if(this.hasNext()) {
				return names[index++];
			}
			return null;
		}
		
	}
	
	
	

}
