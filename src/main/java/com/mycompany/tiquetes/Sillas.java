/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tiquetes;

import java.util.ArrayList;

/**
 * Esta clase contiene las variables que describen la silla
 *
 * @author Laura
 */
public class Sillas {

    /*
     Esta variable se encarga de almacenar el codigo de la silla
     */
    private int id;
    /*
     Esta variable se encarga de almacenar la fila de la silla
     */
    private int fila;

    /*
     Esta variable se encarga de almacenar la letra de la silla
     */
    private char letra;

    /*
     Esta variable se encarga de almacenar el estado de reservacion de la silla
     */
    private boolean reservacion;

    /*
     Esta variable se encarga de almacenar el precio de la silla
     */
    private int valor;

    /**
     * Este constructor se encarga de inicializar las variables de la clase
     *
     * @param id
     * @param fila
     * @param letra
     * @param reservacion
     * @param valor
     */
    public Sillas(int id, int fila, char letra, boolean reservacion, int valor) {
        this.id = id;
        this.fila = fila;
        this.letra = letra;
        this.reservacion = reservacion;
        this.valor = valor;
    }

    /*
     Este get permite obtener el id de la silla
     */
    public int getId() {
        return id;
    }

    /*
     Este set permite obtener el codigo de la silla
     */
    public void setId(int id) {
        this.id = id;
    }

    /*
     Este get permite obtener la fila de la silla id de la silla
     */
    public int getFila() {
        return fila;
    }

    /*
     Este set permite obtener la fila  de la silla
     */
    public void setFila(int fila) {
        this.fila = fila;
    }

    /*
     Este get permite obtener la letra de la silla id de la silla
     */
    public char getLetra() {
        return letra;
    }

    /*
     Este set permite obtener la letra de la silla
     */
    public void setLetra(char letra) {
        this.letra = letra;
    }


    /*
     Este get permite obtener el estado de reservacion de la silla
     */
    public boolean isReservacion() {
        return reservacion;
    }

    /*
     Este set permite obtener el estado de reserva de la silla
     */
    public void setReservacion(boolean reservacion) {
        this.reservacion = reservacion;
    }

    /*
     Este get permite obtener el precio de la silla
     */
    public int getValor() {
        return valor;
    }

    /*
     Este set permite obtener el precio de la silla
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

}
