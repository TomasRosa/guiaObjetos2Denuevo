import java.util.UUID;
public class Cliente
{
    private UUID id;
    private String nombre;
    private String email;
    private double descuento; ///Es el porcentaje de descuento que tiene el cliente.

    public Cliente()
    {

    }
    public Cliente(String nombre, String email, double descuento)
    {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.email = email;
        this.descuento = descuento;
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

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public double getDescuento()
    {
        return descuento;
    }

    public void setDescuento(double descuento)
    {
        this.descuento = descuento;
    }
    public void mostrarCliente ()
    {
        System.out.println("ID del cliente: " + this.id);
        System.out.println("Nombre del cliente: " + this.nombre);
        System.out.println("Email del cliente: " + this.email);
        System.out.println("Descuento del cliente: " + this.descuento);
    }

}
