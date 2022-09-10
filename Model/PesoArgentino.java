package com.ltizzi.conversor.Model;

/**
 * @author ltizzi
 */
public class PesoArgentino extends Moneda {

  public PesoArgentino(double cantidad) {
    super("peso argentino", 0.0071, cantidad);
  }

  public PesoArgentino() {}
}
