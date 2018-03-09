package com.wpx.demo27;

public class Client{

  public static void main(String[] args) {
    AShape greenCircle = new  Circle(10,new GreenCircle());
    AShape redCircle = new Circle(10,new  RedCircle());

    greenCircle.draw();
    redCircle.draw();
  }
}
