/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tiquetes;

/**
 * Esta clase contiene los datods del vuelo del avion
 *
 * @author Laura
 * @version 1
 */
public class Vuelo {

    /*
     Esta variable se encarga de guardar el codigo del avon
     */
    private int avion;

    /*
     Esta variable se encarga de guardar el total del vuelo
     */
    private double total;

    /**
     * Este constructor se encarga de inicializar las variables de la clase
     *
     * @param avion
     * @param total
     */
    public Vuelo(int avion, double total) {
        this.avion = avion;
        this.total = total;
    }

    /*
     con este get podemo obtener el codigo del avion 
     */
    public int getAvion() {
        return avion;
    }

    /*
     Con este set podemos editar el codigo del avion
     */
    public void setAvion(int avion) {
        this.avion = avion;
    }

    /*
     Con este get podemos obtener el total del avion
     */
    public double getTotal() {
        return total;
    }

    /*
     Con este set podemos editar el total del avion
     */
    public void setTotal(double total) {
        this.total = total;
    }

}
