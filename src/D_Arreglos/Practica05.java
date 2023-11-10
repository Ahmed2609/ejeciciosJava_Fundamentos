/*
    Leer por teclado dos tablas de 10 numeros enteros y mezclarlas en una tercera de la forma:
    el 1º de A, el 1º de B, el 2º de A, el 2º de B, etc.
*/
package D_Arreglos;

import java.util.Scanner;

public class Practica05 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[],b[],c[];
        
        a = new int[10];
        b = new int[10];
        c = new int[20];
        
        // Pedimos el arreglo a;
        System.out.println("Digite el PRIMER arreglo ");
        for (int i=0; i<10; i++) {
            System.out.print((i+1)+". Digite un numero: ");
            a[i] = sc.nextInt();
        }
        // Pedimos el arreglo b
        System.out.println("\nDigite el SEGUNDO arreglo ");
        for (int i=0; i<10; i++) {
            System.out.print((i+1)+". Digite un numero: ");
            b[i] = sc.nextInt();
        }
        
        // Imprimimos el arreglo c
        System.out.println("");
        int j=0;
        for (int i=0; i<10; i++) {
            System.out.print(c[j] = a[i]);
            System.out.print(" ");
            j++;
            System.out.print(c[j] = b[i]);
            System.out.print(" ");
            j++;
        }
        System.out.println("");
        
    }
    
}
