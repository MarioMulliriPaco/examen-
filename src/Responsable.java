public class Responsable{
    String nombre;
    int CI;

    public Responsable(String nombre, int CI) {
        this.nombre = nombre;
        this.CI = CI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCI() {
        return CI;
    }

    public void setCI(int CI) {
        this.CI = CI;
    }

    @Override
    public String toString() {
        return "Responsable{" +
                "nombre='" + nombre + '\'' +
                ", CI=" + CI +
                '}';
    }
}
