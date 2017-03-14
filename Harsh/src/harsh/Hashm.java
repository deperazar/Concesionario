/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harsh;

public class Hashm {

    
    public static void main(String[] args) {
        Producto p1= new Producto();
        p1.setNombre("A");
        p1.setPrecio(10);
        
        Producto p2= new Producto();
        p2.setNombre("B");
        p2.setPrecio(10);
        
        Factura f=new Factura(1);
        f.adicionar(p1);
        f.adicionar(p2);
        
        double total=f.calculartotal();
        System.out.println("TOTAL= "+total);
            
        Producto b=f.buscar("A");
        if(b!=null){
            System.out.println("Precio= "+b.getprecio());
        }
        
    }
    
}
 