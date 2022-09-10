package com.ltizzi.conversor.Service;

import com.ltizzi.conversor.Model.Dolar;
import com.ltizzi.conversor.Model.Moneda;
import com.ltizzi.conversor.Model.UnidadTemperatura;

/**
 * @author ltizzi
 */
public class ConversorServiceImp implements ConversorService {

  @Override
  public double convertirMoneda(Moneda origen, Moneda destino, double cantidad) {
    Dolar dolar = new Dolar();
    Class d = dolar.getClass();

    //    if (origen.getClass() == d) {
    //      System.out.println("test destino en usd " + destino.getValorEnUSD());
    //      System.out.println(cantidad * destino.getValorEnUSD());
    //      return Math.round(cantidad * destino.getValorEnUSD());
    //    } else if (destino.getClass() == d) {
    //      System.out.println("test destino en usd " + origen.getValorEnUSD());
    //      System.out.println(cantidad * origen.getValorEnUSD());
    //      return Math.round(cantidad * origen.getValorEnUSD());
    //    } else if (destino.getClass() == d && origen.getClass() == d) {
    //      System.out.println(cantidad);
    //      return cantidad;
    //    } else {
    double valorOrigenConvertido = origen.getValorEnUSD() * cantidad;
    double valorDestinoConvertido = Math.round(valorOrigenConvertido / destino.getValorEnUSD());
    System.out.println(valorDestinoConvertido);
    return valorDestinoConvertido;
    //    }
  }

  @Override
  public double convertirTempratura(
      UnidadTemperatura origen, UnidadTemperatura destino, double temperatura) {
    String unidadOrigen = origen.getNombre();
    String unidadDestino = destino.getNombre();

    if (unidadOrigen == "kelvin" && unidadDestino == "celsius") {
      return temperatura - 273.15;
    }
    if (unidadOrigen == "kelvin" && unidadDestino == "farenheit") {
      return 1.8 * (temperatura - 273.15) + 32;
    }
    if (unidadOrigen == "celsius" && unidadDestino == "kelvin") {
      return temperatura + 273.15;
    }
    if (unidadOrigen == "celsius" && unidadDestino == "farenheit") {
      return (temperatura * 1.8) + 32;
    }
    if (unidadOrigen == "farenheit" && unidadDestino == "celsius") {
      return (temperatura - 32) / 1.8;
    }
    if (unidadOrigen == "farenheit" && unidadDestino == "kelvin") {
      return (5 / 9) * (temperatura - 32) + 273.15;
    }
    return temperatura;
  }
}
