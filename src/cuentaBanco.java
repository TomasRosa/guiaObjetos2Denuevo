import java.util.Scanner;
import java.util.UUID;

public class cuentaBanco
{
    private UUID id;
    private double balance;
    private clienteBanco cliente;
    private Registro[] movimientosClientes;
    private int validosCLientes;

    public cuentaBanco ()
    {
        this.movimientosClientes = new Registro[10];
        validosCLientes = 0;
    }
    public cuentaBanco (double balance, clienteBanco cliente)
    {
        this.id = UUID.randomUUID();
        this.balance = balance;
        this.cliente = cliente;
        this.movimientosClientes = new Registro[10];
        validosCLientes = 0;
    }

    public Registro[] getMovimientosClientes()
    {
        return movimientosClientes;
    }

    public void setMovimientosClientes(Registro[] movimientosClientes)
    {
        this.movimientosClientes = movimientosClientes;
    }

    public int getValidosCLientes()
    {
        return validosCLientes;
    }

    public void setValidosCLientes(int validosCLientes)
    {
        this.validosCLientes = validosCLientes;
    }

    public UUID getId()
    {
        return id;
    }

    public void setId(UUID id)
    {
        this.id = id;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public clienteBanco getCliente()
    {
        return cliente;
    }

    public void setCliente(clienteBanco cliente)
    {
        this.cliente = cliente;
    }
    public void deposito (double deposito)
    {
        this.balance = this.balance + deposito;
        Registro nuevo = new Registro(this.cliente.getNombre(),1,deposito);
        this.movimientosClientes[validosCLientes] = nuevo;
        validosCLientes++;
    }
    public void extraer (double extraccion)
    {
        if(this.balance - extraccion < -2000)
        {
            System.out.println("Tu balance quedara inferior a -2000$, no puedes realizar esa extraccion.");
        }
        else
        {
            this.balance = this.balance - extraccion;
        }
        Registro nuevo = new Registro(this.cliente.getNombre(),2,extraccion);
        this.movimientosClientes[validosCLientes] = nuevo;
        validosCLientes++;

    }
    public void mostrarCuentaBancaria ()
    {
        System.out.println("********CLIENTE********");
        this.cliente.mostrarCliente();
        System.out.println("********CUENTA BANCARIA********");
        System.out.println("ID de la cuenta bancaria: " + this.id);
        System.out.println("Balance de la cuenta bancaria: " + this.balance);
    }
    public void mostrarPuntoE ()
    {
        for(int i = 0; i < validosCLientes; i++)
        {
            if(this.movimientosClientes[i].getOperacion() == 1)
            {
                System.out.println(this.movimientosClientes[i].getNombre() +  ",Deposito"  + this.movimientosClientes[i].getMonto());
            }
            else if(this.movimientosClientes[i].getOperacion() == 2)
            {
                System.out.println(this.movimientosClientes[i].getNombre() +  ",Extrajo"  + this.movimientosClientes[i].getMonto());

            }
        }
    }
    public void interaccionUsuarioBanco (int opcion)
    {
        Scanner scan = new Scanner(System.in);
        char continuar = 's';
        do
        {
            if(opcion == 1)
            {
                System.out.println("Ingrese el dinero a depositar. Usted es el cliente: " + cliente.getNombre());
                double deposito = scan.nextDouble();
                deposito(deposito);
                System.out.println("Tu balance es de: " + getBalance());
            }
            else if(opcion == 2)
            {
                System.out.println("Ingrese el dinero a extraer. Usted es el cliente: " + cliente.getNombre());
                double extraccion = scan.nextDouble();
                extraer(extraccion);
                System.out.println("Tu balance es de: " + getBalance());
            }
            System.out.println("Desea seguir realizando operaciones? s/n");
            continuar = scan.next().charAt(0);
            if(continuar == 's')
            {
                System.out.println("Ingrese 1 si desea depositar. ");
                System.out.println("Ingrese 2 si desea extraer.");
                opcion = scan.nextInt();
            }
        }while(continuar == 's');
    }
}
