public class Exercicio3 {
    public static void main(String[] args) {
        var conta1 = new Conta("João Silva", "123.456.789-00");
        conta1.depositar(1000);
        conta1.sacar(200);
        conta1.mostrarDados();

        System.out.println("\n--- Separador ---\n");

        var conta2 = new Conta("Maria Santos", "987.654.321-00");
        conta2.depositar(500);
        conta2.sacar(100);
        conta2.mostrarDados();

        System.out.println("\n--- Separador ---\n");

        var conta3 = new Conta("Paulo Colado", "987.654.321-01");
        conta3.sacar(1000);
        conta3.mostrarDados();
        
    }
}