/*
    Leer un numero y mostrar su cuadrado, repetir el proceso hasta que se introduzca 
    un numero negativo.
*/
package C_Bucles;

import java.util.Scanner;

public class Practica01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num;
        
        System.out.print("Digite un numero: ");
        num = sc.nextInt();
            
        while (num>0){
            System.out.println("El numero "+num+" elevado al cuadrado es: " + (int)Math.pow(num,2));
        
            System.out.print("Digite otro numero: ");
            num= sc.nextInt();
        }
        
    }
    
}
