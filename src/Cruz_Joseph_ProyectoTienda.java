//Joseph Cruz Proyecto Tienda en Java.

import java.util.Scanner;

public class Cruz_Joseph_ProyectoTienda {    
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        boolean Salir=true;
        while (Salir){
            System.out.println("Bienvenido al programa de su tienda, el Menu es el siguiente.");
            System.out.println("***************************************************************");
            System.out.println("************************(1) Abrir Caja ************************");
            System.out.println("***************************************************************");
            System.out.println("************************(2) Ventas ****************************");
            System.out.println("***************************************************************");
            System.out.println("************************(3) Compras ***************************");
            System.out.println("***************************************************************");
            System.out.println("************************(4) Reportes **************************");
            System.out.println("***************************************************************");
            System.out.println("************************(5) Cierre de Caja ********************");
            System.out.println("***************************************************************");
            System.out.println("************************(6) Salir del Sistema *****************");
            System.out.println("***************************************************************");
            System.out.println("Elija una de las opciones ingresando el numero correspondiente a la opcion que desea ingresar.");
            int menu=leer.nextInt();
            switch (menu){
                case 1:
                    System.out.println("Usted ha abierto la caja.\nA continuacion ingrese cuando efectivo desea ingresar a caja.");
                    double caja=leer.nextDouble();
                    
        }
            
        }
    }
    
}
