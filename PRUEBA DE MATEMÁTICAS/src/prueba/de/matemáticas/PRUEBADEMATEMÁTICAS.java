
package prueba.de.matemáticas;

import java.util.Random;
import java.util.Scanner;


public class PRUEBADEMATEMÁTICAS {

    public static void main(String[] args) {
        //DECLARACIÓN DE HERRAMIENTA RANDOM Y SCANNER, PERMITE ESCOGER UNA CATIDAD DE NÚMEROS
        Scanner input = new Scanner(System.in);
        Random number = new Random();
        
        //DECLARACIÓN DE VARIABLES Y OPERACIONES
        int valor1 = number.nextInt(30), valor2 = number.nextInt(30), res;
        res = valor1 + valor2;
        int RES2, RES3;
        //IMPRIMIR E INPUT DEL SCANNER
        System.out.println("Responde las siguientes operaciones correctamente, asegurate de responder en valores enteros, sin decimales.");
        System.out.print(valor1);
        System.out.print("+");
        System.out.println(valor2);
        RES2 = input.nextInt();
        
        //IF STATEMENTS TIME :D
        if (res == RES2) {
            System.out.println("Ganaste!");
            //ANOTHER OPERATION D:
            res = valor1 - valor2;
            
            //RESUELVE, POR FAVOR ._.
            System.out.print(valor1);
            System.out.print("-");
            System.out.println(valor2);
            RES3 = input.nextInt();
            
            //IF STATEMENTS AGAIN :D
            if (res == RES3){
                System.out.println("Ganaste!");
            } else {
                System.out.println("Perdiste");
            }
            
        } else {
            System.out.println("Perdiste");
        
        }
    }
    
}
