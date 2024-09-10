package lista_array.q34;

public class Matriz {
    private float matriz[][];

    public Matriz(float v1, float v2, float v3, float v4) {
        matriz = new float[2][2];
        matriz[0][0] = v1;
        matriz[0][1] = v2;
        matriz[1][0] = v3;
        matriz[1][1] = v4;
    }

    public float calculaDeterminante(){
        return (matriz[0][0] * matriz[1][1]) - (matriz[1][0] * matriz[0][1]);
    }

    public void imprimirMatriz() {
        for (float[] linha : matriz) {
            System.out.printf("%.2f  %.2f%n", linha[0], linha[1]);
        }
        System.out.println();
    } 

}
