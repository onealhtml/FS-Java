import java.util.Scanner;

public class Aula5_cidades {
    private final Cidade[] listacidades;

    public Aula5_cidades(int tamanho) {
        listacidades = new Cidade[tamanho];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas cidades deseja cadastrar? ");
        int qtd = scanner.nextInt();
        scanner.nextLine();

        Aula5_cidades programa = new Aula5_cidades(qtd);

        for (int i = 0; i < qtd; i++) {
            System.out.println("\nCadastro da cidade " + (i + 1) + ":");
            
            String nome = "";
            while (nome.trim().isEmpty()) {
                System.out.print("Nome da cidade: ");
                nome = scanner.nextLine();
                if (nome.trim().isEmpty()) {
                    System.out.println("O nome não pode ser vazio.");
                }
            }

            int populacao = -1;
            while (populacao < 0) {
                System.out.print("População: ");
                if (scanner.hasNextInt()) {
                    populacao = scanner.nextInt();
                    if (populacao < 0) {
                        System.out.println("A população não pode ser negativa.");
                    }
                } else {
                    System.out.println("Por favor, digite um número inteiro.");
                    scanner.next();
                }
            }
            scanner.nextLine();

            String siglaestado = "";
            while (siglaestado.trim().length() != 2) {
                System.out.print("Sigla do Estado (2 letras): ");
                siglaestado = scanner.nextLine();
                if (siglaestado.trim().length() != 2) {
                    System.out.println("A sigla deve conter exatamente 2 letras.");
                }
            }

            float area = 0;
            while (area <= 0) {
                System.out.print("Área da cidade: ");
                if (scanner.hasNextFloat()) {
                    area = scanner.nextFloat();
                    if (area <= 0) {
                        System.out.println("A área deve ser maior que zero.");
                    }
                } else {
                    System.out.println("Por favor, digite um número válido (ex: 123.45).");
                    scanner.next();
                }
            }
            scanner.nextLine();

            programa.listacidades[i] = new Cidade(nome, populacao, siglaestado.toUpperCase(), area);
        }

        System.out.print("\nDigite a sigla do estado que deseja filtrar: ");
        String estadoFiltro = scanner.nextLine().toUpperCase();
        
        System.out.println("\n--- Cidades do estado " + estadoFiltro + " ---");
        boolean encontrou = false;
        long somaPopulacao = 0;
        Cidade cidadeMaiorPopulacao = null;

        for (int i = 0; i < qtd; i++) {
            Cidade c = programa.listacidades[i];
            
            somaPopulacao += c.getPopulacao();
            
            if (cidadeMaiorPopulacao == null || c.getPopulacao() > cidadeMaiorPopulacao.getPopulacao()) {
                cidadeMaiorPopulacao = c;
            }

            if (c.getSiglaestado() != null && c.getSiglaestado().equals(estadoFiltro)) {
                System.out.println("- " + c.getNome() + " (População: " + c.getPopulacao() + ")");
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhuma cidade encontrada para este estado.");
        }

        System.out.println("\n--- Relatório Final ---");
        System.out.println("Número total de cidades cadastradas: " + qtd);
        
        if (qtd > 0) {
            double mediaPopulacao = (double) somaPopulacao / qtd;
            System.out.println("População média: " + mediaPopulacao);
            System.out.println("Cidade com maior população: " + cidadeMaiorPopulacao.getNome() + " (População: " + cidadeMaiorPopulacao.getPopulacao() + ")");
        }

        scanner.close();
    }
}
