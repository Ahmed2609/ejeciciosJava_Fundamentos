/*
    Pedir 10 numeros y escribir la suma total
*/
package C_Bucles;

import java.util.Scanner;

public class Practica10 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num,suma=0;
        
        for(int i=0; i<10; i++){
            System.out.print("Digite un numero: ");
            num = sc.nextInt();
            suma+=num;
        }
        System.out.println("La SUMA es de: "+suma);
    }
    
}
