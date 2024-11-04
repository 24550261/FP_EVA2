/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_17_arreglos;

import java.util.Scanner;

/**
 *
 * @author Ivan
 */
public class EVA2_17_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cap = new Scanner(System.in);
        int cc;
        int cal[];
        String nm[];
        System.out.println("Ingrese cuantas materias esta cursando actualmente: ");
        cc=cap.nextInt();
        cap.nextLine();
        cal=new int [cc];
        nm=new String[cc];
        
        
        for(int i=0;i<cal.length;i++){
            System.out.println("Nombre del estudiante: ");
            
            nm[i]=cap.nextLine();
            System.out.println("Ingrese la calificacion de la materia: ");
            cal[i]=cap.nextInt();
            cap.nextLine();
        }
        
        for(int i=0;i<cal.length;i++){
            System.out.print(nm[i]+": "+cal[i]+"    -   ");
        }
        
        
    }
    
}
