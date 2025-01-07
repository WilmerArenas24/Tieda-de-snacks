package exepciones;

public class PreubaAritmetica {
    public static void main(String[] args) {

        try {
            var resultado = Aritmetica.division(12,4);
            System.out.println("Resultado división: "+resultado);
        } catch (Exception e) {
            System.out.println("Ocurrio un error "+e);
        }
    }
}
