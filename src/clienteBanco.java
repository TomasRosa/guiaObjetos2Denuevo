import java.util.UUID;
public class clienteBanco
{
    private UUID id;
    private String nombre;
    private char genero;

    public clienteBanco ()
    {

    }
    public clienteBanco (String nombre, char genero)
    {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.genero = genero;
    }

    public UUID getId()
    {
        return id;
    }

    public void setId(UUID id)
    {
        this.id = id;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public char getGenero()
    {
        return genero;
    }

    public void setGenero(char genero)
    {
        this.genero = genero;
    }
    public void mostrarCliente ()
    {
        System.out.println("La ID del cliente es: " + this.id);
        System.out.println("El nombre del cliente es: " + this.nombre);
        System.out.println("El genero del cliente es: " + this.genero);
    }
}
