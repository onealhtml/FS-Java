public class Vaca extends Mamifero {
    private double producaoLeite;

    public Vaca(String nome, int idade, String corPelo, double producaoLeite) {
        super(nome, idade, corPelo);
        this.producaoLeite = producaoLeite;
    }

    public void pastar() {
        System.out.println(getNome() + " está pastando.");
    }

    @Override
    public void emitirSom() {
        System.out.println("A vaca " + getNome() + " de cor " + getCorPelo() + " diz: Muuuu!");
    }
}
