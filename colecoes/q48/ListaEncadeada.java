package colecoes.q48;

import java.util.LinkedList;

public class ListaEncadeada {
    public static void main(String[] args) {
        // Criar a lista original
        LinkedList<Character> listaOriginal = new LinkedList<>();
        for (char ch = 'A'; ch <= 'J'; ch++) {
            listaOriginal.add(ch);
        }

        // Criar a lista invertida
        LinkedList<Character> listaInvertida = new LinkedList<>();

        // Copiar os elementos da lista original para a lista invertida, invertendo a ordem
        for (int i = listaOriginal.size() - 1; i >= 0; i--) {
            listaInvertida.add(listaOriginal.get(i));
        }

        // Exibir as listas
        System.out.println("Lista original: " + listaOriginal);
        System.out.println("Lista invertida: " + listaInvertida);
    }
}

