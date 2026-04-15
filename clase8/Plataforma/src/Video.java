public class Video {
    private String titulo;

    //cosntructor
    public Video(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String Nuevotitulo) {
        this.titulo = Nuevotitulo;
    }

    @Override
    public String toString() {
        return "Video: " + titulo;
    }
}
