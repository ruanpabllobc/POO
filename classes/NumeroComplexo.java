package classes;

public class NumeroComplexo {
    double real;
    String imaginario;
    
    public NumeroComplexo(double real, String imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }
    public NumeroComplexo(double real) {
        this.real = real;
        this.imaginario = "0";
    }
    public NumeroComplexo() {
        this.real = 0;
        this.imaginario = "0";
    }
    @Override
    public String toString() {
        return "NumeroComplexo [" + real + "+" + imaginario + "]";
    }

    public static void main(String[] args) {
        NumeroComplexo numero1 = new NumeroComplexo();
        NumeroComplexo numero2 = new NumeroComplexo(6);
        NumeroComplexo numero3 = new NumeroComplexo(3,"6y");
        System.out.println(numero1.toString() + numero2.toString() + numero3.toString());

    }

    
}
