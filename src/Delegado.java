
public class Delegado extends Persona {

    private String especialidad;

    public Delegado() {
        super();
        setEspecialidad();
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad() {
        especialidad = "Delegado";
    }
}