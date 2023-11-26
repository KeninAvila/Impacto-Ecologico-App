/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.impacto.ecologico.app;

/**
 *
 * @author Usuario
 */
public class Edificio implements ImpactoEcologico {
    private String tipo;
    private int numeroPisos;
    private double consumoLuz;
    private double cantidadDesechos;
    private double consumoAgua;
    private int cantidadPersonas;
    private boolean utilizaEnergiaRenovable;
    private boolean tieneAreasVerdes;
    private double emisionesTransporte;

    public Edificio(String tipo, int numeroPisos, double consumoLuz, double cantidadDesechos,
                    double consumoAgua, int cantidadPersonas, boolean utilizaEnergiaRenovable,
                    boolean tieneAreasVerdes, double emisionesTransporte) {
        this.tipo = tipo;
        this.numeroPisos = numeroPisos;
        this.consumoLuz = consumoLuz;
        this.cantidadDesechos = cantidadDesechos;
        this.consumoAgua = consumoAgua;
        this.cantidadPersonas = cantidadPersonas;
        this.utilizaEnergiaRenovable = utilizaEnergiaRenovable;
        this.tieneAreasVerdes = tieneAreasVerdes;
        this.emisionesTransporte = emisionesTransporte;
    }

    public String getTipo() {
        return tipo;
    }
    
    @Override
        public double obtenerImpactoEcologico() {
        // Lógica para calcular el impacto ecológico considerando varios atributos de consumo
        double impactoPorPisos = 20.0 * numeroPisos;
        double impactoLuz = 2.0 * consumoLuz;
        double impactoDesechos = 5.0 * cantidadDesechos;
        double impactoAgua = 1.5 * consumoAgua;
        double impactoPersonas = 3.0 * cantidadPersonas;
        double impactoRenovable = utilizaEnergiaRenovable ? -5.0 : 0.0; // Descuento si utiliza energía renovable
        double impactoAreasVerdes = tieneAreasVerdes ? -2.0 : 0.0; // Descuento si tiene áreas verdes
        double impactoTransporte = 1.8 * emisionesTransporte; // Ajustar según la realidad

        return impactoPorPisos + impactoLuz + impactoDesechos + impactoAgua +
                impactoPersonas + impactoRenovable + impactoAreasVerdes + impactoTransporte;
    }
}
