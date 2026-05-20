public class Ave extends Animal {
    private String corPena;

    public Ave(String nome, int idade, String corPena) {
        super(nome, idade);
        this.corPena = corPena;
    }

    public String getCorPena() {
        return corPena;
    }

    @Override
    public void emitirSom() {
        System.out.println("A ave faz um som característico.");
    }
}

