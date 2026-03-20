public class Usuario {
    private String nombre;
    private String correo;

    public Usuario(){}

    public Usuario(String nombre, String correo){
        this.nombre = nombre;
        this.correo = correo;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }
    
    public void setCorreo(String correo){
        this.correo = correo;
    }

    public String getCorreo(){
        return this.correo;
    }

    public void clonar(Usuario u){
        u.setNombre(this.getNombre());
        u.setCorreo(this.getCorreo());
    }
}
