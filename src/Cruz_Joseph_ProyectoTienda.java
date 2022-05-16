import java.util.Scanner;

//Joseph Cruz Proyecto Tienda
public class Cruz_Joseph_ProyectoTienda {
    static double azucar = 0.0;
    static double avena = 0.0;
    static double trigo = 0.0;
    static double maiz = 0.0;
    static double azucarCompras = 0.0;
    static double avenaComprasB = 0.0;
    static double avenaComprasC = 0.0;
    static double trigoCompras = 0.0;
    static double maizCompras = 0.0;
    static double banco = 0.0;
    static int    count_compras = 0;
    static int    count_ventas = 0;
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp;
        double cuentaCaja=0;
        int menu;
        String tipoCliente;
        String proveedores;
        boolean abierto=false;
        
        do{
            System.out.println("Seleccione una opcion");
            System.out.println("0) Productos");
            System.out.println("1) Abrir Caja");
            System.out.println("2) Ventas");
            System.out.println("3) Compras");
            System.out.println("4) Reportes");
            System.out.println("5) Cierre de Caja");
            System.out.println("0) Salir del Sistema");
            menu = sc.nextInt();
            sc.nextLine();

            switch(menu){
                case 0:
                    productos();
                    break;
                case 1:
                    abierto = true;
                    System.out.println("Su efectivo actual es de: "+cuentaCaja);
                    if(cuentaCaja==0){
                        System.out.println("Ingrese cuanto dinero desea adicionar");
                        temp = sc.nextInt();
                        cuentaCaja = cuentaCaja+temp;
                        System.out.println("Actualizado cuenta actual: "+cuentaCaja);
                    }
                    break;
                case 2:
                    if(abierto){
                    int producto;
                    double azucarVenta=0, avenaVenta=0, trigoVenta=0, maizVenta=0;
                    do{
                        System.out.println("Ingrese el tipo cliente -A -B -C");
                        tipoCliente = sc.nextLine();
                        tipoCliente = tipoCliente.toUpperCase();
                        
                        if(!"A".equals(tipoCliente) & !"B".equals(tipoCliente) & !"C".equals(tipoCliente)){
                            System.out.println("Ingrese un tipo de cliente valido");
                        }else if("A".equals(tipoCliente)){
                            String continuar;
                            do{
                                productos();
                                do{
                                    System.out.println("Ingrese el codigo del producto");
                                    producto = sc.nextInt();
                                    productosValidacion(producto,1);
                                }while(producto!=1 & producto!=2 & producto!=3 & producto!=4);
                                
                                double cuentaCliente, kilogramos;
                                System.out.println("Ingrese su efectivo");
                                cuentaCliente = sc.nextDouble();
                                System.out.println("Ingrese la cantidad de kilogramos");
                                kilogramos = sc.nextDouble();

                                if(cuentaCliente<precioVenta(producto)*kilogramos){
                                    System.out.println("Su saldo es insuficiente para realizar esta compra");
                                }else{
                                    System.out.println("Su compra fue efectuada");
                                    sumarProducto(producto, kilogramos);
                                    switch(producto){
                                        case 1: azucarVenta = azucarVenta+kilogramos; break;
                                        case 2: avenaVenta = avenaVenta+kilogramos; break;
                                        case 3: trigoVenta = trigoVenta+kilogramos; break;
                                        default: maizVenta = maizVenta+kilogramos;
                                    }
                                }
                                
                                sc.nextLine();
                                System.out.println("Desea seguir comprando? s/n");
                                continuar = sc.nextLine();
                            }while(!"N".equals(continuar) & !"n".equals(continuar));
                            
                        }else if("B".equals(tipoCliente)){
                            String continuar;
                            do{
                                productos();
                                do{
                                    System.out.println("Ingrese el codigo del producto");
                                    producto = sc.nextInt();
                                    productosValidacion(producto,2);
                                }while(producto!=1 & producto!=2 & producto!=3);
                                
                                double cuentaCliente, kilogramos;
                                System.out.println("Ingrese su efectivo");
                                cuentaCliente = sc.nextDouble();
                                System.out.println("Ingrese la cantidad de kilogramos");
                                kilogramos = sc.nextDouble();
                                
                                if(cuentaCliente<precioVenta(producto)*kilogramos){
                                    System.out.println("Su saldo es insuficiente para realizar esta compra");
                                }else{
                                    System.out.println("Su compra fue efectuada");
                                    sumarProducto(producto, kilogramos);
                                    switch(producto){
                                        case 1: azucarVenta = azucarVenta+kilogramos; break;
                                        case 2: avenaVenta = avenaVenta+kilogramos; break;
                                        default: trigoVenta = trigoVenta+kilogramos;
                                    }
                                }
                                
                                sc.nextLine();
                                System.out.println("Desea seguir comprando? s/n");
                                continuar = sc.nextLine();
                            }while(!"N".equals(continuar) & !"n".equals(continuar));
                        }else{
                            String continuar;
                            do{
                                productos();
                                do{
                                    System.out.println("Ingrese el codigo del producto");
                                    producto = sc.nextInt();
                                    productosValidacion(producto,3);
                                }while(producto!=4);
                                
                                double cuentaCliente, kilogramos;
                                System.out.println("Ingrese su efectivo");
                                cuentaCliente = sc.nextDouble();
                                System.out.println("Ingrese la cantidad de kilogramos");
                                kilogramos = sc.nextDouble();
                                
                                if(cuentaCliente<precioVenta(producto)*kilogramos){
                                    System.out.println("Su saldo es insuficiente para realizar esta compra");
                                }else{
                                    System.out.println("Su compra fue efectuada");
                                    sumarProducto(producto, kilogramos);
                                    maizVenta = maizVenta+kilogramos;
                                }
                                
                                sc.nextLine();
                                System.out.println("Desea seguir comprando? s/n");
                                continuar = sc.nextLine();
                            }while(!"N".equals(continuar) & !"n".equals(continuar));
                        } 
                    }while(!"A".equals(tipoCliente) & !"B".equals(tipoCliente) & !"C".equals(tipoCliente));
                    double subtotal=0.0, total;
                    System.out.println("-----------------Facturacion-----------------");
                    if(azucarVenta!=0 & azucarVenta>0){
                        System.out.println("Azucar -> Precio Unitario: 30   Kilogramos: "+azucarVenta);
                        subtotal = subtotal + (azucarVenta*30);
                    }
                    if(avenaVenta!=0 & avenaVenta>0){
                        System.out.println("Avena -> Precio Unitario: 25    Kilogramos: "+avenaVenta);
                        subtotal = subtotal + (avenaVenta*25);
                    }
                    if(trigoVenta!=0 & trigoVenta>0){
                        System.out.println("Trigo -> Precio Unitario: 32    Kilogramos: "+trigoVenta);
                        subtotal = subtotal + (trigoVenta*32);
                    }
                    if(maizVenta!=0 & maizVenta>0){
                        System.out.println("Trigo -> Precio Unitario: 20    Kilogramos: "+maizVenta);
                        subtotal = subtotal + (trigoVenta*20);
                    }
                    System.out.println("Subtotal: "+subtotal);
                    if(subtotal>5000){
                        subtotal = subtotal - (subtotal*0.1);
                        System.out.println("Descuento 5%");
                    }
                    else if(subtotal>=1000){
                        subtotal = subtotal - (subtotal*0.05);
                        System.out.println("Descuento 10%");
                    }
                    else{System.out.println("Sin Descuento");}
                    total = subtotal + (subtotal*0.07);
                    System.out.println("Total: "+total);
                    cuentaCaja = cuentaCaja+total;
                    System.out.println("Caja: "+cuentaCaja);
                    
                    }else{System.out.println("Abra la caja primero");}
                    count_ventas++;
                    break;
                case 3:
                    if(abierto){
                    int productoProveedor;
                    String tieneProducto;
                    do{
                        double totalCompras=0.0;
                        System.out.println("Ingrese el tipo de proveedor -A -B -C");
                        proveedores = sc.nextLine();
                        proveedores = proveedores.toUpperCase();
                        
                        if(!"A".equals(proveedores) & !"B".equals(proveedores) & !"C".equals(proveedores)){
                            System.out.println("Ingrese un proveedor valido");
                        }else if("A".equals(proveedores)){
                            productos();
                            
                            do{
                                System.out.println("Ingrese el codigo del producto");
                                productoProveedor = sc.nextInt();
                                productoProveedorValidacion(productoProveedor,1);
                            }while(productoProveedor!=1 & productoProveedor!=4);
                            sc.nextLine();
                            do{
                                System.out.println("Tiene el producto s/n (Simule al proveedor)");
                                tieneProducto = sc.nextLine();
                            }while(!"s".equals(tieneProducto) & !"n".equals(tieneProducto));
                            
                            double kilogramos;
                            System.out.println("Ingrese los kilogramos que usted desea comprar");
                            kilogramos = sc.nextDouble();
                            
                            if("n".equals(tieneProducto)){
                                System.out.println("El proveedor no tiene dicho producto");
                            }else{
                                if(cuentaCaja<precioCompra(productoProveedor,0)*kilogramos){
                                    System.out.println("No se puede pagar compra");
                                }else{
                                    totalCompras = precioCompra(productoProveedor,0)*kilogramos;
                                    sumarProductoCompras(productoProveedor, kilogramos);
                                    cuentaCaja = cuentaCaja-totalCompras;
                                }
                            }
                            System.out.println("----Detalles----");
                            System.out.println("Total: "+totalCompras);
                            System.out.println("Caja: "+cuentaCaja);
                        }else if("B".equals(proveedores)){
                            productos();
                            do{
                                System.out.println("Ingrese el codigo del producto");
                                productoProveedor = sc.nextInt();
                                productoProveedorValidacion(productoProveedor,2);
                            }while(productoProveedor!=2 & productoProveedor!=3);
                            sc.nextLine();
                            do{
                                System.out.println("Tiene el producto s/n (Simule al proveedor)");
                                tieneProducto = sc.nextLine();
                            }while(!"s".equals(tieneProducto) & !"n".equals(tieneProducto));
                            
                            double kilogramos;
                            System.out.println("Ingrese los kilogramos que usted desea comprar");
                            kilogramos = sc.nextDouble();
                            
                            if("n".equals(tieneProducto)){
                                System.out.println("El proveedor no tiene dicho producto");
                            }else{
                                if(cuentaCaja<precioCompra(productoProveedor,1)*kilogramos){
                                    System.out.println("No se puede pagar compra");
                                }else{
                                    totalCompras = precioCompra(productoProveedor,1)*kilogramos;
                                    sumarProductoCompras(productoProveedor, kilogramos);
                                    cuentaCaja = cuentaCaja-totalCompras;
                                }
                            }
                            System.out.println("----Detalles----");
                            System.out.println("Total: "+totalCompras);
                            System.out.println("Caja: "+cuentaCaja);
                        }else{
                            productos();
                            do{
                                System.out.println("Ingrese el codigo del producto");
                                productoProveedor = sc.nextInt();
                                productoProveedorValidacion(productoProveedor,3);
                            }while(productoProveedor!=2);
                            sc.nextLine();
                            do{
                                System.out.println("Tiene el producto s/n (Simule al proveedor)");
                                tieneProducto = sc.nextLine();
                            }while(!"s".equals(tieneProducto) & !"n".equals(tieneProducto));
                            
                            double kilogramos;
                            System.out.println("Ingrese los kilogramos que usted desea comprar");
                            kilogramos = sc.nextDouble();
                            
                            if("n".equals(tieneProducto)){
                                System.out.println("El proveedor no tiene dicho producto");
                            }else{
                                if(cuentaCaja<precioCompra(productoProveedor,2)*kilogramos){
                                    System.out.println("No se puede pagar compra");
                                }else{
                                    totalCompras = precioCompra(productoProveedor,2)*kilogramos;
                                    sumarProductoCompras(productoProveedor+2, kilogramos);
                                    cuentaCaja = cuentaCaja-totalCompras;
                                }
                            }
                            System.out.println("----Detalles----");
                            System.out.println("Total: "+totalCompras);
                            System.out.println("Caja: "+cuentaCaja);    
                        }
                    }while(!"A".equals(proveedores) & !"B".equals(proveedores) & !"C".equals(proveedores));
                    count_compras++;
                    }else{System.out.println("Abra la caja primero");}
                    break;
                    
                case 4:
                    double volumenVentas, volumenCompras;
                    int estrella;
                    System.out.println("Cantidad actual de caja: "+cuentaCaja);
                    System.out.println("Num. Compras: "+count_compras);
                    System.out.println("Num. Ventas: "+(count_ventas));
                    volumenVentas=((azucar*30)+(avena*25)+(trigo*32)+(maiz*20));
                    volumenCompras=((azucarCompras*30)+(trigoCompras*32)+
                            (maizCompras*20)+(avenaComprasB*20)+(avenaComprasC*22));
                    System.out.println("Volumen de ventas: "+volumenVentas);
                    System.out.println("Volumen de compras: "+volumenCompras);
                    System.out.println("Margen de ganancias: "+(volumenVentas-volumenCompras));
                    System.out.println("Promedio compra: "+(volumenVentas/4));
                    System.out.println("Promedio venta: "+(volumenCompras/4));
                    if(azucar*30>=avena*25 & azucar*30>=trigo*32 & azucar*30>=maiz*20){
                        System.out.println("El producto con mayor ganancias es la azucar");
                        estrella = 1;
                    }else if(avena*25>=azucar*30 & avena*25>=trigo*32 & avena*25>=maiz*20){
                        System.out.println("El producto con mayor ganancias es la avena");
                        estrella = 2;
                    }else if(trigo*32>=azucar*30 & trigo*32>=avena*25 & trigo*32>=maiz*20){
                        System.out.println("El producto con mayor ganancias es el trigo");
                        estrella = 3;
                    }else{
                        System.out.println("El producto con mayor ganancias es el maiz");
                        estrella = 4;
                    }
                    if(azucarCompras*25>=avenaComprasB*20+(avenaComprasC*22) & azucarCompras*25>=trigoCompras*30 &
                            azucarCompras*25>=maizCompras*18){
                        System.out.println("El producto mas costoso de comprar fue la azucar");
                    }else if(trigoCompras*30>=azucarCompras*25 & trigoCompras*30>=avenaComprasB*20+(avenaComprasC*22) &
                            trigoCompras*30>=maizCompras*18){
                        System.out.println("El producto mas costoso de comprar fue el trigo");
                    }else if(maizCompras*18>=azucarCompras*25 & maizCompras*18>avenaComprasB*20+(avenaComprasC*22) &
                            maizCompras*18>trigoCompras*30){
                        System.out.println("El producto mas costoso de comprar fue el maiz");
                    }else{
                        System.out.println("El producto mas costoso de comprar fue la avena");
                    }
                    switch(estrella){
                        case 1:System.out.println("El producto estrella es la azucar");break;
                        case 2:System.out.println("El producto estrella es la avena");break;
                        case 3:System.out.println("El producto estrella es el trigo");break;
                        default:System.out.println("El producto estrella es el maiz");
                    }
                    break;
                case 5:
                    double cantidadGuardar=0.0;
                    String guardar;
                    System.out.println("Total de ganancia: "+(((azucar*30)+(avena*25)+(trigo*32)+(maiz*20))-(
                            (azucarCompras*30)+(trigoCompras*32)+(maizCompras*20)+(avenaComprasB*20)+(avenaComprasC*22))));
                    System.out.println("Desea guardar en el banco s/n");
                    guardar = sc.nextLine();
                    if("s".equals(guardar)){
                        System.out.println("Ingrese la cantidad a guardar en el banco");
                        do{
                            System.out.println("Debe ser mayor a 0 y menor al 60% del valor en caja actual");
                            cantidadGuardar=sc.nextDouble();
                        }while(cantidadGuardar<=0 | cantidadGuardar>cuentaCaja-(cuentaCaja*0.6));
                        banco = banco+cantidadGuardar;
                        cuentaCaja=cuentaCaja-cantidadGuardar;
                    }
                    abierto=false;
                    azucar = 0.0;
                    avena = 0.0;
                    trigo = 0.0;
                    maiz = 0.0;
                    azucarCompras = 0.0;
                    avenaComprasB = 0.0;
                    avenaComprasC = 0.0;
                    trigoCompras = 0.0;
                    maizCompras = 0.0;
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            }
        }while(menu!=0);
    }
    
    public static void productosValidacion(int x, int y){
        switch (y) {
            case 1:
                if(x!=1 & x!=2 & x!=3 & x!=4){System.out.println("Ingrese el codigo de producto adecuado (1-4)");}break;
            case 2:
                if(x!=1 & x!=2 & x!=3){System.out.println("Ingrese el codigo de producto adecuado (1-3)");}break;
            default:
                if(x!=4){System.out.println("Ingrese el codigo de producto adecuado (4)");}break;
        }
    }
    
    public static int precioVenta(int x){
        switch (x) {
            case 1:return 30;
            case 2:return 25;
            case 3:return 32;
            default:return 20;
        }
    }
    
    public static void sumarProducto(double x, double y){
        if(x==1){azucar = azucar + y;}
        else if(x==2){avena = avena + y;}
        else if(x==3){trigo = trigo + y;}
        else{maiz = maiz + y;}
    }
    
    public static void productoProveedorValidacion(int x, int y){
        switch(y){
            case 1:
                if(x!=1 & x!=4){System.out.println("Ingrese el codigo de producto adecuado (1,4)");}
                break;
            case 2:
                if(x!=2 & x!=3){System.out.println("Ingrese el codigo de producto adecuado (2-3)");}
            default:if(x!=2){System.out.println("Ingrese el codigo de producto adecuado (2)");}
        }
    }
    
    public static int precioCompra(int x, int y){
        switch (x) {
            case 1:return 25;
            case 2:if(y==1){return 20;}else if(y==2){return 22;}
            case 3:return 30;
            default:return 18;
        }
    }
    
    public static void sumarProductoCompras(double x, double y){
        if(x==1){azucarCompras = azucarCompras + y;}
        else if(x==2){avenaComprasB = avenaComprasB + y;}
        else if(x==3){trigoCompras = trigoCompras + y;}
        else if(x==4){avenaComprasC = avenaComprasC + y;}
        else{maizCompras = maizCompras + y;
        }
    }
    
   public static void productos(){
        System.out.println("| Codigo | Producto | Precio Venta |   Precio Compra  |");
        System.out.println("|    1   |  Azucar  |    Lps. 30   |      Lps. 25     |");
        System.out.println("|    2   |  Avena   |    Lps. 25   | Lps. B(20)-C(22) |");
        System.out.println("|    3   |  Trigo   |    Lps. 32   |      Lps. 30     |");
        System.out.println("|    4   |  Maiz    |    Lps. 20   |      Lps. 18     |");
    }
}

