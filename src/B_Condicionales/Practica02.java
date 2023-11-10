/*
    Pedir dos numeros enteros y decir cual es el mayor o si son iguales.
*/
package B_Condicionales;

import java.util.Scanner;

public class Practica02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1,num2;
        
        System.out.print("Digite 2 numeros: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        
        if (num1>num2){
            System.out.println(num1+" es mayor que "+num2);
        }else if(num1<num2){
            System.out.println(num2+" es mayor que "+num1);
        }else{
            System.out.println("Son IGUALES");
        }
        
    }    
}
