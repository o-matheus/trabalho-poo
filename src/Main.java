import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class Main {
    public static void Main(String[] args){
        int opcao=0;
        Scanner sc= new Scanner(System.in);
        do{
            System.out.print("MENU\n 1- Cadastrar Filme\n 2- Cadastrar Diretor\n " +
                    "3- Cadastrar Ator\n 4- Associar filmes com Diretores ou Atores\n" +
                    "5- Pesquisar Filme\n 6- Sair");
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
}
