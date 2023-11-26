/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.impacto.ecologico.app;

/**
 *
 * @author Usuario
 */
public class Edificio {
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
}
