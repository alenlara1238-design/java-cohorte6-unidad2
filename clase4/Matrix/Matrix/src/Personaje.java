public abstract class Personaje {
    
    private String nombre;

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public abstract void actuar();
}
