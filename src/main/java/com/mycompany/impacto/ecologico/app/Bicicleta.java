/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.impacto.ecologico.app;

/**
 *
 * @author Usuario
 */
public class Bicicleta{
    private String tipo;
    private int numeroEngranajes;
    private boolean utilizaMaterialesReciclados;
    private boolean tieneNeumaticosInflados;
    private boolean utilizaFrenosReciclables;
    private double peso;
    private int fabricacionAnio;
    private double distanciaPromedioRecorrida;

    public Bicicleta(String tipo, int numeroEngranajes, boolean utilizaMaterialesReciclados,
                     boolean tieneNeumaticosInflados, boolean utilizaFrenosReciclables,
                     double peso, int fabricacionAnio, double distanciaPromedioRecorrida) {
        this.tipo = tipo;
        this.numeroEngranajes = numeroEngranajes;
        this.utilizaMaterialesReciclados = utilizaMaterialesReciclados;
        this.tieneNeumaticosInflados = tieneNeumaticosInflados;
        this.utilizaFrenosReciclables = utilizaFrenosReciclables;
        this.peso = peso;
        this.fabricacionAnio = fabricacionAnio;
        this.distanciaPromedioRecorrida = distanciaPromedioRecorrida;
    }

    public String getTipo() {
        return tipo;
    }
}
