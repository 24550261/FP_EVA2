

package com.mycompany.eva2_4_factorial;

import java.util.Scanner;


public class EVA2_4_FACTORIAL {

    public static void main(String[] args) {
        Scanner cap = new Scanner(System.in);
        int fc,sm;
        System.out.println("Ingrese el numero al que le quiere calcular el factorial");
        fc=cap.nextInt();
        sm=1;
        for(int i=1;i<=fc; i++){
            sm=sm*i;
        }
        System.out.println("el factorial del numero "+fc+" "+"es: "+sm);
    }
}