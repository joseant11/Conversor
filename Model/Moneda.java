/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.ltizzi.conversor.Model;

/**
 * @author ltizzi
 */
public class Moneda {
  private String nombre;
  private double valorEnUSD;
  private double cantidad;

  public Moneda(String nombre, double valorEnUSD, double cantidad) {
    this.nombre = nombre;
    this.valorEnUSD = valorEnUSD;
    this.cantidad = cantidad;
  }

  public Moneda() {}

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getValorEnUSD() {
    return valorEnUSD;
  }

  public void setValorEnUSD(double valorEnUSD) {
    this.valorEnUSD = valorEnUSD;
  }

  public double getCantidad() {
    return cantidad;
  }

  public void setCantidad(double cantidad) {
    this.cantidad = cantidad;
  }

  @Override
  public String toString() {
    return "Moneda{"
        + "nombre="
        + nombre
        + ", valorEnUSD="
        + valorEnUSD
        + ", cantidad="
        + cantidad
        + '}';
  }
}
