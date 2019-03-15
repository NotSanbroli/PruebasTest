/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.HashMap;
import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Familia
 */
public class EncontrarTest {
    Persona hijo1=new Persona(1,"alberto");
    Persona hijo2=new Persona(2,"Juan");
    Persona hijo3=new Persona(3,"mateo");
    Persona padre1=new Persona(4,"carlos");
    Persona padre2=new Persona(5,"Camilo");
    Persona padre3=new Persona(6,"ramiro");
    Persona abue1=new Persona(7,"donald");
    Persona abue2=new Persona(8,"david");
    Persona abue3=new Persona(9,"soraya");
     int i;
       Scanner capt = new Scanner(System.in);    

    @Test
    public void encontrarAbuelosTest(){
        Codigo cod = new Codigo();
        Scanner capt = new Scanner(System.in);    
        padre1.getMapaPersonas().put(hijo1.getCodigo(), hijo1);
        padre2.getMapaPersonas().put(hijo2.getCodigo(), hijo2);
        padre3.getMapaPersonas().put(hijo3.getCodigo(), hijo3);
        abue1.getMapaPersonas().put(padre1.getCodigo(), padre1);
        abue2.getMapaPersonas().put(padre2.getCodigo(), padre2);
        abue3.getMapaPersonas().put(padre3.getCodigo(), padre3);
        abue1.getMapaPersonas().put(padre2.getCodigo(), padre2);
            
        HashMap<Integer,Persona>listaAbuelos=new HashMap();
        
        listaAbuelos.put(abue1.getCodigo(), abue1);
        listaAbuelos.put(abue2.getCodigo(), abue2);
        listaAbuelos.put(abue3.getCodigo(), abue3);
        i=7;
        cod.Codigo(listaAbuelos, i);
        assertEquals("donald",cod.informacion);
        
    
    }
    @Test
 public void encontrarHijosTest(){
 Codigo cod = new Codigo();
        Scanner capt = new Scanner(System.in);    
        padre1.getMapaPersonas().put(hijo1.getCodigo(), hijo1);
        padre2.getMapaPersonas().put(hijo2.getCodigo(), hijo2);
        padre3.getMapaPersonas().put(hijo3.getCodigo(), hijo3);
        abue1.getMapaPersonas().put(padre1.getCodigo(), padre1);
        abue2.getMapaPersonas().put(padre2.getCodigo(), padre2);
        abue3.getMapaPersonas().put(padre3.getCodigo(), padre3);
        abue1.getMapaPersonas().put(padre2.getCodigo(), padre2);
            
        HashMap<Integer,Persona>listaAbuelos=new HashMap();
        
        listaAbuelos.put(abue1.getCodigo(), abue1);
        listaAbuelos.put(abue2.getCodigo(), abue2);
        listaAbuelos.put(abue3.getCodigo(), abue3);
        i=1;
        cod.Codigo(listaAbuelos, i);
        assertEquals("alberto",cod.informacion);
 }
 @Test
 public void encontarPadresTest(){
 Codigo cod = new Codigo();
        Scanner capt = new Scanner(System.in);    
        padre1.getMapaPersonas().put(hijo1.getCodigo(), hijo1);
        padre2.getMapaPersonas().put(hijo2.getCodigo(), hijo2);
        padre3.getMapaPersonas().put(hijo3.getCodigo(), hijo3);
        abue1.getMapaPersonas().put(padre1.getCodigo(), padre1);
        abue2.getMapaPersonas().put(padre2.getCodigo(), padre2);
        abue3.getMapaPersonas().put(padre3.getCodigo(), padre3);
        abue1.getMapaPersonas().put(padre2.getCodigo(), padre2);
            
        HashMap<Integer,Persona>listaAbuelos=new HashMap();
        
        listaAbuelos.put(abue1.getCodigo(), abue1);
        listaAbuelos.put(abue2.getCodigo(), abue2);
        listaAbuelos.put(abue3.getCodigo(), abue3);
        i=4;
        cod.Codigo(listaAbuelos, i);
        assertEquals("carlos",cod.informacion);
 }
 
}
