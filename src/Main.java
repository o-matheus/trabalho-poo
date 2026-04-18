import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Diretor> listaDiretor = new ArrayList<>();
        ArrayList<Diretor> listaAtpr = new ArrayList<>();
        ArrayList<Diretor> listaFilme = new ArrayList<>();

        int opcao = 0;
        Scanner sc = new Scanner(System.in);
        do {
            //chamando o menu pra tela
            imprimirMenu();
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1: //Cadastrar Filme - Bruna
                    break;
                case 2: //Cadastrar Diretor - Matheus
                    Diretor diretor = cadastrarDiretor(sc);
                    listaFilme.add(diretor);

                    break;
                case 3: //Cadastrar Ator - Nicole
                    break;
                case 4: //Associar Filmes com Diretor e ou Atores - David
                    break;
                case 5: //Pesquisar Filme - Matheus
                    break;
                case 6: // Sair
                    System.out.print("\n Finalizando o Sistema...");
                    break;
                case 7:
                    for (Diretor d : listaFilme) {
                        System.out.println(d.getNome());
                    }
                    break;
                default:
                    System.out.print("\nA Opção Selecionada é Inválida tente outra!");
                    break;
            }
        } while (opcao != 6);
    }

    public static void imprimirMenu() {

        // Cores ANSI
        String RESET = "\u001B[0m";
        String AMARELO = "\u001B[33m";
        String AZUL = "\u001B[34m";

        // Imprimindo o Menu
        System.out.println(AMARELO + "+------------------------------------------+" + RESET);
        System.out.println(AMARELO + "| >>>>>>>>>>>>>>>>> MENU <<<<<<<<<<<<<<<<< |" + RESET);
        System.out.println(AMARELO + "+------------------------------------------+" + RESET);
        // Comentário com o nome da pessoa que fez ;)
        System.out.println(AMARELO + "|" + AZUL + " 1 ➤ Cadastrar Filme                     " + AMARELO + "|" + RESET);
        System.out.println(AMARELO + "|" + AZUL + " 2 ➤ Cadastrar Diretor                   " + AMARELO + "|" + RESET);
        System.out.println(AMARELO + "|" + AZUL + " 3 ➤ Cadastrar Ator                      " + AMARELO + "|" + RESET);
        System.out.println(AMARELO + "|" + AZUL + " 4 ➤ Associar Filmes                     " + AMARELO + "|" + RESET);
        System.out.println(AMARELO + "|" + AZUL + " 5 ➤ Pesquisar Filme                     " + AMARELO + "|" + RESET);
        System.out.println(AMARELO + "|" + AZUL + " 6 ➤ Sair                                " + AMARELO + "|" + RESET);

        System.out.println(AMARELO + "+------------------------------------------+" + RESET);
        System.out.println();
        System.out.print(AMARELO + "Digite uma das opções acima: " + RESET);
    }

    // Matheus
    public static Diretor cadastrarDiretor(Scanner sc) {
        System.out.print("Digite o nome do diretor: ");
        String nome = sc.nextLine();
        System.out.print("Digite a nacionaidade do diretor: ");
        String nacionalidade = sc.nextLine();
        int idade = 0;
        do {
            System.out.print("Digite a idade do diretor: ");
            try {
                idade = sc.nextInt();
                sc.nextLine();
                validarIdade(idade, 12);

            } catch (InputMismatchException e) {
                System.out.println("Erro: valor da idade deve ser um inteiro");
                sc.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        } while (idade < 12);
        System.out.println("Diretor cadastrado com sucesso!");
        return new Diretor(nome, nacionalidade, idade);
    }

    public static void validarIdade(int idade, int idadeCorte) {
        if (idade < idadeCorte) {
            throw new IllegalArgumentException("Idade mínima " + idadeCorte + " ano(s) \n");
        }
    }

}
