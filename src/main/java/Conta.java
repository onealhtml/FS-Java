public class Conta {
    private final String nome;
    private final String cpf;
    private double saldo;

    public Conta(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = 0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado!");
        } else {
            System.out.println("Erro: Valor deve ser superior a 0");
        }
    }

    public void sacar(double valor) {
        if (valor > 0) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado!");
        } else {
            System.out.println("Erro: Valor deve ser superior a 0");
        }
    }

    public void mostrarDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Saldo atual: " + this.saldo);
    }
}
