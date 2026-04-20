import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
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
                System.out.println("Erro: Digite um número!");
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
                        System.out.println("Filme não encontrado");
                    }

                    break;
                case 6: // Sair - Nicole
                    System.out.print("\n Finalizando o Sistema...");
                    break;
                case 7: //Mateus
                    for (Diretor d : listaDiretor) {
                        System.out.println(d.getNome());
                    }
                    break;
                case 8: // Nicole
                    for (Ator a : listaAtor) {
                        System.out.println(a.getNome());
                    }
                    break;
                case 9: // Bruna
                    for (Filme f : listaFilme) {
                        System.out.println(f);
                    }
                    break;
                case 10: //Buscar ator
                    int index1 = buscarAtor(listaAtor, sc);
                    if (index1 >= 0) {
                        System.out.println(listaAtor.get(index1));
                    } else {
                        System.out.println("Ator não encontrado");
                    }
                    break;
                case 11: //Buscar diretor
                    int index2 = buscarDiretor(listaDiretor, sc);
                    if (index2 >= 0) {
                        System.out.println(listaDiretor.get(index2));
                    } else {
                        System.out.println("Diretor não encontrado");
                    }
                    break;
                default:
                    System.out.print("\nA Opção Selecionada é Inválida tente outra!");
                    break;
            }
        } while (opcao != 6);
    }

    //David
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
        System.out.println(AMARELO + "|" + AZUL + " 10 ➤ Pesquisar Ator                     " + AMARELO + "|" + RESET);
        System.out.println(AMARELO + "|" + AZUL + " 11 ➤ Pesquisar Diretor                     " + AMARELO + "|" + RESET);
        System.out.println(AMARELO + "|" + AZUL + " 6 ➤ Sair                                " + AMARELO + "|" + RESET);

        System.out.println(AMARELO + "+------------------------------------------+" + RESET);
        System.out.println();
        System.out.print(AMARELO + "Digite uma das opções acima: " + RESET);
    }

    // Matheus
    public static void cadastrarDiretor(Scanner sc, List<Diretor> diretores) {
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
        diretores.add(new Diretor(nome, nacionalidade, idade));
    }

    public static void cadastrarAtor(Scanner sc, List<Ator> atores) { // Nicole
        System.out.print("Digite o nome do ator: ");
        String nome = sc.nextLine();
        System.out.print("Digite a nacionaidade do ator: ");
        String nacionalidade = sc.nextLine();
        int idade = 0;
        do {
            System.out.print("Digite a idade do ator: ");
            try {
                idade = sc.nextInt();
                sc.nextLine();
                validarIdade(idade, 0);

            } catch (InputMismatchException e) {
                System.out.println("Erro: valor da idade deve ser um inteiro");
                sc.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        } while (idade < 0);
        System.out.println("Ator cadastrado com sucesso!");
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
        System.out.print("Digite o título do filme: ");
        String nome = sc.nextLine();
        System.out.print("Digite a data de lançamento (mês/ano): ");
        String dataLancamento = sc.nextLine();
        double orcamento = 0;
        do {
            System.out.print("Digite o orçamento: ");
            try {
                orcamento = sc.nextDouble();
                sc.nextLine();
                validarOrcamento(orcamento);

            } catch (InputMismatchException e) {
                System.out.println("Erro: valor do orçamento deve ser um número");
                sc.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        } while (orcamento <= 0);

        System.out.print("Digite a descrição: ");
        String descricao = sc.nextLine();

        filme = new Filme(dataLancamento, nome, orcamento, descricao);
        filmes.add(filme);

        System.out.print("Quer adicionar diretor ou ator?\n 1 - Sim \n 2 - Não\n");
        int opcao = sc.nextInt();
        sc.nextLine();
        if (opcao == 1) {
            associarFuniconarios(filmes, atores, diretores, sc);
        }
        return filme;
    }

    public static void validarOrcamento(double orcamento) { //Bruna
        if (orcamento < 0) {
            throw new IllegalArgumentException("Orçamento não pode ser menor que zero \n");
        }
    }

    //David
    public static void associarFuniconarios(List<Filme> filmes, List<Ator> atores, List<Diretor> diretores, Scanner sc) {
        int index = buscarFilme(filmes, sc);
        if (index >= 0) {
            System.out.println("Filme encontrado");
            Filme filme = filmes.get(index);
            System.out.println("Deseja associar um diretor?\n 1 - Sim\n 2 - Não");
            int opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                int indexDiretor = buscarDiretor(diretores, sc);
                if (indexDiretor != -1) {
                    Diretor diretor = diretores.get(indexDiretor);
                    System.out.println("Diretor encontrado");
                    filme.setDiretor(diretor);
                    System.out.println("Diretor adicionado!");
                } else {
                    System.out.println("Diretor não encontrado. Deseja cadastrar um novo diretor?\n 1 - Sim\n 2 - Não");
                    opcao = sc.nextInt();
                    sc.nextLine();
                    if (opcao == 1) {
                        cadastrarDiretor(sc, diretores);
                        Diretor diretor2 = diretores.getLast();
                        filme.setDiretor(diretor2);
                        System.out.println("Diretor adicionado!");
                    }

                }
            }
            System.out.println("Deseja associar um Ator?\n 1 - Sim\n 2 - Não");
            opcao = sc.nextInt();
            sc.nextLine();
            do {
                if (opcao == 1) {
                    int indexAtor = buscarAtor(atores, sc);
                    if (indexAtor != -1) {
                        Ator ator = atores.get(indexAtor);
                        System.out.println("Ator encontrado");
                        filme.cadastrarAtores(ator);
                        System.out.println("Ator adicionado!");
                    } else {
                        System.out.println("Ator não encontrado. Deseja cadastrar um novo Ator?\n 1 - Sim\n 2 - Não");
                        opcao = sc.nextInt();
                        sc.nextLine();
                        if (opcao == 1) {
                            cadastrarAtor(sc,atores);
                            Ator ator2 = atores.getLast();
                            filme.cadastrarAtores(ator2);
                            System.out.println("Ator adicionado!");
                        }

                    }
                }
                System.out.println("Deseja associar um novo Ator?\n 1 - Sim\n 2 - Não");
                opcao = sc.nextInt();
                sc.nextLine();
            } while (opcao != 2);


        } else {
            System.out.println("filme não encontrado!");
        }

    }

    public static int buscarFilme(List<Filme> filmes, Scanner sc) {
        System.out.println("Digite o nome do filme");
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
        System.out.println("Digite o nome do ator");
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
        System.out.println("Digite o nome do diretor");
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
