public class Mamifero extends Animal {
    private String corPelo;

    public Mamifero(String nome, int idade, String corPelo) {
        super(nome, idade);
        this.corPelo = corPelo;
    }

    public String getCorPelo() {
        return corPelo;
    }

    @Override
    public void emitirSom() {
        System.out.println("O mamífero faz um som específico.");
    }
}