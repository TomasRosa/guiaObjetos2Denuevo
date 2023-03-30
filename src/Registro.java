public class Registro
{
    private String nombre;
    private int operacion; ///1 deposito - 2 extraccion
    private double monto;

    public  Registro ()
    {

    }
    public Registro (String nombre, int operacion,double monto)
    {
        this.nombre = nombre;
        this.operacion = operacion;
        this.monto = monto;
    }
    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public int getOperacion()
    {
        return operacion;
    }

    public void setOperacion(int operacion)
    {
        this.operacion = operacion;
    }
    public double getMonto() {
    return monto;
}

    public void setMonto(int monto) {
        this.monto = monto;
    }
}
