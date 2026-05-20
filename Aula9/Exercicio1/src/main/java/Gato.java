public class Gato extends Mamifero {
    private boolean adoraCaixas;

    public Gato(String nome, int idade, String corPelo, boolean adoraCaixas) {
        super(nome, idade, corPelo);
        this.adoraCaixas = adoraCaixas;
    }

    public void ronronar() {
        System.out.println(getNome() + " está ronronando.");
    }

    @Override
    public void emitirSom() {
        System.out.println("O gato " + getNome() + " (" + getCorPelo() + ") diz: Miau!");
    }
}
