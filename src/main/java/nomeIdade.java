public class nomeIdade {

    String nome;
    int idade;

    // construtor: recebe os valores e guarda na classe
    public nomeIdade(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void processo() {
        if (idade <= 12) {
            System.out.println(nome + " é Criança");
        } else if (idade <= 17) {
            System.out.println(nome + " é Adolescente");
        } else {
            System.out.println(nome + " é Adulto");
        }
    }
}
