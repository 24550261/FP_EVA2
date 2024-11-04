/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2;

import java.util.Scanner;

/**
 *
 * @author Ivan
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1,n2;
        Scanner cap = new Scanner(System.in);
        System.out.println("Ingrese el numero 1: ");
        n1=cap.nextInt();
        System.out.println("Ingrese el numero 2");
        n2=cap.nextInt();
        
        for(int i=n1+1;i<n2;i++){
            System.out.println(i);
            System.out.println(" ");
        }
        for(int i=n2-1;i>n1;i--){
            System.out.println(i);
            System.out.println(" ");
        }
    }
    
}
