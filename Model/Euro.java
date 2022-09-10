package com.ltizzi.conversor.Model;

/**
 * @author ltizzi
 */
public class Euro extends Moneda {

  public Euro(double cantidad) {
    super("euro", 0.99, cantidad);
  }

  public Euro() {}
}
