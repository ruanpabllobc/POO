package lista_array.q34;

public class DemoMatriz {
    public static void main(String[] args) {
        Matriz mat1 = new Matriz(1, 2, 3, 4);
        mat1.imprimirMatriz();
        System.out.println("Determinante: " + mat1.calculaDeterminante());
        System.out.println("========================");
    }
}
