/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package konversisuhu;

/**
 *
 * @author mrmar
 */
public class KonversiSuhu {
        double celcius;
        
    Main data = new Main();
    public KonversiSuhu(double celcius){
        
       this.celcius= celcius; 
       
    }double farenheit(){
        
        return (celcius * 1.8 +32);
        
    }double reamur(){
        
        return (celcius *0.8);
        
    }double kelvin(){
        
        return (celcius+273.15);
        
    }String kondisiair(){
        if(celcius <=0){
            
            return "Beku";
            
        }else if (celcius >=100){
            
            return "Mendidih";
            
        }else {
            
            return "Normal";
            
        }
    }
}
