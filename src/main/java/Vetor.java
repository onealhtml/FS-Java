import java.util.Scanner;

public class Vetor {
    int N;
    float[] numeros;
    float maiorValor, menorValor, media;

    public void leDados() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor:");
        N = sc.nextInt();
        numeros = new float[N];
    }

    public void preencherVetor() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < N; i++) {
            System.out.println("Digite o valor do vetor na posição " + i + " :");
            numeros[i] = sc.nextFloat();
        }
    }

    public void calculaVetor() {
        maiorValor = numeros[0];
        menorValor = numeros[0];
        float soma = numeros[0];

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
    }
}
