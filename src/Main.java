import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Solicitud solicitud=new Solicitud("Mario Paco",259450,25, Calendar.getInstance().getTime());
        System.out.println(solicitud);
        Bien bien=new Bien(1234,"oficina",4,40,100,50000);
        System.out.println(bien);

    }
}