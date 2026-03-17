import model.CuentaBancaria;

import java.util.Scanner;

public class Main {

    static void main(String[] args) {

        CuentaBancaria cuentaBancaria1 = new CuentaBancaria("ana lopez", "ES1234567890");
        CuentaBancaria cuentaBancaria2 = new CuentaBancaria("juan montero", "ES0987654321");

        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.printf("---BANCO---\n" +
                    "1. ingresar\n" +
                    "2. retirar\n" +
                    "3. mostrar info\n" +
                    "4. transferir\n" +
                    "5. salir\n");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Ingresa el valor del ingreso para ingresar: ");
                    double ingreso = sc.nextInt();
                    cuentaBancaria1.ingresarSaldo(ingreso);
                }
                case 2 -> {
                    System.out.println("Ingresa el valor del retiro para retirar: ");
                    double retiro = sc.nextInt();
                    cuentaBancaria1.retirar(retiro);
                }
                case 3 -> {
                    cuentaBancaria1.mostrarInfo();
                }
                case 4 -> {
                    System.out.println("Ingresa el valor a transferir: ");
                    double valor = sc.nextDouble();
                    cuentaBancaria1.transferir(cuentaBancaria2, valor);
                }
            }
        }while (opcion != 5);
    }
}
