package com.wpx.demo26;

public class AudioPlayer implements IMediaPlayer{

	IMediaPlayer mediaPlayer;

	@Override
	public void play(String audioType, String fileName) {
		//audioType inner support mp3
		if (audioType.equalsIgnoreCase("mp3")) {
			System.out.println("Playing mp3 file and fileName is  "+fileName);
		}
		//if audioType is mp4 or vlc
		else if (audioType.equalsIgnoreCase("mp4") || audioType.equalsIgnoreCase("vlc")) {
				mediaPlayer = new MediaAdapter(audioType);
				mediaPlayer.play(audioType,fileName);
		}
		else{
			//Invalid type
			System.out.println("Invalid media. "+audioType + " is not supported" );
		}

	}

}
