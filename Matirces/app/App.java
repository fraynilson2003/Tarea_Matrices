package app;

import Ejercicios.EjerciciosMatrices;
import util.LeerTeclado;

public class App {

public static void lista(){
    LeerTeclado fn=new LeerTeclado();
    
    EjerciciosMatrices mtr=new EjerciciosMatrices();
    String lista;
    int opcion;
    
    System.out.println("Eliga cual matriz desea imprimir");

    lista="1  : Imprimir la matriz 05 "+
    "\n2  : Imprimir la matriz 07"+
    "\n3  : Imprimir la matriz 12"+
    "\n4  : Imprimir la matriz 13"+
    "\n5  : Imprimir la matriz 15"+
    "\n6  : Imprimir la matriz 17"+
    "\n7  : Imprimir la matriz 18"+
    "\n8  : Imprimir la matriz 21"+
    "\n9  : Imprimir la matriz 25"+
    "\n10 : Imprimir la matriz 27";

    opcion=fn.leer(0, lista);
    String mensaje="\n¿Desea seguir probando matrices?"+
    "\n1 : SI"+
    "\n2 : NO";

    int opcion2;
    switch (opcion) {
        case 1: mtr.transformada05(5, 0);opcion2=fn.leer(0, mensaje) ;
            if (opcion2==1) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                lista();           
            }else{
                System.out.println("\nGracias por usar nuestro aplicativo, vuelva pronto\n");
            }  break;
      
        case 2: mtr.transformada07(5, 0); opcion2=fn.leer(0, mensaje) ;
            if (opcion2==1) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                lista();           
            }else{
                System.out.println("\nGracias por usar nuestro aplicativo, vuelva pronto\n");
            } break;
        case 3: mtr.transformada12(5, 0); opcion2=fn.leer(0, mensaje) ;
        if (opcion2==1) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
                lista();           
            }else{
                System.out.println("\nGracias por usar nuestro aplicativo, vuelva pronto\n");
            } break;
        case 4: mtr.transformada13(5, 0);opcion2=fn.leer(0, mensaje) ;
            if (opcion2==1) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                lista();           
            }else{
                System.out.println("\nGracias por usar nuestro aplicativo, vuelva pronto\n");
            } break;
        case 5: mtr.transformada15(5, 0); opcion2=fn.leer(0, mensaje) ;
            if (opcion2==1) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                lista();           
            }else{
                System.out.println("\nGracias por usar nuestro aplicativo, vuelva pronto\n");
            } break;
        case 6: mtr.transformada17(5, 0); opcion2=fn.leer(0, mensaje) ;
            if (opcion2==1) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                lista();           
            }else{
                System.out.println("\nGracias por usar nuestro aplicativo, vuelva pronto\n");
            } break;
        case 7: mtr.transformada18(5, 0); opcion2=fn.leer(0, mensaje) ;
            if (opcion2==1) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                lista();           
            }else{
                System.out.println("\nGracias por usar nuestro aplicativo, vuelva pronto\n");
            } break;
        case 8: mtr.transformada21(5, 0); opcion2=fn.leer(0, mensaje) ;
            if (opcion2==1) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                lista();           
            }else{
                System.out.println("\nGracias por usar nuestro aplicativo, vuelva pronto\n");
            } break;
        case 9: mtr.transformada25(5, 0); opcion2=fn.leer(0, mensaje) ;
            if (opcion2==1) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                lista();           
            }else{
                System.out.println("\nGracias por usar nuestro aplicativo, vuelva pronto\n");
            } break;
        case 10: mtr.transformada27(5, 0); opcion2=fn.leer(0, mensaje) ;
            if (opcion2==1) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                lista();           
            }else{
            System.out.println("\nGracias por usar nuestro aplicativo, vuelva pronto\n");
            } break;
        default: 
        System.out.println("\nError, por favor vuelva a intentarlo\n"); 
        lista();break; 
    }
}





public static void main(String[] args) {
    lista();
}
    
}
