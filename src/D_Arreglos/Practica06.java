/*
    Leer los datos correspondiente a dos tablas de 12 elementos numericos, y 
    mezclarlos en una tercera de la forma: 3 de la tabla A, 3 de la tabla B,
    otros 3 de la A, otros 3 de la B, etc.
*/
package D_Arreglos;

import java.util.Scanner;

public class Practica06 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[],b[],c[];
        int i,j;
        
        a = new int[12]; // Arreglo a[] va a tener 12 elementos
        b = new int[12];
        c = new int[24]; // Arreglo c[] va almacenar a a[] y b[]
        
        // Pedimos el arreglo a[]
        System.out.println("Digite el PRIMER arreglo");
        for (i=0; i<12; i++) {
            System.out.print((i+1)+". Digite un numero: ");
            a[i] = sc.nextInt();
        }
        // Pedimo sel arreglo b[]
        System.out.println("\nDigite el SEGUNDO arreglo");
        for (i=0; i<12; i++) {
            System.out.print((i+1)+". Digite un numero: ");
            b[i] = sc.nextInt();
        }
        
        // Ahora vamos a mezclar los arreglos a[] y b[]
        // El iterador i sera para los arrelgos a[] y b[]
        // y el iterador j sera para el arreglo c[]
        
        // Imprimimos el arreglo c[]
        
        i=0;
        j=0;
        
        while(i<12){
            // Copiar los 3 elementos de a[]
            for (int k=0; k<3; k++) {
                c[j] = a[i+k];
                j++;
            }
            
            // Ahora, copiamos 3 elementos de b[]
            for (int k=0; k<3; k++) {
                c[j] = b[i+k];
                j++;
            }
            
            i+=3;
        }
        
        System.out.println("El arreglo resultante es: ");
        for (i=0; i<24; i++) {
            System.out.print(c[i]+" - ");
        }
        System.out.println("");
    }
    
}
