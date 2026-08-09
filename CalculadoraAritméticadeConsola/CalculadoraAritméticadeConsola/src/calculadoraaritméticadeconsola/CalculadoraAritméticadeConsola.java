/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoraaritméticadeconsola;

import java.util.Scanner;

/**
 *
 * @author suazo
 */
public class CalculadoraAritméticadeConsola {

    /**
     * @param args the command line arguments
     * 
     * 3. Calculadora Aritmética de Consola
          Crear un programa que actúe como una calculadora básica. Debe solicitar al usuario dos números
          enteros y un carácter (char) que represente la operación a realizar:
          • Suma
          • Resta
          • División
          • Multiplicación
          • Módulo ‘%.
        Dependiendo del carácter ingresado, el programa debe usar una estructura de selección para
        realizar la operación aritmética correspondiente y mostrar el resultado en formato decimal (cuidar
        las divisiones entre cero). Si el usuario ingresa un carácter no válido, se debe mostrar "Operador
       no reconocido".
     *
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        char seleccionMenu = '@';
       
        //Datos Ingresados
        int numeroIngresado1 = 0;
        int numeroIngresado2 = 0;
       
        //Opercion Aritemtica
        double sumaNumeros = 0;
        double restaNumeros = 0;
        double multiplicacionNumeros = 0;
        double divisionNumeros = 0;
        double moduloNumeros = 0;
        

        System.out.println("Programa de Calculardora");
        System.out.println("Seleccione una Operacion del Menu");
        System.out.println("+. Suma");
        System.out.println("-. Resta");
        System.out.println("*. Multiplicacion");
        System.out.println("/. Division");
        System.out.println("%. Modulo");
        System.out.println("");
        seleccionMenu = entrada.nextLine().charAt(0);

        System.out.println("Ingrese el primer numero: ");
        numeroIngresado1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        numeroIngresado2 = entrada.nextInt();
       

            switch (seleccionMenu) {

                case '+': 
                    sumaNumeros = numeroIngresado1 + numeroIngresado2;
                    System.out.printf("El resultado es: %.2f ", sumaNumeros);
                    break;
                //fincase+

                case '-': 
                    restaNumeros = numeroIngresado1 - numeroIngresado2;
                    System.out.printf("El resultado es: %.2f ", restaNumeros);
                    break;
                //fincase-

                case '*': 
                    multiplicacionNumeros = numeroIngresado1 * numeroIngresado2;
                    System.out.printf("El resultado es: %.2f ", multiplicacionNumeros);
                    break;
                //fincase*

                case '/': 
                    if (numeroIngresado1 != 0 && numeroIngresado2 != 0){ 
                    divisionNumeros = numeroIngresado1 / (double) numeroIngresado2;
                    System.out.printf("El resultado es: %.2f ", divisionNumeros);
                    }else {
                        System.out.println("No se puede dividir numeros 0");
                    }//finIF/ELSE
                    break;
                //fincase/  
                    
                case '%':
                    if (numeroIngresado1 != 0 && numeroIngresado2 != 0){
                    moduloNumeros = numeroIngresado1 % (double) numeroIngresado2;
                    System.out.printf("El resultado es: %.2f ", moduloNumeros);
                    }else {
                    System.out.println("No se puede dividir numeros 0");
                    }//finIF/ELSE
                    break;
                //fincase%

                default: 
                    System.out.println("Operador no reconocido");

            } // finSwitch
        
        
    }//FindeMain
    
} //FindeClass
