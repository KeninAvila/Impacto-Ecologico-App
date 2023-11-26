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
}

