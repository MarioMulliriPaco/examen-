import java.util.Date;

public class Inventario {
    int codigo_almacen;
    String responsable_A;
    Date fecha_entrega;
    String direccion;

    public Inventario(int codigo_almacen, String responsable_A, Date fecha_entrega, String direccion) {
        this.codigo_almacen = codigo_almacen;
        this.responsable_A = responsable_A;
        this.fecha_entrega = fecha_entrega;
        this.direccion = direccion;
    }

    public int getCodigo_almacen() {
        return codigo_almacen;
    }

    public void setCodigo_almacen(int codigo_almacen) {
        this.codigo_almacen = codigo_almacen;
    }

    public String getResponsable_A() {
        return responsable_A;
    }

    public void setResponsable_A(String responsable_A) {
        this.responsable_A = responsable_A;
    }

    public Date getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(Date fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Inventario{" +
                "codigo_almacen=" + codigo_almacen +
                ", responsable_A='" + responsable_A + '\'' +
                ", fecha_entrega=" + fecha_entrega +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
