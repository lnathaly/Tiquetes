/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tiquetes;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase es la clase padre avion que contiene las caracteristicas en communde los 3 tipos de avion
 * @author Laura
 * @version 1
 * 
 */
public abstract class Avion {
    /*
    En esta variable se almacena el codigo del avion
    */
    private int codigo;
    /*
    En esta variable se almacena el nombre de la empresa a la cual pertenece el avion
    */
    private String empresa;/*
    
    /*
    Enesta lista se almacenan las sillas de cada avion
    */
    
    private List<Sillas> sillas;

  /**
   * Este constructor se encarga de inicializar las variables de la clase
   * @param codigo
   * @param empresa 
   */
    public Avion(int codigo, String empresa) {
        this.codigo = codigo;
        this.empresa = empresa;
        sillas= new ArrayList<Sillas>();
    }

    
    /*
    Este get permite obtener el codigo del avion
    */
    public int getCodigo() {
        return codigo;
    }
 
    /*
    permite modifiar el codigo del avion
    */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /*
    Este get permite obtener la lista de las sillas que tiene el avon
    */
    public List<Sillas> getSillas() {
        return sillas;
    }

    /*
    permite modifiar la lista de sillas del avion
    */
    public void setSillas(List<Sillas> sillas) {
        this.sillas = sillas;
    }

    /*
    permite obtener el nombre de la empresa a la cual pertenece el avion
    */
    public String getEmpresa() {
        return empresa;
    }

    /*
    permite modifiar la empresa a la que pertenece el avion
    */
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
    
    
    
}
