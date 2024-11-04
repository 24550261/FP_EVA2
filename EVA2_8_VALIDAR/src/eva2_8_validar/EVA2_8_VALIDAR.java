/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_8_validar;

import java.util.Scanner;

/**
 *
 * @author Ivan
 */
public class EVA2_8_VALIDAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ds;
        Scanner cap = new Scanner(System.in);
        System.out.print("inserte un numero de la semana: ");
        ds=cap.nextInt();
        cap.nextLine();
        switch (ds){
            case 1: System.out.println("Lunes");
            break;
            case 2: System.out.println("Martes");
            break;
            case 3: System.out.println("Miercoles");
            break;
            case 4: System.out.println("Jueves");
            break;
            case 5: System.out.println("viernes");
            break;
            case 6: System.out.println("Sabado");
            break;
            case 7: System.out.println("Domingo");
            break;
            default: while (ds<1||ds>7){
                System.out.println("Ingrese un numero valido de la semana 1-7: ");
                ds=cap.nextInt();
                 switch (ds){
            case 1: System.out.println("Lunes");
            break;
            case 2: System.out.println("Martes");
            break;
            case 3: System.out.println("Miercoles");
            break;
            case 4: System.out.println("Jueves");
            break;
            case 5: System.out.println("viernes");
            break;
            case 6: System.out.println("Sabado");
            break;
            case 7: System.out.println("Domingo");
            break;
            default: while (ds<1||ds>7){
                System.out.println("Ingrese un numero valido de la semana 1-7: ");
                ds=cap.nextInt();
            }
            }
           
        }
    }
    
}
}