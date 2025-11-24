
package eva3_fp_pruebadecalculomentalymecanografia;

import java.util.Random;
import java.util.Scanner;


public class EVA3_FP_PRUEBADECALCULOMENTALYMECANOGRAFIA {


    public static void main(String[] args) {
        //PRUEBA DE MECANOGRAFÍA Y CÁLCULO MENTAL
        //MENÚ PRINCIPAL
        Scanner input = new Scanner(System.in);
        int eleccion;
        do{
            System.out.println("");
            System.out.println("***PRUEBA DE MECANOGRAFÍA Y CÁLCULO MENTAL***");
            System.out.println("");
            System.out.println("INTRODUCE EL NÚMERO QUE CORRESPONDE A LA OPCIÓN: ");
            System.out.println("");
            System.out.println("1. Cálculo Mental");
            System.out.println("2. Mecanografía");
            System.out.println("3. Terminar programa");
            eleccion = input.nextInt();
            switch(eleccion){
                case 1:
                    calculoMental();
                    break;
                case 2:
                    Mecanografia();
                    break;
            }
        }while(eleccion != 3);
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
        System.out.println("DIFICULTAD: FACÍL");
        System.out.println("¿Qué tipo de operaciones desea realizar?");
        System.out.println("1. Suma.");
        System.out.println("2. Resta.");
        System.out.println("3. Multiplicación.");
        System.out.println("4. División.");
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
        }
    }
    public static void facilSuma(){
        Scanner input = new Scanner(System.in);
        Random number = new Random();
        System.out.println("***SUMA***");
        System.out.println("¡Introduce las respuestas correctas!");
        while(true){
            //INICIALIZACION DE VARIABLES
            int num1 = number.nextInt(50), num2 = number.nextInt(50);
            int res1;
            System.out.println(num1 + "+" + num2);
            long inicio = System.currentTimeMillis();
            res1 = input.nextInt();
            long fin = System.currentTimeMillis();
            int resultado = num1 + num2;
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
        System.out.println("***RESTA***");
        System.out.println("¡Introduce las respuestas correctas!");
        while(true){
            //INICIALIZACION DE VARIABLES
            int num1 = number.nextInt(50), num2 = number.nextInt(50);
            int res1;
            System.out.println(num1 + "-" + num2);
            long inicio = System.currentTimeMillis();
            res1 = input.nextInt();
            long fin = System.currentTimeMillis();
            int resultado = num1 - num2;
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
        System.out.println("***MULTIPLICACIÓN***");
        System.out.println("¡Introduce las respuestas correctas!");
        while(true){
            //INICIALIZACION DE VARIABLES
            int num1 = number.nextInt(30), num2 = number.nextInt(30);
            int res1;
            System.out.println(num1 + "*" + num2);
            long inicio = System.currentTimeMillis();
            res1 = input.nextInt();
            long fin = System.currentTimeMillis();
            int resultado = num1 * num2;
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
        System.out.println("***DIVISIÓN***");
        System.out.println("¡Introduce las respuestas correctas!");
        while(true){
            //INICIALIZACION DE VARIABLES
            int num1 = number.nextInt(30) + 1, num2 = number.nextInt(9) + 1;
            int res1;
            System.out.println(num1 + "/" + num2);
            long inicio = System.currentTimeMillis();
            res1 = input.nextInt();
            long fin = System.currentTimeMillis();
            int resultado = num1 / num2;
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
    public static void difMedia(){
        Scanner input = new Scanner(System.in);
        int eleccion;
        System.out.println("");
        System.out.println("*** CÁLCULO MENTAL ***");
        System.out.println("DIFICULTAD: MEDIA");
        System.out.println("¿Qué tipo de operaciones desea realizar?");
        System.out.println("1. Suma.");
        System.out.println("2. Resta.");
        System.out.println("3. Multiplicación.");
        System.out.println("4. División.");
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
        }
    }
    public static void mediaSuma(){
        Random number = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("***SUMA***");
        System.out.println("¡Introduce las respuestas correctas!");
        while(true){
            //INICIALIZACION DE VARIABLES
            int num1 = number.nextInt(100), num2 = number.nextInt(100);
            int res1;
            System.out.println(num1 + "+" + num2);
            long inicio = System.currentTimeMillis();
            res1 = input.nextInt();
            long fin = System.currentTimeMillis();
            int resultado = num1 + num2;
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
    public static void mediaResta(){
        Random number  = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("***RESTA***");
        System.out.println("¡Introduce las respuestas correctas!");
        while(true){
            //INICIALIZACION DE VARIABLES
            int num1 = number.nextInt(80), num2 = number.nextInt(80);
            int res1;
            System.out.println(num1 + "-" + num2);
            long inicio = System.currentTimeMillis();
            res1 = input.nextInt();
            long fin = System.currentTimeMillis();
            int resultado = num1 - num2;
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
    public static void mediaMultiplicacion(){
        Scanner input = new Scanner(System.in);
        Random number = new Random();
        System.out.println("***MULTIPLICACIÓN***");
        System.out.println("¡Introduce las respuestas correctas!");
        while(true){
            //INICIALIZACION DE VARIABLES
            int num1 = number.nextInt(50), num2 = number.nextInt(50);
            int res1;
            System.out.println(num1 + "*" + num2);
            long inicio = System.currentTimeMillis();
            res1 = input.nextInt();
            long fin = System.currentTimeMillis();
            int resultado = num1 * num2;
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
    public static void mediaDivision(){
        Scanner input = new Scanner(System.in);
        Random number = new Random();
        System.out.println("***DIVISIÓN***");
        System.out.println("¡Introduce las respuestas correctas!");
        while(true){
            //INICIALIZACION DE VARIABLES
            int num1 = number.nextInt(60) + 1, num2 = number.nextInt(20) + 1;
            int res1;
            System.out.println(num1 + "/" + num2);
            long inicio = System.currentTimeMillis();
            res1 = input.nextInt();
            long fin = System.currentTimeMillis();
            int resultado = num1 / num2;
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
    public static void difDificil(){
        Scanner input = new Scanner(System.in);
        int eleccion;
        System.out.println("");
        System.out.println("*** CÁLCULO MENTAL ***");
        System.out.println("DIFICULTAD: DIFICÍL");
        System.out.println("¿Qué tipo de operaciones desea realizar?");
        System.out.println("1. Suma.");
        System.out.println("2. Resta.");
        System.out.println("3. Multiplicación.");
        System.out.println("4. División.");
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
        }
    }
    public static void dificilSuma(){
        Scanner input = new Scanner (System.in);
        Random number = new Random();
        System.out.println("***SUMA***");
        System.out.println("¡Introduce las respuestas correctas!");
        while(true){
            //INICIALIZACION DE VARIABLES
            int num1 = number.nextInt(3000), num2 = number.nextInt(3000);
            int res1;
            System.out.println(num1 + "+" + num2);
            long inicio = System.currentTimeMillis();
            res1 = input.nextInt();
            long fin = System.currentTimeMillis();
            int resultado = num1 + num2;
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
    public static void dificilResta(){
        Scanner input = new Scanner(System.in);
        Random number = new Random();
        System.out.println("***RESTA***");
        System.out.println("¡Introduce las respuestas correctas!");
        while(true){
            //INICIALIZACION DE VARIABLES
            int num1 = number.nextInt(300), num2 = number.nextInt(300);
            int res1;
            System.out.println(num1 + "-" + num2);
            long inicio = System.currentTimeMillis();
            res1 = input.nextInt();
            long fin = System.currentTimeMillis();
            int resultado = num1 - num2;
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
    public static void dificilMultiplicacion(){
        Random number = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("***MULTIPLICACIÓN***");
        System.out.println("¡Introduce las respuestas correctas!");
        while(true){
            //INICIALIZACION DE VARIABLES
            int num1 = number.nextInt(50), num2 = number.nextInt(50);
            int res1;
            System.out.println(num1 + "*" + num2);
            long inicio = System.currentTimeMillis();
            res1 = input.nextInt();
            long fin = System.currentTimeMillis();
            int resultado = num1 * num2;
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
    public static void dificilDivision(){
        Scanner input = new Scanner(System.in);
        Random number = new Random();
        System.out.println("***DIVISIÓN***");
        System.out.println("¡Introduce las respuestas correctas!");
        while(true){
            //INICIALIZACION DE VARIABLES
            int num1 = number.nextInt(100) + 1, num2 = number.nextInt(50) + 1;
            int res1;
            System.out.println(num1 + "/" + num2);
            long inicio = System.currentTimeMillis();
            res1 = input.nextInt();
            long fin = System.currentTimeMillis();
            //COMPROBACIÓN DE RESULTADO
            int resultado = num1 / num2;
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
        Random number = new Random();
        //ARREGLO
        String[] teclado = {"jdfk", "adsjk", "FGRTVB45", "AQZ1¡", "SWX2", "HJYUNM67", "KI8", "LO9", "BCDFGHJ", "asdfjklñ", "qwert", "yuiop", "qwertyuiop", "zxcvb", "zxcvbnm", "qa we er rt ty yu ui io op", "za sx dc fv gb hn jm"};
        //VARIABLE DE ELECCIÓN
        String respuestaTeclado;
        System.out.println("***TECLADO***");
        System.out.println("");
        System.out.println("INTRODUCE LA SIGUIENTE SERIE DE TECLAS CORRECTAMENTE: ");
        System.out.println("");
        while(true){
            int posicion = number.nextInt(teclado.length);
            System.out.println(teclado[posicion]);
            long inicio = System.currentTimeMillis();
            respuestaTeclado = input.nextLine();
            long fin = System.currentTimeMillis();
            if(respuestaTeclado.equals(teclado[posicion])){
                System.out.println("");
                System.out.println("¡¡CORRECTO!!");
                System.out.println("");
                long tiempo = (fin - inicio) / 1000;
                System.out.println("");
                System.out.println("TIEMPO: " + tiempo + " segundos");
                System.out.println("");
            }else{
                System.out.println("");
                System.out.println("¡¡INCORRECTO!!");
                System.out.println("");
                System.out.println("");
                break;
            }
        }
        System.out.println("");
    }
    public static void palabrasSpanish(){
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
            if(respuestaPalabra.equals(palabras[posicion])){
                System.out.println("");
                System.out.println("¡¡CORRECTO!!");
                System.out.println("");
                long tiempo = (fin - inicio) / 1000;
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
        System.out.println("");
    }
    public static void oracionesSpanish(){
        Scanner input = new Scanner(System.in);
        Random number = new Random();
        String[] oraciones = {"El rápido zorro marrón salta sobre el perro perezoso con gran agilidad.", "Mi hermana menor cocinó una deliciosa cena para toda la familia anoche.", "Los estudiantes entregaron todos sus proyectos finales la semana pasada sin falta.", "Viajaremos a la playa más hermosa del país el próximo verano.", "El concierto de la banda de rock fue absolutamente increíble y vibrante.", ".  La nueva biblioteca del centro abrirá sus puertas al público mañana.", "El científico explicó el complejo experimento con palabras muy sencillas y claras.", "Compré unas manzanas rojas y jugosas en el mercado del pueblo.", "El equipo de fútbol entrenó con mucha intensidad durante toda la tarde.", "La película que vimos en el cine tenía unos efectos especiales asombrosos.", "El jardín de mi abuela está lleno de coloridas flores en primavera.", "Aprendió a tocar la guitarra clásica con solo practicar unos meses.", "El vuelo hacia la ciudad europea tuvo un retraso de varias horas.", "La empresa lanzará un producto innovador al mercado el próximo trimestre.", "El antiguo castillo sobre la colina tiene una leyenda misteriosa y antigua.", "El viejo marinero contaba historias fascinantes sobre sus viajes por el mundo.", "La luz de la luna iluminaba el camino serpenteante del bosque.", ". Necesito encontrar mis llaves antes de salir de la casa rápidamente.", "El pan recién horneado llenaba la cocina con un aroma delicioso.", "El niño leyó un libro muy interesante sobre dinosaurios gigantes.", "Nuestro vecino pintó su casa de un color azul muy brillante.", "El proyecto final requirió mucho esfuerzo y dedicación constante.", "El gato persiguió al ratón por toda la casa y el jardín.", ". La tormenta de anoche causó algunos daños en la ciudad.", "El médico recetó las medicinas para la gripe severa.", "El camino hacia la cima de la montaña era empinado y peligroso.", "El juez tomó una decisión importante para la comunidad local.", "El pastel de chocolate es su postre favorito desde pequeño.", "El autobús escolar pasa por mi calle todas las mañanas.", "El programa de televisión terminó con una sorpresa increíble.", "El viento fuerte sacudió las ventanas de la oficina central.", "La abuela tejió un suéter cálido para el invierno helado.", "El chef preparó un plato especial para los invitados.", "El artista pintó un cuadro abstracto con colores vibrantes."};
        System.out.println("***ORACIONES***");
        System.out.println("");
        System.out.println("INTRODUCE LAS SIGUIENTES ORACIONES CORRECTAMENTE: ");
        System.out.println("");
        while(true){
            String respuestaOracion;
            int posicion = number.nextInt(oraciones.length);
            System.out.println(oraciones[posicion]);
            long inicio = System.currentTimeMillis();
            respuestaOracion = input.nextLine();
            long fin = System.currentTimeMillis();
            if(respuestaOracion.equals(oraciones[posicion])){
                System.out.println("");
                System.out.println("¡¡CORRECTO!!");
                System.out.println("");
                long tiempo = (fin - inicio) / 1000;
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
        System.out.println("");
    }
    public static void parrafoSpanish(){
        Scanner input = new Scanner(System.in);
        Random number = new Random();
        String[] textos = {"Muchos años después, frente al pelotón de fusilamiento, el coronel Aureliano Buendía había de recordar aquella tarde remota en que su padre lo llevó a conocer el hielo. Macondo era entonces una aldea de veinte casas de barro y cañabrava construidas a la orilla de un río de aguas diáfanas que se precipitaban por un lecho de piedras pulidas, blancas y enormes como huevos prehistóricos.", "Era un día frío y brillante de abril, y los relojes daban las trece. Winston Smith, con la barbilla clavada en el pecho en su esfuerzo por escapar al molestísimo viento, se deslizó rápidamente por entre las puertas de cristal de las Casas de la Victoria, aunque no con la suficiente rapidez para impedir que una ráfaga de polvo se colara adentro con él.", "El señor y la señora Dursley, del número cuatro de Privet Drive, estaban orgullosos de decir que eran perfectamente normales, afortunadamente. Eran las últimas personas que se esperaría encontrar relacionadas con algo extraño o misterioso, porque no estaban para tales tonterías. El señor Dursley era director de una empresa llamada Grunnings, que fabricaba taladros.", "En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero, adarga antigua, rocín flaco y galgo corredor. Una olla de algo más vaca que carnero, salpicón las más noches, duelos y quebrantos los sábados, lentejas los viernes, algún palomino de añadidura los domingos, consumían las tres partes de su hacienda.", "La mañana había llegado con un frío tan intenso que se podía cortar con un cuchillo. En la ladera, arriba del bosque de dioses, los aposentos de los huéspedes parecían esculturas de hielo, pálidos y cristalinos bajo la luz del sol naciente. Bran no sentía el frío mientras cabalgaba, ni cuando su padre lo alzó para sentarlo en su alta silla de montar", "Cuando el señor Bilbo Bolsón de Bolsón Cerrado anunció que muy pronto celebraría su cumpleaños ciento once, toda la Comarca se agitó inmediatamente con una gran expectación. Bilbo era muy rico y muy peculiar, y había sido el asombro de la Comarca durante sesenta años, desde su memorable desaparición e inesperado regreso. Las riquezas que había traído de aquellos viajes se habían convertido en leyenda local.", "El día en que lo iban a matar, Santiago Nasar se levantó a las 5.30 de la mañana para esperar el buque en que llegaba el obispo. Había soñado que atravesaba un bosque de higueras donde caía una llovizna tierna, y por un instante fue feliz en el sueño, pero al despertar se sintió por completo salpicado de cagada de pájaros.", "Todavía recuerdo aquella amanecida en que mi padre me llevó por primera vez a visitar el Cementerio de los Libros Olvidados. Desgranaban los primeros días del verano de 1945 y caminábamos por las calles de una Barcelona atrapada bajo cielos de ceniza y un sol de vapor que se derramaba sobre la Rambla de Santa Mónica en un torrente de cobre líquido.", "Cuando me despierto, el otro lado de la cama está frío. Extiendo la mano en busca de la calidez de Prim, pero solo encuentro la áspera lona de la colcha. Debe de haberse escapado a la cama de nuestra madre, seguramente por una pesadilla. Hoy es el día de la cosecha, y por una vez puedo oler a pan tostado que sube desde el distrito.", "Cuando me despierto, el otro lado de la cama está frío. Extiendo la mano en busca de la calidez de Prim, pero solo encuentro la áspera lona de la colcha. Debe de haberse escapado a la cama de nuestra madre, seguramente por una pesadilla. Hoy es el día de la cosecha, y por una vez puedo oler a pan tostado que sube desde el distrito.", "La destrucción de la presa y el dique que contenía el agua del Kenduskeag comenzó a las 3:02 de la tarde del jueves, diecisiete de octubre, con un sonido parecido al de un disparo de rifle. Chuckie Gingras, de once años, que estaba pescando con una caña improvisada cerca del lugar, fue el único testigo del suceso. Chuckie, que no era un niño especialmente listo, vio cómo una grieta en forma de Z se abría en la pared de cemento.", "Era un placer especial ver las cosas consumidas, verlas ennegrecidas y cambiadas. Con la antorcha de latón en el puño, con esta serpiente gigantesca escupiendo su veneno petroleado sobre el mundo, la sangre latía en sus sienes y sus manos eran las manos de algún asombroso director tocando todas las sinfonías del fuego y las llamas para destruir los montones de leña que eran los libros.", "Barrabás llegó a la familia por vía marítima, anotó la niña Clara con su delicada caligrafía. Ya entonces tenía el hábito de escribir las cosas importantes y más tarde, cuando se quedó muda, escribía también las trivialidades, sin sospechar que cincuenta años después sus cuadernos me servirían para rescatar la memoria del pasado y para sobrevivir a mi propio espantoso destino.", "n comienzo es el momento más delicado para cualquier empresa. Es entonces cuando se deben vigilar con más cuidado las tendencias latentes. Ahora te conoces a ti mismo, sabes los recursos limitados de que dispones y también conoces el lugar que ocupas en el plan de la Misión Protectora. Así pues, es el momento de que conozcas la posición que ocupas en mi plan.", "Un comienzo es el momento más delicado para cualquier empresa. Es entonces cuando se deben vigilar con más cuidado las tendencias latentes. Ahora te conoces a ti mismo, sabes los recursos limitados de que dispones y también conoces el lugar que ocupas en el plan de la Misión Protectora. Así pues, es el momento de que conozcas la posición que ocupas en mi plan.", "Ayer tarde, la nieve empezó a caer. Esta mañana, todo está blanco. Yo, que apenas puedo salir del jardín, he pasado la mañana en la biblioteca, hojeando viejos libros y mirando por la ventana, hacia el páramo cubierto de nieve, y hacia el cementerio, donde las lápidas están casi enterradas. No he visto a nadie, ni he oído nada, excepto el viento que gime alrededor de la casa."};
        System.out.println("***PARRAFOS***");
        System.out.println("");
        System.out.println("INTRODUCE EL PARRAFO CORRECTAMENTE: ");
        while(true){
            String respuestaParrafo;
            int posicion = number.nextInt(textos.length);
            System.out.println(textos[posicion]);
            long inicio = System.currentTimeMillis();
            respuestaParrafo = input.nextLine();
            long fin = System.currentTimeMillis();
            if(respuestaParrafo.equals(textos[posicion])){
                System.out.println("");
                System.out.println("¡¡CORRECTO!!");
                System.out.println("");
                long tiempo = (fin - inicio) / 1000;
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
        Random number = new Random();
        String[] keyboard = {"asdf", "jkl;", "qa ws ed rf tg yh uj ik ol p", "za xs dc fv gb hn jm", "asdf jkl", "jkl", "asdf", "zxcv bnm", "qz, wa, se, dr, ft, gy, hu, ji, ko, lp", "qa, ws, ed, rf, tg, yh, uj, ik, ol, p", "zxcvbnm zxcvbnm", "qwer", "zxcv", "ASDF", "ZAQ!"};
        System.out.println("***KEYBOARD***");
        System.out.println("");
        System.out.println("TYPE THE NEXT SERIES OF KEYS THROUGH YOUR KEYBOARD: ");
        System.out.println("");
        while(true){
            String answerKeyboard;
            int posicion = number.nextInt(keyboard.length);
            System.out.println(keyboard[posicion]);
            long inicio = System.currentTimeMillis();
            answerKeyboard = input.nextLine();
            long fin = System.currentTimeMillis();
            if(answerKeyboard.equals(keyboard[posicion])){
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
    public static void wordsEnglish(){
        Scanner input = new Scanner(System.in);
        Random number = new Random();
        String[] words = {"connect", "dog", "cat", "hat", "jam", "lap", "sad", "dad", "fit", "log", "kid", "gas", "was", "sad", "ask", "fast", "fact", "task", "plank", "adds", "plug", "look", "bear", "pizza", "before", "the", "bite", "fox", "beneath", "where", "far", "in", "sky", "eye", "is", "map", "note", "rope", "hope", "home", "mine", "line"};
        System.out.println("***WORDS***");
        System.out.println("");
        System.out.println("TYPE THE WORDS CORRECTLY: ");
        while(true){
           String answerWord;
            int posicion = number.nextInt(words.length);
            System.out.println(words[posicion]);
            long inicio = System.currentTimeMillis();
            answerWord = input.nextLine();
            long fin = System.currentTimeMillis();
            if(answerWord.equals(words[posicion])){
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
    public static void sentencesEnglish(){
        Scanner input = new Scanner(System.in);
        Random number = new Random();
        String[] sentences = {"The cabin that they bought resides next to the big snowy mountain.", "The entrance to the cave is narrow, even without entering you can already feel the air of your lungs leaving.", "The family restaurant is located near the border of Hurricane, Utah.", "The rope needed to climb the mountain is right beside you.", "The oak tree is the home to many squirrels", "The City's Hospital is near the center of the city, where the statue of the angel lives.", "Old Stan used to fish in the lake with his grandchildren before he passed away.", "My cat is used to jumping around when it meets someone new."};
        System.out.println("***SENTENCES***");
        System.out.println("");
        System.out.println("TYPE THE NEXT SENTENCES CORRECTLY: ");
        while(true){
            String answerSentence;
            int posicion = number.nextInt(sentences.length);
            System.out.println(sentences[posicion]);
            long inicio = System.currentTimeMillis();
            answerSentence = input.nextLine();
            long fin = System.currentTimeMillis();
            if(answerSentence.equals(sentences[posicion])){
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
    public static void paragraphsEnglish(){
        Scanner input = new Scanner(System.in);
        Random number = new Random();
        String[] paragraphs = {"The sun rises after the moon’s shift is done, greeting the birds, revealing the secrets the river hides. The flowers, gleefully, show their eyes to the bumblebees. The despairing darkness becomes a hopeful light. Plants, blissfully, hold the magnet together with the help of the near ending star, the animals, grateful for another day, can only rejoice that the star is there once again to greet them.", "Management cares about their employees, and it’s time consuming and expensive to hire and train new ones, not to mention the occasional legal fees and the hassle of covering up “accidents”, so they installed reinforced doors on either side of the office. In the unlikely event that an intruder visits you here. You can open and shut the east and west doors by pressing the big red buttons in the doorways."};
        System.out.println("***PARAGRAPHS***");
        System.out.println("");
        System.out.println("INTRODUCE THE NEXT PARAGRAPHS CORRECTLY: ");
        System.out.println("");
        while(true){
            String answerParagraph;
            int posicion = number.nextInt(paragraphs.length);
            System.out.println(paragraphs[posicion]);
            long inicio = System.currentTimeMillis();
            answerParagraph = input.nextLine();
            long fin = System.currentTimeMillis();
            if(answerParagraph.equals(paragraphs[posicion])){
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
    public static void problemasFisica(){
        Scanner input = new Scanner (System.in);
        Random number = new Random();
        
        System.out.println("");
        System.out.println("***PROBLEMAS DE FÍSICA***");
        System.out.println("");
        
    
    }
}
