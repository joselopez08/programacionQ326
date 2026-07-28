/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversiones;

import java.util.Scanner;

/**
 *
 * @author suazo
 */
public class Conversiones {

    
    
    /**
     * @param args the command line arguments
     * Objetivos
     * 1. Orden Secuencial de las Instrucciones
     * 2. Capturar Datos desde Teclado
     * 3. Operaciones Aritmeticas
     * 
     * Desarollar un algoritmo que me permita convertir los siguientes Elementos:
     * 1. Pulgas a centimetros
     * 2. Kilometros a Millas
     * 3. Grados Fahrenheit a grados Celsius
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner teclado = new Scanner(System.in);
        
        //Declarar Variables
        
        int pulgadas = 0;
        double resultadoCM = 0;
        
        double kilometros = 0;
        double millas = 0;
        
        double fahrenheit = 0;
        double gradoscelsius = 0;
        
        pulgadas = 10; //Los datos van de derecha a izquierda -> =
        resultadoCM = pulgadas * 2.54;
        System.out.printf("%d pulgadas es igual a %.2f cm",pulgadas,resultadoCM);
        
        pulgadas = 35;
        resultadoCM = pulgadas * 2.54;
        System.out.printf("\n%.2f cm es igual a %d pulgadas", resultadoCM, pulgadas);
        
        System.out.println("");
        System.out.println("Cuantos kilometros hay de TGU-SPS?");
        kilometros = teclado.nextDouble();
        millas = kilometros /1.6;
        System.out.printf("%.2f km es igual a %.2f millas ",kilometros,millas);
        System.out.println("");

        System.out.println("Cual es la temperatura que tenemos hoy?");
        fahrenheit = teclado.nextDouble();
        gradoscelsius = (fahrenheit - 32) * 5/9;
        System.out.printf("%.2f fahrenheit equivale a %.2f grados celsius",fahrenheit,gradoscelsius);
        
        
        
        
        
        
    }//Fin de Main
    
}//Fin Class Conversiones
