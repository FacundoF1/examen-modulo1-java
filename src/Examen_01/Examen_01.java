/*
 * EXAMEN: 1° MODULO "TECNICAS DE PROGRAMACIÓN"
 * PROGRAMA "111 MIL PROGRAMADORES"
 */
package Examen_01;
import java.util.Scanner;

/**
 *
 * @author facundo ferrari
 * http://facundoferrari.ml
 */
public class Examen_01 {

    /**
     * INICIO DEL SISTEMA
     */
    public static void main(String[] args) {
        
        //Función para ingresar datos
        Scanner in = new Scanner( System.in );
        
        //Instancio la clase creada en archivo calculos
        Calculos miRutina = new Calculos();
        
        //Impresión e ingreso de datos para inicializar el sistema
        System.out.println("================== BIENVENIDO AL EXÁMEN PRELIMINAR CURSO 111 PROGRAMADORES  ==================");
        System.out.println("");
        
        System.out.println("Ingrese su nombre: ");
        String miNombre = in.nextLine();
        miRutina.establecerNombre( miNombre );
        System.out.println();
        
        System.out.println("Ingrese su Apellido: ");
        String miApellido = in.nextLine();
        miRutina.establecerApellido( miApellido );
        System.out.println();
        
        // Insertamos la clase cabecera que tráe los datos ingresados anteriormente
        miRutina.imprimirCabecera();
        System.out.println("");
        
        //Se crea un bucle donde permite ingresar y salir de los diferentes modulos del sistema
        while(true){
        miRutina.ingresarOpcion();       
                if( miRutina.obtenerOpcion2() == 1 ){
                        while(true){
                            miRutina.ejercicioN1();
                            System.out.println("");
                            System.out.println("===    INGRESAR UNA  OPCIÓN  EJERCÍCIO N° 1  ===\n");
                            System.out.println(" 1 - CONINUAR EN ESTE EJERCÍCIO N° 1 .- ");
                            System.out.println(" 0 - SALIR MENU PRINCIPAL");                                          
                            miRutina.continuar();
                            if( miRutina.obtenerOpcion() == 0) break;
                        }
                    }
                
                
                if( miRutina.obtenerOpcion2() == 2  ){
                    while(true){
                        miRutina.ejercicioN2();
                        System.out.println("");
                            System.out.println("===    INGRESAR UNA  OPCIÓN EJERCÍCIO N° 2   === \n");
                            System.out.println(" 1 - CONINUAR EN ESTE EJERCÍCIO N° 2 .- ");
                            System.out.println(" 0 - SALIR MENU PRINCIPAL");  
                        miRutina.continuar();
                    if( miRutina.obtenerOpcion() == 0) break;
                    }
                }
                
                
                if( miRutina.obtenerOpcion2() == 3 ){
                    while(true){
                        miRutina.ejercicioN3();
                        System.out.println("");
                            System.out.println("===    INGRESAR UNA  OPCIÓN EJERCÍCIO N° 3   === \n");
                            System.out.println(" 1 - CONINUAR EN ESTE EJERCÍCIO N° 3 .- ");
                            System.out.println(" 0 - SALIR MENU PRINCIPAL");  
                        miRutina.continuar();
                    if( miRutina.obtenerOpcion() == 0) break;
                    }
                }
                
                
        
        System.out.println("");
        System.out.println("===    MENÚ PRINCIPAL    === \n");
        System.out.println(" 1 - CONTINUAR EN EL MENÚ PRINCIPAL .- ");
        System.out.println(" 0 - SALIR DEL SISTEMA");          
        miRutina.continuar();      
        if( miRutina.obtenerOpcion() == 0) break;
        }//END WHILE 

    }//END PUBLI CLASS
}//FIN SISTEMA
