/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemadeaprobacióndemateria;

import java.util.Scanner;

/**
 *
 * @author suazo
 */
public class SistemadeAprobacióndeMateria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        /** Sistema de Aprobación de Materia
        Se tiene que escribir un programa que solicite al usuario el nombre del estudiante (tipo string) y las
        obtenidas en dos exámenes parciales (tipo double). El programa debe calcular el
        promedio final. Si el promedio es mayor o igual a 65.0, debe mostrar un mensaje indicando que el
        está "Aprobado". De lo contrario, debe mostrar "Reprobado".
        Requisito estricto: Solo puedes usar una estructura if/else simple*/
        
       Scanner entrada = new Scanner(System.in);
       
       String nombreAlumno = "A";
       double examenParcial1 = 0;
       double examenParcial2 = 0; 
       double promedioFinal = 0;
       
       
        System.out.println("Ingrese el nombre del Alumno: ");
        nombreAlumno = entrada.nextLine();
        
        System.out.println("Ingrese la Nota del Primer examen: ");
        examenParcial1 = entrada.nextDouble();
        
        System.out.println("Ingrese la Nota del Segundo examen: ");
        examenParcial2 = entrada.nextDouble();
        
        promedioFinal = (examenParcial1 + examenParcial2 ) /2;
        
        if (promedioFinal >= 65.0){
            System.out.printf("Su Promedio Final es: %s ",promedioFinal);
            System.out.println("Aprobado");
        }
        else {
            System.out.printf("Su Promedio Final es: %s ",promedioFinal);
            System.out.println("Reprobado");
        }
    }//FindeMain
    
}//FindeClass
