package com.wpx.demo27;

public class Circle extends AShape{

  private int radius;

  public Circle(int radius ,IDrawAPI iDrawAPI){
    super(iDrawAPI);
    this.radius = radius;
  }
  public void draw(){
    iDrawAPI.drawCircle(radius);
  }

}
