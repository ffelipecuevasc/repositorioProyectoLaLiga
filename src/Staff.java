import java.util.Scanner;

public class Staff {

    private Integer codigo;
    private Director dt;
    private Entrenador ep;
    private Preparador pf;
    private Psicologo p;
    private Delegado d;
    private Scanner leer;
    
    public Staff() {
        leer = new Scanner(System.in);
        setCodigo();
        setDt();
        setEp();
        setPf();
        setP();
        setD();
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo() {
        System.out.println("Ingrese el codigo del Staff: ");
        codigo = leer.nextInt();
        leer.nextLine();
    }

    public Director getDt() {
        return dt;
    }

    public void setDt() {
        dt = new Director();
    }

    public Entrenador getEp() {
        return ep;
    }

    public void setEp() {
        ep = new Entrenador();
    }

    public Preparador getPf() {
        return pf;
    }

    public void setPf() {
        pf = new Preparador();
    }

    public Psicologo getP() {
        return p;
    }

    public void setP() {
        p = new Psicologo();
    }

    public Delegado getD() {
        return d;
    }

    public void setD() {
        d = new Delegado();
    }
}
