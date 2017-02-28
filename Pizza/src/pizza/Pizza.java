
package pizza;
import java.util.*;

public class Pizza {
    
    Scanner lec=new Scanner(System.in);
    
    
        private String toppings;
        private double diameter;
        private double price;
        
        /*Pizza(String xtoppings, double xdiameter, double xprice){
            toppings=xtoppings;
            diameter=xdiameter;
            price=xprice;
                    
        }*/
        public void settoppings( String a){
           this.toppings=a;
        }
        public void setdiameter( Double b){
           this.diameter=b;     
        }
        public void setprice( Double c){
           this.price=c;
        }
        
        public String gettoppings(){
            return toppings;     
        }
        public double getdiameter(){
            return diameter;
        }
        public double getprice(){
            return price;
        }
        
    public static void main(String[] args) {
        
        
        Scanner lec=new Scanner(System.in);
        
        Pizza a= new Pizza();
        System.out.println(a.gettoppings() +" "+ a.getdiameter()+ " "  + a.getprice());
        
        a.settoppings("Cheddar Cheese");
        a.setdiameter(29.0);
        a.setprice(32.99);
        System.out.println(a.gettoppings() +" "+ a.getdiameter()+ " "  + a.getprice());
        
        Pizza [] pizzas= new Pizza[2];
        
        for(int i=0;i<2;i++){
            pizzas[i]=new Pizza();
            System.out.println("Ingrediente: " + i);
            pizzas[i].settoppings(lec.next());
            System.out.println("Tamaño: " + i);
            pizzas[i].setdiameter(lec.nextDouble());
            System.out.println("Precio: "+ i);
            pizzas[i].setprice(lec.nextDouble());
            
        }
        
        for(int j=0;j<2;j++){
            System.out.println("Pizza:"+j+" "+pizzas[j].gettoppings());
            System.out.println("Pizza:"+j+" "+pizzas[j].getdiameter());
            System.out.println("Pizza:"+j+" "+pizzas[j].getprice());
        }
    }
}