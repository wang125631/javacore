package com.wpx.demo27;

/**
 *
 * abstract class
 * @author wangpx
 */
 public abstract class AShape{

   protected IDrawAPI iDrawAPI;

   protected AShape(IDrawAPI iDrawAPI){
     this.iDrawAPI = iDrawAPI;

   }

   public abstract void draw();
 }
