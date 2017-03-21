

package javaapplication17;


public class Habitacion {
    private int capacidadmaxima;
    private String IDhabitacion;
    private Precio price;
    private Persona[] p;
    public Habitacion(int cp, String IDhab){
        capacidadmaxima=cp;
        IDhabitacion=IDhab;
        p = new Persona[cp];
     
    }
    
    
    public void setIDhab(int j,int i){
        this.IDhabitacion=j+"0"+i;
    }
    
    public void addpersona(Persona i){
        
        p[1]= i;
    }
}
