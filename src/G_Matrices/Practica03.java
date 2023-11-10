/*
    Crear y cargar una matriz de tamaño 3x3, trasponerla y mostarla.
*/
package G_Matrices;

import java.util.Scanner;

public class Practica03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        
        System.out.println("Digite la matriz");
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                System.out.print("Matriz["+i+"]["+j+"]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("\nMatriz Original");
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println("");
        }
        
        // Transponiendo la matriz
        int aux;
        for (int i=0; i<3; i++) {
            for (int j=0; j<i; j++) {
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
            }
        }
        
        System.out.println("\nMatriz Transpuesta");
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                System.out.print(matriz[i][j] +" ");
            }
            System.out.println("");
        }
        
    }
    
}
