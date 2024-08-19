/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alturas;

/**
 *
 * @author ESTUDIANTE
 */
public class Cal_altura {
    private double Altur[], Altur_max, Altur_min;
    
    public Cal_altura(){
    }
    
    public void vec_Altura (double Altura[]){
        this.Altur = Altura;
    }
    
    public void Cal_altur (){
        int i;
        Altur_min=100.00;
        for (i=0; i<Altur.length; i++){
            if (Altur[i]>Altur_max){
                Altur_max=Altur[i];
            }
            if (Altur[i]<Altur_min){
                Altur_min=Altur[i];
            }
        }
    }
    
    public double getAltur_max(){
        return Altur_max;
    }
    public double getAltur_min(){
        return Altur_min;
    }
    
}
