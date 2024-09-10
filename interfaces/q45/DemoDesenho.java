package interfaces.q45;

public class DemoDesenho {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Triangulo triangulo = new Triangulo();
        Quadrado quadrado = new Quadrado();
        Desenho desenho1 = new Desenho(circulo, 0, 0, quadrado, 0, 5);
        Desenho desenho2 = new Desenho(quadrado, 5, 0, triangulo, 5, 5);
        desenho1.apresenta();
        System.out.println();
        desenho2.apresenta();
    }
}