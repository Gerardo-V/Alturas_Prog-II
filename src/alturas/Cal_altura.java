/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alturas;

/**
 *
 * @author ESTUDIANTE
 */
public class Cal_altura {                           // establecemos todos las variables que nesesitaremos 
    private double Altur[], Altur_max, Altur_min;
    
    public Cal_altura(){
    }
    
    public void vec_Altura (double Altura[]){       // llamamos nuestro vector 
        this.Altur = Altura;
    }
    
    public void Cal_altur (){                       // usando un ciclo for con 2 if en su interior para comprovar
        int i;                                      // y guardar las alturas que nesesitamos para el software dentro
        Altur_min=100.00;                           // de las variables creadas
        for (i=0; i<Altur.length; i++){
            if (Altur[i]>Altur_max){
                Altur_max=Altur[i];
            }
            if (Altur[i]<Altur_min){
                Altur_min=Altur[i];
            }
        }
    }
    
    public double getAltur_max(){                   //permitimos retornar los resultados que fueron almacenados para 
        return Altur_max;                           //que despues puedan ser mostrados en Alturas (main)
    }
    public double getAltur_min(){
        return Altur_min;
    }
    
}
