import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int opcao=0;
        Scanner sc= new Scanner(System.in);
        do{
                    //chamando o menu pra tela
                    imprimirMenu();
                    opcao= sc.nextInt();
            switch (opcao) {
                case 1: //Cadastrar Filme
                    break;
                case 2: //Cadastrar Diretor
                    break;
                case 3: //Cadastrar Ator
                    break;
                case 4: //Associar Filmes com Diretore ou Atores
                    break;
                case 5: //Pesquisar Filme
                    break;
                case 6: // Sair
                    System.out.print("\n Finalizando o Sistema...");
                    break;
                default:
                    System.out.print("\nA Opção Selecionada é Inválida tente outra!");
                    break;
            }
        }while (opcao!=6);
    }

    public static void imprimirMenu(){

        // Cores ANSI
        String RESET = "\u001B[0m";
        String AMARELO  = "\u001B[33m";
        String AZUL = "\u001B[34m";

        // Imprimindo o Menu
        System.out.println(AMARELO + "+------------------------------------------+" + RESET);
        System.out.println(AMARELO + "| >>>>>>>>>>>>>>>>> MENU <<<<<<<<<<<<<<<<< |" + RESET);
        System.out.println(AMARELO + "+------------------------------------------+" + RESET);

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

}
