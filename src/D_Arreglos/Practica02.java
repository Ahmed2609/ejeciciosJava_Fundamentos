/*
    Leer 5 numeros, guardarlos en un arreglo y mostrarlos en el orden inverso al introducido
*/
package D_Arreglos;

import java.util.Scanner;

public class Practica02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float numeros[] = new float[5];
        
        System.out.println("Guardando los datos del arreglo");
        for (int i=0; i<5; i++) {
            System.out.print((i+1)+". Digite un numero: ");
            numeros[i] = sc.nextFloat();
        }
        
        System.out.println("\nLos elementos del arreglo en orden inverso son: ");
        for (int i=4; i>=0; i--) {
            System.out.println(numeros[i]+" ");
        }
    }
    
}
