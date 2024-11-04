/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica5;

import java.util.Scanner;

/**
 *
 * @author Ivan
 */
public class Practica5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ldp;
        String acum="*";
        Scanner cap = new Scanner(System.in);
         System.out.println("Ingrese el largo de la piramide: ");
         ldp=cap.nextInt();
         cap.nextLine();
         
         for(int i=1;i<=ldp;i++){
             System.out.println(acum);
             acum=acum+"*";
         }
        
    }
    
}
