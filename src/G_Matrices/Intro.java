/*

*/
package G_Matrices;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Intro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matriz[][],nFilas,nCol;
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de Filas: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de Columnas: "));

        matriz = new int[nFilas][nCol];
        
        System.out.println("Digite la matriz:");
        for (int i=0; i<nFilas; i++) {
            for (int j=0; j<nCol; j++) {
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
       
        for (int i=0; i<nFilas; i++) { // Numero de Filas
            for (int j=0; j<nCol; j++) { // Numero de Columnas
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }
    
}
