
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Familia
 */
public class Codigo {
  
    String informacion;
    HashMap<Integer,Persona> listaAbuelos;
    int i;
 
     public String Codigo(HashMap<Integer,Persona> listaAbuelos,int i) {

            if(listaAbuelos.containsKey(i)){                
                System.out.println("Es el codigo del abuelo: " + listaAbuelos.get(i).getNombre());
                int llavePadre = Integer.parseInt(listaAbuelos.get(i).getMapaPersonas().keySet().toArray()[0].toString());
                System.out.println("Su hijo es: "+listaAbuelos.get(i).getMapaPersonas().get(llavePadre).getNombre());
                int llaveNieto = Integer.parseInt(listaAbuelos.get(i).getMapaPersonas().get(llavePadre).getMapaPersonas().keySet().toArray()[0].toString());
                System.out.println("Su nieto es: "+listaAbuelos.get(i).getMapaPersonas().get(llavePadre).getMapaPersonas().get(llaveNieto).getNombre());
                informacion=listaAbuelos.get(i).getNombre();
            }
            
            for (Persona per:listaAbuelos.values()){                
                if(per.getMapaPersonas().containsKey(i)){                    
                    System.out.println("Es el codigo del Padre: " + per.getMapaPersonas().get(i).getNombre());
                    System.out.println("Su padre es: " + per.getNombre());
                    int llaveHijo = Integer.parseInt(per.getMapaPersonas().get(i).getMapaPersonas().keySet().toArray()[0].toString());
                    System.out.println("Su hijo es: "+ per.getMapaPersonas().get(i).getMapaPersonas().get(llaveHijo).getNombre());
                    informacion=per.getMapaPersonas().get(i).getNombre();
                }
                
                for (Persona pa : per.getMapaPersonas().values()) {
                    if(pa.getMapaPersonas().containsKey(i)){
                        System.out.println("Es el codigo del Hijo: " + pa.getMapaPersonas().get(i).getNombre());
                        System.out.println("Su padre es: " + pa.getNombre());
                        System.out.println("Su abuelo es: " + per.getNombre());
                        informacion=pa.getMapaPersonas().get(i).getNombre();
                    }
                }
            }  return informacion;              
     }

  

    
}
