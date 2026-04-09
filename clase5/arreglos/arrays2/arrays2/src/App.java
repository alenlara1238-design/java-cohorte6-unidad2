import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);


        int maxCourses= 10;
        int[] miArregloVacio = new int[maxCourses]; // Esto crea un arreglo de enteros con 5 posiciones, pero todas las posiciones están inicializadas a 0

        int[] miArreglo = {232,33,454,565};
        int[] miArreglo2 = {2423, 324324, 3432, 234234,3242, 42332};

        imprimirArreglo(miArreglo2);

        //System.out.println(miArreglo.toString()); // Esto va a imprimir la referencia de memoria del arreglo

    }

    public static void imprimirArreglo(int[] arreglo){
        for(int i=0; i< arreglo.length; i++){
            System.out.print( "[" + arreglo[i] + "] " );
        }
    }

}
