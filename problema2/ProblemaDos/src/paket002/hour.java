/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paket002;

public class hour {
    private int hour;
    private int min;
    private int seg;
    private double day;

    public hour(int horas) {
        this.hour = horas;
        calcularEquivalente();
    }

    private void calcularEquivalente() {
        min = hour * 60;
        seg = hour * 3600;
        day =  hour / 24;
    }

    public int getMinutos() {
        return min;
    }

    public int getSegundos() {
        return seg;
    }

    public double getDias() {
        return day;
    }

}
