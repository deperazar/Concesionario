/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harsh;
import java.util.*;
/**
 *
 * @author Estudiante
 */
public class Producto {
    private String nombre;
    private double precio;
    
    public void setNombre(String a){
        this.nombre=a;
    }
    public void setPrecio(double b){
        this.precio=b;
    }
    public String getnombre(){
        return nombre;
    }
    public double getprecio(){
        return precio;
    }
}
