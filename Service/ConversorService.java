package com.ltizzi.conversor.Service;

import com.ltizzi.conversor.Model.Moneda;
import com.ltizzi.conversor.Model.UnidadTemperatura;

/**
 * @author ltizzi
 */
public interface ConversorService {

  public double convertirMoneda(Moneda origen, Moneda destino, double cantidad);

  public double convertirTempratura(
      UnidadTemperatura origen, UnidadTemperatura destino, double temperatura);
}
