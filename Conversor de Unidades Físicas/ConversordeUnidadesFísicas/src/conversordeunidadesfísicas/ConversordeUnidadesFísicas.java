/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversordeunidadesfísicas;

import java.util.Scanner;

/**
 *
 * @author suazo
 * 
 * 2. Conversor de Unidades Físicas (Uso Do-while)
       Crea un menú interactivo que permita al usuario convertir medidas de longitud y peso. El menú
       debe mostrar las opciones: 1) Metros a Pies, 2) Kilogramos a Libras, 3) Centímetros a Pulgadas, y
       4) Salir.
          • Validación: Se debe pedir la magnitud a convertir. Una longitud o un peso nunca pueden
            ser negativos. Si el usuario ingresa un valor menor a cero, debe mostrarse un mensaje de
            error y volver a pedir el dato.
          • Operación: Utiliza una estructura switch para procesar la opción elegida y realizar la
            operación aritmética correspondiente. El menú debe repetirse usando do-while hasta que
            el usuario elija la opción 4
            
 */
public class ConversordeUnidadesFísicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        int opcionMenu = 0;
        double datoUnidad = 0;

        
        double resultado = 0;
       

        System.out.println("-----------------------------------------");
        System.out.println("Programa de Conversor de Unidades Fisicas");
        System.out.println("-----------------------------------------");
        

        
        do {
        System.out.println("");
        System.out.println("Seleccione una de las Siguientes opciones de conversion: ");
        System.out.println("1. Metros a Pies ");
        System.out.println("2. Kilogramos a Libras");
        System.out.println("3. Centimetros a Pulgadas");
        System.out.println("4. Salir");   
        opcionMenu = sc.nextInt();
        

         sc.nextLine ();
        switch (opcionMenu){
            
            
            case 1: 
                System.out.println("Ingrese el dato de metros: ");
                datoUnidad = sc.nextDouble();
                if (datoUnidad <= 0) {
                    System.out.println("Error!! dato no valido. Ingrese nuevamente el dato: ");
                } else {
                resultado = datoUnidad * 3.28084;
                System.out.printf("El resultado es: %.2f Pies",resultado);
                }
               break;

            case 2:
                System.out.println("Ingrese el dato de kilogramos: ");
                datoUnidad = sc.nextDouble();
                if (datoUnidad <= 0) {
                    System.out.println("Error!! dato no valido. Ingrese nuevamente el dato: ");
                } else {
                    resultado = datoUnidad * 2.20462;
                    System.out.printf("El resultado es: %.2f Libras", resultado);
                }
                break;

            case 3:
                System.out.println("Ingrese el dato de Centimetros: ");
                datoUnidad = sc.nextDouble();
                if (datoUnidad <= 0) {
                    System.out.println("Error!! dato no valido. Ingrese nuevamente el dato: ");
                } else {
                    resultado = datoUnidad * 0.393701;
                    System.out.printf("El resultado es: %.2f Pulgadas", resultado);
                }
                break;
               
            case 4: 
                System.out.println("Fin del Programa!!!");
                break;
            
            default:
                System.out.println("Opcion no valida");

                
            
        
        }//fin del switch
        
        
        
        
        }while (opcionMenu !=4);
        System.out.println("Gracias por utilizar nuestro programa!!");
        
    
        
    }//fin de main
    
}//fin de class
