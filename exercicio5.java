/*Faça um programa que permita que o usuário digite o nome de uma
banda musical e insira o nome de 3 músicas dessa banda, as músicas
deverão ser armazenadas e no final o programa deverá mostrar a
seguinte mensagem:

NomeDaBanda

Musica1
Musica2
Musica3*/

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o nome da banda: ");
        String nomeBanda = leitor.nextLine();

        String[] listaDeMusicas = new String[3];

        for(int i = 0 ; i < listaDeMusicas.length; i++){
            if(i < 1){
                System.out.print("Digite o nome de uma música dessa banda: ");
                listaDeMusicas[i] = leitor.nextLine();
            }
            else{
                System.out.print("Digite o nome de outra música dessa banda: ");
                listaDeMusicas[i] = leitor.nextLine();
            }
        }
        System.out.print("\n"+nomeBanda+"\n \n");

        for(int i = 0 ; i < listaDeMusicas.length; i++){
            System.out.println(listaDeMusicas[i]);
        }
    }
}
