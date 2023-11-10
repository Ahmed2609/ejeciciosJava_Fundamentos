/*
    Pedir numeros hasta que se teclee uno negativo, y mostrar cuantos numeros se han introducido
*/
package C_Bucles;

import java.util.Scanner;

public class Practica04 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,cont=0;
        
        System.out.print("Digite un numero(Negativo = Salir): ");
        num = sc.nextInt();
        
        while(num>0){
            cont++;
            System.out.print("Digite otro numero: ");
            num = sc.nextInt();
        }
        
        System.out.println("Se ha digitado: "+cont);
    }
    
}
