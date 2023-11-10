/*
    Pedir el dia, mes y año de una fecha e indicar si la fecha es correcta.
    con meses de 28, 30 y 31 dias. Sin años bisiestos
*/
package B_Condicionales;

import java.util.Scanner;


public class Practica10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int dia,mes,year;
        
        System.out.print("Digite el dia(1-31): ");
        dia = sc.nextInt();
        System.out.print("Digite el mes(1-12): ");
        mes = sc.nextInt();
        System.out.print("Digite el año: ");
        year = sc.nextInt();
        
        if(year == 0){
            System.out.println("Fecha INCORRECTA");
        }else if((mes==2) && (dia>0 && dia<=28)){
            System.out.println("Fecha CORRECTA");
        }else if((mes==4 || mes==6 || mes==9 || mes == 11)&& (dia>0 && dia<=30)){
            System.out.println("Fecha CORRECTA");
        }else if((mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) && (dia>0 && dia<=31) ) {
            System.out.println("Fecha CORRECTA");
        }else{
            System.out.println("Fecha INCORRECTA");
        }
        
        
        
        
        
        
    }
    
}
