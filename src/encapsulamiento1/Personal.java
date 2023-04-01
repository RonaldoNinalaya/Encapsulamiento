/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento1;

/**
 *
 * @author Ronaldo
 */
public class Personal {
    
    private String nombre;
    private String dni;
    private double peso;
    
    
    public String getNombre(){
        return this.nombre;
    }

    public Personal(String nombre, String dni, double peso) {
        this.nombre = nombre;
        this.dni = dni;
        this.peso = peso;
    }
    
    /**
     * Esta funcion permite 
     * encapsular el nombre de la persoa
     */
    private void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

   
}
