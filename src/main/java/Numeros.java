import java.util.Scanner;

public class Numeros {
    private int N;
    private float[] numeros;
    private float maiorValor, menorValor, media, soma;

    public void leN() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        N = sc.nextInt();
        numeros = new float[N];
        System.out.print("\n");
    }

    public void preencherVetor() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < N; i++) {
            System.out.print("Digite o valor do vetor na posição " + i + ": ");
            numeros[i] = sc.nextFloat();
        }
        System.out.print("\n");
    }

    public void calculaVetor() {
        maiorValor = numeros[0];
        menorValor = numeros[0];
        soma = numeros[0];

        for (int i = 1; i < N; i++) {
            if (numeros[i] > maiorValor)
                maiorValor = numeros[i];
            if (numeros[i] < menorValor)
                menorValor = numeros[i];

            soma += numeros[i];
        }

        media = soma / N;
    }

    public void imprimeResultados() {
        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Menor valor: " + menorValor);
        System.out.println("Média: " + media);
        System.out.println("Soma: " + soma);
    }
}
