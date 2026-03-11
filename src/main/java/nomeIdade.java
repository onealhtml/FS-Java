import java.util.Scanner;

public class nomeIdade {

    String nome;
    int idade;

    public void processo() {
        if (idade <= 12) {
            System.out.println(nome + " é Criança");
        } else if (idade <= 17) {
            System.out.println(nome + " é Adolescente");
        } else {
            System.out.println(nome + " é Adulto");
        }
    }

    void leDados() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        nome = sc.next();

        System.out.println("Digite a idade: ");
        idade = sc.nextInt();
    }
}
