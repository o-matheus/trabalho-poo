public class Filme {
    private String nome;
    private String dataLancamento;
    private double orçamento;
    private String descricao;

    public Filme(){}

    public Filme(String dataLancamento, String nome, double orçamento, String descricao) {
        this.dataLancamento = dataLancamento;
        this.nome = nome;
        this.orçamento = orçamento;
        this.descricao = descricao;
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

    public double getOrçamento() {
        return orçamento;
    }

    public void setOrçamento(double orçamento) {
        this.orçamento = orçamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "nome='" + nome + '\'' +
                ", dataLancamento='" + dataLancamento + '\'' +
                ", orçamento=" + orçamento +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
