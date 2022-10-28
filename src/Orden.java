import java.util.Date;

public class Orden extends Proveedor{
    int Nro_orden;
    Date fecha;
    int monto_total;
    Date fecha_entrega;

    public Orden(int NIT, String nombre_pro, int nro_orden, Date fecha, int monto_total, Date fecha_entrega) {
        super(NIT, nombre_pro);
        Nro_orden = nro_orden;
        this.fecha = fecha;
        this.monto_total = monto_total;
        this.fecha_entrega = fecha_entrega;
    }

    public int getNro_orden() {
        return Nro_orden;
    }

    public void setNro_orden(int nro_orden) {
        Nro_orden = nro_orden;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getMonto_total() {
        return monto_total;
    }

    public void setMonto_total(int monto_total) {
        this.monto_total = monto_total;
    }

    public Date getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(Date fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    @Override
    public String toString() {
        return "Orden{" +
                "Nro_orden=" + Nro_orden +
                ", fecha=" + fecha +
                ", monto_total=" + monto_total +
                ", fecha_entrega=" + fecha_entrega +
                ", NIT=" + NIT +
                ", nombre_pro='" + nombre_pro + '\'' +
                '}';
    }
}
