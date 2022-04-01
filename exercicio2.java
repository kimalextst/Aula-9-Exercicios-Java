import java.util.Scanner;

//Faça um programa de lista de chamada que armazene o nome de 10 alunos e apresente a lista completa para o usuário

public class exercicio2 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        String[] listaDeChamada = new String[10];

        for(int i = 0; i < listaDeChamada.length; i++){
            int numeroAlunos = i + 1;
            System.out.print("Digite o nome do "+numeroAlunos+"° aluno: ");
            listaDeChamada[i] = leitor.nextLine();
        }

        System.out.println("LISTA DE CHAMADA \n");

        for(int i = 0; i < listaDeChamada.length; i++){
            int numeroAlunos = i + 1;
            System.out.println("Aluno "+numeroAlunos+": "+listaDeChamada[i]);
        }
    }
    
}
