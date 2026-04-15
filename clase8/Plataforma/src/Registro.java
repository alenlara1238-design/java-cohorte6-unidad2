public class Registro {
    private Long id;
    private Estudiante estudiante;
    private Curso curso;

    public Registro(Long id, Estudiante estudiante, Curso curso) {
        this.id = id;
        this.estudiante = estudiante;
        this.curso = curso;
    }

    public Long getId() {
        return id;
    }
    
    public Estudiante getEstudiante() {
        return estudiante;
    }

    public Curso getCurso() {
        return curso;
    }

    @Override
    public String toString() {
        return "Registro{id=" + id + ", estudiante=" + estudiante + ", curso=" + curso + "}";
    }

}
