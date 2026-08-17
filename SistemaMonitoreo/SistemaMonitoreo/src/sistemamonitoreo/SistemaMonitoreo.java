/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemamonitoreo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author suazo
 * 
 * Desarrolla un programa en Java que simule la lectura de sensores de temperatura
 * en cuarto de servidores. El programa debe solicitar: 
 * El nombre del operador encargado y cuantas lecturas de sensores se van a simular. 
 * Debe validar que la cantidad de lecturas sea mayor a 0 y menor o igual a 50. Por cada
 * lectura, el sistema generará una temperatura aleatoria en grados Celsius. El programa
 * debe de converitr cada lectura a Fahrenheit, determinar si hay una alerta de sobrecalentamiento y 
 * al final mostrar un resumen estadístico. 
 * 
 */

/*
   1. Comprender el problema que se esta abordando
      a. Que datos de Entrada necesito? 
      b. Transformacion / Calculos Necesarios 
      c. Que resultados se presentan?

   2. Visualizacion/Diseño de la Solucion
      a. Diaframa de flujo 
      b. Pseudocodigo 

   3. Programacion Incremental 
     a. LIstados de Tareas
      i. Declaracion de variable
      ii. Estructura de Seleccion
      iii. Ciclos de Repeticion
      iv. Validaciones de Datos
     b. Validacion

   4. Pruebas de Escritorio 
     a. Casos
     b. Escenarios
     c. Resultados/Patrones Definidos

*/

public class SistemaMonitoreo {

    /*
     Lista de Entrada: 
      1. Entrada: 
                  Nombre de Usuario
                  Numero de Lecturas
                  Ingreso de Temperaturas
      2. Calculos/Transformacion 
                                 Formula de Celsius - Farenheit
                                 Definicion de Sobrecalentamiento 
                                 Validacion Lecturas (0 > lectura menor 50) 
                                 Promedias el monitoreo
                                 Validacion Temperatura
      3. Salida
                Resumen Estadistico
                Alerta de Sobrecalentamiento 
    
    Lista de Tareas
     1. Capturar el nombre del usuario
       a. definicion de Libreria/Instancia SCANNER
       b. Declaracion de Variable para el usuario
     2. Captura de numero de Lecturas
       a. Declaracion de Variable para numero de lectura
     3. Generacion de Temperatura
       a. Definicion de libreria Random 
       b. Declaracion de Variable
       c. Mostrar el numero Random Generado Temporalmente
       d. Rango de Tempo 200 - 500
       e. Ciclo de Repeticion, WHILE
    4. Formula F = (C * 9/5) + 32
    5. Limite de Sobrecalentamiento 350 C (662F)
       Estrucutra de Seleccion (IF/ELSE)
    6. Validacion de Lecturas (DO WHILE)
    7. Sumas lo numeros de Sobrecalentamiento
    8. Calcular el promedio
    9. Mostrar el resumen: 
       Promedio
       # de sobrecalentamienti
    10. Generar una Alerta de Sobrecalentamiento
    

    */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner sc = new Scanner (System.in);
        Random rd = new Random();
        
        String nombreUsuario = "John Doe";
        int numLectura = 0;
        int ciclo = 0;
        double tempC = 0;
        double tempF = 0;
        int numSobreCalentamiento = 0;
        double promedio = 0; 
        double acumTEMP = 0;

        System.out.println("Nombre de Operacion: ");
        nombreUsuario = sc.nextLine().toUpperCase();
        System.out.printf("Validar Captura: %s\n",nombreUsuario);
        
        do {
            System.out.println("Numero de Lecturas: ");
            numLectura = sc.nextInt();
            //System.out.printf("Validacion de Cpatura: %d\n", numLectura);
       // if (!(numLectura >0 && numLectura < 50)){
       if (numLectura < 0 || numLectura >50){
            System.out.println("Valor no Valido");
            System.out.println("Tiene que ser entre 0 y 50");
        }//fin de if
        //}while(!(numLectura > 0 && numLectura < 50));
        }while (numLectura < 0 || numLectura > 50);
        while (ciclo < numLectura){
            
            tempC = rd.nextDouble(200, 500);
            tempF = (tempC * 9/5) + 32;
            //tempC = (Math.random()*400) - 300 + 200;//opcion b
            //System.out.printf("Validacion Random :%.2f\n", tempC);
            System.out.printf("Num Lec: %d\tTemp C. %.2f \n",ciclo+1,tempC);
            System.out.printf("Temp en Faren: %.2f\n",tempF);
            
            if (tempF>662){
                System.out.println("Alert!!!....SobreCalentamiento");
                numSobreCalentamiento++;
            }//fin de if
            else {
               acumTEMP += tempF; 
            }//fin del else
            
            ciclo++;
            
            
        }//fin de while
        
        promedio = acumTEMP / numLectura;
        
        System.out.println("-------------------------");
        System.out.println("          RESUMEN        ");
        System.out.println("-------------------------");
        System.out.printf("Promedio de TEMP: %.2f\n",promedio);
        System.out.printf("SobreCalentamiento: %d\n",numSobreCalentamiento);
        
    }//fin de main
    
}//fin de class
