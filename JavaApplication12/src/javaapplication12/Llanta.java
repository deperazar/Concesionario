



package javaapplication12;

public class Llanta {
    
    private String marcall;
    private int tamll;
    private String modeloll;
    
    
    public Llanta(String mll, int tll, String moll){
        marcall=mll;
        tamll=tll;
        modeloll=moll;
    }
    
    public void setMarcall(){
        this.marcall=marcall;
    }
    public void setTamll(){
        this.tamll=tamll;
    }
    public void setModeloll(){
        this.modeloll=modeloll;
    }
    public String getMarcall(){
        return marcall;
    }
    public int getTamll(){
        return tamll;
    }
    public String getModelo(){
        return modeloll;
    }
    
    
}
