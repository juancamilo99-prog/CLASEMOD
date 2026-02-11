public class Main {
    static void main(String[] args) {

        //break -> rompe una iteracion
        //continue -> la iteracion que tenga continue no la ejecuta pero no rompe la ejecucion, la ultima linea de la ejecucion
        //return -> retorna un valor en el metodo y lo termina es la ultima linea del metodo

        int acumulador = 0, intentos = 0;
        int[] numeros = {1,4,-67,23,-13,25,30,-96};
        /*do {
            System.out.println("Repitiendo");
            acumulador += (int) (Math.random()*20);
            intentos++;
            if (acumulador>100 && acumulador<110){
                break;
            }
        }while (acumulador < 301);
        System.out.println("Terminando la ejecucion con un saldo de "+acumulador);
        System.out.println("has necesitado de "+intentos+ " intentos");*/

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0){
                continue;
            }
            System.out.println(numeros[i]);
        }



    }
}
