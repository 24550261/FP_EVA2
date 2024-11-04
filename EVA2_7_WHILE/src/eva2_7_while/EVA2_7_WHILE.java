/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_7_while;

import java.util.Scanner;


public class EVA2_7_WHILE {

    public static void main(String[] args) {
        // TODO code application logic here
        //imprimir los numeros del 1 al 10
        int n;
        Scanner cap = new Scanner(System.in);
        System.out.println("Ingrese un numero menor a 10: ");
        n=cap.nextInt();
        cap.nextLine();
        
        while(n<10){
            System.out.println(n);
            n++;
        }
        
        do{
            
        }while();
    }
    
}
