import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el ejercicio que desea ver. ");
        int opcion = scan.nextInt();

        switch (opcion)
        {
            case 1:
            {
                ejercicio1();
                break;
            }
            case 2:
            {
                ejercicio2();
                break;
            }
            case 3:
            {
                ejercicio3();
                break;
            }
        }
    }
    public static void ejercicio1()
    {
        Scanner scan = new Scanner(System.in);
        /*
        ///a y b
        Autor autor = new Autor("Joshua","Bloch","joshua@email.com",'M');

        ///autor.mostrarAutor();
        ///c y d y f
        Libro libro = new Libro("Effective Java",450,150,autor);
        ///libro.mostrarLibro();
        //e
        System.out.println("Ingrese el nuevo precio que le quiere poner al libro 'Effective Java'. ");
        double nuevoPrecio = scan.nextDouble();
        libro.setPrecio(nuevoPrecio);
        System.out.println("Ingrese el nuevo stock que quiere tener de el libro 'Effective Java'. ");
        int nuevoStock = scan.nextInt();
        libro.setStock(nuevoStock);

        System.out.println("Nuevo precio: " + libro.getPrecio());
        System.out.println("Nuevo stock: " + libro.getStock());

        //g
        libro.mostrarAlgunosAtributos();
        */
        //h MODIFICADO PARA QUE PUEDA HACERSE
        Autor arregloAutores[] =  new Autor[10];
        Libro libro = new Libro("Effective Java",500,100);

        libro.cargarUnArregloDeAutores(arregloAutores,10);
        libro.setAutores(arregloAutores);

        System.out.println("Arreglo con los autores: ");
        libro.mostrarArregloAutores(arregloAutores);
        System.out.println("PUNTO G MODIFICADO.");
        libro.mostrarAlgunosAtributosArray();
    }
    public static void ejercicio2 ()
    {
        Scanner scan = new Scanner(System.in);

        ///Ejercicio B.
        System.out.println("Ingrese el nombre del cliente. ");
        String nombre = scan.nextLine();
        System.out.println("Ingrese el email del cliente. ");
        String email = scan.nextLine();
        System.out.println("Ingrese el descuento del cliente. ");
        double descuento = scan.nextDouble();

        Cliente cliente = new Cliente(nombre,email,descuento);
        ///System.out.println("Cliente cargado: ");
        ///cliente.mostrarCliente();

        ///Ejercicio C.
        System.out.println("Ingrese el total de lo gastado. ");
        double montoTotal = scan.nextDouble();
        Factura factura = new Factura(montoTotal,cliente);
        /*
        System.out.println("Su monto total gastado es de: " + montoTotal);
        double montoDescuento = factura.calcularMontoFinalLuegoDeDescuento();
        System.out.println("Su monto total con descuento es de: " + montoDescuento);
         */
        ///Ejercicio D.
        ///factura.mostrarFacturaMasCliente();
        ///EJERCICIO E.

        factura.cargarArregloItems(10);
        System.out.println("FACTURA CON LOS ITEMS: ");
        factura.mostrarArregloItems();

        double montoTotalItems = factura.calcularMontoTotalesArregloItems();
        double montoTotalItemsConDescuento = factura.calcularMontoTotalArregloItemsConDescuento();

        System.out.println("El total de tu compra es de: " + montoTotalItems);
        System.out.println("El total de tu compra con descuento es de: " + montoTotalItemsConDescuento);
    }
    public static void ejercicio3()
    {
        Scanner scan = new Scanner(System.in);
        ///A
        System.out.println("Ingresa el nombre del cliente. ");
        String nombre = scan.next();
        System.out.println("Ingresa el genero del cliente");
        char genero = scan.next().charAt(0);

        clienteBanco cliente = new clienteBanco(nombre,genero);
        ///B

        cuentaBanco cuenta = new cuentaBanco(10000,cliente);
        cuenta.mostrarCuentaBancaria();
        ///c y d
        System.out.println("Ingrese el monto a depositar. ");
        double deposito = scan.nextDouble();
        cuenta.deposito(deposito);
        System.out.println("Balance: " + cuenta.getBalance());

        System.out.println("Ingrese el monto a extraer. ");
        double extraccion = scan.nextDouble();
        cuenta.extraer(extraccion);
        System.out.println("Balance: " + cuenta.getBalance());

    }
}