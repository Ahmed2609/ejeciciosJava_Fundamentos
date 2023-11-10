/*
    Guillermo tiene N dolares. Luis tiene la mitad de lo que posee Guillermo
    Juan tiene la mitad de lo que poseen Luis y Guillermo juntos. 
    Hacer un programa que calcule e imprima la cantidad de dinero que tienen entre los 3
*/
package A_Operadores;

import java.util.Scanner;

public class Practica03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int guillermo,luis,juan;
        
        System.out.print("Digite la cantidad de Guillermo: ");
        guillermo = sc.nextInt();
        
        luis = guillermo /2;
        juan = (guillermo+luis)/2;
        
        System.out.println("Entre los 3 tienen: "+(guillermo+luis+juan));
    }
    
}
