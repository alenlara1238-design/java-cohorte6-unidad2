import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Usuario u1 = new Usuario("Alejandra", "ale@gmail.com");
       
       Usuario u2 = new Usuario();

       u1.clonar(u2);

       System.out.println("u2 nombre: " + u2.getNombre());
       System.out.println("u2 correo: " + u2.getCorreo());

    }

    public static void modificarObjeto(Usuario u){
        u.setNombre("Nombre modificado");
    }

    public static void ejemplo1(){
         Scanner sc = new Scanner(System.in);

        System.out.print("Titulo: ");
        String titulo = sc.nextLine();

        System.out.print("Descripcion: ");
        String descripcion = sc.nextLine();

        System.out.print("Audiencia(T/F): ");
        boolean audiencia = sc.nextBoolean();

        sc.nextLine();

        System.out.print("Visibilidad(Publico - Privado - Oculto): ");
        String visibilidad = sc.nextLine();

        Video v1;

        if(descripcion.isEmpty()){
            v1 = new Video(titulo, audiencia, visibilidad);
        }else{
             v1 = new Video(titulo, descripcion, audiencia, visibilidad);
        }
        System.out.println("Video creado exitosamente");
    }
}
