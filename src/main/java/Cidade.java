public class Cidade {
    private String nome;
    private int populacao;
    private String siglaestado;
    private float area;

    public Cidade(String nome, int populacao, String siglaestado, float area) {
        setNome(nome);
        setPopulacao(populacao);
        setSiglaestado(siglaestado);
        setArea(area);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido.");
        }
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        if (populacao >= 0) {
            this.populacao = populacao;
        } else {
            System.out.println("População inválida.");
        }
    }

    public String getSiglaestado() {
        return siglaestado;
    }

    public void setSiglaestado(String siglaestado) {
        if (siglaestado != null && siglaestado.trim().length() == 2) {
            this.siglaestado = siglaestado.toUpperCase();
        } else {
            System.out.println("Sigla de estado inválida.");
        }
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        if (area > 0) {
            this.area = area;
        } else {
            System.out.println("Área inválida.");
        }
    }
}
