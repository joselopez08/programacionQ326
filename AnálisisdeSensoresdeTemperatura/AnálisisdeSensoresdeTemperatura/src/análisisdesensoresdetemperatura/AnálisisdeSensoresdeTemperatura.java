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
        int numTemperatura =0;
        double temperatura = 0;
        double promedio = 0;
        double maximaTemperatura =-273.15;
        double minimaTemperatura =0; 
        double sumaAcumulada = 0;
        double diferenciaTermica = 0;
        
        System.out.println("-----------------------------");
        System.out.println("Programa de Sensor Industrial");
        System.out.println("-----------------------------");
        System.out.println("");
        
        System.out.println("Ingrese la Temperatura en Centigrados: ");
        temperatura = sc.nextDouble(); 
     
        while (temperatura != -999){
            
            if (temperatura >= -273.15){
                
                if (numTemperatura == 0 ){
                    maximaTemperatura = temperatura;
                    minimaTemperatura = temperatura;
                }//fin de if
                
                else {
                    if (temperatura > maximaTemperatura){
                        maximaTemperatura = temperatura;
                    }//fin de if
                       if (temperatura < minimaTemperatura){
                           minimaTemperatura = temperatura;
                       }//fin de if
                     
                }//fin de else
                    sumaAcumulada = sumaAcumulada + temperatura;
                    numTemperatura = numTemperatura + 1;
                    
            }//fin de if
            else {
                 System.out.println(" Alerta!!!! Dato no valdio........ "); 
            }//fin de else
            System.out.println("Ingrese la Temperatura en Centigrados: ");
                    temperatura = sc.nextDouble();
            
                    
        }//fin del while
       
        if (numTemperatura > 0){
            promedio = sumaAcumulada / numTemperatura;
            diferenciaTermica = maximaTemperatura - minimaTemperatura;
            System.out.printf("Promedio de Temperatura: %.2f\n ",promedio);
            System.out.printf("Diferencia Termica: %.2f",diferenciaTermica);
            
        }//fin de if
        else {
            System.out.println("No hay temperaturas ingresadas!!!!!!");
        }//fin de else
        

        
        
                  
    }//fin de main 
}//fin de Class
