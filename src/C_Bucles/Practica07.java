/*
    Pedir numeros hasta que se introduzca uno negativo, y calcular la media.
*/
package C_Bucles;

import java.util.Scanner;

public class Practica07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num,cont=0,suma=0;
        
        do{
            System.out.print("Digite un numero: ");
            num = sc.nextInt();
            
            suma+=num;
            cont++;
        }while(num>0);
        
        System.out.println("La media de los numeros introducidos es de: "+ (suma)/(cont-1));
    }
    
}
