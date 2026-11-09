package com.mycompany.java.deneme.sinavi;

import java.util.Scanner;

public class JavaDenemeSinavi {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Dogru cevap sayinizi (0-20) girin: ");
        int number = input.nextInt();
        
        System.out.print("Yanlis cevap sayinizi (0-20) girin: ");
        int number2 = input.nextInt();
        
        if (number >= 0 && number <= 20 && number2 >= 0 && number2 <= 20 && number + number2 <= 20) {
            
            double net = number - number2/4.0;
            
            System.out.println("Toplam soru: " + (number + number2));
            
            System.out.println("Dogru: " + number);
            
            System.out.println("Yanlis: " + number2);
            
            System.out.println("Bos: " + (20 - (number + number2)));
            
            System.out.println("Net: " + net);
            
            if (net > 15 && net <= 20 ) {
                
                System.out.println("Basari: Cok iyi");
                
            }
            
            else if (net > 10 && net <= 15 ) {
                
                System.out.println("Basari: Iyi");
                
            }
            
            else if (net > 5 && net <= 10 ) {
                
                System.out.println("Basari: Orta");
                
            }
            
            else {
                
                System.out.println("Basari: Gelistirilmeli");
                
            }
            
        }
        
        else {
            
            System.out.print("Hesaplama yapilamaz!");
            
        }
        
        input.close();
        
    }
}