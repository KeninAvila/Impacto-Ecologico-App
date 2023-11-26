/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.impacto.ecologico.app;

/**
 *
 * @author Usuario
 */
public class Bicicleta implements ImpactoEcologico {
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
    
    @Override
        public double obtenerImpactoEcologico() {
        // Lógica para calcular el impacto ecológico considerando varios atributos de consumo
        double impactoEngranajes = 1.2 * numeroEngranajes;
        double impactoReciclado = utilizaMaterialesReciclados ? -2.0 : 0.0;
        double impactoNeumaticos = tieneNeumaticosInflados ? -1.5 : 0.0;
        double impactoFrenos = utilizaFrenosReciclables ? -1.0 : 0.0;
        double impactoPeso = 0.8 * peso;
        double impactoFabricacion = 2.0 * (2023 - fabricacionAnio); // Ajustar según la realidad
        double impactoDistancia = 0.5 * distanciaPromedioRecorrida;

        return impactoEngranajes + impactoReciclado + impactoNeumaticos +
                impactoFrenos + impactoPeso + impactoFabricacion + impactoDistancia;
    }
}
