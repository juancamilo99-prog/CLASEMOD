import controller.Traductor;
import model.Diccionario;

public class Main {
    public static void main(String[] args) {
        Traductor traductor = new Traductor();
        String[][] traducciones = {
                {"adios", "goodbye"},
                {"gracias", "tankyou"},
                {"el", "the"},
                {"esta", "is"},
                {"mundo", "word"},
                {"en", "in"},
                {"la", "the"}

        };
        traductor.agregarTraduccion(new Diccionario("hola", "hello"));
        traductor.agregarTraduccion(new Diccionario("gato", "cat"));
        traductor.agregarTraduccion(new Diccionario("casa", "house"));
        traductor.agregarVariasTraducciones(traducciones);
        traductor.traducir("hola");
        traductor.tamanioDiccionario();
        traductor.listarDiccionario();
        traductor.traducirFrase("el gato esta en la casa");
    }
}