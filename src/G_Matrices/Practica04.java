/*
    Crear una matriz de tamaño 7x7 y rellenarla de forma que los elementos de la
    diagonal principal sean 1 y el resto 0
*/
package G_Matrices;

public class Practica04 {

    public static void main(String[] args) {
        int matriz[][] = new int[7][7];
        
        for (int i=0; i<7; i++) {
            for (int j=0; j<7; j++) {
                if (i==j) {
                    matriz[i][j] = 1;
                }else{
                    matriz[i][j] = 0;
                }
            }
        }
        
        // Imprimimoms la matriz
        for (int i=0; i<7; i++) {
            for (int j=0; j<7; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
}
