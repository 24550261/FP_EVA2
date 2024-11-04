
package eva2_3_potencia;

import java.util.Scanner;

/**
 *
 * @author Ivan
 */
public class EVA2_3_POTENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int num,expo,numx;
        
        Scanner cap = new Scanner(System.in);
        System.out.println("Ingrese el numero que quiera elevar:  ");
        num=cap.nextInt();
        cap.nextLine();
        System.out.println("Ingrese el exponente al que va a elevar el numero:  ");
        expo=cap.nextInt();
        cap.nextLine();
        numx=1;
               
        for(int i=1; i<=expo; i++){
                numx=num*numx;
        }
        System.out.println("Su numero elevado es: "+numx);
    }
    
}
