/*Faça um programa que receba de lista de compras sendo que o
usuário irá inserir a quantidade de itens que quer adicionar na lista
de compras e após inserir a quantidade o programa deverá permitir
que o usuário insira os produtos nessa lista. Exiba a lista completa
para o usuário.*/

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitor2 = new Scanner(System.in);

        System.out.print("Insira quantos itens deseja colocar na lista: ");
        int qntdItens = leitor.nextInt();

        String[] listaDeCompras = new String[qntdItens];

        for(int i = 0; i < listaDeCompras.length; i++){
            int numero = i + 1;
            System.out.print("Digite aqui o "+numero+"° item: ");
            listaDeCompras[i] = leitor2.nextLine(); 
        }

        System.out.println("LISTA DE COMPRAS\n");

        for(int i = 0; i < listaDeCompras.length; i++){
            int numero = i + 1;
            System.out.println("Item "+numero+": "+listaDeCompras[i]);
        }
    }
    
}
