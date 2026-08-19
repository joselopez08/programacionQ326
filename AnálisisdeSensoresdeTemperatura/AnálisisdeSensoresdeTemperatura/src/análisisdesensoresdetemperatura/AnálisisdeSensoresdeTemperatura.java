/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package análisisdesensoresdetemperatura;

import java.util.Scanner;

/**
 *
 * @author suazo
 */
public class AnálisisdeSensoresdeTemperatura {

    /**
     * @param args the command line arguments
     * 
     * Análisis de Sensores de Temperatura (Uso While)
          Desarrolla un programa que lea repetidamente las temperaturas (en grados centígrados)
          registradas por un sensor industrial. El programa debe detenerse cuando el usuario ingrese el valor
          centinela −999.
           Validación: La temperatura absoluta más baja posible es el cero absoluto (−273.15 °𝐶). Si
           el usuario ingresa un valor menor a este (que no sea el centinela), el programa debe
           mostrar un error usando una estructura if-else y no tomarlo en cuenta para los cálculos.
             Operación: Al finalizar, el programa debe imprimir el promedio de las temperaturas válidas
               ingresadas y la diferencia térmica entre la temperatura más alta y la más baja leída.
* 
* 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner (System.in);
        int numTemperatura =1;
        double temperatura = 0;
        double promedio = 0;
        double maximaTemperatura =0;
        double minimaTemperatura =0; 
        
       
        
        
        while (temperatura != -999) {

            if (temperatura < -273.15) {
                System.out.println("Error Temperatura no Valida");
            }//fin del if
            else {
                System.out.printf("Temperatura %d)Ingrese la Temperatura: ", numTemperatura);
                temperatura = sc.nextDouble();
                numTemperatura++;
            }//fin del else
            
            
        }//findelwhile
        
            promedio = temperatura / numTemperatura;
            System.out.printf("Promedio de Temperatura %.2f: ", promedio);
            
            
        
        
    }//fin del Main
    
}//fin de Class
