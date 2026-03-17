package controller;

import model.Empleado;

public class EmpleadoController {

    Empleado empleado = new Empleado("camilo", "Z1592205N", 1500);

    public void agregarHorasExtras(int horasExtras) {
        empleado.setHorasExtras(horasExtras);
        System.out.println("Agregando Horas Extras");
        System.out.println("Horas Extras: " + horasExtras);
    }

    public double calcularSalarioTotal() {
        double salarioTotal = empleado.getSalarioBase()+(empleado.getHorasExtras()*20);
        System.out.println("Salario Total con extras: " + salarioTotal);
        return salarioTotal;
    }

    public void aplicarAumento(double porcentaje) {
        System.out.println("salario base actual: " + empleado.getSalarioBase());
        double nuevoSalario = empleado.getSalarioBase()+(empleado.getSalarioBase()*porcentaje/100);
        System.out.println("Salario base aumentado: " + nuevoSalario);
    }

    public void resetearHorasExtras() {
        empleado.setHorasExtras(0);
    }
}
