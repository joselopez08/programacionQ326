/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seleccionvehiculo;
import java.util.Scanner;

/**
 *
 * @author suazo
 *  * Estructuras de seleccion
 * 1. Estructura o Formato
 *   a. Palabres Claves --> if .... else
 *   b. Bloques
 *   c. Terminaciones ---> no se termina con ";"
 *   d. Condiciones --> valor a comprar
 * 
 * 2. Tipos de Seleccion
 *   a. simple
 *   b. doble
 * 
 * 3. Condiciones
 *   a. Tipos de Condiciones
 *   b. Tipos de Comparacion
 * 
 */
public class Seleccionvehiculo {

    /**
     * @param args the command line arguments
     * * Desarrollar un algoritmo que me permita determinar los siguiente elementos 
     * de un vehiculo.
     *   a. Si el tamaño del tanque de combustible agarra mas de 30 litros. (dato numerico)
     *   b. El tipo de combustible si es o no Diesel. (Dato tipo caracter)
     *   c. Si es energeticamente eficiente y ecologico. (Dato Cadena)
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner (System.in);
        int cantidadLitros=0;
        char respuestoTipo = '@';
        String respuestaCadena = "John Doe";
        
        System.out.println("Me dijeron que eres duenio de un vehiculo \"Verde\"");
        System.out.println("Tienes que hecharle biodiesel?");
        System.out.print("Cuantos litros de agarra?");
        cantidadLitros = entrada.nextInt();
        
        if(cantidadLitros>30){
            System.out.println("Es un vehiculo con");
            System.out.println("grande capacidades");
            System.out.println("Seguro la factura es alta!!");
        }
        
        System.out.println("");
        
       entrada.nextLine();//Limpiar el buffer
       System.out.println("Tu vehiculo es Diesel verde? (x = si, y = no)");
       respuestoTipo = entrada.nextLine().charAt(0);
       
       if(respuestoTipo == 'x'){
            System.out.println("Si es diesel verde!!");
            System.out.println("Diesel combinado con ethanol");
            System.out.println("Se saca del maiz");
        }
       else
       {
               System.out.println("Uyy..eres anticlimatico");
               System.out.println("Calentamineto Global!!!");
                       
        }
       
       System.out.println("");
       
       /*
       System.out.println("");
       System.out.println("Tu carro es energeticamente eficiente?");
       respuestaCadena = entrada.nextLine();
       System.out.printf("Respuesta ingresada %s",respuestaCadena);
       
       System.out.println("\nSeguro que es asi?");
       respuestaCadena = entrada.nextLine().toUpperCase ();
       System.out.printf("Respuesta ingresada: %s",respuestaCadena);
       
       System.out.println("\n100% Seguro");
       respuestaCadena = entrada.nextLine().toLowerCase ();
       System.out.printf("Respuesta ingresada: %s",respuestaCadena);
       */
               
       if (respuestaCadena.equals("si") ){
          System.out.println("Excelente");
          System.out.println("Amigable con el ambiente");
       }
       else{30
            System.out.println("Uyy...busca que hacer");
       }
  
        
    }//Fin de Main
    
}//Fin Class
