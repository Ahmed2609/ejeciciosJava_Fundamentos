/*
    Leer 10 numeros enteros, guardarlos en un arreglo. Debemos mostrarlos en el siguente
orden: el primero, el ultimo, el segundo, el penultimo,el tercero, etc
*/
package D_Arreglos;

import java.util.Scanner;

public class Practica04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numeros[] = new int[10];
        int cambio[] = new int[10];
        
        for (int i=0; i<10; i++) {
            System.out.print((i+1)+". Digite un numero: ");
            numeros[i] = sc.nextInt();
        }
        
        for (int i=0; i<5; i++) {
            System.out.print(numeros[i]+" "); // primer,segundo
            System.out.print(numeros[9-i]+" "); // ultimo,penultimo
        }
        
    }
    
}
