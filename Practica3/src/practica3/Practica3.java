/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica3;

import java.util.Scanner;

/**
 *
 * @author Ivan
 */
public class Practica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String palabra;
        Scanner cap = new Scanner(System.in);
        System.out.println("Ingrese una palabara :");
        
       palabra=cap.nextLine();
        
       for(int i=0;i<=palabra.length()-1;i++){
           System.out.println(palabra.charAt(i));
       }
    }
    
}
