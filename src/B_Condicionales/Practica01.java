/*
    Hacer un programa que lea un numero entero y muestre si el numero es multiplo de 10
*/
package B_Condicionales;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Practica01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.print("Digite un numero: ");
        num = sc.nextInt();
        
        if(num%10==0){
            System.out.println(num+" es multiplo de 10");
        }else{
            System.out.println("NO es multiplo de 10");
        }
        
    }
    
}
