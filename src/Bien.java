public class Bien {
     int codigo_bien;
     String nombre_bien;
     int cantidad_solicitada;
     int unidad_medida;
     int valor_unitario;
     int valor_total;

    public Bien(int codigo_bien, String nombre_bien, int cantidad_solicitada, int unidad_medida, int valor_unitario, int valor_total) {
        this.codigo_bien = codigo_bien;
        this.nombre_bien = nombre_bien;
        this.cantidad_solicitada = cantidad_solicitada;
        this.unidad_medida = unidad_medida;
        this.valor_unitario = valor_unitario;
        this.valor_total = valor_total;
    }

    public int getCodigo_bien() {
        return codigo_bien;
    }

    public void setCodigo_bien(int codigo_bien) {
        this.codigo_bien = codigo_bien;
    }

    public String getNombre_bien() {
        return nombre_bien;
    }

    public void setNombre_bien(String nombre_bien) {
        this.nombre_bien = nombre_bien;
    }

    public int getCantidad_solicitada() {
        return cantidad_solicitada;
    }

    public void setCantidad_solicitada(int cantidad_solicitada) {
        this.cantidad_solicitada = cantidad_solicitada;
    }

    public int getUnidad_medida() {
        return unidad_medida;
    }

    public void setUnidad_medida(int unidad_medida) {
        this.unidad_medida = unidad_medida;
    }

    public int getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(int valor_unitario) {
        this.valor_unitario = valor_unitario;
    }

    public int getValor_total() {
        return valor_total;
    }

    public void setValor_total(int valor_total) {
        this.valor_total = valor_total;
    }

    @Override
    public String toString() {
        return "Bien{" +
                "codigo_bien=" + codigo_bien +
                ", nombre_bien='" + nombre_bien + '\'' +
                ", cantidad_solicitada=" + cantidad_solicitada +
                ", unidad_medida=" + unidad_medida +
                ", valor_unitario=" + valor_unitario +
                ", valor_total=" + valor_total +
                '}';
    }
}