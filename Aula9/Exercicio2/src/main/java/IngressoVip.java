public class IngressoVip extends Ingresso {

    public enum Camarote {
        CAMAROTE_SUPERIOR,
        CAMAROTE_INFERIOR
    }

    private Camarote localizacao;

    public IngressoVip(double valor, Camarote localizacao) {
        super(valor);
        this.localizacao = localizacao;
    }

    public double getValorVip() {
        if (localizacao == Camarote.CAMAROTE_SUPERIOR) {
            return retornaValor() * 1.50; // Adicional de 50%
        } else if (localizacao == Camarote.CAMAROTE_INFERIOR) {
            return retornaValor() * 1.70; // Adicional de 70%
        }
        return retornaValor();
    }

    @Override
    public void imprimirValor() {
        System.out.println("Valor do ingresso VIP: R$ " + getValorVip());
    }

    @Override
    public String toString() {
        return "Ingresso VIP (" + localizacao + "), valor: R$ " + getValorVip();
    }
}
