/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.impacto.ecologico.app;

/**
 *
 * @author Usuario
 */
public class Auto {
    private String marca;
    private String modelo;
    private int añoFabricacion;
    private double emisionesCO2;
    private double consumoCombustible;
    private boolean tieneConvertidorCatalitico;
    private boolean esHibrido;
    private boolean utilizaBiocombustible;
    private int capacidadPasajeros;

    public Auto(String marca, String modelo, int añoFabricacion, double emisionesCO2,
                double consumoCombustible, boolean tieneConvertidorCatalitico,
                boolean esHibrido, boolean utilizaBiocombustible, int capacidadPasajeros) {
        this.marca = marca;
        this.modelo = modelo;
        this.añoFabricacion = añoFabricacion;
        this.emisionesCO2 = emisionesCO2;
        this.consumoCombustible = consumoCombustible;
        this.tieneConvertidorCatalitico = tieneConvertidorCatalitico;
        this.esHibrido = esHibrido;
        this.utilizaBiocombustible = utilizaBiocombustible;
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    
    public double obtenerImpactoEcologico() {
        // Lógica para calcular el impacto ecológico considerando varios atributos de consumo
        double impactoCO2 = 3.0 * emisionesCO2;
        double impactoCombustible = 2.5 * consumoCombustible;
        double impactoCatalitico = tieneConvertidorCatalitico ? -4.0 : 0.0;
        double impactoHibrido = esHibrido ? -3.5 : 0.0;
        double impactoBiocombustible = utilizaBiocombustible ? -2.0 : 0.0;
        double impactoPasajeros = 1.2 * capacidadPasajeros;

        return impactoCO2 + impactoCombustible + impactoCatalitico +
                impactoHibrido + impactoBiocombustible + impactoPasajeros;
    }
}

