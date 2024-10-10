
import java.util.Scanner;

public class Arbitro extends Persona {

    private String especialidad;
    private Scanner leer = new Scanner(System.in);

    public Arbitro() {
        super();
        setEspecialidad();
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad() {
        System.out.println("Especialidad del Árbitro: ");
        especialidad = leer.nextLine();
    }
}
