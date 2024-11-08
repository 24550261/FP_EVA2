/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg24550261_examenpr_eva2;

import java.util.Scanner;

/**
 *
 * @author Ivan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int ru,ct=0,cu=0,ce=0;
       String su,ru1="",rpc="";
        Scanner cap = new Scanner(System.in);
        System.out.println("PIEDRA PAPEL O TIJERA");
        System.out.println("        ");
        System.out.println("        ");
        System.out.println("        ");
        System.out.println("        ");
        System.out.println("        ");
        System.out.println("        ");
        System.out.println("        ");
        do{
            System.out.println("Escoge entre  piedra papel o tijera: ");
            System.out.println(" (Si desea parar el juego, solo transcriba basta)   ");
            System.out.println("    ");
            System.out.println("    ");
            System.out.println("    ");
            System.out.println("1.-Piedra");
            System.out.println("2.-Papel");
            System.out.println("3.-Tijera");
            double rpc1=Math.random();
            
            
            ru=cap.nextInt();
             cap.nextLine();
            if (ru==1){
                System.out.println("Respuesta Usuario: Piedra");
                ru1="Piedra";
            }else if(ru==2){
                System.out.println("Respuesta Usuario: Papel");
                ru1="Papel";
            }else if(ru==3){
                System.out.println("Respuesta Usuario: Tijera");
                ru1="Tijera";
            }else{
                System.out.println("No ingreso una respuesta valida");
                
            }
            
            if(rpc1>0&&rpc1<0.3){
                System.out.println("Respuesta PC: Piedra");
                rpc="Piedra";
            }else if(rpc1>0.3&&rpc1<0.6){
                System.out.println("Respuesta PC: Papel");
                rpc="Papel";
            }else if(rpc1>0.6&&rpc1<=1){
                System.out.println("Respuesta PC: Tijera");
                rpc="Tijera";
            }
            
            if(rpc.equals("Piedra")&&ru1.equals("Tijera")){
                System.out.println("Gana la computadora!!!");
               
                ct=ct+1;
                System.out.println("Contador: ");
                System.out.println("PC= "+ct);
                System.out.println("HUMANO= "+cu);
                
            }else if(rpc.contains("Papel")&&ru1.contains("Piedra")){
                System.out.println("Gana la computadora!!!");
               
                ct=ct+1;
                System.out.println("Contador: ");
                System.out.println("PC= "+ct);
                System.out.println("HUMANO= "+cu);
                
                
            }else if(rpc.contains("Tijera")&&ru1.contains("Papel")){
                System.out.println("Gana la computadora!!!");
               
                ct=ct+1;
                System.out.println("Contador: ");
                System.out.println("PC= "+ct);
                System.out.println("HUMANO= "+cu);
                
            }else if(rpc.contains("Piedra")&&ru1.contains("Papel")){
                System.out.println("Gana el usuario!!!");
               
                cu=cu+1;
                System.out.println("Contador: ");
                System.out.println("PC= "+ct);
                System.out.println("HUMANO= "+cu);
                
            }else if(rpc.contains("Papel")&&ru1.contains("Tijera")){
                System.out.println("Gana el usuario!!!");
               
                cu=cu+1;
                System.out.println("Contador: ");
                System.out.println("PC= "+ct);
                System.out.println("HUMANO= "+cu);
                
            }else if(rpc.contains("Tijera")&& ru1.contains("Piedra")){
                System.out.println("Gana el usuario!!!");
               
                cu=cu+1;
                System.out.println("Contador: ");
                System.out.println("PC= "+ct);
                System.out.println("HUMANO= "+cu);
                
            }else if(rpc.contains("Piedra")&&ru1.contains("Piedra")){
                System.out.println("EMPATE");
               
               ce=ce+1;
                System.out.println("Contador: ");
                System.out.println("PC= "+ct);
                System.out.println("HUMANO= "+cu);
                
            }else if(rpc.contains("Papel")&&ru1.contains("Papel")){
                System.out.println("EMPATE");
               
               ce=ce+1;
                System.out.println("Contador: ");
                System.out.println("PC= "+ct);
                System.out.println("HUMANO= "+cu);
                
            }else if(rpc.contains("Tijera")&&ru1.contains("Tijera")){
                System.out.println("EMPATE");
               
               ce=ce+1;
                System.out.println("Contador: ");
                System.out.println("PC= "+ct);
                System.out.println("HUMANO= "+cu);
                
            }
            
            


            System.out.println("Desea seguir?");
            su=cap.nextLine();
        }while (!su.contentEquals("basta"));
       
        
        if(ct>cu){
            System.out.println("Gana computadora");
            System.out.println("MARCADOR GANADOR"+ct);
        }else if(cu>ct){
            System.out.println("Gana Usuario");
            System.out.println("MARCADOR GANADOR: "+cu);
        }else{
            System.out.println("Empate");
            System.out.println("MRACADOR FINAL: ");
            System.out.println("MARCADOR USUARIO: "+cu);
            System.out.println("MARCADOR USUARIO: "+ct);
            System.out.println("MARCADOR EMPATES: "+ce);
            
        }
    }
    
}

