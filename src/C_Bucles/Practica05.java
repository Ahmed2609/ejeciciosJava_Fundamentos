/*
    Realizar un juego para adivinar un numero. Para ello genera un numero aleatorio entre 0-100,
    y luego ir pidiendo numeros indicando "es mayor" o "es menor" segun sea mayor o menor
    con respecto a N. 
    El proceso termina cuadno el usuario acierta y mostrar el numero de intentos
*/
package C_Bucles;

import java.util.Scanner;

public class Practica05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num,cont=0;
        int aleatorio;
        
        aleatorio = (int)(Math.random()*100);
        System.out.println(aleatorio);
        
        System.out.print("Adivina el numero en el que estoy pensando: ");
        num = sc.nextInt();
        
        while(num!=aleatorio){
            cont++;
            if(num<aleatorio){
                System.out.println("PiSTA: es MAYOR");
            }else{
                System.out.println("PISTA: es MENOR");
            }
            System.out.print("Digite otro numero: ");
            num = sc.nextInt();
            
        }
        System.out.println("Enhorabuena!! acertasta el numero --> "+aleatorio);
        System.out.println("Lo acertaste en el intento "+cont);
        
    }
    
}
