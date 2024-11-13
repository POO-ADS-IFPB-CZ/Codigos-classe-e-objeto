import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe quantos números quer jogar:");
        int numero = scanner.nextInt();
        if(numero <6 || numero > 20){
            System.out.println("ERRO: Informe um valor entre 6 e 20\n" +
                    "O programa será fechado");
            System.exit(0);
        }

        Jogo jogo = new Jogo(numero);

        while (!jogo.isCompleto()){
            System.out.println("Informe o número a ser jogado: ");
            int n = scanner.nextInt();
            if(jogo.adicionar(n)){
                System.out.println("Número adicionado");
            }
        }

        //TODO: Apresentar os números ordenados e informar o preço
        System.out.println("Seu jogo é: "+ Arrays.toString(jogo.getNumeros()));

    }

}