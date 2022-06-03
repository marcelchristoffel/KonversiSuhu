/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konversisuhu;

import java.util.Scanner;
/**
 *
 * @author mar
 */
        
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pil;
        double sebelum;
        System.out.println("KONVERSI SUHU AIR");
        System.out.println("_________________");
        System.out.println(" ");
        System.out.print("Masukan suhu dalam Celcius : ");sebelum = input.nextInt();
        
        
        do{
            KonversiSuhu setelah = new KonversiSuhu(sebelum);
            System.out.println("1. Lihat Data ");
            System.out.println("2. Input Ulang");
            System.out.println("3. Exit");
            System.out.print("Pilih   : ");pil=input.nextInt();
            
            if(pil==1){
                System.out.println("");
                System.out.println("Celcius     : " + sebelum + "°C");
                System.out.println("Farenheit   : " + setelah.farenheit() + "°F");
                System.out.println("Reamur      : " + setelah.reamur() + "°R");
                System.out.println("Kelvin      : " + setelah.kelvin() + "K");
                System.out.println("Kondisi Air " + setelah.kondisiair());
                
            }else if (pil==2){
                 System.out.println("KONVERSI SUHU AIR");
                 System.out.println("_________________");
                 System.out.println(" ");
                 System.out.print("Masukan suhu dalam Celcius : ");sebelum = input.nextInt();
                
            }else if (pil > 3 || pil < 1){
                System.out.println("Masukan pilihan yang tersedia");
            }
        } while (pil !=3);
    }  
}