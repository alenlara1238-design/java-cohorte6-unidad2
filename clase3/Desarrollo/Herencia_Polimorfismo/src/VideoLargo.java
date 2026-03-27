public class VideoLargo extends Contenido implements Monetizable{
   
    private int stats;

    public VideoLargo(){
        super();
    }

    public VideoLargo(String autor, String titulo){
        super(autor, titulo);
    }

    void reproducir(int x){
        System.out.println("reproduciendo video largo" + this.getTitulo());
    }

    void adelantar(int n){
        System.out.printf("Reproduciendo a %dx", n);
    }

    public void miMetodoUnico(){
        System.out.println("efdfsddafaaasf");
    }

    @Override
    public void mostrarAnuncio() {
        System.out.println("mostrando anuncio desde video largo...");
     }
}
