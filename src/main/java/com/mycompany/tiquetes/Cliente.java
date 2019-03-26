/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tiquetes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Esta clase contiene las variables correspondientes al cliente que realiza la
 * compra de tiquetes
 *
 * @author Laura
 * @version 1
 */
public class Cliente {

    /*
     en esta variable se almacena la cedula del cliente
     */
    private int cedula;

    /*
     En esta variable se almacena el nombre del ciente 
     */
    private String nombre;

    /*
     En esta variable se almcena la fecha de nacimiento del cliente
     */
    private Date fechaNacimiento;

    /*
     E esta lista se almacena la lista de reservaciones del cliente 
     */
    private List<Reservacion> reserva;

    /**
     * Este constructor se encarga de inicializar las variables de la clase
     *
     * @param cedula
     * @param nombre
     * @param fechaNacimiento
     */
    public Cliente(int cedula, String nombre, Date fechaNacimiento) {
        this.cedula = cedula;
        this.nombre = nombre;;
        this.fechaNacimiento = fechaNacimiento;
        reserva = new ArrayList<>();
    }

    /*
     Este get permite obtener la cedula del cliente
     */
    public int getCedula() {
        return cedula;
    }

    /*
     Este set permite editar la cedula del cliente
     */
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    /*
     Este get permite obtener el nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }

    /*
     Este set permite editar el nombre del cliente
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    /*
     Este get permite obtener la fecha de nacimiento del cliente
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /*
     Este set permite editar la fecha de nacimiento del cliente
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /*
     Este get permite obtener la lisa de reservaciones  del cliente
     */
    public List<Reservacion> getReserva() {
        return reserva;
    }

    /*
     Este set permite editar la lista de reservaciones del cliente
     */
    public void setReserva(List<Reservacion> reserva) {
        this.reserva = reserva;
    }

}
