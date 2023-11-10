/*
    Diseñar una aplicacion que declare una tabla de 10 elementos enteros. 
    Leer mediante el teclado 8 numeros. 
    Despues se debe pedir un numero y una posicion, insertarlo en la posicion indicada,
    desplazando los que esten detras.
*/
package D_Arreglos;

import java.util.Scanner;

public class Practica08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arreglo[] = new int[10]; // Creamos el arreglo de 10 elementos enteros
        int numero,posicion;
        
        System.out.println("Llenamos el arreglo");
        for (int i=0; i<8; i++) {
            System.out.print((i+1)+". Digite un numero: ");
            arreglo[i] = sc.nextInt();
        }
        
        System.out.print("\nDigite un numero: ");
        numero = sc.nextInt();
        System.out.print("Digite una posicion: ");
        posicion = sc.nextInt();
        
        // Correr una posicion los elementos detras de la posicion que el usuario quiere
        for (int i=7; i>=posicion; i--) { // 1-2-3-numero-4-5-6
            arreglo[i+1] = arreglo[i];
        }
        
        arreglo[posicion] = numero; // Insertamos el numero en la posicioin requerida
        
        for (int i=0; i<9; i++) {
            System.out.println("Posicion "+i+": "+arreglo[i]);
        }
        
    }
    
    
    
    
}
