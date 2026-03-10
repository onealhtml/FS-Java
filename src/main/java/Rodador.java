import java.util.Scanner;

public class Rodador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = sc.next();
        int idade = sc.nextInt();

        // cria o objeto passando nome e idade
        nomeIdade p = new nomeIdade(nome, idade);

        // chama o método no objeto
        p.processo();
    }
}
