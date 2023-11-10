/*
    Leer un numero e indicar si es positivo o negativo. 
    El proceso se repetira hasta que se introduzca un 0
*/
package C_Bucles;

import java.util.Scanner;

public class Practica02 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.print("Digite un numero(0. Salir): ");
        num = sc.nextInt();
        
        while (num!=0) {            
            if(num>0){
                System.out.println(num+" es POSITIVO");
            }else{
                System.out.println(num+" es NEGATIVO");
            }
            
            System.out.print("Digite otro numero: ");
            num = sc.nextInt();
        }
        
    }
    
}
