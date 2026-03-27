public class Cypher extends Personaje implements PuedeHackear{

    @Override
    public void hackearSistema() {
        System.out.println("Cypher hackea solo en la nave");
    }

    @Override
    public void actuar() {
        System.out.println("Cypher actua como traidor de la tripulación"); 
    }

}
