package eva3_fp_pruebadecalculomentalymecanografia;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;


public class EVA3_FP_PRUEBADECALCULOMENTALYMECANOGRAFIA {


    public static void main(String[] args) {
        //PRUEBA DE MECANOGRAFÍA Y CÁLCULO MENTAL
        //MENÚ PRINCIPAL
        Scanner input = new Scanner(System.in);
        int eleccion;
        do{
            System.out.println("");
            System.out.println("***COEUS***");
            System.out.println("");
            System.out.println("INTRODUCE EL NÚMERO QUE CORRESPONDE A LA OPCIÓN: ");
            System.out.println("");
            System.out.println("1. Cálculo Mental");
            System.out.println("2. Mecanografía");
            System.out.println("3. Física.");
            System.out.println("4. Terminar programa");
            eleccion = input.nextInt();
            switch(eleccion){
                case 1:
                    calculoMental();
                    break;
                case 2:
                    Mecanografia();
                    break;
                case 3:
                    fisica();
                    break;
            }
        }while(eleccion != 4);
    }
    public static void calculoMental(){
        Scanner input = new Scanner(System.in);
        //INICIALIZACIÓN DE VARIABLES
        int eleccion;
        //PRUEBA DE MATEMÁTICAS
        System.out.println("");
        System.out.println("*** CÁLCULO MENTAL ***");
        System.out.println("");
        System.out.println("DIFICULTAD");
        System.out.println("");
        System.out.println("1. Fácil.");
        System.out.println("2. Media.");
        System.out.println("3. Difícil.");
        System.out.println("Cualquier otro número. MENÚ PRINCIPAL.");
            //INTRODUCCIÓN DE DATOS
            eleccion = input.nextInt();
            switch(eleccion){
                case 1:
                    difFacil();
                    break;
                case 2:
                    difMedia();
                    break;
                case 3:
                    difDificil();
                    break;
            }
    }
    public static void difFacil(){
        Scanner input = new Scanner(System.in);
        int eleccion;
        //INICIO DE REDACCIÓN
        System.out.println("");
        System.out.println("*** CÁLCULO MENTAL ***");
        System.out.println("");
        System.out.println("DIFICULTAD: FACÍL");
        System.out.println("");
        System.out.println("¿Qué tipo de operaciones desea realizar?");
        System.out.println("");
        System.out.println("1. Suma.");
        System.out.println("2. Resta.");
        System.out.println("3. Multiplicación.");
        System.out.println("4. División.");
        System.out.println("5. Comparación de números.");
        System.out.println("Cualquier otro número. MENÚ PRINCIPAL.");
        //INTRODUCCIÓN DE DATOS
        eleccion = input.nextInt();
        //SWITCH
        switch(eleccion){
            case 1:
                facilSuma();
                break;
            case 2:
                facilResta();
                break;
            case 3:
                facilMultiplicacion();
                break;
            case 4:
                facilDivision();
                break;
            case 5: 
                comparacionNumeros();
                break;
        }
    }
    public static void facilSuma(){
        Scanner input = new Scanner(System.in);
        Random number = new Random();
        System.out.println("");
        System.out.println("***SUMA***");
        System.out.println("");
        System.out.println("¡Introduce las respuestas correctas!");
        System.out.println("");
        while(true){
            //INICIALIZACION DE VARIABLES
            int num1 = number.nextInt(50), num2 = number.nextInt(50);
            int res1;
            System.out.println("");
            System.out.println(num1 + "+" + num2);
            System.out.println("");
            long inicio = System.currentTimeMillis();
            res1 = input.nextInt();
            long fin = System.currentTimeMillis();
            int resultado = operacionSuma(num1, num2);
            //ESTRUCTURA DE DECISIÓN
            if(res1 == resultado){
                System.out.println("");
                System.out.println("¡CORRECTO!");
                System.out.println("");
                long tiempo = (fin - inicio) / 1000;
                System.out.println("TIEMPO: " + tiempo + " segundos");
                System.out.println("");
            }else{
                System.out.println("");
                System.out.println("¡INCORRECTO!");
                System.out.println("");
                break;
            }
        }
        System.out.println("");
    }
    public static void facilResta(){
        Scanner input = new Scanner(System.in);
        Random number = new Random();
        System.out.println("");
        System.out.println("***RESTA***");
        System.out.println("");
        System.out.println("¡Introduce las respuestas correctas!");
        System.out.println("");
        while(true){
            //INICIALIZACION DE VARIABLES
            int num1 = number.nextInt(50), num2 = number.nextInt(50);
            int res1;
            System.out.println("");
            System.out.println(num1 + "-" + num2);
            System.out.println("");
            long inicio = System.currentTimeMillis();
            res1 = input.nextInt();
            long fin = System.currentTimeMillis();
            int resultado = operacionResta(num1, num2);
            //ESTRUCTURA DE DECISIÓN
            if(res1 == resultado){
                System.out.println("");
                System.out.println("¡CORRECTO!");
                long tiempo = (fin - inicio) / 1000;
                System.out.println("");
                System.out.println("TIEMPO: " + tiempo + " segundos");
                System.out.println("");
            }else{
                System.out.println("");
                System.out.println("¡INCORRECTO!");
                System.out.println("");
                break;
            }
        }
        System.out.println("");
    }
    public static void facilMultiplicacion(){
        Scanner input = new Scanner(System.in);
        Random number = new Random();
        System.out.println("");
        System.out.println("***MULTIPLICACIÓN***");
        System.out.println("");
        System.out.println("¡Introduce las respuestas correctas!");
        System.out.println("");
        while(true){
            //INICIALIZACION DE VARIABLES
            int num1 = number.nextInt(30), num2 = number.nextInt(30);
            int res1;
            System.out.println("");
            System.out.println(num1 + "*" + num2);
            System.out.println("");
            long inicio = System.currentTimeMillis();
            res1 = input.nextInt();
            long fin = System.currentTimeMillis();
            int resultado = operacionMultiplicacion(num1, num2);
            //ESTRUCTURA DE DECISIÓN
            if(res1 == resultado){
                System.out.println("");
                System.out.println("¡CORRECTO!");
                System.out.println("");
                long tiempo = (fin - inicio) / 1000;
                System.out.println("");
                System.out.println("TIEMPO: " + tiempo + " segundos");
                System.out.println("");
            }else{
                System.out.println("");
                System.out.println("¡INCORRECTO!");
                System.out.println("");
                break;
            }
        }
        System.out.println("");
    }
    public static void facilDivision(){
        Scanner input = new Scanner(System.in);
        Random number = new Random();
        System.out.println("");
        System.out.println("***DIVISIÓN***");
        System.out.println("");
        System.out.println("¡Introduce las respuestas correctas!");
        System.out.println("");
        while(true){
            //INICIALIZACION DE VARIABLES
            int num1 = number.nextInt(30) + 1, num2 = number.nextInt(9) + 1;
            int res1;
            System.out.println("");
            System.out.println(num1 + "/" + num2);
            System.out.println("");
            long inicio = System.currentTimeMillis();
            res1 = input.nextInt();
            long fin = System.currentTimeMillis();
            int resultado = operacionDivision(num1, num2);
            //ESTRUCTURA DE DECISIÓN
            if(res1 == resultado){
                System.out.println("");
                System.out.println("¡CORRECTO!");
                long tiempo = (fin - inicio) / 1000;
                System.out.println("");
                System.out.println("TIEMPO: " + tiempo + " segundos");
                System.out.println("");
            }else{
                System.out.println("");
                System.out.println("¡INCORRECTO!");
                System.out.println("");
                break;
            }
        }
        System.out.println("");
    }
    public static void difMedia(){
        Scanner input = new Scanner(System.in);
        int eleccion;
        System.out.println("");
        System.out.println("*** CÁLCULO MENTAL ***");
        System.out.println("");
        System.out.println("DIFICULTAD: MEDIA");
        System.out.println("");
        System.out.println("¿Qué tipo de operaciones desea realizar?");
        System.out.println("");
        System.out.println("1. Suma.");
        System.out.println("2. Resta.");
        System.out.println("3. Multiplicación.");
        System.out.println("4. División.");
        System.out.println("5. Ordena los números.");
        System.out.println("Cualquier otro número. MENÚ PRINCIPAL.");
        //INTRODUCCIÓN DE DATOS
        eleccion = input.nextInt();
        switch(eleccion){
            case 1:
                mediaSuma();
                break;
            case 2:
                mediaResta();
                break;
            case 3:
                mediaMultiplicacion();
                break;
            case 4:
                mediaDivision();
                break;
            case 5: 
                ordenarNumeros();
                break;
        }
    }
    public static void mediaSuma(){
        Random number = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("***SUMA***");
        System.out.println("");
        System.out.println("¡Introduce las respuestas correctas!");
        System.out.println("");
        while(true){
            //INICIALIZACION DE VARIABLES
            int num1 = number.nextInt(100), num2 = number.nextInt(100);
            int res1;
            System.out.println("");
            System.out.println(num1 + "+" + num2);
            System.out.println("");
            long inicio = System.currentTimeMillis();
            res1 = input.nextInt();
            long fin = System.currentTimeMillis();
            int resultado = operacionSuma(num1, num2);
            //ESTRUCTURA DE DECISIÓN
            if(res1 == resultado){
                System.out.println("");
                System.out.println("¡CORRECTO!");
                System.out.println("");
                long tiempo = (fin - inicio) / 1000;
                System.out.println("TIEMPO: " + tiempo + " segundos");
                System.out.println("");
            }else{
                System.out.println("");
                System.out.println("¡INCORRECTO!");
                System.out.println("");
                break;
            }
        }
        System.out.println("");
    }
    public static void mediaResta(){
        Random number  = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("***RESTA***");
        System.out.println("");
        System.out.println("¡Introduce las respuestas correctas!");
        System.out.println("");
        while(true){
            //INICIALIZACION DE VARIABLES
            int num1 = number.nextInt(80), num2 = number.nextInt(80);
            int res1;
            System.out.println("");
            System.out.println(num1 + "-" + num2);
            System.out.println("");
            long inicio = System.currentTimeMillis();
            res1 = input.nextInt();
            long fin = System.currentTimeMillis();
            int resultado = operacionResta(num1, num2);
            //ESTRUCTURA DE DECISIÓN
            if(res1 == resultado){
                System.out.println("");
                System.out.println("¡CORRECTO!");
                System.out.println("");
                long tiempo = (fin - inicio) / 1000;
                System.out.println("TIEMPO: " + tiempo + " segundos");
                System.out.println("");
            }else{
                System.out.println("");
                System.out.println("¡INCORRECTO!");
                System.out.println("");
                break;
            }
        }
        System.out.println("");
    }
    public static void mediaMultiplicacion(){
        Scanner input = new Scanner(System.in);
        Random number = new Random();
        System.out.println("");
        System.out.println("***MULTIPLICACIÓN***");
        System.out.println("");
        System.out.println("¡Introduce las respuestas correctas!");
        while(true){
            //INICIALIZACION DE VARIABLES
            int num1 = number.nextInt(50), num2 = number.nextInt(50);
            int res1;
            System.out.println("");
            System.out.println(num1 + "*" + num2);
            System.out.println("");
            long inicio = System.currentTimeMillis();
            res1 = input.nextInt();
            long fin = System.currentTimeMillis();
            int resultado = operacionMultiplicacion(num1, num2);
             //ESTRUCTURA DE DECISIÓN
            if(res1 == resultado){
                System.out.println("");
                System.out.println("¡CORRECTO!");
                System.out.println("");
                long tiempo = (fin - inicio) / 1000;
                System.out.println("TIEMPO: " + tiempo + " segundos");
                System.out.println("");
            }else{
                System.out.println("");
                System.out.println("¡INCORRECTO!");
                System.out.println("");
                break;
            }
        }
        System.out.println("");
    }
    public static void mediaDivision(){
        Scanner input = new Scanner(System.in);
        Random number = new Random();
        System.out.println("");
        System.out.println("***DIVISIÓN***");
        System.out.println("");
        System.out.println("¡Introduce las respuestas correctas!");
        while(true){
            //INICIALIZACION DE VARIABLES
            int num1 = number.nextInt(60) + 1, num2 = number.nextInt(20) + 1;
            int res1;
            System.out.println("");
            System.out.println(num1 + "/" + num2);
            System.out.println("");
            long inicio = System.currentTimeMillis();
            res1 = input.nextInt();
            long fin = System.currentTimeMillis();
            int resultado = operacionDivision(num1, num2);
            //ESTRUCTURA DE DECISIÓN
            if(res1 == resultado){
                System.out.println("");
                System.out.println("¡CORRECTO!");
                System.out.println("");
                long tiempo = (fin - inicio) / 1000;
                System.out.println("TIEMPO: " + tiempo + " segundos");
                System.out.println("");
            }else{
                System.out.println("");
                System.out.println("¡INCORRECTO!");
                System.out.println("");
                break;
            }
        }
        System.out.println("");
    }
    public static void difDificil(){
        Scanner input = new Scanner(System.in);
        int eleccion;
        System.out.println("");
        System.out.println("*** CÁLCULO MENTAL ***");
        System.out.println("");
        System.out.println("DIFICULTAD: DIFICÍL");
        System.out.println("");
        System.out.println("¿Qué tipo de operaciones desea realizar?");
        System.out.println("");
        System.out.println("1. Suma.");
        System.out.println("2. Resta.");
        System.out.println("3. Multiplicación.");
        System.out.println("4. División.");
        System.out.println("5. Potencias.");
        System.out.println("6. Geometría básica.");
        System.out.println("7. Limites.");
        System.out.println("8. Funciones.");
        System.out.println("Cualquier otro número. MENÚ PRINCIPAL.");
        //INTRODUCCIÓN DE DATOS
        eleccion = input.nextInt();
        switch(eleccion){
            case 1:
                dificilSuma();
                break;
            case 2: 
                dificilResta();
                break;
            case 3:
                dificilMultiplicacion();
                break;
            case 4:
                dificilDivision();
                break;
            case 5: 
                potencias();
                break;
            case 6:
                geometriaBasica();
                break;
            case 7:
                limites();
                break;
            case 8:
                funciones();
                break;
        }
    }
    public static void dificilSuma(){
        Scanner input = new Scanner (System.in);
        Random number = new Random();
        System.out.println("");
        System.out.println("***SUMA***");
        System.out.println("");
        System.out.println("¡Introduce las respuestas correctas!");
        while(true){
            //INICIALIZACION DE VARIABLES
            int num1 = number.nextInt(3000), num2 = number.nextInt(3000);
            int res1;
            System.out.println("");
            System.out.println(num1 + "+" + num2);
            System.out.println("");
            long inicio = System.currentTimeMillis();
            res1 = input.nextInt();
            long fin = System.currentTimeMillis();
            int resultado = operacionSuma(num1, num2);
            //ESTRUCTURA DE DECISIÓN
            if(res1 == resultado){
                System.out.println("");
                System.out.println("¡CORRECTO!");
                System.out.println("");
                long tiempo = (fin - inicio) / 1000;
                System.out.println("TIEMPO: " + tiempo + " segundos");
                System.out.println("");
            }else{
                System.out.println("");
                System.out.println("¡INCORRECTO!");
                System.out.println("");
                break;
            }
        }
        System.out.println("");
    }
    public static void dificilResta(){
        Scanner input = new Scanner(System.in);
        Random number = new Random();
        System.out.println("");
        System.out.println("***RESTA***");
        System.out.println("");
        System.out.println("¡Introduce las respuestas correctas!");
        while(true){
            //INICIALIZACION DE VARIABLES
            int num1 = number.nextInt(300), num2 = number.nextInt(300);
            int res1;
            System.out.println("");
            System.out.println(num1 + "-" + num2);
            System.out.println("");
            long inicio = System.currentTimeMillis();
            res1 = input.nextInt();
            long fin = System.currentTimeMillis();
            int resultado = operacionResta(num1, num2);
            //ESTRUCTURA DE DECISIÓN
            if(res1 == resultado){
                System.out.println("");
                System.out.println("¡CORRECTO!");
                System.out.println("");
                long tiempo = (fin - inicio) / 1000;
                System.out.println("TIEMPO: " + tiempo + " segundos");
                System.out.println("");
            }else{
                System.out.println("");
                System.out.println("¡INCORRECTO!");
                System.out.println("");
                break;
            }
        }
        System.out.println("");
    }
    public static void dificilMultiplicacion(){
        Random number = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("***MULTIPLICACIÓN***");
        System.out.println("");
        System.out.println("¡Introduce las respuestas correctas!");
        while(true){
            //INICIALIZACION DE VARIABLES
            int num1 = number.nextInt(50), num2 = number.nextInt(50);
            int res1;
            System.out.println("");
            System.out.println(num1 + "*" + num2);
            System.out.println("");
            long inicio = System.currentTimeMillis();
            res1 = input.nextInt();
            long fin = System.currentTimeMillis();
            int resultado = operacionMultiplicacion(num1, num2);
            //ESTRUCTURA DE DECISIÓN
            if(res1 == resultado){
                System.out.println("");
                System.out.println("¡CORRECTO!");
                System.out.println("");
                long tiempo = (fin - inicio) / 1000;
                System.out.println("TIEMPO: " + tiempo + " segundos");
                System.out.println("");
            }else{
                System.out.println("");
                System.out.println("¡INCORRECTO!");
                System.out.println("");
                break;
            }
        }
        System.out.println("");
    }
    public static void dificilDivision(){
        Scanner input = new Scanner(System.in);
        Random number = new Random();
        System.out.println("");
        System.out.println("***DIVISIÓN***");
        System.out.println("");
        System.out.println("¡Introduce las respuestas correctas!");
        while(true){
            //INICIALIZACION DE VARIABLES
            int num1 = number.nextInt(100) + 1, num2 = number.nextInt(50) + 1;
            int res1;
            System.out.println("");
            System.out.println(num1 + "/" + num2);
            System.out.println("");
            long inicio = System.currentTimeMillis();
            res1 = input.nextInt();
            long fin = System.currentTimeMillis();
            //COMPROBACIÓN DE RESULTADO
            int resultado = operacionDivision(num1, num2);
            //ESTRUCTURA DE DECISIÓN
            if(res1 == resultado){
                System.out.println("");
                System.out.println("¡CORRECTO!");
                System.out.println("");
                long tiempo = (fin - inicio) / 1000;
                System.out.println("TIEMPO: " + tiempo + " segundos");
                System.out.println("");
            }else{
                System.out.println("");
                System.out.println("¡INCORRECTO!");
                System.out.println("");
                break;
            }
        }
        System.out.println("");
    }
    public static void Mecanografia(){
        Scanner input = new Scanner(System.in);
        //VARIABLE DE ELECCIÓN
        int eleccion;
        System.out.println("");
        System.out.println("***MECANOGRAFÍA***");
        System.out.println("");
        System.out.println("IDIOMA A PRACTICAR: ");
        System.out.println("");
        System.out.println("1. Español.");
        System.out.println("2. Inglés.");
        System.out.println("Cualquier otro número. MENÚ PRINCIPAL.");
        eleccion = input.nextInt();
        switch(eleccion){
            case 1:
                mecanografiaSpanish();
                break;
            case 2:
                mecanografiaEnglish();
                break;
        }
    }
    public static void mecanografiaSpanish(){
        Scanner input = new Scanner(System.in);
        int eleccion;
        System.out.println("");
        System.out.println("***MECANOGRAFÍA EN ESPAÑOL***");
        System.out.println("");
        System.out.println("¿QUÉ DESEA PRACTICAR?");
        System.out.println("");
        System.out.println("1. Teclado.");
        System.out.println("2. Palabras.");
        System.out.println("3. Oraciones.");
        System.out.println("4. Parrafos.");
        System.out.println("Cualquier otro número. MENÚ PRINCIPAL.");
        eleccion = input.nextInt();
        switch(eleccion){
            case 1:
                tecladoSpanish();
                break;
            case 2:
                palabrasSpanish();
                break;
            case 3:
                oracionesSpanish();
                break;
            case 4:
                parrafoSpanish();
                break;
        }       
    }
    public static void tecladoSpanish(){
        Scanner input = new Scanner(System.in);
        String respuestaTeclado;
        System.out.println("***TECLADO***");
        System.out.println("");
        System.out.println("INTRODUCE LA SIGUIENTE SERIE DE TECLAS CORRECTAMENTE: ");
        System.out.println("");
        while(true){
            String teclado = tecladoAleatorio();
            System.out.println("");
            System.out.println(teclado);
            System.out.println("");
            long inicio = System.currentTimeMillis();
            System.out.print("RESPUESTA: ");
            respuestaTeclado = input.nextLine();
            long fin = System.currentTimeMillis();
            if(respuestaTeclado.equals(teclado)){
                System.out.println("");
                System.out.println("¡¡CORRECTO!!");
                System.out.println("");
                long tiempo = (fin - inicio) / 1000;
                System.out.println("TIEMPO: " + tiempo + " segundos");
                System.out.println("");
            }else{
                System.out.println("");
                System.out.println("¡¡INCORRECTO!!");
                System.out.println("");
                break;
            }
        }
        System.out.println("");
    }
    public static void palabrasSpanish(){
        Scanner input = new Scanner(System.in);
        System.out.println("***PALABRAS***");
        System.out.println("");
        System.out.println("INTRODUCE LAS SIGUIENTES PALABRAS CORRECTAMENTE: ");
        System.out.println("");
        while(true){
            String palabra = palabrasAleatorio();
            String respuestaPalabra;
            System.out.println("");
            System.out.println(palabra);
            System.out.println("");
            long inicio = System.currentTimeMillis();
            System.out.print("REPUESTA: ");
            respuestaPalabra = input.nextLine();
            long fin = System.currentTimeMillis();
            if(respuestaPalabra.equals(palabra)){
                System.out.println("");
                System.out.println("¡¡CORRECTO!!");
                System.out.println("");
                long tiempo = (fin - inicio) / 1000;
                System.out.println("TIEMPO: " + tiempo + " segundos");
                System.out.println("");
            }else{
                System.out.println("");
                System.out.println("¡¡INCORRECTO!!");
                System.out.println("");
                break;
            }
        }
        System.out.println("");
    }
    public static void oracionesSpanish(){
        Scanner input = new Scanner(System.in);
        System.out.println("***ORACIONES***");
        System.out.println("");
        System.out.println("INTRODUCE LAS SIGUIENTES ORACIONES CORRECTAMENTE: ");
        System.out.println("");
        while(true){
            String oraciones  = oracionesAleatorio();
            String respuestaOracion;
            System.out.println("");
            System.out.println(oraciones);
            System.out.println("");
            long inicio = System.currentTimeMillis();
            System.out.print("RESPUESTA: ");
            respuestaOracion = input.nextLine();
            long fin = System.currentTimeMillis();
            if(respuestaOracion.equals(oraciones)){
                System.out.println("");
                System.out.println("¡¡CORRECTO!!");
                System.out.println("");
                long tiempo = (fin - inicio) / 1000;
                System.out.println("TIEMPO: " + tiempo + " segundos");
                System.out.println("");
            }else{
                System.out.println("");
                System.out.println("¡¡INCORRECTO!!");
                System.out.println("");
                break;
            }
        }
        System.out.println("");
    }
    public static void parrafoSpanish(){
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("***PARRAFOS***");
        System.out.println("");
        System.out.println("INTRODUCE EL PARRAFO CORRECTAMENTE: ");
        while(true){
            String parrafo = parrafosAleatorio();
            String respuestaParrafo;
            System.out.println("");
            System.out.println(parrafo);
            System.out.println("");
            long inicio = System.currentTimeMillis();
            System.out.print("RESPUESTA: ");
            respuestaParrafo = input.nextLine();
            long fin = System.currentTimeMillis();
            if(respuestaParrafo.equals(parrafo)){
                System.out.println("");
                System.out.println("¡¡CORRECTO!!");
                System.out.println("");
                long tiempo = (fin - inicio) / 1000;
                System.out.println("TIEMPO: " + tiempo + " segundos");
                System.out.println("");
            }else{
                System.out.println("");
                System.out.println("¡¡INCORRECTO!!");
                System.out.println("");
                break;
            }
        }
        System.out.println("");
    }
    public static void mecanografiaEnglish(){
        Scanner input = new Scanner(System.in);
        int eleccion;
        System.out.println("");
        System.out.println("***MECHANOGRAPHY IN ENGLISH***");
        System.out.println("");
        System.out.println("WHAT DO YOU WISH TO PRACTICE?");
        System.out.println("");
        System.out.println("1. Keyboard.");
        System.out.println("2. Words.");
        System.out.println("3. Sentences.");
        System.out.println("4. Paragraphs.");
        System.out.println("Any other number. MAIN MENU.");
        eleccion = input.nextInt();
        switch(eleccion){
            case 1:
                keyboardEnglish();
                break;
            case 2:
                wordsEnglish();
                break;
            case 3:
                sentencesEnglish();
                break;
            case 4:
                paragraphsEnglish();
                break;
        }
    }
    public static void keyboardEnglish(){
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("***KEYBOARD***");
        System.out.println("");
        System.out.println("TYPE THE NEXT SERIES OF KEYS THROUGH YOUR KEYBOARD: ");
        System.out.println("");
        while(true){
            String keyboard = keyboardAleatorio();
            String answerKeyboard;
            System.out.println("");
            System.out.println(keyboard);
            System.out.println("");
            long inicio = System.currentTimeMillis();
            System.out.print("ANSWER: ");
            answerKeyboard = input.nextLine();
            long fin = System.currentTimeMillis();
            if(answerKeyboard.equals(keyboard)){
                System.out.println("");
                System.out.println("CORRECT!!");
                long tiempo = (fin - inicio) / 1000;
                System.out.println("");
                System.out.println("TIME " + tiempo + " seconds");
                System.out.println("");
            }else{
                System.out.println("");
                System.out.println("INCORRECT!!");
                System.out.println("");
                break;
            }
        }
        System.out.println("");
    }
    public static void wordsEnglish(){
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("***WORDS***");
        System.out.println("");
        System.out.println("TYPE THE WORDS CORRECTLY: ");
        System.out.println("");
        while(true){
            String words = wordsAleatorio();
            String answerWord;
            System.out.println("");
            System.out.println(words);
            System.out.println("");
            long inicio = System.currentTimeMillis();
            System.out.print("ANSWER: ");
            answerWord = input.nextLine();
            long fin = System.currentTimeMillis();
            if(answerWord.equals(words)){
                System.out.println("");
                System.out.println("CORRECT!!");
                System.out.println("");
                long tiempo = (fin - inicio) / 1000;
                System.out.println("TIME " + tiempo + " seconds");
                System.out.println("");
            }else{
                System.out.println("");
                System.out.println("INCORRECT!!");
                System.out.println("");
                break;
            }
        }
        System.out.println("");
    }
    public static void sentencesEnglish(){
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("***SENTENCES***");
        System.out.println("");
        System.out.println("TYPE THE NEXT SENTENCES CORRECTLY: ");
        while(true){
            String sentences = sentenceAleatorio();
            String answerSentence;
            System.out.println("");
            System.out.println(sentences);
            System.out.println("");
            long inicio = System.currentTimeMillis();
            System.out.print("ANSWER: ");
            answerSentence = input.nextLine();
            long fin = System.currentTimeMillis();
            if(answerSentence.equals(sentences)){
                System.out.println("");
                System.out.println("CORRECT!!");
                long tiempo = (fin - inicio) / 1000;
                System.out.println("");
                System.out.println("TIME " + tiempo + " seconds");
                System.out.println("");
            }else{
                System.out.println("");
                System.out.println("INCORRECT!!");
                System.out.println("");
                break;
            }
        }
        System.out.println("");
    }
    public static void paragraphsEnglish(){
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("***PARAGRAPHS***");
        System.out.println("");
        System.out.println("INTRODUCE THE NEXT PARAGRAPHS CORRECTLY: ");
        System.out.println("");
        while(true){
            String paragraphs = paragraphAleatorio();
            String answerParagraph;
            System.out.println("");
            System.out.println(paragraphs);
            System.out.println("");
            long inicio = System.currentTimeMillis();
            System.out.print("ANSWER: ");
            answerParagraph = input.nextLine();
            long fin = System.currentTimeMillis();
            if(answerParagraph.equals(paragraphs)){
                System.out.println("");
                System.out.println("CORRECT!!");
                System.out.println("");
                long tiempo = (fin - inicio) / 1000;
                System.out.println("");
                System.out.println("TIME " + tiempo + " seconds");
                System.out.println("");
            }else{
                System.out.println("");
                System.out.println("INCORRECT!!");
                System.out.println("");
                break;
            }
        }
        System.out.println("");
    }
    public static void ordenarNumeros(){
        Scanner input = new Scanner (System.in);
        Random number = new Random();
        //ARREGLOS
        int[] numOrdenado;
        int num[] = new int[5];
        System.out.println("");
        System.out.println("***ORDENA LOS NÚMEROS***");
        System.out.println("");
        System.out.println("INTRODUCE LOS NÚMEROS DE MANERA ORDENADA");
        while(true){
            for(int i = 0; i < 5; i++){
                num[i] = number.nextInt(100);
            }
            for(int i = 0; i < num.length; i++){
                System.out.println("{" + num[i] + "}");
            }
            System.out.println("");
            long inicio = System.currentTimeMillis();
            //COPIA DEL ARREGLO NUM
            numOrdenado = num.clone();
            //Arrays.sort ORDENADA EL ARREGLO DENTRO DEL PARENTESIS, ES DECIR, OODENA LA COPIA DEL ARREGLO num LLAMADA numOrdenado
            Arrays.sort(numOrdenado);
            //RESPUESTA
            int[] respuestaOrdenada = new int[5];
            for(int i = 0; i < respuestaOrdenada.length; i++){
                System.out.println("RESPUESTA (PRESIONA ENTER CUANDO INGRESES UN ELEMENTO PARA PODER INGRESAR EL SIGUIENTE): ");
                respuestaOrdenada[i] = input.nextInt();
            }
            long fin = System.currentTimeMillis();
            long tiempo = (fin - inicio) / 1000;
            //VERIFICACIÓN DE RESULTADOS
            //Arrays.equals es similar a cuando un dato String es igual a otro. Esté compara la respuesta que ingresa el usuario y el arreglo ordenado.
            boolean comparacionRespuesta = Arrays.equals(respuestaOrdenada, numOrdenado);
            //SI LA COMPARACIÓN (comparaciónRespuesta, el cual es un booleano) ES VERDADERA ENTONCES CONTINUARA, SI NO ES ASÍ, ESTÉ INDICARA EL ERROR Y FINALIZARÁ LA ACTIVIDAD.
            if (comparacionRespuesta){
                System.out.println("");
                System.out.println("¡¡CORRECTO!!");
                System.out.println("");
                System.out.println("TIEMPO: " + tiempo + " segundos");
                System.out.println("");
            }else{
                System.out.println("");
                System.out.println("¡¡INCORRECTO!!");
                System.out.println("");
                break;
            }
        }
    }
    public static void comparacionNumeros(){
        Scanner input = new Scanner(System.in);
        Random number = new Random();
        int respuesta;
        System.out.println("");
        System.out.println("***COMPARACIÓN DE NÚMEROS***");
        System.out.println("");
        System.out.println("INTRODUCE EL NÚMERO QUE SEA MAYOR CORRECTAMENTE: ");
        System.out.println("");
        while(true){
            int num1 = number.nextInt(100), num2 = number.nextInt(100);
            System.out.println("NÚMERO 1: " + num1);
            System.out.println("NÚMERO 2: " + num2);
            System.out.println("");
            System.out.println("¿ES EL NÚMERO 1 MAYOR QUE EL NÚMERO 2? (SI: 1 / NO: 0)");
            System.out.println("");
            long inicio = System.currentTimeMillis();
            System.out.println("RESPUESTA: ");
            respuesta = input.nextInt();
            long fin = System.currentTimeMillis();
            long tiempo = (fin - inicio) / 1000;
            boolean respuestaCorrecta = (num1 > num2 && respuesta == 1) || (num1 <= num2 && respuesta == 0);
            if(respuestaCorrecta){
                System.out.println("");
                System.out.println("¡¡CORRECTO!!");
                System.out.println("");
                System.out.println("TIEMPO: " + tiempo + " segundos");
                System.out.println("");
            }else{
                System.out.println("");
                System.out.println("¡¡INCORRECTO!!");
                System.out.println("");
                break;
            }
        }
    }
    public static void potencias(){
        Scanner input = new Scanner(System.in);
        Random number = new Random();
        int respuesta;
        System.out.println("");
        System.out.println("***POTENCIAS***");
        System.out.println("");
        System.out.println("INTRODUCE LA RESPUESTA DE LA POTENCIA CORRECTAMENTE: ");
        System.out.println("");
        while (true){
            int num1 = number.nextInt(10) + 1, num2 = number.nextInt(6);
            System.out.println(num1 + " elevado a la " + num2);
            long inicio = System.currentTimeMillis();
            int resultado = 1;
            for(int i = 0; i < num2; i++){
                resultado *= num1;
            }
            respuesta = input.nextInt();
            long fin = System.currentTimeMillis();
            long tiempo = System.currentTimeMillis();
            if(respuesta == resultado){
                System.out.println("");
                System.out.println("¡¡CORRECTO!!");
                System.out.println("");
                System.out.println("TIEMPO: " + tiempo + " segundos");
                System.out.println("");
            }else{
                System.out.println("");
                System.out.println("¡¡INCORRECTO!!");
                System.out.println("");
                break;
            }
        }
    }
    public static void geometriaBasica(){
        Scanner input = new Scanner(System.in);
        Random number = new Random();
        //VARIABLES
        int figura, medida, respuesta;
        //INICIO DEL PROGRAMA
        System.out.println("");
        System.out.println("***GEOMETRÍA BÁSICA***");
        System.out.println("");
        System.out.println("RESPONDE LOS PROBLEMAS CORRECTAMENTE, ASEGURATE DE INTRODUCIR LAS RESPUESTAS EN ENTEROS: ");
        System.out.println("");
        while(true){
            //FÍGURAS 0: CUADRADO, 1: RECTÁNGULO. 2: TRIÁNGULO
            figura = number.nextInt(3);
            //MEDIDAS 0: ÁREA, 1: PERÍMETRO
            medida = number.nextInt(2);
            //RESPUESTA 
            int respuestaCorrecta = 0;
            switch (figura){
                //CUADRADO
                case 0:
                    //DECLARACIÓN DE MEDIDA DE LADOS
                    int lado;
                    lado = number.nextInt(10) + 1;
                    //DECLARACIÓN DE TIPO DE MEDIDAD QUE SE BUSCA
                    if(medida == 0){//ÁREA
                        System.out.println("Calcula el área de un cuadrado con la medida de cada uno de sus lados igual a " + lado);
                        respuestaCorrecta = lado * lado;
                    }else{
                        System.out.println("Calcula el perímetro de un cuadrado con la medida de cada uno de sus lados igual a: " + lado);
                        respuestaCorrecta = lado + lado + lado + lado;
                    }
                    break;
                //RECTÁNGULO
                case 1:
                    int base1, altura1;
                    base1 = number.nextInt(15) + 1;
                    altura1 = number.nextInt(15) + 1;
                    if(medida == 0){
                        System.out.println("Calcula el área de un rectángulo con la medida de su base igual a " + base1 + " y altura de " + altura1);
                        respuestaCorrecta = base1 * altura1;
                    }else{
                        System.out.println("Calcula el perímetro de un rectángulo que tiene la medidad de su base igual a " + base1 + " y la altura de " + altura1);
                        respuestaCorrecta = (2 * base1) + (2 * altura1);
                    }
                    break;
                //TRIÁNGULO
                case 2:
                    int base2, altura2, lado1, lado2;
                    base2 = number.nextInt(15) +1 ;
                    altura2 = number.nextInt(15) + 1;
                    if(medida == 0){
                        System.out.println("Calcula el área de un triángulo el cual tiene la medida de su base igual a " + base2 + " y la medida de su altura igual a " + altura2);
                        respuestaCorrecta = (base2 * altura2) / 2;
                    }else{
                        lado1 = number.nextInt(15) + 1;
                        lado2 = number.nextInt(10) + 1;
                        System.out.println("Calcula el perímetro del triángulo el cual tiene una base con medida igual a " + base2 + ", un lado con medida igual a " + lado1 + " y con la otra medida de su lado igual a " + lado2);
                        respuestaCorrecta = base2 + lado1 + lado2;
                    }
                    break;
            }
            System.out.print("RESPUESTA: ");
            respuesta = input.nextInt();
            //COMPARACIÓN DE RESPUESTAS
            if(respuesta == respuestaCorrecta){
                System.out.println("");
                System.out.println("¡¡CORRECTO!!");
                System.out.println("");
            }else{
                System.out.println("");
                System.out.println("¡¡INCORRECTO!!");
                System.out.println("");
                break;
            }
            System.out.println("");
        }
    }
    public static void fisica(){
        Scanner input = new Scanner(System.in);
        int eleccion;
        System.out.println("");
        System.out.println("*** FISICA ***");
        System.out.println("");
        System.out.println("¿QUÉ QUIERES APRENDER HOY");
        System.out.println("");
        System.out.println("1. M.R.U");
        System.out.println("2. M.R.U.A");
        System.out.println("3. Segunda ley de Newton.");
        System.out.println("cualquier otro número. MENÚ PRINCIPAL.");
        eleccion = input.nextInt();
        switch(eleccion){
            case 1:
                MRU();
                break;
            case 2:
                MRUA();
                break;
            case 3:
                newton();
                break;
        }
    }
    public static void MRU(){
        Scanner input = new Scanner(System.in);
        int eleccion;
        System.out.println("");
        System.out.println("***M.R.U***");
        System.out.println("");
        System.out.println("¿QUÉ QUIERES APRENDER HOY?");
        System.out.println("");
        System.out.println("1. Velocidad.");
        System.out.println("2. Distancia.");
        System.out.println("3. Tiempo.");
        System.out.println("cualquier otro número. MENÚ PRINCIPAL.");
        eleccion = input.nextInt();
        switch(eleccion){
            case 1:
                velocidad();
                break;
            case 2:
                distancia();
                break;
            case 3:
                tiempo();
                break;
        }
    }
    public static void velocidad(){
        Scanner input = new Scanner(System.in);
        Random number = new Random();
        System.out.println("");
        System.out.println("***VELOCIDAD***");
        System.out.println("");
        System.out.println("¡INTRODUCE EL RESULTADO!");
        System.out.println("");
        while(true){
            System.out.println("LA FORMULA A UTILIZAR ES: V = d/t");
            System.out.println("");
            int num1 = number.nextInt(20) + 1, num2 = number.nextInt(10) + 1;
            int res1;
            System.out.println("LA VELOCIDAD SI, MI DISTANCIA ES " + num1 + " METROS " + "Y EL TIEMPO ES DE " + num2 + " SEGUNDOS.");
            System.out.println("");
            System.out.print("RESPUESTA: ");
            long inicio = System.currentTimeMillis();
            res1 = input.nextInt();
            long fin = System.currentTimeMillis();
            long tiempo = (fin - inicio) / 1000;
            int resultado = num1 / num2;
             //ESTRUCTURA DE DECISIÓN
            if(res1 == resultado){
                System.out.println("");
                System.out.println("¡CORRECTO! LA VELOCIDAD ERA: " + resultado + "m/s");
                System.out.println("");
                System.out.println("TIEMPO: " + tiempo);
                System.out.println("");
            }else{
                System.out.println("");
                System.out.println("¡INCORRECTO! LA RESPUESTA CORRECTA ERA: " + resultado + "m/s");
                System.out.println("");
                break;
            }
        }
        System.out.println("");
    }
    public static void distancia(){
        Scanner input = new Scanner(System.in);
        Random number = new Random();
        System.out.println("");
        System.out.println("***DISTANCIA***");
        System.out.println("");
        System.out.println("¡INTRODUCE EL RESULTADO!");
        System.out.println("");
        while(true){
            System.out.println("");
            System.out.println("LA FORMULA A UTILIZAR ES: d = v * t");
            System.out.println("");
            int num1 = number.nextInt(15)+1, num2 = number.nextInt(10)+1;
            int res1;
            System.out.println("LA DISTANCIA SI, MI VELOCIDAD ES " + num1 + "m/s " + " Y EL TIEMPO ES DE " + num2 + " segundos");
            System.out.println("");
            System.out.print("RESPUESTA: ");
            long inicio = System.currentTimeMillis();
            res1 = input.nextInt();
            long fin = System.currentTimeMillis();
            long tiempo = (fin - inicio) / 1000;
            int resultado = num1 * num2;
             //ESTRUCTURA DE DECISIÓN
            if(res1 == resultado){
                System.out.println("");
                System.out.println("¡CORRECTO!" + " LA DISTANCIA ERA: " + resultado + "m");
                System.out.println("");
                System.out.println("TIEMPO: " + tiempo + " segundos ");
                System.out.println("");
            }else{
                System.out.println("");
                System.out.println("¡INCORRECTO! LA DISTANCIA CORRECTA ERA: " + resultado + "m");
                System.out.println("");
                break;
            }
        }
        System.out.println("");
    }
    public static void tiempo(){
     Scanner input = new Scanner(System.in);
        Random number = new Random();
        System.out.println("");
        System.out.println("***TIEMPO***");
        System.out.println("");
        System.out.println("¡INTRODUCE EL RESULTADO!");
        while(true){
            System.out.println("");
            System.out.println("LA FORMULA A UTILIZAR ES: t = d / v");
            System.out.println("");
            int num1 = number.nextInt(15)+1, num2 = number.nextInt(10)+1;
            int res1;
            System.out.println("EL TIEMPO SI, MI DISTANCIA ES " + num1 + " METROS " + " Y LA VELOCIDAD ES DE " + num2 + "m/s");
            System.out.println("");
            System.out.print("RESULTADO: ");
            long inicio = System.currentTimeMillis();
            res1 = input.nextInt();
            long fin = System.currentTimeMillis();
            long tiempo = (fin - inicio) / 1000;
            int resultado = num1 / num2;
             //ESTRUCTURA DE DECISIÓN
            if(res1 == resultado){
                System.out.println("");
                System.out.println("¡CORRECTO! EL TIEMPO ERA DE: " + resultado + " segundos");
                System.out.println("");
                System.out.println("TIEMPO TOMADO PARA RESPONDER: " + tiempo + " segundos ");
                System.out.println("");
            }else{
                System.out.println("");
                System.out.println("¡INCORRECTO! LA REPUESTA CORRECTA ERA: " + resultado + " segundos");
                System.out.println("");
                break;
            }
        }
        System.out.println("");
    }
    public static void MRUA(){
        Scanner input = new Scanner(System.in);
        int eleccion;
        System.out.println("");
        System.out.println("***M.R.U.A***");
        System.out.println("");
        System.out.println("¿QUÉ QUIERE APRENDER HOY?");
        System.out.println("");
        System.out.println("1. Velocidad final.");
        System.out.println("2. Distancia.");
        System.out.println("cualquier otro número. MENÚ PRINCIPAL.");
        eleccion = input.nextInt();
        switch(eleccion){
            case 1:
                velocidadFinal();
                break;
            case 2:
                distanciaMRUA();
                break;
        }
    }
    public static void velocidadFinal(){
        Scanner input = new Scanner(System.in);
        Random number = new Random();
        System.out.println("");
        System.out.println("***VELOCIDAD FINAL***");
        System.out.println("");
        System.out.println("¡INTRODUCE EL RESULTADO!");
        System.out.println("");
        while(true){
            System.out.println("");
            System.out.println("LA FORMULA QUE VAS A USAR ES LA DE vf = vi + a*t");
            System.out.println("");
            int num1 = number.nextInt(20)+1, num2 = number.nextInt(10)+1, num3  = number.nextInt(10)+1;
            int res1;
            System.out.println("LA VELOCIDAD FINAL SI, MI VELOCIDAD INICIAL ES " + num1 + " m/s " + " Y LA ACELERACIÓN ES DE " + num2 + "EL TIEMPO ES DE " + num3 + " segundos");
            System.out.println("");
            System.out.print("RESULTADO: ");
            long inicio = System.currentTimeMillis();
            res1 = input.nextInt();
            long fin = System.currentTimeMillis();
            long tiempo = (fin - inicio) / 1000;
            int resultado = num1 + (num2 * num3);
             //ESTRUCTURA DE DECISIÓN
            if(res1 == resultado){
                System.out.println("");
                System.out.println("¡CORRECTO! LA VELOCIDAD FINAL ERA: " + resultado + "m/s");
                System.out.println("");
                System.out.println("TIEMPO: " + tiempo + " segundos ");
                System.out.println("");
            }else{
                System.out.println("");
                System.out.println("¡INCORRECTO! LA RESPUESTA CORRECTA ERA: " + resultado + "m/s");
                System.out.println("");
                break;
            }
        }
         System.out.println("");
     }
    public static void distanciaMRUA(){
        Scanner input = new Scanner(System.in);
        Random number = new Random();
        System.out.println("");
        System.out.println("***DISTANCIA (M.R.U.A)***");
        System.out.println("");
        System.out.println("¡INTRODUCE EL RESULTADO!");
        System.out.println("");
        while(true){
            System.out.println("");
            System.out.println("LA FORMULA A UTILIZAR ES: d = vi*t + (1/2 * a * t * t)");
            System.out.println("");
            int num1 = number.nextInt(5)+1, num2 = number.nextInt(5)+1, num3 = number.nextInt(5)+1;
            int res1;
            System.out.println("LA DISTANCIA SI, MI VELOCIDAD INICIAL ES " + num1 + "m/s " + "  EL TIEMPO ES DE " + num2 + "segundos" + " Y LA ACELERACIÓN ES DE " + num3 + " m/s");
            System.out.println("");
            System.out.println("Recuerda realizar lo que se encuentra después de la suma.");
            System.out.println("");
            System.out.print("RESULTADO: ");
            long inicio = System.currentTimeMillis();
            res1 = input.nextInt();
            long fin = System.currentTimeMillis();
            long tiempo = (fin - inicio) / 1000;
            int resultado = num1 * num2 + ((num3 * num2 * num2)/2);
             //ESTRUCTURA DE DECISIÓN
            if(res1 == resultado){
                System.out.println("");
                System.out.println("¡CORRECTO! LA DISTANCIA ERA: " + resultado + "m");
                System.out.println("");
                System.out.println("TIEMPO: " + tiempo + " segundos ");
                System.out.println("");
            }else{
                System.out.println("");
                System.out.println("¡INCORRECTO! LA DISTANCIA ERA: " + resultado + "m");
                System.out.println("");
                break;
            }
        }
        System.out.println("");
    }
    public static void newton(){
        Scanner input = new Scanner(System.in);
        int eleccion;
        //INICIO DE REDACCIÓN
        System.out.println("");
        System.out.println("***SEGUNDA LEY DE NEWTON***");
        System.out.println("");
        System.out.println("¿QUÉ QUIERE APRENDER HOY");
        System.out.println("");
        System.out.println("1. Fuerza.");
        System.out.println("2. Masa.");
        System.out.println("3. Aceleración.");
        System.out.println("cualquier otro número. MENÚ PRINCIPAL.");
        //INTRODUCCIÓN DE DATOS
        eleccion = input.nextInt();
        while(true){
            switch(eleccion){
                case 1:
                    fuerza();
                    return;
                case 2:
                    masa();
                    return;
                case 3:
                    aceleracion();
                    return;
            }
        }
    }
    public static void fuerza(){
        Scanner input = new Scanner(System.in);
        Random number = new Random();
        System.out.println("");
        System.out.println("***FUERZA***");
        System.out.println("");
        System.out.println("¡Introduce EL RESULTADO");
        while(true){
            System.out.println("");
            System.out.println("LA FORMULA QUE VAS A USAR ES F = m*a");
            System.out.println("");
            int num1 = number.nextInt(25)+1, num2 = number.nextInt(20)+1;
            int res1;
            System.out.println("LA FUERZA SI MI MASA ES " + num1 + "kg " + " Y MI ACELERACIÓN ES " + num2 + "m/s");
            System.out.println("");
            System.out.print("RESULTADO: ");
            long inicio = System.currentTimeMillis();
            res1 = input.nextInt();
            long fin = System.currentTimeMillis();
            long tiempo = (fin - inicio) / 1000;
            int resultado = num1 * num2;
             //ESTRUCTURA DE DECISIÓN
            if(res1 == resultado){
                System.out.println("");
                System.out.println("¡CORRECTO! LA FUERZA ERA: " + resultado + "N");
                System.out.println("");
                System.out.println("TIEMPO: " + tiempo + " segundos ");
            }else{
                System.out.println("");
                System.out.println("¡INCORRECTO! LA FUERZA ERA: " + resultado + "N");
                System.out.println("");
                return;
            }
        }
    }
    public static void masa(){
        Scanner input = new Scanner(System.in);
        Random number = new Random();
        System.out.println("");
        System.out.println("***MASA***");
        System.out.println("");
        System.out.println("¡INTRODUCE EL RESULTADO");
        System.out.println("");
        while(true){
            System.out.println("");
            System.out.println("LA FORMULA QUE VAS A USAR ES m = F/a");
            System.out.println("");
            int num1 = number.nextInt(25)+1, num2 = number.nextInt(20)+1;
            int res1;
            System.out.println("LA MASA SI LA FUERZA ES " + num1 + "Newtons" + " Y MI ACELERACIÓN ES " + num2 + "m/s");
            System.out.println("");
            System.out.print("RESULTADO: ");
            long inicio = System.currentTimeMillis();
            res1 = input.nextInt();
            long fin = System.currentTimeMillis();
            long tiempo = (fin - inicio) / 1000;
            int resultado = num1 / num2;
             //ESTRUCTURA DE DECISIÓN
            if(res1 == resultado){
                System.out.println("");
                System.out.println("¡CORRECTO! LA MASA ERA: " + resultado);
                System.out.println("");
                System.out.println("TIEMPO: " + tiempo + " segundos");
            }else{
                System.out.println("");
                System.out.println("¡INCORRECTO! LA MASA ERA: " + resultado);
                System.out.println("");
                break;
            }
        }
        System.out.println("");
     }
    public static void aceleracion(){
        Scanner input = new Scanner(System.in);
        Random number = new Random();
        System.out.println("");
        System.out.println("***ACELERACIÓN***");
        System.out.println("");
        System.out.println("¡INTRODUCE EL RESULTADO");
        while(true){
            System.out.println("");
            System.out.println("LA FORMULA A UTILIZAR ES: a = F/m");
            System.out.println("");
            int num1 = number.nextInt(25)+1, num2 = number.nextInt(20)+1;
            int res1;
            System.out.println("ACELERACIÓN SI LA FUERZA ES " + num1 + "Newtons" + " Y LA MASA ES " + num2 + "kg");
            System.out.println("");
            System.out.print("RESULTADO: ");
            long inicio = System.currentTimeMillis();
            res1 = input.nextInt();
            long fin = System.currentTimeMillis();
            long tiempo = (fin - inicio) / 1000;
            int resultado = num1 / num2;
             //ESTRUCTURA DE DECISIÓN
            if(res1 == resultado){
                System.out.println("");
                System.out.println("¡CORRECTO! LA ACELERACIÓN ERA: " + resultado + "m/s");
                System.out.println("");
                System.out.println("TIEMPO: " + tiempo + " segundos");
            }else{
                System.out.println("");
                System.out.println("¡INCORRECTO! LA ACELERACIÓN ERA: " + resultado + "m/s");
                System.out.println("");
                break;
            }
        }
        System.out.println("");
    }
    public static void limites(){
        Scanner input = new Scanner(System.in);
        Random number = new Random();
        System.out.println("");
        System.out.println("***LIMITES***");
        System.out.println("");
        System.out.println("Son el valor al que una función o una sucesión se acerca a medida que su argumento se acerca a un número determinado.");
        System.out.println("");
        //sera una funcion de 3 valores
        while(true){
            int resu1;
            int x = number.nextInt(15), num1 = number.nextInt(10) + 1, num2 = number.nextInt(10) + 1;
            System.out.println("");
            System.out.println("EL LIMITE ES : " + "F(x) = " + num1 + "x*x" + " + " + num2 + "x" + " -9");
            System.out.println("");
            System.out.println("Cuando x tiende a = " + x);
            System.out.println("");
            resu1 = (num1 * x * x) + (num2 * x) - 9;
            System.out.print("RESPUESTA: ");
            int resultado = input.nextInt();
            if(resultado == resu1){
                System.out.println("");
                System.out.println("¡CORRECTO!");
                System.out.println("");
            }else{
                System.out.println("");
                System.out.println("¡INCORRECTO!");
                System.out.println("");
                break;
            }
        }
    }
    public static void funciones(){
        Scanner input = new Scanner(System.in);
        Random number = new Random();
        System.out.println("");
        System.out.println("***FUNCIONES***");
        System.out.println("");
        System.out.println("Una funcion no es mas que la relacion entre dos conjuntos.");
        System.out.println("");
        while(true){
            int resu1, resu2;
            int x = number.nextInt(15), num1 = number.nextInt(10)+1, num2 = number.nextInt(10)+1, x2 = number.nextInt(15), x3 = number.nextInt(20);           System.out.println("");
            System.out.println("");
            System.out.println("LA FUNCION ES : " + "F(x) = " + num1 + "x * x" + " + " + num2 + "x" + "-" + x3);
            System.out.println("");
            System.out.println("Cuando x es igual a = " + x + " Y cuando x es igual a = " + x2);
            System.out.println("");
            resu1 = (num1 * x * x) + (num2 * x) - x3;
            resu2 = (num1 * x * x2) + (num2 * x2) - x3;
            System.out.println("");
            System.out.println("El resultado de x cuando es: " + x);
            System.out.println("");
            int resultado1 = input.nextInt();
            System.out.println("");
            System.out.println("El resultado cuando x es: " + x2);
            System.out.println("");
            int resultado2 = input.nextInt();
            if(resultado1 == resu1 && resultado2 == resu2){
                System.out.println("");
                System.out.println("¡CORRECTO!");
                System.out.println("");
            }else if(resultado1 == resu1 && resultado2 != resu2){
                System.out.println("");
                System.out.println("Casi, el primer resultado es correcto, pero el segundo es incorrecto.");
                System.out.println("");
            }else if(resultado1 != resu1 && resultado2 == resu2){
                System.out.println("");
                System.out.println("Casi, el primer resultado es incorrecto, pero el segundo es correcto.");
                System.out.println("");
            }
            else{
                System.out.println("");
                System.out.println("¡INCORRECTO!");
                System.out.println("");
                System.out.println("Los resultados eran : " + resu1 +" DEL EJERCICIO 1 "+ " Y " + resu2 + " DEL EJERCICIO 2.");
                System.out.println("");
                break;
            }
        }
    }
    //BASE DE DATOS DE MECANOGRAFÍA
    //
    //
    //
    //
    public static String palabrasAleatorio(){
        Random number = new Random();
        List<String> palabras = new ArrayList<>();
        try (BufferedReader buffer = new BufferedReader(
                new InputStreamReader(
                        EVA3_FP_PRUEBADECALCULOMENTALYMECANOGRAFIA.class.getResourceAsStream("Palabras.txt")
                )
            )
        )
        {//LOS PARENTESIS SE ENCARGAN DE CERRAR EL BufferedReader y el InputStreamReader. Y DÉSUES UNA LLAVE ABIERTA LA CUAL ESTÁ CONECTADAD A CATCH PARA PODER CONTINUAR CON LAS SISGUIENTES INSTRUCCIONES.
            String linea;
            while((linea = buffer.readLine()) != null){
                palabras.add(linea);
            }
        }catch (Exception error){
            System.out.println("ERROR AL LEER ARCHIVO: " + error.getMessage());
        }
        return palabras.get(number.nextInt(palabras.size()));
    }
    public static String tecladoAleatorio(){
        Random number = new Random();
        List<String> keyboard = new ArrayList<>();
        try (BufferedReader buffer = new BufferedReader(
                new InputStreamReader(
                        EVA3_FP_PRUEBADECALCULOMENTALYMECANOGRAFIA.class.getResourceAsStream("KEYBOARD.txt")
                )
            )
        )
        {
            String linea;
            while((linea = buffer.readLine()) != null){
                keyboard.add(linea);
            }
        }catch (Exception error){
            System.out.println("ERROR AL LEER ARCHIVO: " + error.getMessage());
        }
        return keyboard.get(number.nextInt(keyboard.size()));
    }
    public static String oracionesAleatorio(){
        Random number = new Random();
        List<String> oraciones = new ArrayList<>();
        try (BufferedReader buffer = new BufferedReader(
                new InputStreamReader(
                        EVA3_FP_PRUEBADECALCULOMENTALYMECANOGRAFIA.class.getResourceAsStream("Oraciones.txt")
                )
            )
        )
        {
            String linea;
            while((linea = buffer.readLine()) != null){
                oraciones.add(linea);
            }
        }catch (Exception error){
            System.out.println("ERROR AL LEER ARCHIVO: " + error.getMessage());
        }
        return oraciones.get(number.nextInt(oraciones.size()));
    }
    public static String parrafosAleatorio(){
        Random number = new Random();
        List<String> parrafos = new ArrayList<>();
        try (BufferedReader buffer = new BufferedReader(
                new InputStreamReader(
                        EVA3_FP_PRUEBADECALCULOMENTALYMECANOGRAFIA.class.getResourceAsStream("Parrafos.txt")
                )
            )
        )
        {
            String linea;
            while((linea = buffer.readLine()) != null){
                parrafos.add(linea);
            }
        }catch (Exception error){
            System.out.println("ERROR AL LEER ARCHIVO: " + error.getMessage());
        }
        return parrafos.get(number.nextInt(parrafos.size()));
    }
    public static String keyboardAleatorio(){
        Random number = new Random();
        List<String> keyboardEnglish = new ArrayList<>();
        try (BufferedReader buffer = new BufferedReader(
                new InputStreamReader(
                        EVA3_FP_PRUEBADECALCULOMENTALYMECANOGRAFIA.class.getResourceAsStream("KEYBOARDENGLISH.txt")
                )
            )
        )//LOS PARENTESIS SE ENCARGAN DE CERRAR EL BufferedReader y el InputStreamReader. 
        {
        String linea;
        while((linea = buffer.readLine()) != null){
            keyboardEnglish.add(linea);
        }
        }catch (Exception error){
            System.out.println("ERROR AL LEER ARCHIVO: " + error.getMessage());
        }
        return keyboardEnglish.get(number.nextInt(keyboardEnglish.size()));
    }
    public static String wordsAleatorio(){
        Random number = new Random();
        List<String> wordsEnglish = new ArrayList<>();
        try (BufferedReader buffer = new BufferedReader(
                new InputStreamReader(
                        EVA3_FP_PRUEBADECALCULOMENTALYMECANOGRAFIA.class.getResourceAsStream("WORDENGLISH.txt")
                )
            )
        )
        {
            String linea;
            while((linea = buffer.readLine()) != null){
                wordsEnglish.add(linea);
            }
        }catch (Exception error){
            System.out.println("ERROR AL LEER ARCHIVO: " + error.getMessage());
        }
        return wordsEnglish.get(number.nextInt(wordsEnglish.size()));
    }
    public static String sentenceAleatorio(){
        Random number = new Random();
        List<String> sentenceEnglish = new ArrayList<>();
        try (BufferedReader buffer = new BufferedReader(
                new InputStreamReader(
                        EVA3_FP_PRUEBADECALCULOMENTALYMECANOGRAFIA.class.getResourceAsStream("SENTENCEENGLISH.txt")
                )
            )
        )
        {
            String linea;
            while((linea = buffer.readLine()) != null){
                sentenceEnglish.add(linea);
            }
        }catch (Exception error){
            System.out.println("ERROR AL LEER ARCHIVO: " + error.getMessage());
        }
        return sentenceEnglish.get(number.nextInt(sentenceEnglish.size()));
    }
    public static String paragraphAleatorio(){
        Random number = new Random();
        List<String> keyboardEnglish = new ArrayList<>();
        try (BufferedReader buffer = new BufferedReader(
                new InputStreamReader(
                        EVA3_FP_PRUEBADECALCULOMENTALYMECANOGRAFIA.class.getResourceAsStream("PARAGRAPHSENGLISH.txt")
                )
            )
        )
        {
            String linea;
            while((linea = buffer.readLine()) != null){
                keyboardEnglish.add(linea);
            }
        }catch (Exception error){
            System.out.println("ERROR AL LEER ARCHIVO: " + error.getMessage());
        }
        return keyboardEnglish.get(number.nextInt(keyboardEnglish.size()));
    }
    //OPERACIONES DE CÁLCULO MENTAL
    //APLICA A TODAS LAS DIFICULTADES
    //
    //
    //
    public static int operacionSuma(int valor1, int valor2){
        int resultadoVerdadero;
        resultadoVerdadero = valor1 + valor2;
        return resultadoVerdadero;
    }
    public static int operacionResta(int valor1, int valor2){
        int resultadoVerdadero;
        resultadoVerdadero = valor1 - valor2;
        return resultadoVerdadero;
    }
    public static int operacionMultiplicacion(int valor1, int valor2){
        int resultadoVerdadero;
        resultadoVerdadero = valor1 * valor2;
        return resultadoVerdadero;
    }
    public static int operacionDivision(int valor1, int valor2){
        int resultadoVerdadero;
        resultadoVerdadero = valor1 / valor2;
        return resultadoVerdadero;
    }
}