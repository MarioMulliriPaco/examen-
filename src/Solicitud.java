import java.util.Date;

public class Solicitud extends Responsable{
    int Nro_solicitud;
    Date fecha;

    public Solicitud(String nombre, int CI, int nro_solicitud, Date fecha) {
        super(nombre, CI);
        Nro_solicitud = nro_solicitud;
        this.fecha = fecha;
    }

    public int getNro_solicitud() {
        return Nro_solicitud;
    }

    public void setNro_solicitud(int nro_solicitud) {
        Nro_solicitud = nro_solicitud;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Solicitud{" +
                "Nro_solicitud=" + Nro_solicitud +
                ", fecha=" + fecha +
                ", nombre='" + nombre + '\'' +
                ", CI=" + CI +
                '}';
    }
}
