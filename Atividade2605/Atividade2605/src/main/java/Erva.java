public class Erva extends Planta {

    public Erva() {
        super();
    }

    public Erva(String nome, double altura, String especie) {
        super(nome, altura, especie);
    }

    @Override
    public void crescer() {
        setAltura(getAltura() + 20);
    }

    @Override
    public void obterEnergia() {
        System.out.println("Erva " + getNome() + " absorve nutrientes do solo.");
    }
}
