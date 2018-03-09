package com.wpx.demo27;

public class RedCircle implements IDrawAPI{
 
	@Override
  public void drawCircle(int radius){
    System.out.println("Drawing Circle [ color :red , radius : "+radius+" ] " );
  }
}
