public class Main {
    enum Diasemana {Lunes, Martes, Miercoles, Jueves, Viernes}
    static void main(String[] args) {
        //Estructura switch -> Estructura de control
        //se evaluan, int, char y string
        //ENUM -> es un tipo de dato que guarda valores fijos que no pueden alterarse
        //System.out.println(Diasemana.Lunes);
        //System.out.println(Diasemana.Martes);

        //swtich avanzado con enum y valores con , (recordar que se necesita un level min 14)
        Diasemana dia = Diasemana.Lunes;
        int valor = 4;
        switch (dia){
            case Lunes -> {
                System.out.println("Dia laborable");
            }
            case Martes -> {
                System.out.println("Dia laborable.");
            }
            case Miercoles -> {
                System.out.println("Dia laborable ");
            }
        }

        System.out.println("Hoy es 10 de "+Mesesanho.Noviembre + " y es "+Diasemana.Viernes);
        System.out.printf("Hoy es %d/%s/%d y es %s de un mes de la estacion de %s\n",7,Mesesanho.Enero.name(),2025,Diasemana.Jueves.name(), Mesesanho.Enero.estacion);




        Operaciones operaciones = new Operaciones();
        operaciones.EvaluarCodigo("caido");
    }
}
