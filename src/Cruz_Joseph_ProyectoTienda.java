//Joseph Cruz Proyecto Tienda en Java.

import java.util.Scanner;

public class Cruz_Joseph_ProyectoTienda {    
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        leer.useDelimiter("\\n");
        double caja=0;
        boolean Salir=true;
        int codigo_producto_vender=0;
        int cantidad_kilogramos;
        String puede_comprar_producto;
        String puede_comprar_productolowercase;
        double compra_kilogramos;
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
            System.out.println("************************(6) Ver Inventario ********************");
            System.out.println("***************************************************************");
            System.out.println("************************(7) Salir del Sistema *****************");
            System.out.println("***************************************************************");
            System.out.println("Elija una de las opciones ingresando el numero correspondiente a la opcion que desea ingresar.");
            int menu=leer.nextInt();
            switch (menu){
                case 1:
                    System.out.println("Usted ha abierto la caja.\nA continuacion ingrese cuando efectivo desea ingresar a caja.");
                    caja=leer.nextDouble();
                    System.out.println("Usted ha ingresado " +caja+ " Lps a su caja.");
                    System.out.println("Presione ENTER para continuar.");
                    String salto=leer.next();
                case 2:
                    System.out.println("""
                                       Bienvenido a ventas.
                                        Hay tres tipos de clientes.
                                       Cliente tipo A, el cual puede comprar cualquier producto disponible.
                                       Cliente tipo B, el cual solo puede comprar productos con codigo 1,2,y 3.
                                       Cliente tipo C, el cual solo puede comprar productos con codigo 4.
                                       Elija que tipo de cliente es (solo escriba la letra correspondiente del tipo de cliente, por ejemplo si quiere el cliente A solo escriba la letra A.).""");
                    String tipocliente=leer.next();
                    String tipo_cliente=tipocliente.toUpperCase();
                    do{
                        
                    if ("A".contentEquals(tipo_cliente)){
                        System.out.println("Usted eligio el tipo de cliente "+tipo_cliente+" usted puede comprar cualquier producto disponible.");
                        System.out.println("Ingrese el codigo del producto a vender.");
                        codigo_producto_vender=leer.nextInt(); 
                        
                        if (codigo_producto_vender==1){
                            do{
                            System.out.println("Usted escogio el producto: Azucar\nEl precio de venta es de 30 Lps.\n ¿Puede usted comprar este producto?");
                            puede_comprar_producto=leer.next();
                            puede_comprar_productolowercase=puede_comprar_producto.toLowerCase();
                            if ("si".contentEquals(puede_comprar_productolowercase)){
                                System.out.println("Ingrese la cantidad de kilogramos que desea comprar.");
                                compra_kilogramos=leer.nextDouble();
                            }else if ("no".contentEquals(puede_comprar_productolowercase)){
                                System.out.println("Usted no puede comprar este producto.");
                            }else{
                                System.out.println("Usted ingreso una palabra incorrecta le estamos pregunando si puede comprar el producto.\nResponda con si, o no.");
                            }
                            }while (!"si".contentEquals(puede_comprar_productolowercase)&&(!"no".contentEquals(puede_comprar_productolowercase)));
                        }else if  (codigo_producto_vender==2){
                            do{
                            System.out.println("Usted escogio el producto: Avena \nEl precio de venta es de 25 Lps.\n ¿Puede usted comprar este producto?");
                            puede_comprar_producto=leer.next();
                            puede_comprar_productolowercase=puede_comprar_producto.toLowerCase();
                            if ("si".contentEquals(puede_comprar_productolowercase)){
                                System.out.println("Ingrese la cantidad de kilogramos que desea comprar.");
                                compra_kilogramos=leer.nextDouble();
                            }else if ("no".contentEquals(puede_comprar_productolowercase)){
                                System.out.println("Usted no puede comprar este producto.");
                            }else{
                                System.out.println("Usted ingreso una palabra incorrecta le estamos pregunando si puede comprar el producto.\nResponda con si, o no.");
                            }
                            }while (!"si".contentEquals(puede_comprar_productolowercase)&&(!"no".contentEquals(puede_comprar_productolowercase))); 
                        }else if (codigo_producto_vender==3){
                            do{
                            System.out.println("Usted escogio el producto: trigo\nEl precio de venta es 32 Lps.\n ¿Puede usted comprar este producto?");
                            puede_comprar_producto=leer.next();
                            puede_comprar_productolowercase=puede_comprar_producto.toLowerCase();
                            if ("si".contentEquals(puede_comprar_productolowercase)){
                                System.out.println("Ingrese la cantidad de kilogramos que desea comprar.");
                                compra_kilogramos=leer.nextDouble();
                            }else if ("no".contentEquals(puede_comprar_productolowercase)){
                                System.out.println("Usted no puede comprar este producto.");
                            }else{
                                System.out.println("Usted ingreso una palabra incorrecta le estamos pregunando si puede comprar el producto.\nResponda con si, o no.");
                            }
                            }while (!"si".contentEquals(puede_comprar_productolowercase)&&(!"no".contentEquals(puede_comprar_productolowercase)));
                        }else if (codigo_producto_vender==4){
                            do{
                            System.out.println("Usted escogio el producto: Maiz\nEl precio de venta es 20 Lps.\n ¿Puede usted comprar este producto?");
                            puede_comprar_producto=leer.next();
                            puede_comprar_productolowercase=puede_comprar_producto.toLowerCase();
                            if ("si".contentEquals(puede_comprar_productolowercase)){
                                System.out.println("Ingrese la cantidad de kilogramos que desea comprar.");
                                compra_kilogramos=leer.nextDouble();
                            }else if ("no".contentEquals(puede_comprar_productolowercase)){
                                System.out.println("Usted no puede comprar este producto.");
                            }else{
                                System.out.println("Usted ingreso una palabra incorrecta le estamos pregunando si puede comprar el producto.\nResponda con si, o no.");
                            }
                            }while (!"si".contentEquals(puede_comprar_productolowercase)&&(!"no".contentEquals(puede_comprar_productolowercase)));
                        }else{
                            break;
                        }
                    
                            
                        
                        
                        
                    }else if ("B".contentEquals(tipo_cliente)){                    
                           
                       
                        System.out.println("Usted eligio el tipo de cliente B.\n Solo puede comprar productos con codigo 1,2,y 3.");  
                        codigo_producto_vender=leer.nextInt(); 
                        do{
                        if (codigo_producto_vender>=4||codigo_producto_vender<=0){
                            System.out.println("Usted eligio un codigo de producto invalido por lo cual no se puede comprar con el tipo de cliente actual, por favor elija un codigo combatible con su tipo de cliente.");
                            codigo_producto_vender=leer.nextInt(); 
                        }
                       
                        }while (codigo_producto_vender>=4||codigo_producto_vender<=0);
                    }
                    }while (!"A".contentEquals(tipo_cliente)&&(!"B".contentEquals(tipo_cliente)&&(!"C".contentEquals(tipo_cliente))));
            }
        }
    }
}
                    
           


                   
                    
                    
                    
                    
                    

    
    
