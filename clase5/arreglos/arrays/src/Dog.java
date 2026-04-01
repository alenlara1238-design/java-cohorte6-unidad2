public class Dog {
    
    private String nombre;
    private int edad;


    public Dog(){};

    public Dog(String nombre){
        this.nombre = nombre;
        this.edad = 0;
    }

    public Dog(String nombre, int edad){
        this.nombre = nombre;
        this.edad= edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }


    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return this.edad;
    }

    @Override
    public String toString(){
        return "nombre: " + this.nombre + "\n" + 
                "edad: " + this.edad;
    }

}
