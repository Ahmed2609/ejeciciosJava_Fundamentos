/*
    Pedir un numero entre 0 y 99_999 y decir cuantas cifras tiene.
*/
package B_Condicionales;

import java.util.Scanner;

public class Practica08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.print("Digite un numero(0 - 99.999): ");
        num = sc.nextInt();
        
        if (num<10) {
            System.out.println("Tiene 1 cifra");
        } else if(num>=10 && num<100) {
            System.out.println("Tiene 2 cifras");
        }else if(num>=100 && num<1_000){
            System.out.println("Tiene 3 cifras");
        }else if(num>=1_000 && num<100_000){
            System.out.println("Tiene 4 cifras");
        }
        
        
        
    }
    
}
