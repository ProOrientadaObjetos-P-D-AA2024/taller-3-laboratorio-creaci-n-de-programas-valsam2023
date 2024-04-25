/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problematres;
import paket003.Educativa;

public class ProblemaTres {

    public static void main(String[] args) {
        Educativa tres = new Educativa("APC", "Secundaria", 3000, 100, 1, 200);
        System.out.println("Información de la Institución:");
        System.out.println("-------------------------------");
        System.out.println("Nombre: " + tres.getNombre());
        System.out.println("Tipo: " + tres.getTipo());
        System.out.println("Número de alumnos: " + tres.getNumeroAlumnos());
        System.out.println("Número de docentes: " + tres.getNumeroDocentes());
        System.out.println("Número de sedes: " + tres.getNumeroSedes());
        System.out.println("Gastos proyectados por estudiante: " + tres.getGastosPorEstudiante());
        System.out.println("Presupuesto: " + tres.getPresupuesto());
    }
    
}
