public class Item extends Bien{
    String cantidad_Despachada;

    public Item(int codigo_bien, String nombre_bien, int cantidad_solicitada, int unidad_medida, int valor_unitario, int valor_total, String cantidad_Despachada) {
        super(codigo_bien, nombre_bien, cantidad_solicitada, unidad_medida, valor_unitario, valor_total);
        this.cantidad_Despachada = cantidad_Despachada;
    }

    public String getCantidad_Despachada() {
        return cantidad_Despachada;
    }

    public void setCantidad_Despachada(String cantidad_Despachada) {
        this.cantidad_Despachada = cantidad_Despachada;
    }

    @Override
    public String toString() {
        return "Item{" +
                "cantidad_Despachada='" + cantidad_Despachada + '\'' +
                ", codigo_bien=" + codigo_bien +
                ", nombre_bien='" + nombre_bien + '\'' +
                ", cantidad_solicitada=" + cantidad_solicitada +
                ", unidad_medida=" + unidad_medida +
                ", valor_unitario=" + valor_unitario +
                ", valor_total=" + valor_total +
                '}';
    }
}
