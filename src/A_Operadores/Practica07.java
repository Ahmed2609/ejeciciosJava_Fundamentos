/*
    Construir un programa que, dado un numero total de horas, devuelve el numero de semanas,dias y horas equivalentes.
    Por ejemplo, dado un total de 1_000 horas debe mostrar 5 semanas, 6 dias y 16 horas.
*/
package A_Operadores;

import java.util.Scanner;

public class Practica07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        int totalHoras,dias,semana;
        
        System.out.print("Digite el total de horas: ");
        totalHoras = sc.nextInt(); 
        
        semana = totalHoras /168;
        dias = totalHoras%semana;
        System.out.println(dias);        
        
    }
    
}
