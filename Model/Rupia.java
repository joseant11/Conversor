package com.ltizzi.conversor.Model;

/**
 * @author ltizzi
 */
public class Rupia extends Moneda {

  public Rupia(double cantidad) {
    super("rupia", 0.013, cantidad);
  }

  public Rupia() {}
}
