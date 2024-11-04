/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_usuario_pws;

import java.util.Scanner;

/**
 *
 * @author Ivan
 */
public class EVA2_9_USUARIO_PWS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String u,pws;
        Scanner cap = new Scanner(System.in);
        do{
            System.out.print("ingrese Usuario: ");
            u=cap.nextLine();
            System.out.print("Ingrese pws: ");
               pws=cap.nextLine();
        }while(!(u.contentEquals("admin"))&&!(pws.contentEquals("1234")));  
               System.out.println("Acceso");
       
        
    }
        
        
    }
    

