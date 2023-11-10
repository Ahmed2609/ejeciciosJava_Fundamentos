/*
    Pedir un numero N, y mostrar todos los numeros del 1 al N
*/
package C_Bucles;

import java.util.Scanner;

public class Practica08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,i;
        
        System.out.print("Digite un numero: ");
        num = sc.nextInt();
        
        i=1;
        while (i<= num) {            
            System.out.println(i);
            i++;
        }
    }
    
}
