public class Neo extends Personaje implements PuedePelear, PuedeHackear{

    @Override
    public void actuar() {
        System.out.println("neo actua en la matrix...");
    }

    @Override
    public void hackearSistema() {
        System.out.println("Neo hackea el sistema desde cualquier parte de la matrix y fuera de ella");
    }

    @Override
    public void pelear() {
        System.out.println("Neo pelea con distintas técnicas de combate");
    }

    public void volar(){
          System.out.println("neo está volando...");
    }
    

}
