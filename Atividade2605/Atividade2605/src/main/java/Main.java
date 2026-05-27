import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Planta> plantas = new ArrayList<>();

        plantas.add(new Arvore("Carvalho do Parque", 200, "CARVALHO"));
        plantas.add(new Arvore("Pinheiro Velho", 350, "PINHEIRO"));
        plantas.add(new Arvore("Bambuzal", 150, "BAMBU"));

        plantas.add(new Erva("Hortelã do Quintal", 15, "HORTELA"));
        plantas.add(new Erva("Manjericão Doce", 25, "MANJERICAO"));
        plantas.add(new Erva("Rosa Vermelha", 40, "ROSA"));
        plantas.add(new Erva("Girassol Amarelo", 100, "GIRASSOL"));

        plantas.add(new Cacto("Cacto Gigante", 80, "CACTO_GIGANTE"));
        plantas.add(new Cacto("Mandacaru do Sertão", 200, "MANDACARU"));
        plantas.add(new Cacto("Suculenta da Janela", 12, "SUCULENTA"));

        System.out.println("=== Crescimento e informações de cada planta ===");
        for (Planta p : plantas) {
            p.crescer();
            p.exibirInfo();
            p.obterEnergia();
            System.out.println();
        }

        Scanner sc = new Scanner(System.in);
        String especieBusca = lerEspecieValida(sc);

        System.out.println("\n=== Plantas da espécie " + especieBusca + " ===");
        boolean achou = false;
        for (Planta p : plantas) {
            if (p.getEspecie().equalsIgnoreCase(especieBusca)) {
                p.exibirInfo();
                achou = true;
            }
        }
        if (!achou) {
            System.out.println("Nenhuma planta encontrada para a espécie informada.");
        }

        sc.close();
    }

    private static String lerEspecieValida(Scanner sc) {
        while (true) {
            System.out.print("\nInforme a espécie que deseja pesquisar: ");
            String entrada = sc.nextLine().trim();
            for (Enum_especies e : Enum_especies.values()) {
                if (e.name().equalsIgnoreCase(entrada)) {
                    return e.name();
                }
            }
            System.out.println("Espécie inválida! Espécies válidas:");
            for (Enum_especies e : Enum_especies.values()) {
                System.out.print(e.name() + "  ");
            }
            System.out.println();
        }
    }
}
