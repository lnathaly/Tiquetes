/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tiquetes;

import java.util.List;

/**
 *
 * @author Laura
 */
public class Main {

    public static void main(String[] args) {
        Inicio inicio = new Inicio();

        List<Avion> listaavion;
        listaavion = inicio.AgregarAvion();
        inicio.imprimirAvion(listaavion);
        inicio.reservar(listaavion);
    }

}
