import java.util.Scanner;

public class Persona {

    protected String run;
    protected String nombreApellido;
    protected Integer edad;
    private Scanner leer;
    
    public Persona() {
        leer = new Scanner(System.in);
    }

    public String getRun() {
        return run;
    }

    public void setRun() {
        System.out.println("Ingrese el run: ");
        run = leer.nextLine();
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido() {
        System.out.println("Ingrese el nombre completo: ");
        nombreApellido = leer.nextLine();
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad() {
        System.out.println("Ingrese la edad: ");
        edad = leer.nextInt();
        leer.nextLine();
    }

    
}
