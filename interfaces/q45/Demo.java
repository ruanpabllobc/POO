package interfaces.q45;

public class Demo {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Triangulo triangulo = new Triangulo();
        Quadrado quadrado = new Quadrado();
        circulo.desenha();
        triangulo.desenha();
        quadrado.desenha();
    }
}