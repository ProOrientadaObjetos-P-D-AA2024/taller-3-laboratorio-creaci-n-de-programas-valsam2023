/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problemauno;
import packe2.Terreno;
/**
 *
 * @author Usuario
 */
public class ProblemaUno {

    public static void main(String[] args) {

        //1.Crar un objeto
        Terreno uno = new Terreno();

        //2.Declaracion de variable
        double ancho = 16;
        double largo = 32;
        double valorMetroCuadrado = 150;

        //3.Setear datos en el objeto
        uno.setAncho(ancho);
        uno.setLargo(largo);
        uno.setValorMetroCuadrado(valorMetroCuadrado);
        uno.calarea();
        uno.calCosto();

        //Salida de datos
        System.out.print("    COSTO DE UN TERRENO RECTANGULAR");
        motrarseparador();
        System.out.print("Terreno 1:");
        motrarseparador();
        System.out.println("-Costo del Terreno: " + uno.getCosto_terreno());
        System.out.println("-Ancho: " + uno.getAncho());
        System.out.println("-Largo: " + uno.getLargo());
        System.out.println("-Area: " + uno.getArea());
        System.out.print("-Valor Metro Cuadrado del Terreno: " + uno.getValorMetroCuadrado());
        motrarseparador();

        System.out.println("");

        // CALCULO DEL 2
        //1.Crar un objeto
        Terreno dos = new Terreno();

        //2.Declaracion de variable
        ancho = 18;
        largo = 24;
        valorMetroCuadrado = 180;

        //3.Setear datos en el objeto
        dos.setAncho(ancho);
        dos.setLargo(largo);
        dos.setValorMetroCuadrado(valorMetroCuadrado);
        dos.calarea();
        dos.calCosto();

        //Salida de datos
        motrarseparador();
        System.out.print("Terreno 2: ");
        motrarseparador();
        System.out.println("-Costo del Terreno: " + dos.getCosto_terreno());
        System.out.println("-Ancho: " + dos.getAncho());
        System.out.println("-Largo: " + dos.getLargo());
        System.out.println("-Area: " + dos.getArea());
        System.out.print("-Valor Metro Cuadrado del Terreno: " + dos.getValorMetroCuadrado());
        motrarseparador();

    }

    //Procedimeinto para separador
    public static void motrarseparador() {
        System.out.println("\n**************");
    }
}

