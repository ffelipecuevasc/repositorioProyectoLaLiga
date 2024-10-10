
import java.util.ArrayList;
import java.util.Scanner;

public class Equipo {

    private Scanner leer;
    private Integer codigo;
    private String nombre;
    private ArrayList<Jugador> jugadores;
    private Staff colaboradores;
    private String estadio;

    public Equipo() {
        leer = new Scanner(System.in);
        jugadores = new ArrayList<Jugador>();
        setCodigo();
        setNombre();
        setJugadores();
        setColaboradores();
        setEstadio();

    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo() {
        System.out.println("Ingrese el código del equipo");
        codigo = leer.nextInt();
        leer.nextLine();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre() {
        System.out.println("Ingrese el nombre del equipo");
        nombre = leer.nextLine();
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores() {
        System.out.println("Comenzando a añadir jugadores al equipo (max. 25).");
        String rpta;
        int i = 0;
        do {
            System.out.println("Ingresando jugador[" + (i + 1) + "].");
            Jugador j = new Jugador();
            jugadores.add(j);
            System.out.println("¿Desea ingresar otro jugador? (Si o No): ");
            rpta = leer.nextLine();
            i++;
        } while (rpta.equalsIgnoreCase("Si") && i < 25);

    }

    public Staff getColaboradores() {
        return colaboradores;
    }

    public void setColaboradores() {
        System.out.println("Comenzando el proceso de añadir colaboradores.");
        colaboradores = new Staff();
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio() {
        System.out.println("Ingrese el nombre del estadio del equipo");
        estadio = leer.nextLine();
    }

}
