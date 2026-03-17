import controller.EmpleadoController;

public class Main {
    static void main(String[] args) {
        EmpleadoController empleadoController = new EmpleadoController();

        empleadoController.agregarHorasExtras(18);
        empleadoController.calcularSalarioTotal();
        empleadoController.aplicarAumento(10);
        empleadoController.resetearHorasExtras();
    }
}
