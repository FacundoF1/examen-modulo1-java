/*
 * Programa para realizar ejercicios de aplicación.
 */
package Examen_01;
import java.util.Scanner;

/**
 *
 * @author facundo
 * @version 1.0.0
 * @fecha finalización 18 de julio del 2017
 */
public class Calculos {
    Scanner in = new Scanner( System.in ); 
    
    private int Opcion, num,contFila,Opcion2; //Almaceno opción elegido.
    private String Nombre, Apellido;//Almaceno string's elegido.
    
    public void establecerNombre( String ingresoNombre){
        Nombre = ingresoNombre;
    }
    
    public void establecerApellido( String ingresoApellido){
        Apellido = ingresoApellido;
    }
    
    public String obtenerNombre(){
        return Nombre;
    }
    
    public String obtenerApellido(){
        return Apellido;
    }
    
    public void imprimirCabecera(){
        System.out.printf("%1s %30s %30s \n","*===================","INGRESO DEL SÍSTEMA","=======================*");
        System.out.printf("%1s %5s \n","NOMBRE: ", obtenerNombre());
        System.out.printf("%1s %5s \n","APELLIDO: ", obtenerApellido());
        System.out.println("");
        }
    
    public void establecerOpcionMenu( int opcionMenu )
    {
        
        Opcion = opcionMenu; //Guardo la variable opción
    }
    
    public int obtenerOpcion()
    {
        return Opcion;//Retornamos la opción
    }
    
    public void establecerOpcionMenu2( int opcionMenu2 )
    {
        
        Opcion2 = opcionMenu2; //Guardo la variable opción
    }
    
    public int obtenerOpcion2()
    {
        return Opcion2;//Retornamos la opción
    }
    
    // Método mostrar mensaje con variables creadas con anterioridad
    public void mostrarMensaje()
    {  
        System.out.printf("OPCIÓN : \n", obtenerOpcion() );
        
    }
    
    public void ingresarOpcion(){
        
        System.out.println("Por favor ahora ingrese número para continuar \n");
        System.out.println(" 1 - Ejercicio N° 1 \n");
        System.out.println(" 2 - Ejercicio N° 2 \n");
        System.out.println(" 3 - Ejercicio N° 3 \n");
        System.out.println(" 0 - SALIR  \n");
        int miOpcion = in.nextInt();
        establecerOpcionMenu2( miOpcion );
        System.out.println("");
    }
    
    public void opcionContinuar(){
        
        System.out.println("Ingrese un opción: \n");
        System.out.println(" - 2 - PARA CONTINUAR \n");
        System.out.println(" - 1 - PARA SALIR \n");
        int miOpcion = in.nextInt();
        establecerOpcionMenu( miOpcion );
        System.out.println("");
        mostrarMensaje();
    }
    
    public void continuar(){
           
            int miOpcion = in.nextInt();
            establecerOpcionMenu( miOpcion );
            System.out.println("");
            System.out.printf("OPCIÓN ELEGIDA: %d \n", num);
    }
       
    public void contadorFila(int contaFila){
        
        contFila = contaFila;
    } 
    public int contadorFilas(){
        
        return contFila;
    }
   
    public void ejercicioN1(){
        
        int base, altura;
        
        System.out.printf("%1s %30s %30s \n","*********************","EJERCICIO NÚMERO 1","***********************");
        System.out.println("");
        System.out.println(" Programa para calcular el area de una figúra elegida por el Usuario.- ");
        System.out.println("");
        
        System.out.println("Ingrese la Base: \n");
        base = in.nextInt();
        System.out.println("Ingrese la Altura: \n");
        altura = in.nextInt();
        System.out.println("Datos ingresados: \n");
        
        System.out.printf("Base: %2d\n", base);
        System.out.printf("Altura: %2d\n", altura);
        
        System.out.println("Por favor ahora ingrese la figúra para realizar los calculos. \n");
        System.out.println("1. Triángulo \n");
        System.out.println("2. Rectángulo \n");
        System.out.println("3. Cuadrado \n");
        System.out.println("  0 Salir \n");
        
        int miOpcion2 = in.nextInt();
        establecerOpcionMenu2( miOpcion2 );
        System.out.println("");
        
                if(obtenerOpcion2() == 1  ){

                    double triangulo = (base * altura)/2;

                    System.out.printf("El area del Triángulo es: %2f \n", triangulo);
        
                }//end if 1
                if(obtenerOpcion2() == 2 ){

                    double rectangulo = (base * altura);

                    System.out.printf("El area del Rectángulo es: %2f \n", rectangulo);

                }//end if 2
                if(obtenerOpcion2() == 3 ){

                    double cuadrado = (base * base);

                    System.out.printf("El area del Cuadrado es:%2f \n", cuadrado);

                }//end if 3
    }//END EJERCICIO N1
        
    public void ejercicioN2(){
        System.out.printf("%1s %30s %30s \n","*********************","EJERCICIO NÚMERO 2","*********************** \n");
        System.out.println(" Programa para llenar una matriz con nombres de alumnos y sus respectivas calificaciones.-  \n");
        
        //Creación de variables
        int FILAS = 10, COLUMNAS = 6;    
        int i, j,d,f, suma, promedio, maxPromedio,contador;
        
        //Zona inicialización de variables
        maxPromedio = 0;
        promedio = 0;
        suma = 0;
        contador=0;
        f=0;
        String[] nombres = {"Juan", "Carlos","Luisa","Sebastian","Valentina","Veronica","Andrea","Luis","Facundo","Fernanda"};
        String[] apellidos = {"Ramirez", "Gonzales","Vallejos","Arias","Ibiza","Ojeda","Galarza","Prado","Ferrari","Canteros"};
        int [][] A = new int [FILAS][COLUMNAS];//Matriz de carga valores notas de alumnos
        int[] D = new int [1];//Matriz carga para almacenar valor de comparación
        
        //Inicio del ingreso de notas.
        System.out.println("===  INTRODUCIR LAS NOTAS DE LOS ALUMNOS  ===");
        
        //Ciclo estructurado carga de matriz A
        for(i=0; i< FILAS && i< nombres.length && i< apellidos.length; i++){
          System.out.println("Nombre: "+apellidos[i]+" "+nombres[i]); 
        
          for(j=0; j< COLUMNAS && j< 3; j++){
            int nota = j + 1;    
            System.out.println("Nota: "+ nota);
            A [i][j] = in.nextInt();
            suma = suma + A [i][j];
            promedio = suma/nota;  
           }
           //Cargar array colúmna e inicializar suma
           A[i][3] = promedio;
           A[i][4] = i;
           num = A[i][4];
           suma = 0;
           System.out.printf("Promedio: %d \n", promedio);
                
                //Condición para almacenar cantidad de filas a crear
                if( maxPromedio < A[i][3]){
                    //Inicialización de variables
                    contador = 1;
                    contadorFila(contador);
                    maxPromedio = A[i][3];
                 }else if(maxPromedio == A[i][3]){
                     contador++;
                     contadorFila(contador);
                     maxPromedio = A[i][3];
                }//END IF MATRIZ B
                //Array D carga valor para comparar 
                for( d=0;d<D.length;d++){
                        f = contador - 1;
                        A[i][5] = f;
                }//End array D
        
        }//END CICLO CARGA MATRIZ A
        
        //Crear variables de Matriz C para mostrar los Mayores promedios.
        int Fila = contadorFilas();
        int Colum = 1,a,b;
        String [][] C = new String [Fila][Colum];
        
        //Ciclo estructurado impresión de matriz
        System.out.println("===============   Los valores introducidos son:   ===============");
        System.out.println("");
        System.out.println("Apellido: \t"+"Nombre: \t"+"Nota 1: \t"+"Nota: 2 \t"+"Nota: 3 \t");
        for(i=0; i< A.length && i< nombres.length && i< apellidos.length; i++){
         System.out.printf(apellidos[i]+" \t"+nombres[i]+" \t");
          for(j=0; j< A[i].length && j<3; j++){
               System.out.print(A [i][j]+" \t");
          }
         num = A[i][4];
         promedio =A[i][3];
         System.out.println("Promedio: \t"+promedio);
                
                //Condición para almacenar cantidad de filas a crear
                if( maxPromedio <= A[i][3] ){
                     maxPromedio = A[i][3];
                   //Matriz B con Mayor promedio.
                   for(a=0; a<C.length; a++){ 
                        for(b=0; b<C.length && A[i][5] == a; b++){
                                        
                            C[a][0] = apellidos[num]+" "+nombres[num]+" "+"Promedio: "+A[i][3];
                        
                        }//END matriz carga
                   }//End ciclo llenar matriz C
                
                }//END IF mayor promedio

            }//END CICLO IMPRESIÓN MATRIZ A
   
            System.out.println("");
            System.out.println("******  ALUMNOS CON MAYOR PROMEDIO  ******");
        
        //Ciclo impresión matriz C de mayor promedio.
        for(a=0; a<C.length; a++){
            for(b=0;b<C[a].length; b++){
                    
               System.out.print(C [a][b]);
             }
           System.out.println("");
        }//END CICLO IMPRESIÓN C

   }//END EJERCICIO N2
    
   public void ejercicioN3(){
        
        System.out.printf("%1s %30s %30s \n","*********************","EJERCICIO NÚMERO 3","*********************** \n");
        System.out.println(" Programa para manipular 3 números con los cuales se desea obtener promedio y su producto.-  \n");
        
        //Inicializacion de variables con valor
        int a=7, b= 1, c=9;
        double promedio, producto;
        //Inicio del programa
        System.out.println(" Bienvenido al Sistema");
        System.out.println(" ");
        System.out.println("=== Los números a manipular son: ===");
        System.out.println("Número 1: "+ a);
        System.out.println("Número 2: "+ b);
        System.out.println("Número 3: "+ c);
        
        System.out.println("Para elegir la opción a invocar ingrese el número equivalente a la opción: ");
        System.out.println("Opción N° 1: Promedio");
        System.out.println("Opción N° 2: Producto");
        
        //Ingresado opcion por el usuario
        int miOpcion = in.nextInt();
        establecerOpcionMenu2( miOpcion );
        System.out.println("");
        
        //Obtengo la opcion y realizo las consultas
        if( obtenerOpcion2() == 1 ){
            promedio = (a+b+c)/3;
            System.out.printf("Promedio: %4.2f\n", promedio);
        }
        else if( obtenerOpcion2() == 2 ){
            producto = (a*b*c);
            System.out.printf("Producto: %4.2f\n", producto);
        }
        else if( obtenerOpcion2() != 1 || obtenerOpcion2() != 2 ){
            System.out.println("Ingreso un número que contiene ¡¡¡ Opción invalida !!!");
        }
    }//END EJERCICIO N3


    }//END PUBLIC 
