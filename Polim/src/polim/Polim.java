/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polim;

/**
 *
 * @author Estudiante
 */
import java.util.*;
public class Polim {

    /**
     * @param args the command line arguments
     */
    
    public static int menu(){
        int opcion=0;
        Scanner teclado= new Scanner(System.in);
        System.out.println("1.Agregar"
                            + "  2.Listar"
                            + "  3.Nomina"
                            + "  4.Nomina Programador");
        opcion=teclado.nextInt();
        return (opcion);
    }
    public static void main(String[] args) {
        int opcion=-1;
        Empresa empresa=new Empresa();
        Scanner teclado=new Scanner(System.in);
        int ñ=0;
        do{
            opcion=menu();
            switch(opcion){
                case 1:
                    System.out.println("Agregar Empleado");
                    String nombre=teclado.next();
                    System.out.println("Tipo Empleado: 1.Programador 2.Arquitecto");
                    int tipo=teclado.nextInt();
                    Empleado empleado=null;
                    if(tipo==1){
                        empleado=new Programador(nombre);
                    }
                    else if(tipo==2){
                        empleado=new Arquitecto(nombre);
                    }
                    empresa.agregarempleado(empleado);
                    break;
                case 2:
                    ArrayList<Empleado> empleados=empresa.listarEmpleado();
                    for(int i=0;i<empleados.size();i++){
                        Empleado e= empleados.get(i);
                        if(e instanceof Programador)
                            System.out.println(e.getnombre()+" Programador");
                        else
                            System.out.println(e.getnombre()+" Arquitecto");
                    }
                    break;
                case 3:
                    double nomina=empresa.calcularnomina();
                    System.out.println("Nomina:"+nomina);
                    break;    
                case 4:
                    double nominaprogramadores=empresa.calcularnominasprogramadores();
                    System.out.println("Nomina Programadores: "+nominaprogramadores);
                    break;
                case 5:
                    break;
                
                default:
                    System.out.println("Inválido");
            }
            ñ++;
        }while(ñ<20);
    }
    
}
