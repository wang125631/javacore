package com.wpx.demo26;

public class Client {

	public static void main(String[] args) {
		AudioPlayer audioPlayer=new  AudioPlayer();
		audioPlayer.play("mp3","小跳蛙.mp3");
		audioPlayer.play("mp4","小青蛙.mp4");
		audioPlayer.play("vlc","小青年.vcl");
		audioPlayer.play("avi","热血小青年.avi");
	}
}
