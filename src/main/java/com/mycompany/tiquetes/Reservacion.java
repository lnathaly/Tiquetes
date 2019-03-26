/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tiquetes;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase contiene las variables para hacer las reservaciones del cliente
 *
 * @author Laura
 * @version 1
 */
public class Reservacion {

    /*
     Esta variable se encarga de almacenar la cedula del cliente
     */
    private int cedula;

    /*
     Esta variable se encarga de almacenar el total de la resrvacion
     */
    private int total;

    /*
     Esta variable se encarga de almacenar la lista de las sillas reservadas
     */
    private List<Sillas> sillas;

    /**
     * Este constructor se encarga de inicializar las variables de la clase
     *
     * @param codigo
     * @param cedula
     * @param total
     * @param sillas
     */
    public Reservacion(int cedula, int total, List<Sillas> sillas) {
        this.cedula = cedula;
        this.total = total;
        sillas = new ArrayList<>();
    }

    /*
     Este get permite obtener la celula de la persona que hace la reseva
     */
    public int getCedula() {
        return cedula;
    }

    /*
     Este set permite editar la cedula del cliente que realiza la reserva la reseva
     */
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    /*
     Este get permite obtener el total de la reseva
     */
    public double getTotal() {
        return total;
    }

    /*
     Este set permite editar el total de la reseva
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /*
     Este get permite obtener la lista de sillas de la reseva
     */
    public List<Sillas> getSillas() {
        return sillas;
    }

    /*
     Este set permite editar la lista de sillas de la reseva
     */
    public void setSillas(List<Sillas> sillas) {
        this.sillas = sillas;
    }

}
