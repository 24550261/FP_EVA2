
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica6;

import java.util.Scanner;


/**
 *
 * @author Ivan
 */
public class Practica6 {

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
       for(int i=ldp;i>0;i--)  {
           
           for(int j=1;j<=i;j++){
               System.out.print("*");
               
               
           }
         
           System.out.println("");
          
       }
         
    
}
}