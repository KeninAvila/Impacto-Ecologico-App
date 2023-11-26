/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.impacto.ecologico.app;

import java.util.ArrayList;

/**
 *
 * ------------------ Punto 1: Invertigar en Páginas Web el impacto Ecológico -------------
 * 
 * En las Bicicletas vamos a considerar: El número de engranajes, materiales reciclados, neumáticos, frenos, peso, 
 * año de fabricación y distancia promedio recorrido.
 * 
 * En los Autos vamos a considerar: El impacto de CO2, el consumo de combustible, el convertidor catalítico, 
 * el modo híbrido, el uso de biocombustible y la capacidad de pasajeros del auto.
 * 
 * En los edificios vamos a considerar: El impacto por pisos, el consumo de luz, la cantidad de desechos, el consumo de agua,
 * la cantidad de personas, el uso de energía renovable, la presencia de áreas verdes y el impacto del transporte del edificio
 * 
 * 
 */
public class ImpactoEcologicoApp {
    public static void main(String[] args) {
        // Crear objetos de cada clase con los nuevos atributos
        Edificio edificio = new Edificio("Oficina", 10, 200, 5, 150, 50, true, true, 10);
        Auto auto = new Auto("Toyota", "Corolla", 2020, 150, 8.5, true, false, false, 5);
        Bicicleta bicicleta = new Bicicleta("Montaña", 21, true, true, true, 15, 2022, 30.0);

        // Crear ArrayList<ImpactoEcologico> y agregar objetos
        ArrayList<ImpactoEcologico> impactos = new ArrayList<>();
        impactos.add(edificio);
        impactos.add(auto);
        impactos.add(bicicleta);

        // Iterar a través del ArrayList e invocar en forma polimórfica el método obtenerImpactoEcologico
        for (ImpactoEcologico impacto : impactos) {
            // Obtener información de identificación
            String identificacion = obtenerInformacionIdentificacion(impacto);

            // Invocar el método obtenerImpactoEcologico de manera polimórfica
            double resultado = impacto.obtenerImpactoEcologico();

            // Imprimir información
            System.out.println(identificacion + " - Impacto ecológico: " + resultado);
        }
    }

    // Método para obtener información de identificación
    private static String obtenerInformacionIdentificacion(ImpactoEcologico objeto) {
        if (objeto instanceof Edificio) {
            Edificio edificio = (Edificio) objeto;
            return "Edificio de tipo " + edificio.getTipo();
        } else if (objeto instanceof Auto) {
            Auto auto = (Auto) objeto;
            return "Auto marca " + auto.getMarca() + ", modelo " + auto.getModelo();
        } else if (objeto instanceof Bicicleta) {
            Bicicleta bicicleta = (Bicicleta) objeto;
            return "Bicicleta de tipo " + bicicleta.getTipo();
        } else {
            return "Objeto desconocido";
        }
    }
}
