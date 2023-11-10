/*
    Leer numeros hasta que se introduzca un 0. 
    Para cada uno indicar si es par o impar.
*/
package C_Bucles;

import java.util.Scanner;

public class Practica03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Digite un numero(0. Salir): ");
        num = sc.nextInt();
        
        
        while(num!=0){
            if(num%2==0){
                System.out.println(num+" es PAR");
            }else{
                System.out.println(num+" es IMPAR");
            }
            
            System.out.print("Digite otro numero: ");
            num = sc.nextInt();
        }
        
    }
    
}
