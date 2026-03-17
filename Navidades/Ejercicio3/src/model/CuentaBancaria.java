package model;

public class CuentaBancaria {

    private String titular;
    private String numeroCuenta;
    private double saldo;

    public CuentaBancaria() {
    }

    public CuentaBancaria(String titular, String numeroCuenta) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ingresarSaldo(double cantidad){
        if (cantidad > 0){
            setSaldo(getSaldo() + cantidad);
            System.out.println("Saldo actual: " + getSaldo());
            System.out.println("Ingreso Exitoso!");
        } else {
            System.out.println("Saldo negativo!");
        }
    }

    public boolean retirar(double cantidad){
        boolean esPositivo=false;
        if (getSaldo() >= cantidad){
            setSaldo(getSaldo() - cantidad);
            System.out.println("Retiro Exitoso!");
            System.out.println("Saldo actual: " + getSaldo());
            return true;
        }

        if (!esPositivo){
            System.out.println("Saldo negativo!");
        }
        return false;
    }

    public void transferir(CuentaBancaria destino, double cantidad){
      if (destino == null){
          System.out.println("No existe cuenta bancaria");
          return;
      }

      if (getSaldo() >= cantidad){
          destino.ingresarSaldo(cantidad);
          setSaldo(getSaldo() - cantidad);
          System.out.println("Transference Exitosa!");
          System.out.println("Saldo actual: " + getSaldo());
      }else {
          System.out.println("Saldo negativo!");
      }

    }

    public void mostrarInfo(){
        System.out.println("Titular: " + getTitular());
        System.out.println("Numero Cuenta: " + getNumeroCuenta());
        System.out.println("Saldo: " + getSaldo());
    }
}
