
import java.util.Scanner;

public class Conta {
    private String nome;
    private String cpf;
    private double saldo;

    Conta(){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome do conta: ");
        nome = input.next();
        System.out.print("\n");

        System.out.print("Digite o CPF do conta: ");
        cpf = input.next();
        System.out.print("\n");

        saldo = 0;
    }

    
}
