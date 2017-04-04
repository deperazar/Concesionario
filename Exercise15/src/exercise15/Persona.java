/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise15;
import java.util.ArrayList;
/**
 *
 * @author Estudiante
 */
public class Persona {
    private String nombre;
    private int ID;
   
    
    private ArrayList<Car> carros;
    
    public Persona(String nombre, int ID){
        this.nombre=nombre;
        this.ID=ID;
        this.carros= new ArrayList<>();
           
    }
       
    public void addcar(Car c){
        this.carros.add(c);
    }
    
    public String showinformation(){
        return carros.get(0).showinfo()+carros.get(0).showMotor()+carros.get(0).showchas()+carros.get(0).showruedas();
    }
    public String showinforma(){
        return carros.get(1).showinfo()+carros.get(1).showMotor()+carros.get(1).showchas()+carros.get(1).showruedas();
    }
   
    
}
