public class Pato extends Ave {
    private boolean nadaBem;

    public Pato(String nome, int idade, String corPena, boolean nadaBem) {
        super(nome, idade, corPena);
        this.nadaBem = nadaBem;
    }

    public void nadar() {
        if (nadaBem) {
            System.out.println(getNome() + " está nadando rapidamente.");
        } else {
            System.out.println(getNome() + " não sabe nadar muito bem.");
        }
    }

    @Override
    public void emitirSom() {
        System.out.println("O pato " + getNome() + " diz: Quack quack! E chama o super:");
        super.emitirSom();
    }
}

