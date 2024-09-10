package classes;

public class Comparador {

    public static double maior(double a, double b) {
        return Math.max(a, b);
    }

    public static double maior(double a, double b, double c) {
        return Math.max(Math.max(a, b), c);
    }

    public static double maior(double a, double b, double c, double d) {
        return Math.max(Math.max(Math.max(a, b), c), d);
    }

    public static double maior(double a, double b, double c, double d, double e) {
        return Math.max(Math.max(Math.max(Math.max(a, b), c), d), e);
    }
    
}
