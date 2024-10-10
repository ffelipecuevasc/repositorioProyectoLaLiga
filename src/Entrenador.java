
public class Entrenador extends Persona {

    private String especialidad;

    public Entrenador() {
        super();
        setEspecialidad();
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad() {
        especialidad = "Entrenador de Porteros";
    }
}
