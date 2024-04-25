/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paket003;


public class Educativa {
    private String nombre;
    private String tipo;
    private int nAlumnos;
    private int nDocentes;
    private int nSedes;
    private double gastosE;
    private double presupuesto;

    public Educativa(String nombre, String tipo, int numeroAlumnos, 
                     int numeroDocentes, int numeroSedes, 
                     double gastosPorEstudiante) {
        
        this.nombre = nombre;
        this.tipo = tipo;
        this.nAlumnos = numeroAlumnos;
        this.nDocentes = numeroDocentes;
        this.nSedes = numeroSedes;
        this.gastosE = gastosPorEstudiante;
        this.presupuesto = calcularPresupuesto();
    }

    public double calcularPresupuesto() {
        return nAlumnos * gastosE;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumeroAlumnos() {
        return nAlumnos;
    }

    public void setNumeroAlumnos(int numeroAlumnos) {
        this.nAlumnos = numeroAlumnos;
    }

    public int getNumeroDocentes() {
        return nDocentes;
    }

    public void setNumeroDocentes(int numeroDocentes) {
        this.nDocentes = numeroDocentes;
    }

    public int getNumeroSedes() {
        return nSedes;
    }

    public void setNumeroSedes(int numeroSedes) {
        this.nSedes = numeroSedes;
    }

    public double getGastosPorEstudiante() {
        return gastosE;
    }

    public void setGastosPorEstudiante(double gastosPorEstudiante) {
        this.gastosE = gastosPorEstudiante;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }
}
