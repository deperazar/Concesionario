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
public class Programador extends Empleado {
    
    public Programador(String nombre){
        super(nombre);
    }
    
    @Override
    public double calcularsalario(){
        return 100;
    }
}
