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
public class Excersice45 {

    public static void main(String[] args) {
        
        Profesor p= new Profesor("f","123","poo");
        
        double notas[]= {5,5,5,5};
        
        Estudiante e=new Estudiante("V","456","poo", notas,p);
        
        System.out.println(e.getdireccion());
        System.out.println(e.getAsignado().getdireccion());
        System.out.println(e.getmateria());
        System.out.println(e.calcularpromedio());
    }
    
}
