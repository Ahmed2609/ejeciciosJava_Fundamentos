/*
    Diseñar un programa que muestre el producto de los 10 primeros numeros impares.
*/
package C_Bucles;

import java.util.Scanner;

public class Practica11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num,producto=1;
        
        for(int i=1; i<20; i+=2){
            producto*=i;
        }
        System.out.println(producto);
    }
    
}
