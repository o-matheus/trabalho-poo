import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String nome;
    private String dataLancamento;
    private double orcamento;
    private String descricao;
    private Diretor diretor = new Diretor();
    private List<Ator> listAtores = new ArrayList<>();

    public Filme(){}

    public Filme(String dataLancamento, String nome, double orcamento, String descricao) {
        this.dataLancamento = dataLancamento;
        this.nome = nome;
        this.orcamento = orcamento;
        this.descricao = descricao;
    }

    public Filme(String dataLancamento, String nome, double orcamento, String descricao, Diretor diretor, List<Ator> listAtores) {
        this.nome = nome;
        this.dataLancamento = dataLancamento;
        this.orcamento = orcamento;
        this.descricao = descricao;
        this.diretor = diretor;
        this.listAtores = listAtores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Ator> getListAtores() {
        return listAtores;
    }

    public void setListAtores(List<Ator> listAtores) {
        this.listAtores = listAtores;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    //David
    public void cadastrarAtores(Ator ator){
        listAtores.add(ator);
    }

    @Override
    public String toString() {

        if(listAtores.isEmpty()) {
            return String.format(
                    Main.AZUL + "\nTítulo: " + Main.AMARELO + "%s\n" + Main.AZUL + "Data de lançamento: " + Main.AMARELO +
                            "%s\n" + Main.AZUL + "Orçamento: " + Main.AMARELO + "R$ %.2f\n" + Main.AZUL + "Descrição: " + Main.AMARELO +
                            "%s\n" + Main.AZUL + "Diretor: " + Main.AMARELO + "%s\n" + Main.AZUL + "Atores: " + Main.AMARELO + "Não cadastrados",
                    nome, dataLancamento, orcamento, descricao, diretor.getNome());
        }

        String atoresNomes = listAtores.stream()
                .map(Ator::getNome)
                .collect(java.util.stream.Collectors.joining(", "));

        return String.format(
                Main.AZUL + "\nTítulo: " + Main.AMARELO + "%s\n" + Main.AZUL + "Data de lançamento: " + Main.AMARELO +
                "%s\n" + Main.AZUL + "Orçamento: " + Main.AMARELO + "R$ %.2f\n" + Main.AZUL + "Descrição: " + Main.AMARELO +
                "%s\n" + Main.AZUL + "Diretor: " + Main.AMARELO + "%s\n" + Main.AZUL + "Atores: " + Main.AMARELO + "%s",
                nome, dataLancamento, orcamento, descricao, diretor.getNome(), atoresNomes
        );
    }
}
