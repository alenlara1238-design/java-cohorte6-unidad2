public class App {
    public static void main(String[] args) throws Exception {
       int[] numeros = {1,2,3};
                    // 0, 1 ,2===>  i <= 2;   i < 3;
    
       int resultado = 0;
       for(int i = 0; i < numeros.length; i++){
        resultado += numeros[i];
        //resultado = resultado + numeros[i];
       }
       System.out.println("resultado: " + resultado);

    }

    public static void ejemploArraysDeObjetos(){
         
        Dog[] dogs = new Dog[3];

        dogs[0] = new Dog("Buddy", 12);
        dogs[1] = new Dog("Pily");
        dogs[2] = new Dog();

        dogs[2].setNombre("Peligro");
        System.out.println(dogs[2].getNombre()); //Peligro
    }

    public static int sumar(int a, int b){
        return a + b;
    }

    public static int sumar(int a, int b, int c){
        return a + b + c;
    }

    public static int sumar(int[] sumandos){
        int resultado = 0;

        for(int i = 0; i < sumandos.length; i++){
            resultado += sumandos[i];
         }

        return resultado;
    }

}
