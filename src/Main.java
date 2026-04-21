import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    // Cores ANSI
    public static final String RESET = "\u001B[0m";
    public static final String AMARELO = "\u001B[33m";
    public static final String AZUL = "\u001B[34m";
    public static final String VERMELHO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";

    public static void main(String[] args) {
        List<Diretor> listaDiretor = DadosMock.carregarDiretores();
        List<Ator> listaAtor = DadosMock.carregarAtores();
        List<Filme> listaFilme = DadosMock.carregarFilmes();

        int opcao=0;
        Scanner sc = new Scanner(System.in);
        do {
            try {//Nicole
                imprimirMenu();
                opcao = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println(VERMELHO + "Erro: Digite um número!" + RESET);
                sc.nextLine(); // limpa o buffer
                continue; // volta pro início do loop
            }
            switch (opcao) {
                case 1: //Cadastrar Filme - Bruna
                    Filme filme = cadastrarFilme(sc,listaFilme,listaAtor, listaDiretor);
                    break;
                case 2: //Cadastrar Diretor - Matheus
                    cadastrarDiretor(sc, listaDiretor);
                    break;
                case 3: //Cadastrar Ator - Nicole
                    cadastrarAtor(sc, listaAtor);
                    break;
                case 4: //Associar Filmes com Diretor e ou Atores - David
                    associarFuniconarios(listaFilme, listaAtor, listaDiretor, sc);
                    break;
                case 5: //Pesquisar Filme - Matheus
                    int index = buscarFilme(listaFilme, sc);
                    if (index >= 0) {
                        System.out.println(listaFilme.get(index));
                    } else {
                        System.out.println(VERMELHO + "Filme não encontrado!" + RESET);
                    }
                    break;
                case 6: // Sair - Nicole
                    int index1 = buscarAtor(listaAtor, sc);
                    if (index1 >= 0) {
                        System.out.println(listaAtor.get(index1));
                    } else {
                        System.out.println(VERMELHO + "Ator não encontrado" + RESET);
                    }
                    break;
                case 7: //Mateus
                    int index2 = buscarDiretor(listaDiretor, sc);
                    if (index2 >= 0) {
                        System.out.println(listaDiretor.get(index2));
                    } else {
                        System.out.println(VERMELHO + "Diretor não encontrado" + RESET);
                    }
                    break;
                case 8: // Nicole
                    System.out.print(AZUL + "\nFinalizando o Sistema..." + RESET);
                    break;
                default:
                    System.out.print(VERMELHO + "\nA opção selecionada é inválida tente outra!" + RESET);
                    break;
            }
        } while (opcao != 8);
    }

    //David
    public static void imprimirMenu() {

        // Imprimindo o Menu
        System.out.println();
        System.out.println(AMARELO + "+------------------------------------------+" + RESET);
        System.out.println(AMARELO + "| >>>>>>>>>>>>>>>>> MENU <<<<<<<<<<<<<<<<< |" + RESET);
        System.out.println(AMARELO + "+------------------------------------------+" + RESET);

        System.out.println(AMARELO + "|" + AZUL + " 1 ➤ Cadastrar Filme                     " + AMARELO + "|" + RESET);
        System.out.println(AMARELO + "|" + AZUL + " 2 ➤ Cadastrar Diretor                   " + AMARELO + "|" + RESET);
        System.out.println(AMARELO + "|" + AZUL + " 3 ➤ Cadastrar Ator                      " + AMARELO + "|" + RESET);
        System.out.println(AMARELO + "|" + AZUL + " 4 ➤ Associar Filmes                     " + AMARELO + "|" + RESET);
        System.out.println(AMARELO + "|" + AZUL + " 5 ➤ Pesquisar Filme                     " + AMARELO + "|" + RESET);
        System.out.println(AMARELO + "|" + AZUL + " 6 ➤ Pesquisar Ator                      " + AMARELO + "|" + RESET);
        System.out.println(AMARELO + "|" + AZUL + " 7 ➤ Pesquisar Diretor                   " + AMARELO + "|" + RESET);
        System.out.println(AMARELO + "|" + AZUL + " 8 ➤ Sair                                " + AMARELO + "|" + RESET);

        System.out.println(AMARELO + "+------------------------------------------+" + RESET);
        System.out.println();
        System.out.print(AMARELO + "Digite uma das opções acima " + AZUL + "(1 a 8): " + RESET);
    }

    // Matheus
    public static void cadastrarDiretor(Scanner sc, List<Diretor> diretores) {
        System.out.print(AZUL + "\nDigite o nome do diretor: " + RESET);
        String nome = sc.nextLine();
        System.out.print(AZUL + "\nDigite a nacionalidade do diretor: " + RESET);
        String nacionalidade = sc.nextLine();
        int idade = 0;
        do {
            System.out.print(AZUL + "\nDigite a idade do diretor: " + RESET);
            try {
                idade = sc.nextInt();
                sc.nextLine();
                validarIdade(idade, 12);

            } catch (InputMismatchException e) {
                System.out.println(VERMELHO + "\nErro: valor da idade deve ser um inteiro" + RESET);
                sc.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println(VERMELHO + "\nErro: " + e.getMessage() + RESET);
            }
        } while (idade < 12);
        System.out.println(VERDE + "\nDiretor cadastrado com sucesso!" + RESET);
        diretores.add(new Diretor(nome, nacionalidade, idade));
    }

    public static void cadastrarAtor(Scanner sc, List<Ator> atores) { // Nicole
        System.out.print(AZUL + "\nDigite o nome do ator: " + RESET);
        String nome = sc.nextLine();
        System.out.print(AZUL + "\nDigite a nacionaidade do ator: " + RESET);
        String nacionalidade = sc.nextLine();
        int idade = 0;
        do {
            System.out.print(AZUL + "\nDigite a idade do ator: " + RESET);
            try {
                idade = sc.nextInt();
                sc.nextLine();
                validarIdade(idade, 0);

            } catch (InputMismatchException e) {
                System.out.println(VERMELHO + "\nErro: valor da idade deve ser um inteiro" + RESET);
                sc.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println(VERMELHO + "\nErro: " + e.getMessage() + RESET);
            }
        } while (idade < 0);
        System.out.println(VERDE + "\nAtor cadastrado com sucesso!" + RESET);
        atores.add(new Ator(nome, nacionalidade, idade));
    }

    public static void validarIdade(int idade, int idadeCorte) { //Matheus
        if (idade < idadeCorte) {
            throw new IllegalArgumentException("Idade mínima " + idadeCorte + " ano(s) \n");
        } else if (idade >= 123) { // Nicole
            throw new IllegalArgumentException("Idade máxima 123 ano(s) \n");
        }
    }

    public static Filme cadastrarFilme(Scanner sc, List<Filme> filmes, List<Ator> atores, List<Diretor> diretores) { // Bruna
        Filme filme;
        System.out.print(AZUL + "\nDigite o título do filme: " + RESET);
        String nome = sc.nextLine();
        System.out.print(AZUL + "\nDigite a data de lançamento " + AMARELO + "(mês/ano): " + RESET);
        String dataLancamento = sc.nextLine();
        double orcamento = 0;
        do {
            System.out.print(AZUL + "\nDigite o orçamento: " + RESET);
            try {
                orcamento = sc.nextDouble();
                sc.nextLine();
                validarOrcamento(orcamento);

            } catch (InputMismatchException e) {
                System.out.println(VERMELHO + "\nErro: valor do orçamento deve ser um número" + RESET);
                sc.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println(VERMELHO + "Erro: " + e.getMessage() + RESET);
            }
        } while (orcamento <= 0);

        System.out.print(AZUL + "\nDigite a descrição: " + RESET);
        String descricao = sc.nextLine();

        filme = new Filme(dataLancamento, nome, orcamento, descricao);
        filmes.add(filme);

        System.out.print(AZUL + "\nQuer adicionar diretor ou ator?\n" + AMARELO + "1 ➤ Sim \n2 ➤ Não\n" + RESET);
        int opcao = sc.nextInt();
        sc.nextLine();
        if (opcao == 1) {
            associarFuniconarios(filmes, atores, diretores, sc);
        }
        return filme;
    }

    public static void validarOrcamento(double orcamento) { //Bruna
        if (orcamento < 0) {
            throw new IllegalArgumentException("Orçamento não pode ser menor que zero!");
        }
    }

    //David
    public static void associarFuniconarios(List<Filme> filmes, List<Ator> atores, List<Diretor> diretores, Scanner sc) {
        int index = buscarFilme(filmes, sc);
        if (index >= 0) {
            System.out.println(VERDE + "\nFilme encontrado!" + RESET);
            Filme filme = filmes.get(index);
            System.out.println(AZUL + "\nDeseja associar um diretor?\n" + AMARELO + "1 ➤ Sim\n2 ➤ Não\n" + RESET);
            int opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                int indexDiretor = buscarDiretor(diretores, sc);
                if (indexDiretor != -1) {
                    Diretor diretor = diretores.get(indexDiretor);
                    System.out.println(VERDE + "\nDiretor encontrado!" + RESET);
                    filme.setDiretor(diretor);
                    System.out.println(VERDE + "\nDiretor adicionado!" + RESET);
                } else {
                    System.out.println(AZUL + "\nDiretor não encontrado. Deseja cadastrar um novo diretor?\n" + AMARELO + "1 ➤ Sim\n2 ➤ Não" + RESET);
                    opcao = sc.nextInt();
                    sc.nextLine();
                    if (opcao == 1) {
                        cadastrarDiretor(sc, diretores);
                        Diretor diretor2 = diretores.getLast();
                        filme.setDiretor(diretor2);
                        System.out.println(VERDE + "\nDiretor adicionado!" + RESET);
                    }

                }
            }
            System.out.println(AZUL + "\nDeseja associar um Ator?\n" + AMARELO + "1 ➤ Sim\n2 ➤ Não" + RESET);
            opcao = sc.nextInt();
            sc.nextLine();
            do {
                if (opcao == 1) {
                    int indexAtor = buscarAtor(atores, sc);
                    if (indexAtor != -1) {
                        Ator ator = atores.get(indexAtor);
                        System.out.println(VERDE + "\nAtor encontrado!" + RESET);
                        filme.cadastrarAtores(ator);
                        System.out.println(VERDE + "Ator adicionado!" + RESET);
                    } else {
                        System.out.println(AZUL + "\nAtor não encontrado. Deseja cadastrar um novo Ator?\n" + AMARELO + "1 ➤ Sim\n2 ➤ Não" + RESET);
                        opcao = sc.nextInt();
                        sc.nextLine();
                        if (opcao == 1) {
                            cadastrarAtor(sc,atores);
                            Ator ator2 = atores.getLast();
                            filme.cadastrarAtores(ator2);
                            System.out.println(VERDE + "\nAtor adicionado!" + RESET);
                        }

                    }
                }
                System.out.println(AZUL + "\nDeseja associar um novo Ator?\n" + AMARELO + "1 ➤ Sim\n2 ➤ Não" + RESET);
                opcao = sc.nextInt();
                sc.nextLine();
            } while (opcao != 2);


        } else {
            System.out.println(VERMELHO + "\nfilme não encontrado!" + RESET);
        }

    }

    public static int buscarFilme(List<Filme> filmes, Scanner sc) {
        System.out.print(AZUL + "\nDigite o nome do filme: " + RESET);
        String filmePesquisado = sc.nextLine();
        int i = 0;
        for (Filme f : filmes) {
            if (f.getNome().equalsIgnoreCase(filmePesquisado)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int buscarAtor(List<Ator> atores, Scanner sc) {
        System.out.print(AZUL + "\nDigite o nome do ator: " + RESET);
        String termoPesquisado = sc.nextLine();
        int i = 0;
        for (Ator a : atores) {
            if (a.getNome().equalsIgnoreCase(termoPesquisado)) {
                return i;
            }
            i++;
        }
        return -1;
    }


    public static int buscarDiretor(List<Diretor> diretores, Scanner sc) {
        System.out.print(AZUL + "\nDigite o nome do diretor: " + RESET);
        String termoPesquisado = sc.nextLine();
        int i = 0;
        for (Diretor d : diretores) {
            if (d.getNome().equalsIgnoreCase(termoPesquisado)) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
