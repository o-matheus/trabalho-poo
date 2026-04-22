import java.util.ArrayList;
import java.util.List;

public class DadosMock {
    private static Diretor teste = new Diretor("Joao", "brasileiro", 76);
    private static List<Ator> listaAtores2;

    static {
        listaAtores2 = new ArrayList<>();
        List<Ator> atoresDisponiveis = carregarAtores();
        listaAtores2.add(atoresDisponiveis.get(0)); // Nicole ferraz
        listaAtores2.add(atoresDisponiveis.get(1)); // Bruna
    }

    public static List<Ator> getListaAtores2() {
        return listaAtores2;
    }

    public static List<Filme> carregarFilmes() {
        List<Filme> listaFilme = new ArrayList<>();
        listaFilme.add(new Filme("06/06", "Carros", 120000000.0, "Carros falantes em alta velocidade!"));
        listaFilme.add(new Filme("12/09", "Avatar", 240000000.0, "Ficção científica de seres azuis."));
        listaFilme.add(new Filme("04/12", "Vingadores", 220000000.0, "Super-heróis lutando juntos contra o mal."));
        listaFilme.add(new Filme("12/97", "Titanic", 200000000.0, "Um naufrágio histórico."));
        listaFilme.add(new Filme("06/15", "Divertidamente", 175000000.0, "As emoções humanas personificadas.", teste, getListaAtores2()));
        listaFilme.add(new Filme("07/94", "O Rei Leão", 45000000.0, "Um filhote de leão cresce comendo insetos e derrota o seu tio."));
        listaFilme.add(new Filme("12/19", "Minha mãe é uma peça 3", 8000000.0, "Uma mãe ansiosa lida com a gravidez da filha e o casamento do filho.", teste, getListaAtores2()));
        return listaFilme;
    }

    public static List<Diretor> carregarDiretores() {
        List<Diretor> listaDiretor = new ArrayList<>();
        listaDiretor.add(new Diretor("Matheus", "brasileiro", 27));
        listaDiretor.add(new Diretor("Joao", "brasileiro", 76));
        listaDiretor.add(new Diretor("Maria", "brasileiro", 84));
        listaDiretor.add(new Diretor("Gilberto", "brasileiro", 66));
        listaDiretor.add(new Diretor("Regina", "brasileiro", 50));
                return listaDiretor;
    }

    public static List<Ator> carregarAtores() {
        List<Ator> listaAtores = new ArrayList<>();
        listaAtores.add(new Ator("Nicole ferraz", "portuguesa", 23));
        listaAtores.add(new Ator("Bruna", "brasileira", 26));
        listaAtores.add(new Ator("David", "brasileiro", 18));
        listaAtores.add(new Ator("Ana Joaquina", "brasileira", 30));
        listaAtores.add(new Ator("Orlando", "brasileiro", 45));
        listaAtores.add(new Ator("Eduarda", "brasileira", 10));
        listaAtores.add(new Ator("Guilherme", "brasileiro", 50));
        listaAtores.add(new Ator("Tais", "brasileira", 48));
        listaAtores.add(new Ator("Theo", "brasileiro", 16));
        listaAtores.add(new Ator("Joana", "brasileira", 58));
        listaAtores.add(new Ator("Felipe", "brasileiro", 29));

        return listaAtores;
    }

    
}
