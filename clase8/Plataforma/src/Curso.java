import java.util.ArrayList;
import java.util.List;

public class Curso {
    private Long id;
    private String nombre;

    private Profesor profesor; // asociación con Profesor
    private List<Leccion> lecciones; //composicion
    private List<Registro> registros; //asociación

    public Curso(Long id, String nombre, Profesor profesor) {
        this.id = id;
        this.nombre = nombre;
        this.profesor = profesor;
        this.lecciones = new ArrayList<>();
        this.registros = new ArrayList<>();
    }

    public Curso(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.lecciones = new ArrayList<>();
        this.registros = new ArrayList<>();
    }

    public void asignarProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public void agregarLeccion(String titulo) { 
        lecciones.add(new Leccion(titulo)); //composición
    }

    public void agregarRegistro(Registro registro) {
        registros.add(registro); //asociación
    }

    public List<Leccion> getLecciones() {
        return this.lecciones;
    }

    public List<Registro> getRegistros() {
        return this.registros;
    }

    public Profesor getProfesor() {
        return this.profesor;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String toString() {
        return "Curso: " + this.nombre;
    }
}
