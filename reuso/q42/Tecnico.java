package reuso.q42;

public class Tecnico extends Assistente {
    private double bonusSalarial;

    public Tecnico(String nome, double salario, int numMatricula, double bonusSalarial) {
        super(nome, salario, numMatricula);
        this.bonusSalarial = bonusSalarial;
    }

    @Override
    public double ganhoAnual() {
        return super.ganhoAnual() * (1 + bonusSalarial);
    }

    @Override
    public String toString() {
        return super.toString() + "Tecnico [bonusSalarial=" + (bonusSalarial * 100) + "]";
    }

}
