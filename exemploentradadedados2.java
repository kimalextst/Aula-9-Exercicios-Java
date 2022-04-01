import java.util.Scanner;

public class exemploentradadedados2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Quantos nomes você quer inserir? ");
        int qntdNomes = leitor.nextInt();

        String[] listaNomes = new String[qntdNomes];

        for(int i = 0; i < listaNomes.length; i++){
            System.out.print("Digite o nome na posição "+i+": ");
            listaNomes[i] = leitor.next();
        }

        for(int i = 0; i < listaNomes.length; i++){
            System.out.println("Nome na posição "+i+" é: "+listaNomes[i]);
        }
    }
}

