/*
Ordenamiento: Metodo Insercion
*/
package E_Ordenamiento;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Insercion02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arreglo[],nElementos,pos,aux;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de elementos: "));
        
        arreglo = new int[nElementos];
        
        System.out.println("Digite el Arreglo:");
        for (int i=0; i<nElementos; i++) {
            System.out.print((i+1)+". Digite un numero: ");
            arreglo[i] = sc.nextInt();
        }
        
        // Ordenamiento por INSERCION
        for (int i=0; i<nElementos; i++) {
            pos = i;
            aux = arreglo[i];
            
            while((pos>0) && (arreglo[pos-1] > aux)){
                arreglo[pos] = arreglo[pos-1];
                pos--;
            }
            arreglo[pos] = aux;
                    
        }
        
        System.out.println("\nOrdne Ascendente:");
        for (int i=0; i<nElementos; i++) {
            System.out.print(arreglo[i]+" - ");
        }
        
        System.out.println("\nOrden Descendente:");
        for (int i=(nElementos-1); i>=0; i--) {
            System.out.print(arreglo[i]+" - ");
        }
        
        System.out.println("");
    }
    
}
