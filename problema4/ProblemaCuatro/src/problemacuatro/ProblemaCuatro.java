/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problemacuatro;
import paket004.celulares;

public class ProblemaCuatro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        celulares uno = new celulares("Android", 5.4, 530, 16, "00:1B:44:11:3A:B7", 
                                      "123456789087654");
        
        double costoFinal = uno.calcularCostoFinal();
        
        System.out.println("CARACTERISTICAS EQUIPO CELULAR");
        System.out.println("-------------------------------");
        System.out.println("Sistema operativo: "+uno.getSistemaOperativo());
        System.out.println("Tamaño de pantalla: "+uno.getTamañoPantalla());
        System.out.println("Costo inicial: "+uno.getCostoInicial());
        System.out.println("Porcentaje de IVA: "+uno.getIvaPorcentaje());
        System.out.println("Dirección MAC: "+uno.getDireccionMAC());
        System.out.println("Información IMEI: "+uno.getImei());
    }
    
}
