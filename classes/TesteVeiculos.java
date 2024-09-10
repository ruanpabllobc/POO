package classes;

public class TesteVeiculos {
    public static void main(String[] args) {
        // Criando objeto da classe Moto
        Moto minhaMoto = new Moto("Honda", 250, "Vermelha");
        // Alterando valores dos atributos
        minhaMoto.marca = "Yamaha";
        minhaMoto.cilindradas = 300;
        minhaMoto.cor = "Azul";

        // Criando objeto da classe Carro
        Carro meuCarro = new Carro("Gol", 2015, "Gasolina");
        // Alterando valores dos atributos
        meuCarro.modelo = "Civic";
        meuCarro.ano = 2020;
        meuCarro.combustivel = "Flex";

        // Criando objeto da classe Caminhao
        Caminhao meuCaminhao = new Caminhao("XYZ-1234", 5000, "Reboque");
        // Alterando valores dos atributos usando métodos setters
        meuCaminhao.setPlaca("ABC-5678");
        meuCaminhao.setCapacidadeCarga(8000);
        meuCaminhao.setTipo("Cegonha");

        // Exibindo os valores alterados
        System.out.println("Moto: " + minhaMoto.marca + ", " + minhaMoto.cilindradas + "cc, " + minhaMoto.cor);
        System.out.println("Carro: " + meuCarro.modelo + ", " + meuCarro.ano + ", " + meuCarro.combustivel);
        System.out.println("Caminhao: " + meuCaminhao.getPlaca() + ", " + meuCaminhao.getCapacidadeCarga() + "kg, " + meuCaminhao.getTipo());
    }
}