public class App {
    public static void main(String[] args) throws Exception {
        

        momento1();

    }

    public static void momento1() {
        VideoLargo video = new VideoLargo();
        video.setTitulo("Video largo...");
       // video.reproducir();
        //.titulo = "fwwddwd";


        Short short1 = new Short();
        short1.setTitulo("tips rápidos Short");
        //short1.reproducir();

        Contenido c = new Short();
        Contenido c2 = new VideoLargo();

        Short short2 = new Short();
        Short short3 = new Short();

        Short short4 = new Short("curso de java", "Dev Senior");

        Live miLive = new Live();
        miLive.setTitulo("trasmisión en vivo");

        Reproductor reprod = new Reproductor();
        reprod.play(video);
        reprod.play(short1);
        reprod.play(miLive);

        SistemaAnuncios sis = new SistemaAnuncios();
        sis.procesarAnunciante(miLive);
        sis.procesarAnunciante(video);
        sis.procesarAnunciante(short1);

    }
}
