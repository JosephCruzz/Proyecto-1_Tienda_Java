//Joseph Cruz Proyecto Tienda en Java.

import java.util.Scanner;

public class Cruz_Joseph_ProyectoTienda {    
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        leer.useDelimiter("\\n");
        double caja=0;
        boolean Salir=true;
        int codigo_producto_vender=0;
        double cantidad_kilogramos;
        double azucar_contador=0;
        String puede_comprar_producto;
        String puede_comprar_productolowercase;
        String desea_comprar_otro_producto;
        String desea_otro_producto;
        String tipocliente;
        String tipo_cliente;
        double temp;
        double temp_azucar;
        double temp_avena;
        double temp_trigo;
        double temp_maiz;
        double precio_azucar_venta_total;
        double precio_avena_venta_total;
        double precio_maiz_venta_total;
        double precio_trigo_venta_total;
        double precio_azucar_venta=30;
        double precio_maiz_venta=20;
        double precio_avena_venta=25;
        double precio_trigo_venta=32;
        double compra_kilogramos_azucar=0;
        double compra_kilogramos_avena=0;
        double compra_kilogramos_trigo=0;
        double compra_kilogramos_maiz=0;
        double suma=0;
        double trigo_contador=0;
        double maiz_contador=0;
        double avena_contador=0;
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
                    temp=leer.nextInt();
                    caja=caja+temp;                    
                    System.out.println("Usted ha ingresado " +temp+ " Lps a su caja.");
                    System.out.println("Su saldo total es: "+caja);
                    System.out.println("Presione ENTER para continuar.");
                    String salto=leer.next();
                    break;
                case 2:
                    do{
                        do{
                    System.out.println("""
                                       Bienvenido a ventas.
                                        Hay tres tipos de clientes.
                                       Cliente tipo A, el cual puede comprar cualquier producto disponible.
                                       Cliente tipo B, el cual solo puede comprar productos con codigo 1,2,y 3.
                                       Cliente tipo C, el cual solo puede comprar productos con codigo 4.
                                       Elija que tipo de cliente es (solo escriba la letra correspondiente del tipo de cliente, por ejemplo si quiere el cliente A solo escriba la letra A.).""");
                    tipocliente=leer.next();
                    tipo_cliente=tipocliente.toUpperCase();
                    
                        
                    if ("A".contentEquals(tipo_cliente)){
                        System.out.println("Usted eligio el tipo de cliente "+tipo_cliente+" usted puede comprar cualquier producto disponible.");
                        System.out.println("Ingrese el codigo del producto a vender.");
                        System.out.println("1) Azucar Lps. 30 \n2) Avena Lps. 25 \n" +
                                            "3) Trigo Lps 32 \n" +
                                            "4) Maiz Lps 20 ");
                        codigo_producto_vender=leer.nextInt(); 
                        do{
                        if (codigo_producto_vender==1){
                            do{
                            System.out.println("Usted escogio el producto: Azucar\nEl precio de venta es de 30 Lps.\n ¿Puede usted comprar este producto?");
                            puede_comprar_producto=leer.next();
                            puede_comprar_productolowercase=puede_comprar_producto.toLowerCase();
                            if ("si".contentEquals(puede_comprar_productolowercase)){
                                System.out.println("Ingrese la cantidad de kilogramos que desea comprar.");
                                temp_azucar=leer.nextDouble();
                                azucar_contador++;
                                compra_kilogramos_azucar=compra_kilogramos_azucar+temp_azucar;
                                System.out.println("Desea usted comprar otro producto?");
                                
                                
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
                               temp_avena=leer.nextDouble();
                                avena_contador++;
                                 compra_kilogramos_avena=compra_kilogramos_avena+temp_avena;
                                
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
                                temp_trigo=leer.nextDouble();
                                compra_kilogramos_trigo=compra_kilogramos_trigo+temp_trigo;
                                trigo_contador++;
                                                                
                                
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
                                temp_maiz=leer.nextDouble();
                                maiz_contador++;
                                compra_kilogramos_maiz=compra_kilogramos_maiz+temp_maiz;
                            }else if ("no".contentEquals(puede_comprar_productolowercase)){
                                System.out.println("Usted no puede comprar este producto.");
                            }else{
                                System.out.println("Usted ingreso una palabra incorrecta le estamos pregunando si puede comprar el producto.\nResponda con si, o no.");
                            }
                            }while (!"si".contentEquals(puede_comprar_productolowercase)&&(!"no".contentEquals(puede_comprar_productolowercase)));
                        }else{
                            System.out.println("Usted eligio un numero que no es de 1-4 porfavor elegir un numero dentro de esos valores los cuales son los productos disponibles.");
                            System.out.println("Ingrese otra vez el codigo del producto a vender del 1-4");
                            codigo_producto_vender=leer.nextInt();
                        }
                        }while ((codigo_producto_vender!=1)&&(codigo_producto_vender!=2)&&(codigo_producto_vender!=3)&&(codigo_producto_vender!=4));
                            
                        
                        
                        
                    }else if ("B".contentEquals(tipo_cliente)){                    
                           
                       
                        System.out.println("Usted eligio el tipo de cliente B.\n Solo puede comprar productos con codigo 1,2,y 3.");  
                          System.out.println("1) Azucar Lps. 30 \n2) Avena Lps. 25 \n" +
                                            "3) Trigo Lps 32 \n");
                        codigo_producto_vender=leer.nextInt(); 
                        do{
                        if (codigo_producto_vender>=4||codigo_producto_vender<=0){
                            System.out.println("Usted eligio un codigo de producto invalido por lo cual no se puede comprar con el tipo de cliente actual, por favor elija un codigo combatible con su tipo de cliente.");
                            codigo_producto_vender=leer.nextInt(); 
                        }
                       if (codigo_producto_vender==1){
                            do{
                            System.out.println("Usted escogio el producto: Azucar\nEl precio de venta es de 30 Lps.\n ¿Puede usted comprar este producto?");
                            puede_comprar_producto=leer.next();
                            puede_comprar_productolowercase=puede_comprar_producto.toLowerCase();
                            if ("si".contentEquals(puede_comprar_productolowercase)){
                                System.out.println("Ingrese la cantidad de kilogramos que desea comprar.");
                               temp_azucar=leer.nextInt();
                                azucar_contador++;
                                compra_kilogramos_azucar=compra_kilogramos_azucar+temp_azucar;
                                System.out.println("Desea usted comprar otro producto?");
                                
                                
                            }else if ("no".contentEquals(puede_comprar_productolowercase)){
                                System.out.println("Usted no puede comprar este producto.");
                                
                            }else{
                                System.out.println("Usted ingreso una palabra incorrecta le estamos preguntando si puede comprar el producto.\nResponda con si, o no.");
                            }
                            }while (!"si".contentEquals(puede_comprar_productolowercase)&&(!"no".contentEquals(puede_comprar_productolowercase)));
                        }else if  (codigo_producto_vender==2){
                            do{
                            System.out.println("Usted escogio el producto: Avena \nEl precio de venta es de 25 Lps.\n ¿Puede usted comprar este producto?");
                            puede_comprar_producto=leer.next();
                            puede_comprar_productolowercase=puede_comprar_producto.toLowerCase();
                            if ("si".contentEquals(puede_comprar_productolowercase)){
                                System.out.println("Ingrese la cantidad de kilogramos que desea comprar.");
                                temp_avena=leer.nextInt();
                                avena_contador++;
                                 compra_kilogramos_avena=compra_kilogramos_avena+temp_avena;
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
                                temp_trigo=leer.nextDouble();
                                compra_kilogramos_trigo=compra_kilogramos_trigo+temp_trigo;
                                trigo_contador++;
                            }else if ("no".contentEquals(puede_comprar_productolowercase)){
                                System.out.println("Usted no puede comprar este producto.");
                            }else{
                                System.out.println("Usted ingreso una palabra incorrecta le estamos pregunando si puede comprar el producto.\nResponda con si, o no.");
                            }
                            }while (!"si".contentEquals(puede_comprar_productolowercase)&&(!"no".contentEquals(puede_comprar_productolowercase)));
                        }
                        }while (codigo_producto_vender>=4||codigo_producto_vender<=0);
                    }else if ("C".contentEquals(tipo_cliente)){
                        System.out.println("Usted eligio el tipo de cliente C.\n Solo puede comprar productos con el codigo 4.");  
                        System.out.println("4. Maíz Lps 20 ");
                        codigo_producto_vender=leer.nextInt(); 
                        do{
                      
                        if (codigo_producto_vender==4){
                            do{
                            System.out.println("Usted escogio el producto: Maiz\nEl precio de venta es 20 Lps.\n ¿Puede usted comprar este producto?");
                            puede_comprar_producto=leer.next();
                            puede_comprar_productolowercase=puede_comprar_producto.toLowerCase();
                            if ("si".contentEquals(puede_comprar_productolowercase)){
                                System.out.println("Ingrese la cantidad de kilogramos que desea comprar.");
                                temp_maiz=leer.nextDouble();
                                maiz_contador++;
                                compra_kilogramos_maiz=compra_kilogramos_maiz+temp_maiz;
                            }else if ("no".contentEquals(puede_comprar_productolowercase)){
                                System.out.println("Usted no puede comprar este producto.");
                            }else{
                                System.out.println("Usted ingreso una palabra incorrecta le estamos pregunando si puede comprar el producto.\nResponda con si, o no.");
                            }
                            }while (!"si".contentEquals(puede_comprar_productolowercase)&&(!"no".contentEquals(puede_comprar_productolowercase)));
                        }
                        if (codigo_producto_vender>4||codigo_producto_vender<=3){
                            System.out.println("Usted eligio un codigo de producto invalido por lo cual no se puede comprar con el tipo de cliente actual, por favor elija un codigo combatible con su tipo de cliente.");
                            codigo_producto_vender=leer.nextInt(); 
                        }
                        }while (codigo_producto_vender>4||codigo_producto_vender<=3);
                        
                        
                        
                        
                    }
                        }while (!"A".contentEquals(tipo_cliente)&&(!"B".contentEquals(tipo_cliente)&&(!"C".contentEquals(tipo_cliente))));
                     System.out.println("Desea usted comprar otro producto?");
                                desea_otro_producto=leer.next();
                                desea_comprar_otro_producto=desea_otro_producto.toLowerCase();
                                if (("si".contentEquals(desea_comprar_otro_producto))){
                                    System.out.println("El programa le regresara a comprar otro producto");
                                
                    }else if (("no".contentEquals(desea_comprar_otro_producto))){
                                    System.out.println("Usted ingreso que no quiere comprar otro producto se pasara a facturacion.");
                    
                    }else{
                                    System.out.println("Usted ingreso una palabra invalida se pasara a facturacion.");
                    }
                            
                            
                    }while (("si".contentEquals(desea_comprar_otro_producto)));
                     System.out.println("*****************************************************************");
                    System.out.println("******************** Bienvenido a Facturacion *******************");
                    System.out.println("*****************************************************************");
                    System.out.println("                                                               ");
                    System.out.println("Cantidad de kilogramos de azucar comprada: "+compra_kilogramos_azucar);
                    System.out.println("Precio de cada kilogramo de azucar: "+precio_azucar_venta+" Lps");
                    precio_azucar_venta_total=compra_kilogramos_azucar*precio_azucar_venta;
                    System.out.println("Total de precio en Azucar:"+precio_azucar_venta_total); 
                    System.out.println("                                                               ");
                    System.out.println("Cantidad de kilogramos de avena comprada: "+compra_kilogramos_avena);
                    System.out.println("Precio de cada kilogramo de avena: "+precio_avena_venta+" Lps");
                    precio_avena_venta_total=compra_kilogramos_avena*precio_avena_venta;
                    System.out.println("Total de precio en avena:"+precio_avena_venta_total); 
                    System.out.println("                                                               ");
                    System.out.println("Cantidad de kilogramos de trigo comprada: "+compra_kilogramos_trigo);
                    System.out.println("Precio de cada kilogramo de trigo: "+precio_trigo_venta+" Lps");
                    precio_trigo_venta_total=compra_kilogramos_trigo*precio_trigo_venta;
                    System.out.println("Total de precio en trigo:"+precio_trigo_venta_total);
                    System.out.println("                                                               ");
                    System.out.println("Cantidad de kilogramos de maiz comprada: "+compra_kilogramos_maiz);
                    System.out.println("Precio de cada kilogramo de maiz: "+precio_maiz_venta+" Lps");
                    precio_maiz_venta_total=compra_kilogramos_maiz*precio_maiz_venta;
                    System.out.println("Total de precio en maiz:"+precio_maiz_venta_total);
                    System.out.println("Presione ENTER para continuar.");
                    salto=leer.next();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                    
                    
                    
                               
            }
        }
    }
}
                    
           


                   
                    
                    
                    
                    
                    

    
    
