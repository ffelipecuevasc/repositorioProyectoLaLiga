import java.util.Scanner;

public class Jugador extends Persona {

    private Integer dorsal;
    private String posicion;
    private Double condicionF;
    private Boolean lesion;
    private String tipoLesion;
    private Integer historialPJ;
    private Scanner leer= new Scanner(System.in);
    
    public Jugador(){
        setDorsal();
        setPosicion();
        setCondicionF();
        setLesion();
        setTipoLesion();
        setHistorialPJ();
    }

	public Integer getDorsal() {
		return dorsal;
	}

	public void setDorsal() {
		System.out.println("Ingrese el numero que llevara el Jugador: ");
		dorsal = leer.nextInt();
		leer.nextLine();
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion() {
		System.out.println("Ingrese la posicion en la que jugara: ");
		posicion = leer.nextLine();
	}

	public Double getCondicionF() {
		return condicionF;
	}

	public void setCondicionF() {
		System.out.println("Ingrese el porcentaje de condicion fisica del jugado: ");
		condicionF = leer.nextDouble();
	}

	public Boolean getLesion() {
	    if (lesion) {
	        System.out.println("El jugador está lesionado.");
	    } else {
	        System.out.println("El jugador no está lesionado.");
	    }
	    return lesion; 
	}

	public void setLesion() {
		System.out.println("¿El jugador se encuentra lesionado?");
		System.out.println("a) Si");
		System.out.println("b) No");
		System.out.println("Marque a o b");
		String respuesta = leer.nextLine();
		
		if (respuesta.equalsIgnoreCase("a")) {
			lesion = true;
			System.out.println("El jugador está lesionado.");
		} if(respuesta.equalsIgnoreCase("b")) {
			lesion = false;
			System.out.println("El jugador no está lesionado.");
		} else {
			System.out.println("Respuesta no valida, porfavor intente de nuevo");
			setLesion();
		}
	}

	public String getTipoLesion() {
		return tipoLesion;
	}

	public void setTipoLesion() {
		System.out.println("¿Que tipo de lesion posee?");
		System.out.println("Leve - Moderada - Grave");
		tipoLesion = leer.nextLine();
	}

	public Integer getHistorialPJ() {
		return historialPJ;
	}

	public void setHistorialPJ() {
		System.out.println("Indique cuántos partidos ha jugado en la temporada: ");
		historialPJ = leer.nextInt();
		leer.nextLine();
	}
}
