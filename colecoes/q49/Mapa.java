package colecoes.q49;

import java.util.TreeMap;

public class Mapa {
    public static void main(String[] args) {
        TreeMap<Character, Integer> map = new TreeMap<>();
        String entrada = "RUAN PABLLO";
        entrada = entrada.toUpperCase();

        // Iterar sobre cada caractere da entrada
        for (int i = 0; i < entrada.length(); i++) {
            char letra = entrada.charAt(i);
            // Ignorar espaços em branco
            if (letra != ' ') {
                // Verificar se a letra já está no mapa
                if (map.containsKey(letra)) {
                    // Se estiver, incrementar a contagem
                    map.put(letra, map.get(letra) + 1);
                } else {
                    // Caso contrário, adicionar a letra ao mapa com contagem 1
                    map.put(letra, 1);
                }
            }
        }
        // Exibir as contagens de letras
        System.out.println("Contagem de letras:");
        for (char key : map.keySet()) {
            System.out.println("'" + key + "': " + map.get(key));
        }
    }
}
