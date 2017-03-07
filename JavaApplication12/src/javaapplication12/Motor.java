

package javaapplication12;


public class Motor {
    
    private String numserie;
    private int cilindros;
    
    
    public Motor(String ns, int cil){
        numserie=ns;
        cilindros=cil;
    }
    public void setNumserie(){
        this.numserie=numserie;
    }
    public void setCilidros(){
        this.cilindros=cilindros;
    }
    public String getNumserie(){
        return numserie;
    }
    public int getCilidros(){
        return cilindros;
    }
}
