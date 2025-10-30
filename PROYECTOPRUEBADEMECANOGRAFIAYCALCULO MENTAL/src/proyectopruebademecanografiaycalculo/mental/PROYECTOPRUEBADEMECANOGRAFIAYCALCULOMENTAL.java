
package proyectopruebademecanografiaycalculo.mental;

import java.util.Random;
import java.util.Scanner;


public class PROYECTOPRUEBADEMECANOGRAFIAYCALCULOMENTAL {
//***PENDIENTE***
    //--- TEMPORIZADOR, INTERFAZ (SI ES POSIBLE)
    public static void main(String[] args) {
        //ESTE ARCHIVO CONTIENE LA HABILIDAD DE ESCOGER LA ACTIVIDAD QUE SE DESEA REALIZAR 
        
        //UTILIDADES ---- SE NECESITA IMPORTAR
        Scanner input = new Scanner(System.in);
        Random number = new Random();
        
        //INICIALIZACION DE VARIABLE
        int acceso;
        
        //MENU DEL PROYECTO
        System.out.println("****FORTALECIMIENTO DE MECANOGRAFÍA Y CÁLCULO MENTAL***");
        System.out.println("¿Mecanografía o Calculo Mental (0 o 1)?");
        acceso = input.nextInt();
        
        if(acceso == 1){
            //INICIALIZACIÓN DE VARIABLES
            int eleccion, eleccion1;
            //PRUEBA DE MATEMÁTICAS
            System.out.println("*** CÁLCULO MENTAL ***");
            System.out.println("");
            System.out.println("DIFICULTAD");
            System.out.println("");
            System.out.println("FACÍL (0)");
            System.out.println("MEDIA (1)");
            System.out.println("DIFÍCIL (2)");
            //INTRODUCCIÓN DE DATOS
            eleccion = input.nextInt();
            //DECLARACIONES DE IF
            if(eleccion == 0){
                //INICIO DE REDACCIÓN
                System.out.println("*** CÁLCULO MENTAL ***");
                System.out.println("DIFICULTAD: FACÍL");
                System.out.println("¿Qué tipo de operaciones desea realizar?");
                System.out.println("SUMA (1)");
                System.out.println("RESTA (2)");
                System.out.println("MULTIPLICACIÓN (3)");
                System.out.println("DIVISIÓN (4)");
                System.out.println("MIXTO (5)");
                //INTRODUCCIÓN DE DATOS
                eleccion1 = input.nextInt();
                //DECLARACIÓN IF
                if(eleccion1 == 1){
                    System.out.println("***SUMA***");
                    System.out.println("¡Introduce las respuestas correctas!");
                    while(true){
                        //INICIALIZACION DE VARIABLES
                        int num1 = number.nextInt(50), num2 = number.nextInt(50);
                        int res1;
                        System.out.println(num1 + "+" + num2);
                        res1 = input.nextInt();
                        int resultado = num1 + num2;
                        //ESTRUCTURA DE DECISIÓN
                        if(res1 == resultado){
                            System.out.println("¡CORRECTO!");
                        }else{
                            System.out.println("¡INCORRECTO!");
                            break;
                }
                
            }
                }else if(eleccion1 == 2){
                        System.out.println("***RESTA***");
                        System.out.println("¡Introduce las respuestas correctas!");
                        while(true){
                            //INICIALIZACION DE VARIABLES
                            int num1 = number.nextInt(50), num2 = number.nextInt(50);
                            int res1;
                            System.out.println(num1 + "-" + num2);
                            res1 = input.nextInt();
                            int resultado = num1 - num2;
                            //ESTRUCTURA DE DECISIÓN
                            if(res1 == resultado){
                                System.out.println("¡CORRECTO!");
                            }else{
                                System.out.println("¡INCORRECTO!");
                                break;
                    }

                }
                }else if(eleccion1 == 3){
                        System.out.println("***MULTIPLICACIÓN***");
                        System.out.println("¡Introduce las respuestas correctas!");
                       while(true){
                            //INICIALIZACION DE VARIABLES
                            int num1 = number.nextInt(30), num2 = number.nextInt(30);
                            int res1;
                            System.out.println(num1 + "*" + num2);
                            res1 = input.nextInt();
                            int resultado = num1 * num2;
                            //ESTRUCTURA DE DECISIÓN
                            if(res1 == resultado){
                                System.out.println("¡CORRECTO!");
                            }else{
                                System.out.println("¡INCORRECTO!");
                                break;
                    }

                }

                }else if(eleccion1 == 4){
                        System.out.println("***DIVISIÓN***");
                        System.out.println("¡Introduce las respuestas correctas!");
                        while(true){
                            //INICIALIZACION DE VARIABLES
                            int num1 = number.nextInt(30), num2 = number.nextInt(9);
                            int res1;
                            System.out.println(num1 + "/" + num2);
                            res1 = input.nextInt();
                            int resultado = num1 / num2;
                            //ESTRUCTURA DE DECISIÓN
                            if(res1 == resultado){
                                System.out.println("¡CORRECTO!");
                            }else{
                                System.out.println("¡INCORRECTO!");
                                break;
                    }

                }
            }else if(eleccion == 1){
                System.out.println("*** CÁLCULO MENTAL ***");
                System.out.println("DIFICULTAD: MEDIA");
                System.out.println("¿Qué tipo de operaciones desea realizar?");
                System.out.println("SUMA (1)");
                System.out.println("RESTA (2)");
                System.out.println("MULTIPLICACIÓN (3)");
                System.out.println("DIVISIÓN (4)");
                //INTRODUCCIÓN DE DATOS
                eleccion1 = input.nextInt();
                //DECLARACIÓN IF
                if(eleccion1 == 1){
                    System.out.println("***SUMA***");
                    System.out.println("¡Introduce las respuestas correctas!");
                    while(true){
                        //INICIALIZACION DE VARIABLES
                        int num1 = number.nextInt(100), num2 = number.nextInt(100);
                        int res1;
                        System.out.println(num1 + "+" + num2);
                        res1 = input.nextInt();
                        int resultado = num1 + num2;
                        //ESTRUCTURA DE DECISIÓN
                        if(res1 == resultado){
                            System.out.println("¡CORRECTO!");
                        }else{
                            System.out.println("¡INCORRECTO!");
                            break;
                }
                
            }
                }else if(eleccion1 == 2){
                        System.out.println("***RESTA***");
                        System.out.println("¡Introduce las respuestas correctas!");
                        while(true){
                            //INICIALIZACION DE VARIABLES
                            int num1 = number.nextInt(80), num2 = number.nextInt(80);
                            int res1;
                            System.out.println(num1 + "-" + num2);
                            res1 = input.nextInt();
                            int resultado = num1 - num2;
                            //ESTRUCTURA DE DECISIÓN
                            if(res1 == resultado){
                                System.out.println("¡CORRECTO!");
                            }else{
                                System.out.println("¡INCORRECTO!");
                                break;
                    }

                }
                }else if(eleccion1 == 3){
                        System.out.println("***MULTIPLICACIÓN***");
                        System.out.println("¡Introduce las respuestas correctas!");
                        while(true){
                            //INICIALIZACION DE VARIABLES
                            int num1 = number.nextInt(50), num2 = number.nextInt(50);
                            int res1;
                            System.out.println(num1 + "*" + num2);
                            res1 = input.nextInt();
                            int resultado = num1 * num2;
                            //ESTRUCTURA DE DECISIÓN
                            if(res1 == resultado){
                                System.out.println("¡CORRECTO!");
                            }else{
                                System.out.println("¡INCORRECTO!");
                                break;
                    }

                }

                }else if(eleccion1 == 4){
                        System.out.println("***DIVISIÓN***");
                        System.out.println("¡Introduce las respuestas correctas!");
                        while(true){
                            //INICIALIZACION DE VARIABLES
                            int num1 = number.nextInt(60), num2 = number.nextInt(20);
                            int res1;
                            System.out.println(num1 + "/" + num2);
                            res1 = input.nextInt();
                            int resultado = num1 / num2;
                            //ESTRUCTURA DE DECISIÓN
                            if(res1 == resultado){
                                System.out.println("¡CORRECTO!");
                            }else{
                                System.out.println("¡INCORRECTO!");
                                break;
                    }

                }
            }
        
            }else if(eleccion == 2){
                System.out.println("*** CÁLCULO MENTAL ***");
                System.out.println("DIFICULTAD: DIFICÍL");
                System.out.println("¿Qué tipo de operaciones desea realizar?");
                System.out.println("SUMA (1)");
                System.out.println("RESTA (2)");
                System.out.println("MULTIPLICACIÓN (3)");
                System.out.println("DIVISIÓN (4)");
                //INTRODUCCIÓN DE DATOS
                eleccion1 = input.nextInt();
                //DECLARACIÓN IF
                if(eleccion1 == 1){
                    System.out.println("***SUMA***");
                    System.out.println("¡Introduce las respuestas correctas!");
                    while(true){
                        //INICIALIZACION DE VARIABLES
                        int num1 = number.nextInt(3000), num2 = number.nextInt(3000);
                        int res1;
                        System.out.println(num1 + "+" + num2);
                        res1 = input.nextInt();
                        int resultado = num1 + num2;
                        //ESTRUCTURA DE DECISIÓN
                        if(res1 == resultado){
                            System.out.println("¡CORRECTO!");
                        }else{
                            System.out.println("¡INCORRECTO!");
                            break;
                }
                
            }
                }else if(eleccion1 == 2){
                        System.out.println("***RESTA***");
                        System.out.println("¡Introduce las respuestas correctas!");
                        while(true){
                            //INICIALIZACION DE VARIABLES
                            int num1 = number.nextInt(300), num2 = number.nextInt(300);
                            int res1;
                            System.out.println(num1 + "-" + num2);
                            res1 = input.nextInt();
                            int resultado = num1 - num2;
                            //ESTRUCTURA DE DECISIÓN
                            if(res1 == resultado){
                                System.out.println("¡CORRECTO!");
                            }else{
                                System.out.println("¡INCORRECTO!");
                                break;
                    }

                }
                }else if(eleccion1 == 3){
                        System.out.println("***MULTIPLICACIÓN***");
                        System.out.println("¡Introduce las respuestas correctas!");
                        while(true){
                            //INICIALIZACION DE VARIABLES
                            int num1 = number.nextInt(50), num2 = number.nextInt(50);
                            int res1;
                            System.out.println(num1 + "*" + num2);
                            res1 = input.nextInt();
                            int resultado = num1 * num2;
                            //ESTRUCTURA DE DECISIÓN
                            if(res1 == resultado){
                                System.out.println("¡CORRECTO!");
                            }else{
                                System.out.println("¡INCORRECTO!");
                                break;
                    }

                }

                }else if(eleccion1 == 4){
                        System.out.println("***DIVISIÓN***");
                        System.out.println("¡Introduce las respuestas correctas!");
                        while(true){
                            //INICIALIZACION DE VARIABLES
                            int num1 = number.nextInt(100), num2 = number.nextInt(50);
                            int res1;
                            System.out.println(num1 + "/" + num2);
                            res1 = input.nextInt();
                            int resultado = num1 / num2;
                            //ESTRUCTURA DE DECISIÓN
                            if(res1 == resultado){
                                System.out.println("¡CORRECTO!");
                            }else{
                                System.out.println("¡INCORRECTO!");
                                break;
                            }

                        }
                }
        
            }
        }else if(acceso == 0){
            //DECLARACIÓN DE VARIABLES
            int valor, valor1, valor2, input1;

            //FUNCIONAMIENTO DEL PROGRAMA

            //VALOR A ELEGIR ALEATORIO
            valor = number.nextInt(6000);
            valor1 = number.nextInt(7000);
            valor2 = number.nextInt(9000);

            //PROGRAMA EN MARCHA
            System.out.println("***PRUEBA DE MECANOGRAFÍA***");
            System.out.println("INTRODUCE LOS SIGUIENTES VALORES: ");
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
                                    //SIGUIENTE EJERCICIO
                                    String caracteres[] = {"jfdk", "fjkd", "fjd"};
                                    Scanner text = new Scanner(System.in);
                                    String input2;
                                    System.out.println("INTRODUCE LAS SIGUIENTES LETRAS: ");
                                    System.out.println(caracteres[0]);
                                    input2 = text.nextLine();
                                    if(input2.equals(caracteres[0])){
                                        System.out.println("¡¡CORRECTO!!");
                                        System.out.println("SIGUIENTE LINEA:");
                                        System.out.println(caracteres[1]);
                                        input2 = text.nextLine();
                                        if(input2.equals(caracteres[1])){
                                            System.out.println("¡¡CORRECTO!!");
                                            System.out.println("SIGUIENTE LINEA:");
                                            System.out.println(caracteres[2]);
                                            input2 = text.nextLine();
                                            if(input2.equals(caracteres[2])){
                                                System.out.println("¡¡CORRECTO!!");
                                                String Texto[] = {"La hipotenusa es conocida por ser la medida de la suma de los dos catetos de los triángulos elevados al cuadrado, con raíz cuadrada.", "Tales de Mileto propone que la realidad y todo lo que la conforma proviene del agua.", "El hombre es conocido por su constante determinación para adquirir conocimiento."};
                                                System.out.println("INTRODUCE LOS SIGUIENTES TEXTOS CORRECTAMENTE: ");
                                                System.out.println(Texto[0]);
                                                Scanner text1 = new Scanner(System.in);
                                                input2 = text1.nextLine();
                                                if(input2.equals(Texto[0])){
                                                    System.out.println("¡¡CORRECTO!!");
                                                    System.out.println(Texto[1]);
                                                    Scanner text2 = new Scanner(System.in);
                                                    input2 = text2.nextLine();
                                                    if(input2.equals(Texto[1])){
                                                        System.out.println("¡¡CORRECTO!!");  
                                                        System.out.println(Texto[2]);
                                                        Scanner text3 = new Scanner(System.in);
                                                        input2 = text3.nextLine();
                                                        if(input2.equals(Texto[2])){
                                                            System.out.println("¡¡CORRECTO!!"); 
                                                        }else{
                                                            System.out.println("¡¡INCORRECTO!!");
                                                        }
                                                    }else{
                                                        System.out.println("¡¡INCORRECTO!!");
                                                    }
                                                }else{
                                                        System.out.println("¡¡INCORRECTO!!");
                                                }
                                            }else{
                                                System.out.println("¡¡INCORRECTO!!");
                                            }
                                        }else{
                                            System.out.println("¡¡INCORRECTO!!");
                                        }
                                    }else{
                                        System.out.println("¡¡INCORRECTO!!");
                                    }
                
                                }else{
                                System.out.println("Intentalo de nuevo.");
                                }
                }else{
                    System.out.println("Intentalo de nuevo.");
                }

            }else{
                System.out.println("Intentalo de nuevo.");
            }
        }
    }
    
}
