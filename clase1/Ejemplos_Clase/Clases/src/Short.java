public class Short {
    
    //atributos de la clase: ámbito global
    private String titulo;
    private String autor;
    private int vistas;

    //Acciones: Métodos

    //+++++ Constructor +++++ //
    public Short(){
        //constructor por defecto que usa java cuando hacemos Short short1 = new Short();
        titulo = "";
        autor = "";
        vistas = 0;
    }

    public Short(String autor, String titulo){
        //al atributo autor coloque el valor del parámetro autor
        this.autor = autor;
        this.titulo = titulo;
    }

    // +++++++ Getter(s)+++++++++++++++++
    //Los métodos encargados de mandar la información de valor de cada atributo

    public String getTitulo(){
        return this.titulo;
    }

    public String getAutor(){
        return this.autor;
    }

    public int getVistas(){
        return this.vistas;
    }

}
