/*
Ordenamiento: Metodo Seleccion
*/
package E_Ordenamiento;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Seleccion03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arreglo[],nElementos,min,aux;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de Elementos:"));
        
        arreglo = new int[nElementos];
        
        System.out.println("Rellenando el arreglo: ");
        for (int i=0; i<nElementos; i++) {
            System.out.print((i+1)+". Digite un numero: ");
            arreglo[i] = sc.nextInt();
        }
        
        // Ordenamiento por SELECCION
        for (int i=0; i<nElementos; i++) {
            min = i;
            for (int j=i+1; j<nElementos; j++) {
                if (arreglo[j] < arreglo[min]) {
                    min = j;
                }
            }
            aux = arreglo[i];
            arreglo[i] = arreglo[min];
            arreglo[min] = aux;
        }
        
        System.out.println("\nOrden CRECIENTE");
        for (int i=0; i<nElementos; i++) {
            System.out.print(arreglo[i]+" - ");
        }
        
        System.out.println("\nOrden DECRECIENTE");
        for (int i=(nElementos-1); i>=0; i--) {
            System.out.print(arreglo[i]+" - ");
        }
        
    }
    
}
