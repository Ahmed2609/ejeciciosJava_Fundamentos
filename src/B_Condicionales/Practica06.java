/*
    Hacer un programa que tome dos numeros y diga si ambos son pares o impares
*/
package B_Condicionales;

import java.util.Scanner;

public class Practica06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        
        System.out.print("Digite DOS numeros: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        
        if(num1%2==0 && num2%2==0){
            System.out.println("Ambos son PARES");
        }else if(num1%2!=0 && num2%2!=0){
            System.out.println("Ambos son IMPARES");
        }else{
            System.out.println("Uno es PAR y el otro es IMPAR");
        }
        
    }
    
}
