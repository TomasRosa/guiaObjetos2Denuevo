import java.util.UUID;

public class cuentaBanco
{
    private UUID id;
    private double balance;
    private clienteBanco cliente;

    public cuentaBanco ()
    {

    }
    public cuentaBanco (double balance, clienteBanco cliente)
    {
        this.id = UUID.randomUUID();
        this.balance = balance;
        this.cliente = cliente;
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
    }
    public void mostrarCuentaBancaria ()
    {
        System.out.println("********CLIENTE********");
        this.cliente.mostrarCliente();
        System.out.println("********CUENTA BANCARIA********");
        System.out.println("ID de la cuenta bancaria: " + this.id);
        System.out.println("Balance de la cuenta bancaria: " + this.balance);
    }
}
