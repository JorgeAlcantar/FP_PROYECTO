
package prueba.de.skill.check;

import java.util.Random;
import java.util.Scanner;


public class PRUEBADESKILLCHECK {
//COSAS POR INVESTIGAR Y UTILIZAR: TIMER, CREACIÓN DE DISTINTOS RANGO DE DIFICULTAD, INTEGRACIÓN DE UI.
    public static void main(String[] args) {
        //PRUEBA DE SKILLCHECK EN MECANOGRAFÍA
        //CONSISTE EN TECLEAR UNA SERIE DE LETRAS QUE SE DEMUESTRAN EN LA PANTALLA ASEGURATE DE RESPONDER RAPIDAMENTE.
        
        //SCANNER Y HERRAMIENTA RANDOM (SE NECESITA IMPORTAR)
        Scanner input = new Scanner(System.in);
        Random number = new Random();
        
        //DECLARACIÓN DE VARIABLES
        int valor, valor1, valor2, input1;
        
        //FUNCIONAMIENTO DEL PROGRAMA

        //VALOR A ELEGIR ALEATORIO
        valor = number.nextInt(6000);
        valor1 = number.nextInt(7000);
        valor2 = number.nextInt(9000);
        //PROGRAMA EN MARCHA
        System.out.println("PRUEBA DE MECANOGRAFÍA INVOLVIENDO DISTTINTOS NÚMEROS, INTRODUCELOS CORRECTAMENTE");
        System.out.println(valor);
        //COLOCAR RESPUESTA
        input1 = input.nextInt();
        
        //IF STATEMENTS
        if(input1 == valor){
            //SEGUIMIENTO DEL PROGRAMA
            System.out.println("Correcto!");
            System.out.println("SIGUIENTE VALOR: ");
            System.out.println(valor1);
            //COLOCAR RESPUESTA
            input1 = input.nextInt();
            //IF ANIDADO
            if(input1 == valor1){
                System.out.println("Correcto!");
                            System.out.println("SIGUIENTE VALOR: ");
                            System.out.println(valor2);
                            input1 = input.nextInt();
                            //IF ANIDADO
                             if(input1 == valor2){
                                System.out.println("Correcto!");
                            }else{
                            System.out.println("Intentalo de nuevo");
                            }
            }else{
                System.out.println("Intentalo de nuevo.");
            }
        
        }else{
            System.out.println("Intentalo de nuevo.");
        }
        
       
    }
    
}
