/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_numero_mayor;

import java.util.Scanner;

/**
 *
 * @author Ivan
 */
public class EVA2_11_Numero_Mayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,acum=0;
        Scanner cap = new Scanner(System.in);
        
        
        do{
            System.out.println("Ingrese la vairable: ");
            n=cap.nextInt();
            if(n>=acum){
                acum=n;
            }
        }while(n!=-1);
        System.out.println(acum);
        }
        }
    
    

