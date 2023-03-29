import java.util.UUID;

public class itemVenta
{
        private UUID id;
        private String nombre;
        private String descripcion;
        private double precioUnitario;

        public itemVenta()
        {

        }
        public itemVenta(String nombre, String descripcion, double precioUnitario)
        {
            this.id = UUID.randomUUID();
            this.nombre = nombre;
            this.descripcion = descripcion;
            this.precioUnitario = precioUnitario;
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

        public String getDescripcion()
        {
            return descripcion;
        }

        public void setDescripcion(String descripcion)
        {
            this.descripcion = descripcion;
        }

        public double getPrecioUnitario()
        {
            return precioUnitario;
        }

        public void setPrecioUnitario(double precioUnitario)
        {
            this.precioUnitario = precioUnitario;
        }
    }
