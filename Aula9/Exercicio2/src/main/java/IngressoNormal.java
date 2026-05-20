public class IngressoNormal extends Ingresso {
    public IngressoNormal(double valor) {
        super(valor);
    }

    @Override
    public void imprimirValor() {
        System.out.println("Valor do ingresso normal: R$ " + retornaValor());
    }

    @Override
    public String toString() {
        return "Ingresso Normal, valor: " + retornaValor();
    }
}
