/*
    Leer 5 numeros, guardarlos en un arreglo y mostrarlos en el mismo orden introducido
*/
package D_Arreglos;

import java.util.Scanner;

public class Practica01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numeros[] = new int[5];
        
        System.out.println("Guardando los datos en el arreglo");
        for (int i=0; i<5; i++) {
            System.out.print((i+1)+". Digte un numero: ");
            numeros[i] = sc.nextInt();
        }
        
        System.out.println("\nImprimiendo los numeros digitados:");
        for(int i:numeros){
            System.out.println(i);
        }        
    }
    
}
