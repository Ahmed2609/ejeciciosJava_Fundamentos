/*
    Pedir numeros hasta que se teclee un 0, mostar la suma de todos los numeros introducidos.
*/
package C_Bucles;

import java.util.Scanner;

public class Practica06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num,suma=0;
        
        do{
            System.out.print("Digite un numero(0. Salir): ");
            num = sc.nextInt();
            
            suma+=num;
        }while(num!=0);
        
        System.out.println("La SUMA de todos los numeros digitados es: "+suma);
    }
    
}
