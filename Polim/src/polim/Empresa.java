/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package polim;

import java.util.ArrayList;
/**
 *
 * @author Estudiante
 */
public class Empresa {
    private ArrayList<Empleado> empleados;
    
    public Empresa(){
        this.empleados=new ArrayList<>();
        
    }
       
    public void agregarempleado(Empleado e){
        this.empleados.add(e);
    }
    
    public double calcularnomina(){
        double nomina=0;
        for(Empleado empleados: empleados){
            
            nomina+=empleados.calcularsalario();
        }
        return nomina;
    }
    
    public double calcularnominasprogramadores(){
        double nomina=0;
        for(Empleado empleados: empleados){
            if(empleados instanceof Programador){
                nomina+=empleados.calcularsalario();
            }
        }
        return nomina;
    }
    
     public double calcularnominasarquitectos(){
        double nomina=0;
        for(Empleado empleados: empleados){
            if(empleados instanceof Arquitecto){
                nomina+=empleados.calcularsalario();
            }
        }
        return nomina;
    }
    
    public ArrayList<Empleado> listarEmpleado(){
        return this.empleados;
    }
    
}
