import java.util.Scanner;

public class exemploentradadedados {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Quantos números você quer inserir? ");
        int qntdNumeros = leitor.nextInt();

        int listaNumeros[] = new int[qntdNumeros];

        for(int i = 0; i < listaNumeros.length; i++){
            System.out.print("Qual o valor que será inserido no vetor na posição "+i+": ");
            int numero = leitor.nextInt();
            listaNumeros[i] = numero;
        }

        for(int i = 0; i < listaNumeros.length; i++){
            System.out.println("Posição "+i+" - valor: "+listaNumeros[i]);
        }
    }
}
