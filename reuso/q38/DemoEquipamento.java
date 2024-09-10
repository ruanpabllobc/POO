package reuso.q38;

public class DemoEquipamento {
    public static void main(String[] args) {
        Equipamento equipamento = new Equipamento("32", 32);
        Computador computador = new Computador("Penis", 100, "Intel core 5", 8);
        System.out.println(equipamento);
        System.out.println(computador);
    }
}
