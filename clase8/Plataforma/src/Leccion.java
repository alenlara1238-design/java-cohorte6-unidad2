import java.util.ArrayList;
import java.util.List;

public class Leccion {
    private String titulo;
    private List<Video> videos; // private Video[] videos; // Alternativa usando array

    public Leccion(String titulo) {
        this.titulo = titulo;
        this.videos = new ArrayList<>(); // videos = new Video[10]; // Alternativa usando array
    }

    public void agregarVideo(String titulo){
          //composición
        videos.add(new Video(titulo));
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String toString(){
        return "Leccion: " + this.titulo;
    }

}
