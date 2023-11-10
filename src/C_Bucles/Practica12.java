/*
    Pedir un numero y calcular su factorial
*/
package C_Bucles;

import java.util.Scanner;

public class Practica12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        long factorial=1;
        
        System.out.print("Digite un numero: ");
        num = sc.nextInt();
        
        for (int i=1; i<=num; i++) {
            factorial *=i;
        }
        
        System.out.println("El Factorial de "+num+"! es: "+factorial);
        
    }
    
}
