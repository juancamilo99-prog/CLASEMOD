import model.Producto;

import java.util.Scanner;

public class Main {

    static void main(String[] args) {

        Producto producto1 = new Producto("COD1", "camara", 50, 5);
        Producto producto2 = new Producto("COD2", "mouse", 20, 0);

        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.printf("---PRODUCTO---\n" +
                    "1.mostrar stock\n" +
                    "2. vender producto\n" +
                    "3. abastecer stock\n" +
                    "4. calcular stock\n" +
                    "5. mostrar info\n");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> {
                    producto1.hayStock();
                }
                case 2 -> {
                    System.out.println("digite la cantidad del producto: ");
                    int cantidad = sc.nextInt();
                    producto1.Vender(cantidad);
                }
                case 3 -> {
                    System.out.println("cuanta cantidad abasteceras: ");
                    int cantidad = sc.nextInt();
                    producto1.AbastecerStock(cantidad);
                }
                case 4 -> {
                    producto1.calcularStock();
                }
                case 5 -> {
                    producto1.mostrarInfo();
                }
                case 6 -> {
                    System.out.println("Saliendo del programa...");
                }
                default -> {
                    System.out.println("opcion no valida!");
                }
            }

        }while(opcion != 6);
    }
}
