
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Partido {

    private Integer codigo;
    private Date fecha;
    private String equipoLocal;
    private String equipoVisitante;
    private String estadio;
    private ArrayList<Arbitro> arbitros;
    private Map<String, Integer> resultado;
    private Scanner leer;
    SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

    public Partido() {
        leer = new Scanner(System.in);
        setCodigo();
        setFecha();
        arbitros = new ArrayList<Arbitro>();
        resultado = new HashMap<String, Integer>();
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo() {
        System.out.println("Ingrese codigo partido: ");
        codigo = leer.nextInt();
        leer.nextLine();
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha() {
        System.out.println("Ingrese fecha de partido formato 01-01-2010: ");
        String fe = leer.nextLine();
        try {
            fecha = format.parse(fe);
        } catch (ParseException e) {
            System.out.println("Fecha invalida!, intente nuevamente");
            setFecha();
        }
    }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal() {
        System.out.println("Ingrese equipo local: ");
        equipoLocal = leer.nextLine();
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante() {
        System.out.println("Ingrese equipo visitante: ");
        equipoVisitante = leer.nextLine();
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        System.out.println("Ingrese estadio: ");
        estadio = leer.nextLine();
    }

    public ArrayList<Arbitro> getArbitros() {
        return arbitros;
    }

    public void setArbitros() {
        if (arbitros.size() <= 0) {
            for (int i = 0; i < 4; i++) {
                Arbitro a = new Arbitro();
                arbitros.add(a);
            }
        } else {
            System.out.println("Los arbitros ya estan asignados");
        }

    }

    public Map<String, Integer> getResultado() {
        return resultado;
    }

    public void setResultado(int golL, int golV) {
        resultado.put(equipoLocal, golL);
        resultado.put(equipoVisitante, golV);
    }

}
