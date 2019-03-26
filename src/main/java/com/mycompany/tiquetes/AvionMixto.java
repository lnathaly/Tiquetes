/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tiquetes;

/**
 *Esta clase es la cclase hijo de la clase padrre avion que contiene las sillas de un avion Mixto (Sillas VIP y sillas estandar)
 * @author Laura
 * @version 1
 */
public class AvionMixto extends Avion{

    /**
     * Este condtructor se encarga de incialixar las variables de la clase padre en la clase hijo
     * @param codigo
     * @param empresa 
     */
    public AvionMixto(int codigo, String empresa) {
        super(codigo, empresa);
    }
    
}
