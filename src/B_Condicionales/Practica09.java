/* 
    Pedir el dia, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo
    que todos los meses son de 30 dias.
*/
package B_Condicionales;

import java.util.Scanner;

public class Practica09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia,mes,year;
        
        System.out.print("Digite el dia(1-30): ");
        dia = sc.nextInt();
        System.out.print("Digite el mes(1-12): ");
        mes = sc.nextInt();
        System.out.print("Digite el año: ");
        year = sc.nextInt();
        
        if(dia>0 && dia<=30){
            if(mes>0 && mes<=12){
                if(year!=0){
                    System.out.println("La fecha es CORRECTA");
                }
            }
        }else{
            System.out.println("La fecha es INCORRECTA");
        }
        
    }
    
}
