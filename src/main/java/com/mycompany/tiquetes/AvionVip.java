/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tiquetes;

import java.util.ArrayList;

/**
 * Esta clase es la clase hijo de la clase avion que contiene las sillas de clase VIP
 * @author Laura
 * @version 1
 */
public class AvionVip extends Avion{

    /**
     * Este constructor se encarga de incializar las variables codigo y empresa de la clase 
     * 
     * @param codigo
     * @param empresa 
     */
    public AvionVip(int codigo, String empresa) {
        super(codigo, empresa);
        
    }
    
}
