/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fisica_general_termodinamica;

import java.util.Scanner;

/**
 *
 * @author PC7
 */
public class Fisica_general_Termodinamica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);//se importa el scanner para leere los daots desde el teclado
        int opcion; 
        //menu de opciones de la calculadora 
        do {
        System.out.println("Conversiones de Termodinamica");
        System.out.println("1.-Celsius a Kelvin");
        System.out.println("2.-Kelvin a celsius");
        System.out.println("3.-Celsius a Fahrenheit");
        System.out.println("4.-Fahrenheit a Celsius");
        System.out.println("5.-Salir");
        System.out.println("Elige la conversion de unidad a utilizar:");
        opcion = leer.nextInt();
        //opciones
        switch (opcion) {//no servira para poder ingresar a cda opcion
            case 1:
                float cels;//variable para los celcius  introducidos desde el teclado
                float kelv;// variable para los datos ingresados desde el eteclado
                System.out.println("Celsius a Kelvin");
                System.out.println("Ingrese el valor de Celsius a covertir:");
                cels=leer.nextFloat();
                kelv=cels+273;// formula general para calcular los grados celcius a kelvin
                System.out.println("El valor en Kelvin es:"+ kelv + " K");//se imprime el resultado final de la formula
                break;
            case 2:
                float cel;//variables a utilizar para los datos introducidos desde el teclado 
                float kel;//variables a utilizar para los datos introducidos desde el teclado 
                System.out.println("Kelvin a celsius");
                System.out.println("Ingrese el valor de Kelvin a covertir:");
                kel=leer.nextFloat();
                cel=kel-273;//formula general para calcular los grados kelvin a celsius
                System.out.println("El valor en Celsius es:"+ cel + " °C");//se imprime el resultado final de la formula
                break;
            case 3:
                float C;//variables a utilizar para los datos introducidos desde el teclado 
                double fah;//variables a utilizar para los datos introducidos desde el teclado 
                System.out.println("Celsius a Fahrenheit");
                System.out.println("Ingrese el valor de Celsius a covertir:");
                C=leer.nextFloat();
                fah=1.8*C+32;//formula general para calcular los grados celsius a fahrenheit
                System.out.println("El valor en Fahrenheit es:"+ fah + " °F");//se imprime el resultado final de la formula
                break;
            case 4:
                float F;//variables a utilizar para los datos introducidos desde el teclado 
                float ce;//variables a utilizar para los datos introducidos desde el teclado 
                System.out.println("Fahrenheit a Celsius");
                System.out.println("Ingrese el valor de Fahrenheit a covertir:");
                F=leer.nextFloat();
                ce=(F-32)*5/9;//formula general para calcular los grados fahrenheit a celsius
                System.out.println("El valor en Celsius es:"+ ce + " °C");//se imprime el resultado final de la formula
                break;
            case 5:
                System.out.println("");//salir
                break;
                
        }
        }while (opcion != 5);
  
    }
    
}
