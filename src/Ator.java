public class Ator extends Pessoa{

    private final String cargo = "ATOR";

    public Ator(String nome, String nacionalidade, int idade) {
        super(nome, nacionalidade, idade);
    }

    public Ator() {
    }

    public String getCargo() {
        return cargo;
    }



    @Override
    public String toString() {
        return String.format("Nome: %s, Cargo: %s, Idade: %d, Nacionalidade: %s", getNome(), cargo, getIdade(), getNacionalidade());
    }
}
