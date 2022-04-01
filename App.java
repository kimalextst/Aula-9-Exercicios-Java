public class App {
    public static void main(String[] args) {
        int vetorNumero[] = new int[5]; // vetor com 5 indíces

        vetorNumero[0] = 87; // vetor no indíce 0 terá valor 87
        vetorNumero[4] = 6; // vetor no indíce 4 terá valor 6

        for (int i = 0; i < vetorNumero.length; i++){
            System.out.println("Índice: " + i + " - valor: " + vetorNumero[i] + ".");
        }

    }
}
