/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_promedio;

import java.util.Scanner;

/**
 *
 * @author Ivan
 */
public class EVA2_2_PROMEDIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int nm;
        double clfs,clfsnew,prom;
        Scanner cap = new Scanner(System.in);
        System.out.println("inserte el numero de materias que lleva: ");
        nm=cap.nextInt();
        cap.nextLine();
         clfsnew=0;
        for(int i=1; i<=nm;i++){
            System.out.println("Inserte la calficacion obtenida, en la materia # "+i+": ");
            clfs=cap.nextDouble();
            cap.nextLine();
           
                    clfsnew=clfsnew+clfs;
        }
     prom=clfsnew/nm;
        System.out.println("Su promedio es"+ " " +prom);
    }
    
}
