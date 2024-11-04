/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica4;

import java.util.Scanner;

/**
 *
 * @author Ivan
 */
public class Practica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

      String pab;
      char v1='a',v2='e',v3='i',v4='o',v5='u';
        Scanner cap = new Scanner(System.in);
        System.out.println("ingrese una palabra: ");
        pab=cap.nextLine();
        for(int i=0;i<=pab.length()-1;i++){
            if(pab.charAt(i)==v1||pab.charAt(i)==v2||pab.charAt(i)==v3||pab.charAt(i)==v4||pab.charAt(i)==v5){
                System.out.print(pab.charAt(i));
            }else{
                System.out.println("  ");
            }
        }
    }
    
}
