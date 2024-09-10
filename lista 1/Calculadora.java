public class Calculadora {

    public static int potencia(int base, int expoente) {
        if (expoente == 1) {
            return base;
        } else {
            return base * potencia(base, expoente - 1);
        }
    }

    public static void main(String[] args) {
        int base = 3;
        int expoente = 4;
        int resultado = potencia(base, expoente);
        System.out.println(base + " elevado a " + expoente + " é igual a " + resultado);
    }
}
