public class Cacto extends Planta {

    public Cacto() {
        super();
    }

    public Cacto(String nome, double altura, String especie) {
        super(nome, altura, especie);
    }

    @Override
    public void crescer() {
        setAltura(getAltura() + 5);
    }

    @Override
    public void obterEnergia() {
        System.out.println("Cacto " + getNome() + " armazena água e tem fotossíntese reduzida.");
    }
}
