/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_validar2;

import java.util.Scanner;

/**
 *
 * @author Ivan
 */
public class EVA2_10_Validar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dia;
        Scanner cap = new Scanner(System.in);
        while(true){
            System.out.println("numero corrspondiente al dia (1-7)");
            dia=cap.nextInt();
            if(dia>=1&&dia<=7){
                break;
            }
        }
        switch (dia){
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
    }
    
}
}

