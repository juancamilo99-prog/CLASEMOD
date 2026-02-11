public class Operaciones {
    public void EvaluarCodigo(String estado){
        switch (codigoAceptar(estado)){
            case 200 ->{
                System.out.println("Codigo aceptado, servidor responde ok");
            }
            case 400 ->{
                System.out.println("Codigo aceptado, servidor responde no ok");
            }
            case 500 ->{
                System.out.println("Codigo aceptado, servidor no responde");
            }
        }
    }

    public int codigoAceptar(String estado){
        if (estado.equals("levantado")){
            return 200;
        } else if (estado.equals("levantado_problemas")){
            return 400;
        }else {
            return 500;
        }
    }
}
