/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paket004;

public class celulares {
    private String sistemaO;
    private double pantalla;
    private double costoInicial;
    private double piva;
    private String direccion;
    private String imei;
    
    public celulares(String sistemaOperativo, double tamañoPantalla, 
                    double costoInicial, double ivaPorcentaje, 
                    String direccionMAC, String imei) {
        
        this.sistemaO = sistemaOperativo;
        this.pantalla = tamañoPantalla;
        this.costoInicial = costoInicial;
        this.piva = ivaPorcentaje;
        this.direccion = direccionMAC;
        this.imei = imei;
    }

    public double calcularCostoFinal() {
        double iva = costoInicial * (piva / 100);
        return costoInicial + iva;
    }

    // Getters y setters

    public String getSistemaOperativo() {
        return sistemaO;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaO = sistemaOperativo;
    }

    public double getTamañoPantalla() {
        return pantalla;
    }

    public void setTamañoPantalla(double tamañoPantalla) {
        this.pantalla = tamañoPantalla;
    }

    public double getCostoInicial() {
        return costoInicial;
    }

    public void setCostoInicial(double costoInicial) {
        this.costoInicial = costoInicial;
    }

    public double getIvaPorcentaje() {
        return piva;
    }

    public void setIvaPorcentaje(double ivaPorcentaje) {
        this.piva = ivaPorcentaje;
    }

    public String getDireccionMAC() {
        return direccion;
    }

    public void setDireccionMAC(String direccionMAC) {
        this.direccion = direccionMAC;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }
}