public class Exercicio1 {

    public static void main(String[] args) {
        Animal[] animais = {
            new Cachorro("Rex", 3),
            new Cavalo("Trovão", 7),
            new Preguica("Lento", 2)
        };

        for (Animal animal : animais) {
            System.out.println("Animal: " + animal.getNome() + " | Idade: " + animal.getIdade());
            animal.emitirSom();
            System.out.println();
        }
    }
}
