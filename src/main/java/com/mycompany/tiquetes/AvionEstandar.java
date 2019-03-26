/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tiquetes;

/**
 * Clase Avion Estandar hijo de la clase padre Avion que contiene las sillas de
 * un avion estandar
 *
 * @author Laura
 * @version 1
 */
public class AvionEstandar extends Avion {

    /**
     *Este costructor se encarga de inicializar las variables de la clase 
     * @param codigo
     * @param empresa
     */
    public AvionEstandar(int codigo, String empresa) {
        super(codigo, empresa);
    }

}
