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
public class Persona {
    
    protected String direccion;
    protected String telefono;
    protected String materia;
    
    public Persona(String direccion, String telefono, String materia){
        this.direccion=direccion;
        this.telefono=telefono;
        this.materia=materia;
    }
    
    public String getdireccion(){
        return this.direccion;
    }
    public String gettelefono(){
        return this.telefono;
    }
    public String getmateria(){
        return this.materia;
    }
    
    public void setdireccion(String direccion){
        this.direccion=direccion;
    }
    public void settelefono(String telefono){
        this.telefono=telefono;
    }
    public void setmateria(String materia){
        this.materia=materia;
    }
    
}
