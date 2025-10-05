
package proyectopruebademecanografiaycalculo.mental;

import java.util.Random;
import java.util.Scanner;


public class PROYECTOPRUEBADEMECANOGRAFIAYCALCULOMENTAL {
//***PENDIENTE***
    //--- CICLOS, TEMPORIZADOR, INTERFAZ (SI ES POSIBLE)
    public static void main(String[] args) {
        //ESTE ARCHIVO CONTIENE LA HABILIDAD DE ESCOGER LA ACTIVIDAD QUE SE DESEA REALIZAR 
        
        //UTILIDADES ---- SE NECESITA IMPORTAR
        Scanner input = new Scanner(System.in);
        Random number = new Random();
        
        //INICIALIZACION DE VARIABLE
        int acceso;
        
        //MENU DEL PROYECTO
        System.out.println("****FORTALECIMIENTO DE MECANOGRAFÍA Y CALCÚLO MENTAL***");
        System.out.println("¿Mecanografía o Calculo Mental (0 o 1)?");
        acceso = input.nextInt();
        
        if(acceso == 1){
            //DECLARACIÓN DE VARIABLES Y OPERACIONES
            int valor1 = number.nextInt(30), valor2 = number.nextInt(30), res;
            res = valor1 + valor2;
            int RES1, RES3;
            
            //IMPRIMIR E INPUT DEL SCANNER
            System.out.println("***CALCÚLO MENTAL***");
            System.out.println("Responde las siguientes operaciones correctamente, asegurate de responder en valores enteros, sin decimales.");
            System.out.println(valor1 + "+" + valor2);
            RES1 = input.nextInt();
            
            if(RES1 == res){
            System.out.println("¡¡CORRECTO!!");
            //ANOTHER OPERATION D:
            int valor3 = number.nextInt(30), valor4 = number.nextInt(30);
            res = valor3 - valor4;
            
            //RESUELVE, POR FAVOR ._.
            System.out.println(valor3 + "-" + valor4);
            RES3 = input.nextInt();
            
            //IF STATEMENTS AGAIN :D
            if (res == RES3){
                System.out.println("¡¡CORRECTO!!");
            }else{
                System.out.println("¡¡INCORRECTO!!");
            }
            
            }else{
                System.out.println("¡¡INCORRECTO!!");
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
