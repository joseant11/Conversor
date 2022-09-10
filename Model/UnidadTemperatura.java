package com.ltizzi.conversor.Model;

/**
 * @author ltizzi
 */
public class UnidadTemperatura {

  private String nombre;
  private String signo;

  public UnidadTemperatura(String nombre, String signo) {
    this.nombre = nombre;
    this.signo = signo;
  }

  public String getNombre() {
    return nombre;
  }

  public String getSigno() {
    return signo;
  }
}
