
public abstract class Contenido {
        //CLase Base: atributos comunes
    public String titulo;
    private int duracion;
    private int vistas;
    private String autor;

    //cosntructor

    public Contenido(){}

    public Contenido(String titulo){
        this.titulo = titulo;
    }

    public Contenido(String autor, String titulo){
        this.autor = autor;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getVistas() {
        return vistas;
    }

    public void setVistas(int vistas) {
        this.vistas = vistas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    //metodo comunes:
    void reproducir(int x){
        System.out.println("Reproduciendo: " + this.titulo);
        this.vistas++;
    }
}
