
package com.mycompany.practica1;

import java.util.Scanner;


public class Practica1 {

    public static void main(String[] args) {
        String palabra;
        int nv;
        Scanner cap = new Scanner(System.in);
                System.out.println("Ingrese  la palabra que quiere repetir: ");
                palabra=cap.nextLine();
                System.out.println("Inserte el numero de veces que quiere repetir esta palabara: ");
                nv=cap.nextInt();
                
                for(int i=1; i<=nv; i++){
                    System.out.print(palabra+"-");
                }
    }
}
