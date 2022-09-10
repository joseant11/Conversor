package com.ltizzi.conversor;

import com.ltizzi.conversor.Model.Dolar;
import com.ltizzi.conversor.Model.PesoArgentino;
import com.ltizzi.conversor.Service.ConversorServiceImp;
import com.ltizzi.conversor.Vista.OpcionesConversion;
import javax.swing.*;

/**
 * @author ltizzi
 */
public class Conversor {

  static void continuar() {

    int respuesta = JOptionPane.showConfirmDialog(null, "Desea continuar?");
    if (JOptionPane.OK_OPTION == respuesta) {
      System.out.println("El usuario eligió continuar");
    } else {
      JOptionPane.showMessageDialog(null, "Programa finalizado");
    }
  }

  public static void main(String[] args) {

    OpcionesConversion opcionDeConversion = new OpcionesConversion();

    while (true) {
      String opciones =
          JOptionPane.showInputDialog(
                  null,
                  "Seleccione una opción de conversión",
                  "Menú",
                  JOptionPane.PLAIN_MESSAGE,
                  null,
                  new Object[] {"Conversor de Monedas", "Conversor de Temperatura"},
                  "Elegir")
              .toString();
      switch (opciones) {
        case "Conversor de Monedas":
          {
            String input = JOptionPane.showInputDialog(null, "Ingrese una cantidad a convertir");
            try {
              double cantidad = Double.parseDouble(input);
              opcionDeConversion.convertirMonedas(cantidad);

            } catch (Exception e) {
              e.getMessage();
              JOptionPane.showMessageDialog(
                  null, "Ingrese una cantidad válida (sin símbolos ni letras)");
            }
            continuar();
            break;
          }

        case "Conversor de Temperatura":
          {
            String input = JOptionPane.showInputDialog(null, "Ingrese temperatura a convertir");
            try {
              double cantidad = Double.parseDouble(input);
              opcionDeConversion.convertirTemperatura(cantidad);
            } catch (Exception e) {
              e.getMessage();
              JOptionPane.showMessageDialog(
                  null, "Ingrese una temperatura válida (sin símbolos ni letras");
            }
            continuar();
            break;
          }
      }
    }
  }
}
