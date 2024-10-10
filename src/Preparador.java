public class Preparador extends Persona {

    private String especialidad;

    public Preparador() {
        super();
        setEspecialidad();
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad() {
        especialidad = "Preparador Fisico";
    }

}