package com.wpx.demo26;

public class Mp4Player implements IAdvancedMediaPlayer{

	@Override
	public void palyVlc(String fileName) {
		// 
		
	}

	@Override
	public void palyMp4(String fileName) {
		System.out.println("Mp4__filName :"+fileName+" Playing");
	}

}
