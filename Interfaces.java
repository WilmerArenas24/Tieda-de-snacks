public interface Interfaces {

        //public por default y abstract
    void traducir();

    //Metodos con implementacion por defalult
    default void iniciarTraductor(){
        System.out.println("Iniciando traductor...");
    }
}

class Ingles implements Interfaces{
    @Override
    public void traducir(){
        System.out.println("Traduciendo a ingles...");
    }
}

class Frances implements Interfaces{
    @Override
    public void traducir(){
        System.out.println("Traduciendo a frances...");
    }
}

class PruebaTraductor{

    public static void main(String[] args) {
        Interfaces ingles = new Ingles();
        ingles.iniciarTraductor();
        ingles.traducir();


        Interfaces frances = new Frances();
        frances.iniciarTraductor();
        frances.traducir();
    }
}