/*
    Hacer un programa que calcule el cuadrado de una suma
        (a+b)^2 = a^2+b^2 +2*a*b
*/
package A_Operadores;

import java.util.Scanner;

public class Practica06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        double numA,numB,resultado;
        
        System.out.print("Digite el numero A: ");
        numA = sc.nextFloat();
        System.out.print("Digite el numero B: ");
        numB = sc.nextFloat();
        
        resultado = Math.pow(numA, 2) + Math.pow(numB, 2) + (2*numA*numB);
        
        System.out.println("\nEl resultado es: "+resultado);
    }
    
}
