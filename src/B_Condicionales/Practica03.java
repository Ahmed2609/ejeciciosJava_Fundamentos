/*
    Hacer un programa que lea un caracter por teclado y compruebe si es una letra mayuscula
*/
package B_Condicionales;

import java.util.Scanner;

public class Practica03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char letra;
        
        System.out.print("Digite una Letra: ");
        letra = sc.nextLine().charAt(0);
        
        if (Character.isUpperCase(letra)) {
            System.out.println("Esta en MAYUSCULAS");            
        }else{
            System.out.println("Esta en MINUSCULAS");
        }
    }
    
}
