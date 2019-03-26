/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tiquetes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Laura
 */
public class Inicio {

    ArrayList<Avion> listaAviones = new ArrayList<Avion>();
    Scanner entrada = new Scanner(System.in);

    public ArrayList<Avion> AgregarAvion() {

        AvionMixto mixto1 = new AvionMixto(1, "Air Europa");
        AvionEstandar estandar1 = new AvionEstandar(2, "Vueling");
        AvionVip vip1 = new AvionVip(3, "Copa Club");

        Sillas Vip1 = new Sillas(1, 1, 'A', false, 20000);
        Sillas Vip2 = new Sillas(2, 2, 'A', false, 40000);
        Sillas Vip3 = new Sillas(3, 1, 'B', false, 50000);
        Sillas Vip4 = new Sillas(4, 2, 'B', false, 20000);
        Sillas Vip5 = new Sillas(5, 1, 'C', false, 80000);
        Sillas Vip6 = new Sillas(6, 2, 'C', false, 20000);
        Sillas Vip7 = new Sillas(7, 3, 'C', false, 20000);
        Sillas Vip8 = new Sillas(8, 4, 'C', false, 80000);
        Sillas Vip9 = new Sillas(9, 5, 'C', false, 20000);
        Sillas Vip10 = new Sillas(10, 6, 'C', false, 20000);
        Sillas Vip11 = new Sillas(11, 1, 'D', false, 20000);
        Sillas Vip12 = new Sillas(12, 2, 'D', false, 9000);
        Sillas Vip13 = new Sillas(13, 3, 'D', false, 20000);
        Sillas Vip14 = new Sillas(14, 1, 'D', false, 20000);
        Sillas Vip15 = new Sillas(15, 2, 'D', false, 9000);
        Sillas Vip16 = new Sillas(16, 3, 'D', false, 20000);

        vip1.getSillas().add(Vip1);
        vip1.getSillas().add(Vip2);
        vip1.getSillas().add(Vip3);
        vip1.getSillas().add(Vip4);
        vip1.getSillas().add(Vip5);
        vip1.getSillas().add(Vip6);
        vip1.getSillas().add(Vip7);
        vip1.getSillas().add(Vip8);
        vip1.getSillas().add(Vip9);
        vip1.getSillas().add(Vip10);
        vip1.getSillas().add(Vip11);
        vip1.getSillas().add(Vip12);

        Sillas estanda1 = new Sillas(13, 1, 'A', false, 20000);
        Sillas estanda2 = new Sillas(14, 2, 'A', false, 30000);
        Sillas estanda3 = new Sillas(15, 3, 'A', false, 20000);
        Sillas estanda4 = new Sillas(16, 4, 'B', false, 20000);
        Sillas estanda5 = new Sillas(17, 1, 'B', false, 20000);
        Sillas estanda6 = new Sillas(18, 2, 'B', false, 20000);
        Sillas estanda7 = new Sillas(19, 3, 'C', false, 20000);
        Sillas estanda8 = new Sillas(20, 4, 'C', false, 20000);
        Sillas estanda9 = new Sillas(21, 1, 'C', false, 20000);
        Sillas estanda10 = new Sillas(22, 2, 'D', false, 20000);
        Sillas estanda11 = new Sillas(23, 3, 'D', false, 20000);
        Sillas estanda12 = new Sillas(24, 4, 'D', false, 20000);

        estandar1.getSillas().add(estanda1);
        estandar1.getSillas().add(estanda2);
        estandar1.getSillas().add(estanda3);
        estandar1.getSillas().add(estanda4);
        estandar1.getSillas().add(estanda5);
        estandar1.getSillas().add(estanda6);
        estandar1.getSillas().add(estanda7);
        estandar1.getSillas().add(estanda8);
        estandar1.getSillas().add(estanda9);
        estandar1.getSillas().add(estanda10);
        estandar1.getSillas().add(estanda11);
        estandar1.getSillas().add(estanda12);

        Sillas vipMix1 = new Sillas(13, 1, 'A', false, 20000);
        Sillas vipMix2 = new Sillas(13, 2, 'A', false, 20000);
        Sillas vipMix3 = new Sillas(13, 1, 'B', false, 20000);
        Sillas vipMix4 = new Sillas(13, 2, 'B', false, 20000);
        Sillas estanMix1 = new Sillas(17, 1, 'C', false, 20000);
        Sillas estanMix2 = new Sillas(17, 2, 'C', false, 20000);
        Sillas estanMix3 = new Sillas(17, 3, 'C', false, 20000);
        Sillas estanMix4 = new Sillas(17, 4, 'C', false, 20000);
        Sillas estanMix5 = new Sillas(17, 1, 'D', false, 20000);
        Sillas estanMix6 = new Sillas(17, 2, 'D', false, 20000);
        Sillas estanMix7 = new Sillas(17, 3, 'D', false, 20000);
        Sillas estanMix8 = new Sillas(17, 4, 'D', false, 20000);

        mixto1.getSillas().add(vipMix1);
        mixto1.getSillas().add(vipMix2);
        mixto1.getSillas().add(vipMix3);
        mixto1.getSillas().add(vipMix4);
        mixto1.getSillas().add(estanMix1);
        mixto1.getSillas().add(estanMix2);
        mixto1.getSillas().add(estanMix3);
        mixto1.getSillas().add(estanMix4);
        mixto1.getSillas().add(estanMix5);
        mixto1.getSillas().add(estanMix6);
        mixto1.getSillas().add(estanMix7);
        mixto1.getSillas().add(estanMix8);

        listaAviones.add(estandar1);
        listaAviones.add(mixto1);
        listaAviones.add(vip1);

        return listaAviones;

    }
    List<Avion> listaAvion = new ArrayList<>();
    int cedula = 0;

    public void imprimirAvion(List<Avion> list) {

        listaAvion = list;
        System.out.println("BIENVENIDO");
        for (Avion listaAviones : listaAvion) {
            if (listaAviones instanceof AvionMixto) {
                AvionMixto x;
                x = ((AvionMixto) listaAviones);
                System.out.println("\033[31m AVION MIXTO");
                System.out.println("\033[36m============");
                System.out.println("\033[34m" + x.getEmpresa());
                System.out.println("\033[36m============");

                for (Sillas r : x.getSillas()) {

                    if (r.isReservacion() == false) {
                        System.out.print("\033[31m<<<");
                        System.out.print("\033[35m" + r.getLetra() + "-" + "\033[35m" + r.getFila());
                        System.out.print("\033[31m>>>");
                        System.out.println("\033[36m");
                    } else {
                        System.out.print("\033[31m<<<");
                        System.out.print("\033[32m" + r.getLetra() + "-" + "\033[32m" + r.getFila());
                        System.out.print("\033[31m>>>");
                        System.out.println("\033[36m");
                    }
                }
                System.out.println("");

            } else if (listaAviones instanceof AvionEstandar) {
                AvionEstandar x;
                x = ((AvionEstandar) listaAviones);
                System.out.println("\033[34m AVION ESTANDAR");
                System.out.println("\033[36m============");
                System.out.println("\033[34m" + x.getEmpresa());
                System.out.println("\033[36m============");

                for (Sillas r : x.getSillas()) {

                    if (r.isReservacion() == false) {
                        System.out.print("\033[31m<<<");
                        System.out.print("\033[35m" + r.getLetra() + "-" + "\033[35m" + r.getFila());
                        System.out.print("\033[31m>>>");
                        System.out.println("\033[36m");
                    } else {
                        System.out.print("\033[31m<<<");
                        System.out.print("\033[32m" + r.getFila() + "-" + "\033[32m" + r.getLetra());
                        System.out.print("\033[31m>>>");
                        System.out.println("\033[36m");
                    }
                }
                System.out.println("");
            } else if (listaAviones instanceof AvionVip) {
                AvionVip x;
                x = ((AvionVip) listaAviones);
                System.out.println("\033[34m  AVION VIP");
                System.out.println("\033[36m============");
                System.out.println("\033[34m" + x.getEmpresa());
                System.out.println("\033[36m============");

                for (Sillas r : x.getSillas()) {

                    if (r.isReservacion() == false) {
                        System.out.print("\033[31m<<<");
                        System.out.print("\033[35m" + r.getLetra() + "-" + "\033[35m" + r.getFila());
                        System.out.print("\033[31m>>>");
                        System.out.println("\033[36m");
                    } else {
                        System.out.print("\033[31m<<<");
                        System.out.print("\033[32m" + r.getLetra() + "-" + "\033[32m" + r.getFila());
                        System.out.print("\033[31m>>>");
                        System.out.println("\033[36m");
                    }
                }
                System.out.println("");
            }
        }

    }

    int opcionS = 1, opcionR = 1, valor1 = 0, valor2 = 0, valor3 = 0;
    List<Sillas> listaSilla;

    public int reservar(List<Avion> list) {

        Scanner entrada = new Scanner(System.in);
         System.out.println("\033[34m Bienvenido");
         
          System.out.println("\033[34m Para realizar su compra digite los siguientes datos : ");
        try {
            System.out.print("\033[34m Cedula : ");
            entrada.nextInt();
            entrada.nextLine();
        } catch (InputMismatchException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);

        }
        

        System.out.print("\033[34m Nombre: ");
        String nombre = entrada.nextLine();
        entrada.nextLine();

        System.out.print("\033[34m Fecha de nacimiento(dd/MM/yyyy): ");
        Date fechaN = null;
        try {
            fechaN = new SimpleDateFormat("dd/MM/yyyy").parse(entrada.nextLine());
        } catch (ParseException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }

        Cliente pas = new Cliente(cedula, nombre, fechaN);

        while (opcionS == 1) {
            System.out.print("\033[34m Codigo del Avion: ");
            int codAvion = entrada.nextInt();
            entrada.nextLine();
            opcionR = 1;
            while (opcionR == 1) {
                System.out.print("\033[34m Letra de la silla: ");
                char fila = entrada.next().charAt(0);
                System.out.print("\033[34m Numero de la silla: ");
                int columna = entrada.nextInt();
                System.out.print("\033[32m Digite 1 para ingresar otra silla de lo contario se saldra: ");
                opcionR = entrada.nextInt();

                listaSilla = listaAviones.get(codAvion - 1).getSillas();
                for (Sillas s : listaSilla) {
                    if (s.getFila() == columna && s.getLetra() == fila) {
                        if (s.isReservacion() == true) {
                            System.err.println("Esta silla ya se encuentra reservada, por favor seleccione otra silla");

                        } else {
                            s.setReservacion(true);
                            if (codAvion == 1) {
                                valor1 = valor1 + s.getValor();
                            } else if (codAvion == 2) {
                                valor2 = valor2 + s.getValor();
                            } else {
                                valor3 = valor3 + s.getValor();
                            }

                        }
                    }

                }

            }
            System.out.println("Señor cliente los datos de su reserva son: ");

            System.out.println("Nombre: " + pas.getNombre());
            if (codAvion == 1) {
                System.out.println("El precio de su factura es: " + valor1);
            } else if (codAvion == 2) {
                System.out.println("El precio de su factura es: " + valor2);
            } else {
                System.out.println("El precio de su factura es: " + valor3);
            }

            System.out.print("\033[32mDigite 1 para ingresar otra reserva de lo contrario se saldra: ");
            opcionS = entrada.nextInt();
        }
        System.out.println("Silla de los aviones");
        for (Avion listaAviones : listaAvion) {
            if (listaAviones instanceof AvionMixto) {
                AvionMixto x;
                x = ((AvionMixto) listaAviones);
                System.out.println("\033[31m AVION MIXTO");
                System.out.println("\033[36m============");
                System.out.println("\033[34m" + x.getEmpresa());
                System.out.println("\033[36m============");

                for (Sillas r : x.getSillas()) {

                    if (r.isReservacion() == false) {
                        System.out.print("\033[31m<<<");
                        System.out.print("\033[35m" + r.getLetra() + "-" + "\033[35m" + r.getFila());
                        System.out.print("\033[31m>>>");
                        System.out.println("\033[36m");
                    } else {
                        System.out.print("\033[31m<<<");
                        System.out.print("\033[32m" + r.getLetra() + "-" + "\033[32m" + r.getFila());
                        System.out.print("\033[31m>>>");
                        System.out.println("\033[36m");
                    }
                }
                System.out.println("");

            } else if (listaAviones instanceof AvionEstandar) {
                AvionEstandar x;
                x = ((AvionEstandar) listaAviones);
                System.out.println("\033[34m AVION ESTANDAR");
                System.out.println("\033[36m============");
                System.out.println("\033[34m" + x.getEmpresa());
                System.out.println("\033[36m============");

                for (Sillas r : x.getSillas()) {

                    if (r.isReservacion() == false) {
                        System.out.print("\033[31m<<<");
                        System.out.print("\033[35m" + r.getLetra() + "-" + "\033[35m" + r.getFila());
                        System.out.print("\033[31m>>>");
                        System.out.println("\033[36m");
                    } else {
                        System.out.print("\033[31m<<<");
                        System.out.print("\033[32m" + r.getLetra() + "-" + "\033[32m" + r.getFila());
                        System.out.print("\033[31m>>>");
                        System.out.println("\033[36m");
                    }
                }
                System.out.println("");
            } else if (listaAviones instanceof AvionVip) {
                AvionVip x;
                x = ((AvionVip) listaAviones);
                System.out.println("\033[34m  AVION VIP");
                System.out.println("\033[36m============");
                System.out.println("\033[34m" + x.getEmpresa());
                System.out.println("\033[36m============");

                for (Sillas r : x.getSillas()) {

                    if (r.isReservacion() == false) {
                        System.out.print("\033[31m<<<");
                        System.out.print("\033[35m" + r.getLetra() + "-" + "\033[35m" + r.getFila());
                        System.out.print("\033[31m>>>");
                        System.out.println("\033[36m");
                    } else {
                        System.out.print("\033[31m<<<");
                        System.out.print("\033[32m" + r.getLetra() + "-" + "\033[32m" + r.getFila());
                        System.out.print("\033[31m>>>");
                        System.out.println("\033[36m");
                    }
                }
                System.out.println("");
            }
        }
        return valor1;
    }

    public int reservaP(List<Avion> list, int cod, int col, int ced, String nom, char let) {
        Scanner entrada = new Scanner(System.in);

        Date fechaN = null;

        Cliente pas = new Cliente(ced, nom, fechaN);

        while (opcionS == 1) {

            entrada.nextLine();
            opcionR = 1;
            while (opcionR == 1) {

                System.out.print("\033[32mDigite 1 para ingresar otra silla: ");
                opcionR = entrada.nextInt();

                listaSilla = listaAviones.get(cod - 1).getSillas();
                for (Sillas s : listaSilla) {
                    if (s.getFila() == col && s.getLetra() == let) {
                        if (s.isReservacion() == true) {
                            System.err.println("Esta silla ya se encuentra reservada");

                        } else {
                            s.setReservacion(true);
                            if (cod == 1) {
                                valor1 = valor1 + s.getValor();
                            } else if (cod == 2) {
                                valor2 = valor2 + s.getValor();
                            } else {
                                valor3 = valor3 + s.getValor();
                            }

                        }
                    }

                }

            }
            System.out.println("Señor cliente los datos de su reserva son: ");

            System.out.println("Nombre: " + pas.getNombre());
            if (cod == 1) {
                System.out.println("El precio de su factura es: " + valor1);
            } else if (cod == 2) {
                System.out.println("El precio de su factura es: " + valor2);
            } else {
                System.out.println("El precio de su factura es: " + valor3);
            }

            System.out.print("\033[32mDigite 1 para ingresar otra reserva: ");
            opcionS = entrada.nextInt();
        }
        System.out.println("Lista de Aviones.");
        for (Avion listaAviones : listaAvion) {
            if (listaAviones instanceof AvionMixto) {
                AvionMixto x;
                x = ((AvionMixto) listaAviones);
                System.out.println("\033[31m AVION MIXTO");
                System.out.println("\033[36m============");
                System.out.println("\033[34m" + x.getEmpresa());
                System.out.println("\033[36m============");

                for (Sillas r : x.getSillas()) {

                    if (r.isReservacion() == false) {
                        System.out.print("\033[31m<<<");
                        System.out.print("\033[35m" + r.getLetra() + "-" + "\033[35m" + r.getFila());
                        System.out.print("\033[31m>>>");
                        System.out.println("\033[36m");
                    } else {
                        System.out.print("\033[31m<<<");
                        System.out.print("\033[32m" + r.getLetra() + "-" + "\033[32m" + r.getFila());
                        System.out.print("\033[31m>>>");
                        System.out.println("\033[36m");
                    }
                }
                System.out.println("");

            } else if (listaAviones instanceof AvionEstandar) {
                AvionEstandar x;
                x = ((AvionEstandar) listaAviones);
                System.out.println("\033[34m AVION ESTANDAR");
                System.out.println("\033[36m============");
                System.out.println("\033[34m" + x.getEmpresa());
                System.out.println("\033[36m============");

                for (Sillas r : x.getSillas()) {

                    if (r.isReservacion() == false) {
                        System.out.print("\033[31m<<<");
                        System.out.print("\033[35m" + r.getLetra() + "-" + "\033[35m" + r.getFila());
                        System.out.print("\033[31m>>>");
                        System.out.println("\033[36m");
                    } else {
                        System.out.print("\033[31m<<<");
                        System.out.print("\033[32m" + r.getFila() + "-" + "\033[32m" + r.getLetra());
                        System.out.print("\033[31m>>>");
                        System.out.println("\033[36m");
                    }
                }
                System.out.println("");
            } else if (listaAviones instanceof AvionVip) {
                AvionVip x;
                x = ((AvionVip) listaAviones);
                System.out.println("\033[34m  AVION VIP");
                System.out.println("\033[36m============");
                System.out.println("\033[34m" + x.getEmpresa());
                System.out.println("\033[36m============");

                for (Sillas r : x.getSillas()) {

                    if (r.isReservacion() == false) {
                        System.out.print("\033[31m<<<");
                        System.out.print("\033[35m" + r.getLetra() + "-" + "\033[35m" + r.getFila());
                        System.out.print("\033[31m>>>");
                        System.out.println("\033[36m");
                    } else {
                        System.out.print("\033[31m<<<");
                        System.out.print("\033[32m" + r.getLetra() + "-" + "\033[32m" + r.getFila());
                        System.out.print("\033[31m>>>");
                        System.out.println("\033[36m");
                    }
                }
                System.out.println("");
            }
        }
        return valor1;
    }

}
