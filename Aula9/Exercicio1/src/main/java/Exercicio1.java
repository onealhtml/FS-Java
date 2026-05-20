public class Exercicio1 {
    public static void main(String[] args) {
        Gato meuGato = new Gato("Frajola", 3, "Preto e Branco", true);
        Vaca minhaVaca = new Vaca("Mimosa", 5, "Malhada", 12.5);
        Pato meuPato = new Pato("Donald", 4, "Branca", true);

        System.out.println("--- Testando o Gato ---");
        meuGato.emitirSom();
        meuGato.ronronar();

        System.out.println("\n--- Testando a Vaca ---");
        minhaVaca.emitirSom();
        minhaVaca.pastar();

        System.out.println("\n--- Testando o Pato ---");
        meuPato.emitirSom();
        meuPato.nadar();
    }
}
