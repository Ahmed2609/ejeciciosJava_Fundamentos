/*
    Construir un programa que simule el funcionamiento de una calculadora que puede realizar
    4 operaciones aritmeticas basicas(suma,resta,producto y division) con valores numericos enteros.
    El usuario debe especificar la operacion con el primer caracter del primer parametro
    de la linea de comandos: S o s para la suma, R o r para la resta, P o P para el producto y
    D o d para la division.
*/
package B_Condicionales;

import java.util.Scanner;

public class Practica11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int suma,resta,producto,division,num1,num2;
        char opcion;
        
        System.out.println("S-s: Sumar\nR-r: Restar\nP-p: Producto\nD-d: Division");
        System.out.print("Digite un valor segun las letras: ");
        opcion = sc.next().charAt(0);
        
        switch (opcion) {
            case 'S','s':
                System.out.println("Digite 2 numeros: ");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                
                System.out.print("La SUMA es de: "+ (num1+num2));
                break;
            case 'R','r':
                System.out.print("Digite 2 numeros: ");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                
                System.out.print("La RESTA es de: "+ (num1-num2));
                break;
            case 'P','p':
                System.out.print("Digite 2 numeros: ");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                
                System.out.print("La PRODUCTO es de: "+ (num1*num2));
                break;
            case 'D','d':
                System.out.print("Digite 2 numeros: ");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                
                System.out.println("La SUMA es de: "+ (num1/num2));
                break;
            default:
                System.out.println("Opcion no disponible");
        }
    }
    
}
