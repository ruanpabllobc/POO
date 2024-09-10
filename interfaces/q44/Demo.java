package interfaces.q44;

public class Demo {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Jhoan");
        Funcionario func2 = new Funcionario("Heitor");

        func1.setSalarioPorHora(7.5);
        func2.setIdade(20);

        System.out.println(func1);
        System.out.println("Salario: " + func1.salarioMensal(100) + "\n");

        System.out.println(func2);
        System.out.println("Salario: " + func2.salarioMensal(180) + "\n");
    }
}