public class Autor
{
    private String nombre;
    private String apellido;
    private String email;
    private char genero; ///m o f

    public Autor ()
    {

    }
    public Autor (String nombre, String apellido, String email, char genero)
    {
        this.genero = genero;
        this.email = email;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getApellido()
    {
        return apellido;
    }

    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public char getGenero()
    {
        return genero;
    }

    public void setGenero(char genero)
    {
        this.genero = genero;
    }
    public void mostrarAutor ()
    {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Email: " + this.email);
        System.out.println("Genero: " + this.genero);
    }
}
