public class Video {
    //atributos
    private String titulo;
    private String descripcion;
    private boolean audiencia;
    private String visibilidad;
    private String usuario;
    //private Usuario usuario;
    private int likes;
    private int dislikes;
    private int visualizaciones;
    private int dias;

    //constructor(es)
    public Video(){

    }

    public Video(String titulo, String descripcion, boolean audiencia, String visibilidad){
        this.titulo =titulo;
        this.descripcion = descripcion;
        this.audiencia = audiencia;
        this.visibilidad = visibilidad;
        inicializarAtributos();
    }

    public Video(String titulo, boolean audiencia, String visibilidad){
        this.titulo = titulo;
        this.audiencia = audiencia;
        this.visibilidad = visibilidad;
        this.descripcion = "";
        inicializarAtributos();
    }

    private void inicializarAtributos(){
        this.likes = 0;
        this.dislikes = 0;
        this.dias = 0;
    }

    //getters: permitir consultar valores
    public String getTitulo(){
        return this.titulo;
    }

    public String getDescripcion(){
        return this.descripcion;
    }

    public boolean getAudiencia(){
        return this.audiencia;
    }

    public int getLikes(){
        return this.likes;
    }

    public int getDislikes(){
        return this.dislikes;
    }

    //setters: permiten editar valores de los atributos
    public void setTitulo(String nuevoTitulo){
        this.titulo = nuevoTitulo;
    }

    public void setDescripcion(String nuevaDescripcion){
        this.descripcion = nuevaDescripcion;
    }

    public void darLike(){
        this.likes++;
        // this.likes = this.likes + 1;
    }

    public void darDislike(){
        this.dislikes++;
    }

    public void darUnlike(){
        this.likes--;
    }

    

}
