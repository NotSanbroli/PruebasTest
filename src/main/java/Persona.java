
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Familia
 */
public class Persona {
    int codigo;
    String nombre;
    HashMap <Integer,Persona> mapaPersonas;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

    public HashMap<Integer, Persona> getMapaPersonas() {
        return mapaPersonas;
    }

    public void setMapaPersonas(HashMap<Integer, Persona> mapaPersonas) {
        this.mapaPersonas = mapaPersonas;
    }

    public Persona(int codigo,String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        mapaPersonas = new HashMap<>();
 
    }
}
