
public class Director extends Persona {

    private String especialidad;

    public Director() {
        super();
        setEspecialidad();
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad() {
        especialidad = "Director Técnico";
    }

}
