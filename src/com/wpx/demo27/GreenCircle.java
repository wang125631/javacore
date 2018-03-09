package com.wpx.demo27;


public class GreenCircle implements IDrawAPI{
 
	@Override
  public void drawCircle(int radius){
    System.out.println("Drawing Circle [ color :green radius: "+radius+" ]");
  }
}
