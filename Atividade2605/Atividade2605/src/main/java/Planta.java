public abstract class Planta {

    private String nome;
    private double altura;
    private String especie;

    public Planta() {
        setNome("Sem nome");
        setAltura(0);
        setEspecie("DESCONHECIDA");
    }

    public Planta(String nome, double altura, String especie) {
        setNome(nome);
        setAltura(altura);
        setEspecie(especie);
    }

    public abstract void crescer();

    public abstract void obterEnergia();

    public void exibirInfo() {
        System.out.println("Nome: " + nome + " | Espécie: " + especie + " | Altura: " + altura + " cm");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        if (especie == null) {
            System.out.println("Erro: espécie nula. Definida como DESCONHECIDA.");
            this.especie = Enum_especies.DESCONHECIDA.name();
            return;
        }
        for (Enum_especies e : Enum_especies.values()) {
            if (e.name().equalsIgnoreCase(especie)) {
                this.especie = e.name();
                return;
            }
        }
        System.out.println("Erro: espécie '" + especie + "' inválida. Definida como DESCONHECIDA.");
        this.especie = Enum_especies.DESCONHECIDA.name();
    }
}
