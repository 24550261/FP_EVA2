/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_18_busqueda_lineal;

import java.util.Scanner;

/**
 *
 * @author Ivan
 */
public class EVA2_18_BUSQUEDA_LINEAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int [] dts={10,54,87,98,54,654,564,87,45};
       int dtu,pos=-1;
        Scanner cap = new Scanner(System.in);
        System.out.println("Ingrese un numero al azar: ");
        dtu=cap.nextInt();
        cap.nextLine();
        for(int i=0;i<dts.length;i++){
            if(dtu==dts[i]){
                System.out.println("el lugar es: "+i);
                break;
            }else{
                System.out.println("Su numero no se encuentra...");
        }
            if(pos==-1)
    }
    
}
}