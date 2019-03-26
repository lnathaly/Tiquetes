/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.tiquetes.Avion;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import com.mycompany.tiquetes.Inicio;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Laura
 */
public class Pruebas {
    
    public Pruebas() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

   @Test
    public void PruebaA() {
        Inicio m = new Inicio();
        int respuesta = 0, codigo=1;
        int cedula= 10, fila= 2;
        String nombre="laura";
       
        
        char letra='A';
        int resultadoE;
        resultadoE = 20000;
        List<Avion> listaAvion;
        listaAvion= m.AgregarAvion();
         respuesta = m.reservaP(listaAvion, codigo, fila, cedula, nombre, letra);
         
        assertEquals(resultadoE, respuesta);
        
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
