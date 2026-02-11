public enum Mesesanho {
    Enero("Primavera",1), Febrero("Invierno",2), Marzo("Invierno",3),
    Abril("Invierno",1), Noviembre("Invierno",11);

    String estacion;
    int numero;
    Mesesanho(String estacionP, int numeroP){
        estacion = estacionP;
        numero = numeroP;
    }

}
