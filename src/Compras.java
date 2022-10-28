public class Compras {
    String jefe_Area;

    public Compras(String jefe_Area) {
        this.jefe_Area = jefe_Area;
    }

    public String getJefe_Area() {
        return jefe_Area;
    }

    public void setJefe_Area(String jefe_Area) {
        this.jefe_Area = jefe_Area;
    }

    @Override
    public String toString() {
        return "Compras{" +
                "jefe_Area='" + jefe_Area + '\'' +
                '}';
    }
}