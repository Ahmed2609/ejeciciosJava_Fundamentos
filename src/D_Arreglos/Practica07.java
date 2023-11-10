/*
    Leer por teclado una serie de 10 numeros enteros. La aplicacion debe indicarnos
    si los numeros estan ordenados de forma creciente, decreciente, o si estan desordenados;
*/
package D_Arreglos;

import java.util.Scanner;

public class Practica07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arreglo[] = new int[10];
        boolean creciente=false,decreciente=false;
        int comprobador=0;
        
        System.out.println("Llenar el arreglo");
        for (int i=0; i<10; i++) {
            System.out.print((i+1)+". Digite un numero: ");
            arreglo[i] = sc.nextInt();                    
        }
        
        for (int i=0; i<9; i++) {
            if (arreglo[i]<arreglo[i+1]) { // Creciente: 1-2-3-4-5...
                creciente=true;
            }
            if(arreglo[i]>arreglo[i+1]){ // Decreciente: 5-4-3-2-1...
                decreciente=true;
            }
        }
        
        if (creciente==true && decreciente==false) {
            System.out.println("\nEl arreglo esta en forma CRECIENTE");
        }else if (decreciente==true && creciente==false) {
            System.out.println("\nEl arreglo esta en forma DECRECIENTE");
        }else if (decreciente==true && creciente==true) {
            System.out.println("\nEl arreglo esta DESORDENADO");
        }else if (decreciente==false && creciente==false) {
            System.out.println("\nTODOS los numeros del arreglo son IGUALES");
        }
        
    }
    
}
