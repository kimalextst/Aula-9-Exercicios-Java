//Faça um programa que leia 5 valores inteiros, armazene-os em um vetor, calcule e apresente a soma destes valores

public class exercicio1 {
    public static void main(String[] args){

        int numeros[] = new int[5];

        numeros[0] = 15;
        numeros[1] = 5;
        numeros[2] = 10;
        numeros[3] = 2;
        numeros[4] = 3;

        int soma = 0;
        for(int i = 0; i < numeros.length; i++){
            soma = soma + numeros[i];
        }

        System.out.println("A soma dos valores é "+soma);
    }
}