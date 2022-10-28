import java.util.Date;

public class Almacen {
    private int Nro_salida;
    private Responsable empleado;
    private Date fecha_salida;
    private Date fecha_entrada;

    public Almacen(int nro_salida, Responsable empleado, Date fecha_salida, Date fecha_entrada) {
        setNro_salida(nro_salida);
        this.setEmpleado(empleado);
        this.setFecha_salida(fecha_salida);
        this.setFecha_entrada(fecha_entrada);
    }

    public int getNro_salida() {
        return Nro_salida;
    }

    public void setNro_salida(int nro_salida) {
        Nro_salida = nro_salida;
    }

    public Responsable getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Responsable empleado) {
        this.empleado = empleado;
    }

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public Date getFecha_entrada() {
        return fecha_entrada;
    }

    public void setFecha_entrada(Date fecha_entrada) {
        this.fecha_entrada = fecha_entrada;
    }
}
