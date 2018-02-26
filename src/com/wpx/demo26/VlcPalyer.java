package com.wpx.demo26;

public class VlcPalyer implements IAdvancedMediaPlayer{

	@Override
	public void palyVlc(String fileName) {
		System.out.println( "Vlc__fileName : "+fileName +" Playing ...");
	}

	@Override
	public void palyMp4(String fileName) {
		//
	}

}
