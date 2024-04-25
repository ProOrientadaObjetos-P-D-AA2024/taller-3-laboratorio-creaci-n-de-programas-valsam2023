/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packe2;

public class Terreno {
    //Atributos

    private double costo_terreno;
    private double ancho;
    private double largo;
    private double area;
    private double valorMetroCuadrado;

    //Metodos
    //Costo Terreno
    public double getCosto_terreno() {
        return costo_terreno;
    }

    public void calCosto() {
        costo_terreno = valorMetroCuadrado * area;
    }

    //Ancho
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    //Largo
    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    //Area
    public double getArea() {
        return area;
    }

    public void calarea() {
        area = largo * ancho;
    }

    //Valor Metro Cuadrado
    public double getValorMetroCuadrado() {
        return valorMetroCuadrado;
    }

    public void setValorMetroCuadrado(double valorMetroCuadrado) {
        this.valorMetroCuadrado = valorMetroCuadrado;
    }
}
