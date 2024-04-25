/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problemados;
import java.util.Scanner;
import paket002.hour;
public class ProblemaDos {
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       //Declaracion de variable
       int houra;
       
       //1.Crar un objeto
       hour uno = new hour();
       
       //2.Entrada de datos
       System.out.print("CALCULAR HORAS,MINUTOS,SEGUNDOS,DIAS");
       
       motrarseparador();
   
       System.out.print("\n-Ingrese la cantidad de horas: ");
       houra = sc.nextInt();
       motrarseparador();
       System.out.print("Cálculo: ");
       motrarseparador();

       //3.setear datos en el objeto
       uno.setHoura(houra);
       uno.calmin();
       uno.calseg();
       uno.caldia();

       
       //Salida de datos
       System.out.println("En horas: "+uno.getHoura());
       System.out.println("En minutos: "+uno.getMin());
       System.out.println("En segundos: "+uno.getSeg());
       System.out.println("En dias: "+uno.getDay());

    }
    
    //Procedimeinto para separador
    public static void motrarseparador() {
    System.out.println("\n**************");
    }
}
