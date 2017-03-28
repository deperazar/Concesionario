/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excersice45;

/**
 *
 * @author Estudiante
 */
public class Estudiante extends Persona {
    
    private double[] notas;
    private Profesor asignado;
    
    public Estudiante(String direccion, String telefono, String materia, double [] notas,Profesor asignado){
        super(direccion,telefono,materia);
        this.notas=notas;
        this.asignado=asignado;
        
    }
    
    public double calcularpromedio(){
        double resultado=0;
        for(double nota:notas){
            resultado+=nota;
        }
        return resultado/notas.length;
    }
    
    public double[] vernotas(){
        return notas;
    }
    
     public Profesor getAsignado(){
        return asignado;
    }
    
    
}
