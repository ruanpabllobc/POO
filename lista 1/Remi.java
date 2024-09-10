import java.util.Scanner;

public class Remi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor da carta: ");
        int numero = scan.nextInt();
        System.out.println("Digite o valor do naipe: ");
        int naipe = scan.nextInt();
        scan.close();
        System.out.println(nomeCarta(numero) + " de " + nomeNaipe(naipe) );
    }   

    public static String nomeCarta(int numero){
        String nomes[] = {"Ás","Dois","Três","Quatro","Cinco","Seis","Sete","Oito","Nove","Dez","Valete","Dama","Rei"};
        return nomes[numero-1];
    } 

    public static String nomeNaipe(int naipe){
        String nomes[] = {"Ouros","Paus","Copas","Espadas"};
        return nomes[naipe-1];
 } 
}
