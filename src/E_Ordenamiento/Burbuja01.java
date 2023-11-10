/*
Ordenamiento: Metodo Burbuja
*/
package E_Ordenamiento;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Burbuja01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arreglo[],nElementos,aux=05;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos: "));
        
        arreglo = new int[nElementos]; // Le asiganamos el numero de elementos al arreglo
        
        for (int i=0; i<nElementos; i++) {
            System.out.print((i+1)+". Digite un numero: ");
            arreglo[i] = sc.nextInt();
        }
        
        // Metodo Burbuja
        for (int i=0; i<(nElementos-1); i++) {
            for (int j=0; j<(nElementos-1); j++) {
                if (arreglo[j]> arreglo[j+1]) {
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
            }
        }
        
        // Mostrando el arreglo ordenado en forma creciente
        System.out.println("\nArreglo ordenado en forma CRECIENTE: ");
        for (int i=0; i<nElementos; i++) {
            System.out.print(arreglo[i]+" - ");
        }
        
        System.out.println("\nArreglo ordenado en forma DECRECIENTE");
        for (int i=(nElementos-1); i>=0; i--) {
            System.out.print(arreglo[i]+" - ");
        }
        
        System.out.println("");
    }
    
}
