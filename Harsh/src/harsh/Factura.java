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
public class Factura {
    private int id;
    private HashMap<String,Producto> b;
    
    public Factura(int id){
        this.b=new HashMap<>();
    }
    
    public void adicionar(Producto p){
        this.b.put(p.getnombre(),p);
        //(clave,valor)
    }
    public double calculartotal(){
        double total=0;
        /*for(int i=0;i<this.b.size();i++){
            Producto p=this.b.get(i);
            total+=p.getprecio();
        }
         */
        for(Producto p: b.values()){
            total+=p.getprecio();
        }
        return total;
    }
    
    public Producto buscar(String nombre){
        return this.b.get(nombre);
    }
    
}
