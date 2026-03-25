public class VideoLargo extends Contenido {
   
    private int stats;

    public VideoLargo(){
        super();
    }

    public VideoLargo(String autor, String titulo){
        super(autor, titulo);
    }

    @Override
    void reproducir(){
        System.out.println("Reproduciendo video largo " + this.titulo + " con caracteristicas plus");
    }

    void reproducir(String mensaje){
        System.out.println("reproduciendo con el mensaje: " + mensaje);
    }

    void adelantar(int n){
        System.out.printf("Reproduciendo a %dx", n);
    }

    public void miMetodoUnico(){
        System.out.println("efdfsddafaaasf");
    }
}
