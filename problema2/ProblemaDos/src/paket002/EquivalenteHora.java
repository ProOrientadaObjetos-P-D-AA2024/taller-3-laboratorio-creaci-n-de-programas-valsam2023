/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paket002;

public class EquivalenteHora {
    //Atributos
    private int houra;
    private int min;
    private int seg;
    private double day;
    
    //Metodos
    //Horas
    public int getHoura() {
        return houra;
    }

    public void setHoura(int houra) {
        this.houra = houra;
    }
    //Minutos
    public int getMin() {
        return min;
    }

    public void calmin() {
        min=houra*60;
    }
    //Segundos
    public int getSeg() {
        return seg;
    }

    public void calseg() {
        seg=houra*3600;
    }
    //Dias
    public double getDay() {
        return day;
    }

    public void caldia() {
        day=houra/24;
    }
}
