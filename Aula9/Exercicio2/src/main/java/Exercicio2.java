public class Exercicio2 {
    public static void main(String[] args) {
        Ingresso ingressoNormal = new IngressoNormal(50.0);
        Ingresso ingressoVIP = new IngressoVip(50.0, IngressoVip.Camarote.CAMAROTE_SUPERIOR);
        Ingresso ingressoVIP2 = new IngressoVip(50.0, IngressoVip.Camarote.CAMAROTE_INFERIOR);
        ingressoNormal.imprimirValor();
        ingressoVIP.imprimirValor();
        ingressoVIP2.imprimirValor();

        System.out.println(ingressoNormal);
        System.out.println(ingressoVIP);
        System.out.println(ingressoVIP2);
    }
}
