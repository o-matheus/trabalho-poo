import java.util.ArrayList;
import java.util.List;

public class DadosMock {

    public static List<Filme> carregarFilmes() {
        List<Filme> listaFilme = new ArrayList<>();
        listaFilme.add(new Filme("04/26", "carros", 13122.50, "testes de bruno"));
        listaFilme.add(new Filme("03/25", "motos", 1232.50, "testes de bruno"));
        listaFilme.add(new Filme("02/24", "barcos", 1122.50, "testes de bruno"));
        return listaFilme;
    }

    public static List<Diretor> carregarDiretores() {
        List<Diretor> listaDiretor = new ArrayList<>();
        listaDiretor.add(new Diretor("Matheus", "brasileiro", 27));
        listaDiretor.add(new Diretor("Joao", "brasileiro", 76));
        listaDiretor.add(new Diretor("Maria", "brasileiro", 84));
        return listaDiretor;
    }

    public static List<Ator> carregarAtores() {
        List<Ator> listaAtores = new ArrayList<>();
        listaAtores.add(new Ator("Nicole ferraz", "portuguesa", 20));
        listaAtores.add(new Ator("Bruna", "brasileira", 20));
        listaAtores.add(new Ator("David", "brasileiro", 20));

        return listaAtores;
    }

    
}
