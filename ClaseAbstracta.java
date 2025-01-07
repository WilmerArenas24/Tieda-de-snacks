public class ClaseAbstracta {
    public static void main(String[] args) {

        FiguraGeometrica figuraGeometrica = new Rectangulo();

        figuraGeometrica.dibujar();

        FiguraGeometrica figuraGeometrica1 = new Ciirculo();

        figuraGeometrica1.dibujar();

    }
}

//Clase abstracta
abstract class FiguraGeometrica{
    public abstract void dibujar();
}

class Rectangulo extends FiguraGeometrica{
    @Override
    public void dibujar(){
        System.out.println("Se dibuja un rectangulo");
    }
}

class Ciirculo extends FiguraGeometrica{
    @Override
    public void dibujar(){
        System.out.println("Se dibuja un circulo");
    }
}
