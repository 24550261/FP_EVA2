/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_numeros_pares;

import java.util.Scanner;

/**
 *
 * @author Ivan
 */
public class EVA2_6_NUMEROS_PARES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1,n2;
        Scanner cap = new Scanner(System.in);
        System.out.println("Ingrese su primer numero: ");
        n1=cap.nextInt();
        cap.nextLine();
        System.out.println("Ingrese su sgeundo numero: ");
        n2=cap.nextInt();
        cap.nextLine();
        
        for(int i=n1;i<=n2;i++){
            if(i%2!=1)
                continue;
            System.out.print(i+"-");
        }
    }
    
}
