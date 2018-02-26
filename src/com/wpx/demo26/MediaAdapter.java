package com.wpx.demo26;

public class MediaAdapter implements IMediaPlayer{

	IAdvancedMediaPlayer advancedMusicPlayer;
	
	public MediaAdapter(String audioType) {
		if(audioType.equalsIgnoreCase("vlc")) {
			advancedMusicPlayer=new VlcPalyer();
		}else if(audioType.equalsIgnoreCase("mp4")) {
			advancedMusicPlayer=new Mp4Player();
		}
	}
	
	@Override
	public void paly(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("vlc")) {
			advancedMusicPlayer.palyVlc(fileName);
		}else if(audioType.equalsIgnoreCase("mp4")) {
			advancedMusicPlayer.palyMp4(fileName);
		}
		
	}
}
