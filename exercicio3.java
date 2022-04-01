/*Faça um programa que receba 10 números inteiros, armazene-os e
verifique quais numeros são pares, e exiba para o usuário apenas os
números pares da lista.*/

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int listaNumeros[] = new int[10];

        for(int i = 0; i < listaNumeros.length; i++){
            int numero = i + 1;
            System.out.print("Digite o "+numero+"° número: ");
            listaNumeros[i] = leitor.nextInt();
        }
        System.out.println("NÚMEROS PARES \n");
        
        for(int i = 0; i < listaNumeros.length; i++){
            if(listaNumeros[i] % 2 == 0){
                System.out.println("O número "+listaNumeros[i]+" é par.");
            }
        }
    }
}
