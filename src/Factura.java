import java.util.Date;

public class Factura extends Orden{
    int Nro_factura;
    Proveedor proveedor;

    public Factura(int NIT, String nombre_pro, int nro_orden, Date fecha, int monto_total, Date fecha_entrega, int nro_factura, Proveedor proveedor) {
        super(NIT, nombre_pro, nro_orden, fecha, monto_total, fecha_entrega);
        Nro_factura = nro_factura;
        this.proveedor = proveedor;
    }

    public int getNro_factura() {
        return Nro_factura;
    }

    public void setNro_factura(int nro_factura) {
        Nro_factura = nro_factura;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "Nro_factura=" + Nro_factura +
                ", proveedor=" + proveedor +
                ", Nro_orden=" + Nro_orden +
                ", fecha=" + fecha +
                ", monto_total=" + monto_total +
                ", fecha_entrega=" + fecha_entrega +
                ", NIT=" + NIT +
                ", nombre_pro='" + nombre_pro + '\'' +
                '}';
    }
}
