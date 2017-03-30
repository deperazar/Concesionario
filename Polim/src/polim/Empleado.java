/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polim;

/**
 *
 * @author Estudiante
 */
public class Empleado {
    protected String nombre;
    
    
    public Empleado(String nombre){
        this.nombre=nombre;    
    }
    
    public double calcularsalario(){
        return 0;
    }
    
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
    public String getnombre(){
        return this.nombre;
    }
    
}
