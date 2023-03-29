import java.util.Scanner;

public class Libro
{
    private String titulo;
    private double precio;
    private int stock;
    private Autor autor;
    private Autor autores[];
    private int validosAutores;

    public Libro ()
    {
        this.autores = new Autor[10];
        this.validosAutores = 0;
    }
    public Libro (String titulo, double precio,int stock, Autor autor)
    {
        this.precio = precio;
        this.titulo = titulo;
        this.stock = stock;
        this.autores = new Autor[10];
        this.autor = autor;
        this.validosAutores = 0;
    }
    public Libro (String titulo, double precio,int stock)
    {
        this.precio = precio;
        this.titulo = titulo;
        this.stock = stock;
        this.autores = new Autor[10];
        this.validosAutores = 0;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public Autor[] getAutores()
    {
        return autores;
    }

    public void setAutores(Autor[] autores)
    {
        this.autores = autores;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    public double getPrecio()
    {
        return precio;
    }

    public void setPrecio(double precio)
    {
        this.precio = precio;
    }

    public int getStock()
    {
        return stock;
    }

    public void setStock(int stock)
    {
        this.stock = stock;
    }

    public Autor getAutor()
    {
        return autor;
    }

    public void setAutor(Autor autor)
    {
        this.autor = autor;
    }
    public void mostrarLibro ()
    {
        System.out.println("El titulo es: " + this.titulo);
        System.out.println("Su precio es de: " + this.precio + "$");
        System.out.println("Su stock es de: " + this.stock + " unidades.");
        System.out.println("Datos del autor: ");
        autor.mostrarAutor();
    }
    public void mostrarAlgunosAtributos ()
    {
        System.out.println("El libro: " + getTitulo() + " de: " + getAutor().getNombre() + "." + "Se vende a: " + getPrecio() + " pesos.");
    }
    public void mostrarAlgunosAtributosArray ()
    {
        for(int i = 0; i < this.validosAutores; i++)
        {
            System.out.println("El libro: " + getTitulo() + " de: " + autores[i].getNombre() + "." + "Se vende a: " + getPrecio() + " pesos.");
        }
    }
    public void cargarUnArregloDeAutores (Autor[] arregloAutores, int dimension)
    {
        Scanner scan = new Scanner(System.in);
        char continuar = 's';

        while(continuar == 's' && this.validosAutores < dimension)
        {
            System.out.println("Ingrese el nombre del autor. ");
            String nombre = scan.next();
            System.out.println("Ingrese el apellido del autor. ");
            scan.nextLine();
            String apellido = scan.next();
            System.out.println("Ingrese el email del autor. ");
            String email = scan.next();
            System.out.println("Ingrese el genero del autor. (M/F)");
            char genero = scan.next().charAt(0);

            arregloAutores[this.validosAutores] = new Autor(nombre,apellido,email,genero);
            this.validosAutores++;

            System.out.println("Desea seguir agregando autores? s/n. (SOLO PUEDE AGREGAR UN MAXIMO DE 10.)");
            continuar = scan.next().charAt(0);
        }
    }
    public void mostrarArregloAutores (Autor[] arregloAutores)
    {
        for(int i = 0; i < validosAutores; i++)
        {
            System.out.println("El nombre es: " + arregloAutores[i].getNombre());;
            System.out.println("El apellido: " + arregloAutores[i].getApellido());
            System.out.println("El email es: " + arregloAutores[i].getEmail());
            System.out.println("El genero es: " + arregloAutores[i].getGenero());
        }
    }
}
