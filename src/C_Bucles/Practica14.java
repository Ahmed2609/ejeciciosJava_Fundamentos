/*
    Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 1_000€
*/
package C_Bucles;

import java.util.Scanner;


public class Practica14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cont=0;
        float sueldo,suma=0;
        
        for (int i=0; i<10; i++) {
            System.out.println((i+1)+". Digite el suldo: ");
            sueldo = sc.nextFloat();
            
            if (sueldo>1_000) { // Si el sueldo supera los 1_000€
                cont++; // Aumentamos uno al contador
            }
            suma=+sueldo; // Suma Iterativa de sueldo 
        }
        
        System.out.println("La suma de todos los sueldos es: "+suma);
        System.out.println("Cantidad de sueldos mayores a 1000: "+cont);
    }
    
}
