public class Short extends Contenido {

    public Short(String titulo, String autor){
        //1. debo crear el Contenido: llamar al constructor de la clase padre.
        super(titulo); //regla de oro: primero debo llamar al constructor de la clase padre
        this.setAutor(autor);
    }

    void reproducir(){
        System.out.println("Reproduciendo short en Vertical: " + this.getTitulo());
    }

    void reproducir(int a){
        System.out.println("f adcakjc" + a);
    }
    
}
