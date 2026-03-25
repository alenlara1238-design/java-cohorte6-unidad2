public class App {
    public static void main(String[] args) throws Exception {
        

        momento1();

    }

    public static void momento1() {
        VideoLargo video = new VideoLargo();
        video.setTitulo("Curso de Java cohorte 6");
        video.reproducir();
        video.titulo = "fwwddwd";


        Short short1 = new Short();
        short1.setTitulo("tips rápidos de herencia en Java");
        short1.reproducir();

        Contenido c = new Short();
        Contenido c2 = new VideoLargo();

        Short short2 = new Short();
        Short short3 = new Short();

        Contenido contenido1 = new Contenido("mi titulo");



    }
}
