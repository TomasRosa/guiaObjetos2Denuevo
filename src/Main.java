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
        //h
        Autor arregloAutores[] =  new Autor[10];
        Libro libro = new Libro();
        libro.cargarUnArregloDeAutores(arregloAutores,10);
        System.out.println("Arreglo con los autores: ");
        libro.mostrarArregloAutores(arregloAutores);
    }
}