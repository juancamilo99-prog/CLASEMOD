import java.util.Scanner;

public class Main {
    /*MODEL -> M
    * MAIN -> V
    * CONTROLLER -> C
    *
    * CONTINUE -> "saltaba la iteracion"
    * BREAK -> rotura del iterador proximo
    * RETURN -> rotura del metodo. la ultima linea del metodo
    *
    * ---Buenas practicas----
    * 1. Separar las funcionalidad en metodos
    * 2. Intenta usar los menos STATIC posibles
    * 3. uso de los return dentro de los metodos
    * 4. return / break usalos en iteraaciones no profundas
    * 5. no anides mas de 2 repeticiones*/
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Controller controller = new Controller();
        for (int i = 0; i < 3; i++) {
            System.out.println("introduce el correo que quieres agregar");
            String correo = entrada.next();
            if (correo.equalsIgnoreCase("salir")){
                break;
            }
            if (controller.metodoInsertar(correo)){
                System.out.println("Insertado correctamente");
            }else {
                System.out.println("Correo no insertado");
            }
        }
        System.out.println("el numero de correos ingresados es de: "+controller.getCorreos());
    }
}
