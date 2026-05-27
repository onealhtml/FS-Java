public class Arvore extends Planta {

    public Arvore() {
        super();
    }

    public Arvore(String nome, double altura, String especie) {
        super(nome, altura, especie);
    }

    @Override
    public void crescer() {
        setAltura(getAltura() + 50);
    }

    @Override
    public void obterEnergia() {
        System.out.println("Árvore " + getNome() + " faz fotossíntese por meio das folhas.");
    }
}
