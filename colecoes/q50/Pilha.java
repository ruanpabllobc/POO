package colecoes.q50;

import java.util.Stack;
import java.util.Scanner;

public class Pilha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack <Character> pilha = new Stack<>();
        int fecha = 0;
        char parentese;
        boolean balanceada = true;

        System.out.println("Digite uma sequencia de parenteses");
        String entrada = scan.nextLine();

        for (int i = 0; i < entrada.length(); i++) 
            pilha.push(entrada.charAt(i));

        while (!pilha.isEmpty()) {
            parentese = pilha.pop();
            if (parentese == ')') 
                fecha++;
            else if(fecha > 0)
                fecha--;
            else{
                balanceada = false;
                break;
            }
        }

        if (fecha != 0) {
            balanceada = false;
        }

        System.out.println(balanceada?"Esta balanceada":"Nao esta balanceada");
        scan.close();
    }
}
