/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alturas;
import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class Alturas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);       // se definen las variables, vector y declaramos nuestra otras clase como 
        Cal_altura objt = new Cal_altura ();        // objeto para poder usarla 
        double Vec_altur[] = new double [25];
 

        //                                          // usamos un for para que el usuario pueda ingresar en el vector con todas las 
        for(int i=0; i<25; i++){                    // alturas que desea comprovar 
        System.out.println ("ingrese la altura numero "+(i+1)+" (ej. 1,68)");
        Vec_altur[i]= sc.nextDouble();
        }
        
        objt.vec_Altura(Vec_altur);                 // llamamos/establecemos las funciones o partes que usaremos de nuestro objeto 
        objt.Cal_altur();
        
        System.out.println("");                     // llamamos nuestras respuestas para mostrarlas en pantalla 
        System.out.println("la mayor altura ingresada fue de "+objt.getAltur_max()+"m");
        System.out.println("la menor altura ingresada fue de "+objt.getAltur_min()+"m");
        System.out.println("");
        
    }
    
}
