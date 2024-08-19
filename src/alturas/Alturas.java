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
        Scanner sc = new Scanner (System.in);
        Cal_altura objt = new Cal_altura ();
        double Vec_altur[] = new double [25];
        
        for(int i=0; i<25; i++){
        System.out.println ("ingrese la altura numero "+(i+1)+" (ej. 1,68)");
        Vec_altur[i]= sc.nextDouble();
        }
        
        objt.vec_Altura(Vec_altur);
        objt.Cal_altur();
        
        System.out.println("");
        System.out.println("la mayor altura ingresada fue de "+objt.getAltur_max());
        System.out.println("la menor altura ingresada fue de "+objt.getAltur_min());
        System.out.println("");
        
    }
    
}
