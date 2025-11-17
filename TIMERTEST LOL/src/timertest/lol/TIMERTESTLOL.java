
package timertest.lol;

import java.util.Random;
import java.util.Scanner;

public class TIMERTESTLOL {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random number = new Random();
        String[] palabras = {"montaña", "libro", "esperanza", "energía", "solución", "memoria", "universo", "ventana", "sistema", "horizonte", "música", "silencio", "estructura", "conocimiento", "destino", "brillante", "amargo", "poderoso", "silencioso", "inmediato", "profundo", "ligero", "distante", "suave", "inmenso", "complejo", "estable"};
        System.out.println("***PALABRAS***");
        System.out.println("");
        System.out.println("INTRODUCE LAS SIGUIENTES PALABRAS CORRECTAMENTE: ");
        System.out.println("");
        while(true){
            String respuestaPalabra;
            int posicion = number.nextInt(palabras.length);
            System.out.println(palabras[posicion]);
            long inicio = System.currentTimeMillis();
            respuestaPalabra = input.nextLine();
            long fin = System.currentTimeMillis();
            long tiempo = (fin - inicio) / 1000;
            System.out.println("Tiempo: " + tiempo + " segundos");
            if(respuestaPalabra.equals(palabras[posicion])){
                System.out.println("CORRECTO!!");
            } else {
                System.out.println("INCORRECTO!!");
                break;
            }
        }
        System.out.println("");
    }
    
}
