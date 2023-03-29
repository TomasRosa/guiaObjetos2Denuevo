import java.util.Scanner;
import java.util.UUID;
import java.time.LocalDateTime;
public class Factura
{
    private UUID id;
    private double montoTotal;
    private LocalDateTime fecha;
    private Cliente cliente;
    private itemVenta arregloItems[];
    private int validosItems;

    public itemVenta[] getArregloItems() {
        return arregloItems;
    }

    public void setArregloItems(itemVenta[] arregloItems) {
        this.arregloItems = arregloItems;
    }

    public Factura ()
    {

    }
    public Factura (double montoTotal, Cliente cliente)
    {
        this.id = UUID.randomUUID();
        this.fecha = LocalDateTime.now();
        this.montoTotal = montoTotal;
        this.cliente = cliente;
        this.arregloItems = new itemVenta[10];
        this.validosItems = 0;
    }

    public UUID getId()
    {
        return id;
    }

    public void setId(UUID id)
    {
        this.id = id;
    }

    public double getMontoTotal()
    {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal)
    {
        this.montoTotal = montoTotal;
    }

    public LocalDateTime getFecha()
    {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha)
    {
        this.fecha = fecha;
    }

    public Cliente getCliente()
    {
        return cliente;
    }

    public void setCliente(Cliente cliente)
    {
        this.cliente = cliente;
    }
    public double calcularMontoFinalLuegoDeDescuento()
    {
        double descuento = this.montoTotal * (this.cliente.getDescuento()/100);
        double montoFinal = this.montoTotal - descuento;
        return montoFinal;
    }
    public void mostrarFacturaMasCliente ()
    {
        System.out.println("********FACTURA********");
        System.out.println("ID de factura: " + this.id);
        System.out.println("Fecha: " + this.fecha);
        System.out.println("Monto: " + this.montoTotal);
        System.out.println("Monto con descuento: " + this.calcularMontoFinalLuegoDeDescuento());
        System.out.println("********CLIENTE********");
        cliente.mostrarCliente();
    }
    public void cargarArregloItems (int dimension)
    {
        Scanner scan = new Scanner(System.in);
        char continuar = 's';

        while(continuar == 's' && validosItems < dimension)
        {
            System.out.println("Ingrese nombre del item:");
            String nombre = scan.next();

            System.out.println("Ingrese la descripcion del item (comida/limpieza/etc). ");
            String descripcion = scan.next();

            System.out.println("Ingrese el precio unitario del item. ");
            double precioUnitario = scan.nextDouble();

            itemVenta producto = new itemVenta(nombre,descripcion,precioUnitario);
            this.arregloItems[validosItems] = producto;
            this.validosItems++;

            System.out.println("Desea seguir agregando items a la factura? s/n ");
            continuar = scan.next().charAt(0);
        }
    }
    public void mostrarUnItem (itemVenta item)
    {
        System.out.println("ID del item: " + item.getId());
        System.out.println("Nombre del item: " + item.getNombre());
        System.out.println("Descripcion del item: " + item.getDescripcion());
        System.out.println("Precio unitario del item: " + item.getPrecioUnitario());
    }
    public void mostrarArregloItems ()
    {
        for(int i = 0; i < validosItems; i++)
        {
            mostrarUnItem(this.arregloItems[i]);
        }
    }
    public double calcularMontoTotalesArregloItems ()
    {
        double sumaPrecioItems = 0;

        for(int i = 0; i < validosItems; i++)
        {
            sumaPrecioItems = sumaPrecioItems + this.arregloItems[i].getPrecioUnitario();
        }
        return sumaPrecioItems;
    }
    public double calcularMontoTotalArregloItemsConDescuento ()
    {
        double montoTotal = calcularMontoTotalesArregloItems(); ///1000
        double montoTotalConDescuento1 = montoTotal * (this.cliente.getDescuento()/100);
        double montoTotalConDescuento2 = montoTotal - montoTotalConDescuento1;
        return montoTotalConDescuento2;
    }
}
