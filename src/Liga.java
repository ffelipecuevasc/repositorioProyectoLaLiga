
import java.util.ArrayList;
import java.util.Scanner;

public class Liga {

    private Integer codigo;
    private String nombre;
    private Integer temporada;
    private Integer duracion;
    private ArrayList<Equipo> equipos;
    private ArrayList<Partido> calendario;
    private Scanner leer = new Scanner(System.in);

    public Liga() {
        codigo = null;
        nombre = null;
        temporada = null;
        duracion = null;
        equipos = new ArrayList<Equipo>();
        calendario = new ArrayList<Partido>();
        leer = new Scanner(System.in);
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo() {
        System.out.println("Ingrese el código de la liga: ");
        codigo = leer.nextInt();
        leer.nextLine();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre() {
        System.out.println("Ingrese el nombre de la liga: ");
        nombre = leer.nextLine();
    }

    public Integer getTemporada() {
        return temporada;
    }

    public void setTemporada() {
        System.out.println("Ingrese la temporada de la liga: ");
        temporada = leer.nextInt();
        leer.nextLine();
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion() {
        System.out.println("Ingrese la duración de la liga: ");
        duracion = leer.nextInt();
        leer.nextLine();
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos() {
        System.out.println("Ingrese la cantidad de equipos: ");
        int cantidad = leer.nextInt();
        leer.nextLine();
        for (int i = 0; i < cantidad; i++) {
            Equipo equipo = new Equipo();
            equipo.setCodigo();
            equipo.setNombre();
            equipo.setJugadores();
            equipo.setColaboradores();
            equipo.setEstadio();
            equipos.add(equipo);
        }
    }

    public ArrayList<Partido> getCalendario() {
        return calendario;
    }

    public void setCalendario() {
        System.out.println("Ingrese la cantidad de partidos: ");
        int cantidad = leer.nextInt();
        leer.nextLine();
        for (int i = 0; i < cantidad; i++) {
            Partido partido = new Partido();
            partido.setFecha();
            partido.setEquipoLocal();
            partido.setEquipoVisitante();
            calendario.add(partido);
        }
    }

    @Override
    public String toString() {
        return "Liga{"
                + "código=" + codigo
                + ", nombre='" + nombre + '\''
                + ", temporada=" + temporada
                + ", duración=" + duracion
                + ", equipos=" + equipos
                + ", calendario=" + calendario
                + '}';
    }
}
