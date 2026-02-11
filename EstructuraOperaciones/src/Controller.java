public class Controller {

    private String[] correos = new String[5];

    public boolean metodoInsertar(String correo){
        boolean estaCorreo = metodoBuscar(correo);
        for (int i = 0; i < correos.length; i++) {
            if (correos[i]==null && !estaCorreo){
                correos[i] = correo;
                return true;
            }
        }
        return false;
    }

    public int getCorreos(){
        int numeroCorreos = 0;
        for (String item : correos) {
            if (item != null){
                numeroCorreos++;
            }
        }
        return numeroCorreos;
    }

    public String[] getterCorreos(){
        return correos;
    }

    public void metodoBusquedad(){
    }

    public void metodoEliminar(){}

    public void metodoListar(){
        for (String item : correos) {
            System.out.println(item);
        }
    }
    //el metodo retornara true cuando el correo exista dentro de la lista
    //el metodo retornara false cuando el correo no exista dentro de la lista
    private boolean metodoBuscar(String correo){
        for (String item : correos) {
            //equalsIgnoreCase - > obviar mayusculas y minisculas
            if (item != null && item.equalsIgnoreCase(correo)){
                System.out.println("el dato ingresado ya existe.");
                return true;
            }
        }
        return false;
    }
}
