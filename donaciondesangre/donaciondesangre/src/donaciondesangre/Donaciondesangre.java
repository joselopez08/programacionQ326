/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package donaciondesangre;
import java.util.Scanner;

/**
 *
 * @author suazo
 */
public class Donaciondesangre {

    /**
     * @param args the command line arguments
     * 
     *   * Desarrollar un algoritmo que permita determinar si
     * el usuario puede donar sangre o no, basandose en su edad (18 - 65)
     * y peso (Mas de 110 lbs). 
     * Si se llega a cumplir los criterios antes expuestos, solo
     * se podra donar sangre si ha comido.
     * 
     * Otro elemento que se tiene que considerar para poder donar sangre
     * es tener el nivel de hierro/hemoglobina en la sangre en los 
     * niveles adecuados.
     * Para los hombres tiene que ser mas de 14 y las mujeres mas de 12
     * 
     * AND && (y) - Dinero       Tiempo         Resultado
     *              si(V)        si(V)           si puede viajar (V)
     *              si(V)        no(F)           no puede viajar (F)
     *              no(F)        si(V)           no se puede viajar(F)
     *              no(F)        no(F)           no se puede viajar (F)
     * 
     * OR || (O) - Pasta         Hamburguesa     Resultado
     *             si(V)          Si(V)           se puede comer (V)
     *             si(V)          no(F)           se puede comer (V)
     *             no(F)          si(V)           se puede comer (V)
     *             no(F)          no(F)           no se puede comer (F)
     * 
     * NOT ! (Negacion)  EstadoAnimo        Resultado
     *                    si(V)              no(F)
     *                    no(F)              si(V)
     * 
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        int edad = 0;
        int peso = 0;
        char comio = '@';
        int niveles = '0';
        String genero = "X";        
        
        System.out.println("Ingrese su edad: ");
        edad = entrada.nextInt();

        System.out.println("Ingrese su peso: ");
        peso = entrada.nextInt();

        if (edad >= 18 && edad <= 65 && peso >= 110) {

            entrada.nextLine();
            System.out.println("Si se puede donar");

            System.out.println("Ya comio?");
            comio = entrada.nextLine().charAt(0);

            if (comio == 'S' || comio == 's') {
                System.out.println("Si puede donar");
            } else {
                System.out.println("No puede donar");
            }

        } else {
            System.out.println("No se puede donar");
        }

        System.out.println("Ingrese sus niveles: ");
        niveles = entrada.nextInt();
        
        entrada.nextLine();

        System.out.println("Ingrese su genero: ");
        genero = entrada.nextLine().toUpperCase();

        if ((niveles >= 14 && genero.equals("M")) || 
            (niveles >= 12 && genero.equals("F"))) {
            System.out.println("Si puede donar");
        } else {
            System.out.println("No puede donar");
        }
        
    }//finmain
    
}//finclass
