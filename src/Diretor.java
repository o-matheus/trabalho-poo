public class Diretor extends Pessoa{

    private final String cargo = "DIRETOR";


    public Diretor(String nome, String nacionalidade, int idade) {
        super(nome, nacionalidade, idade);
    }

    public Diretor() {
    }

    public String getCargo() {
        return cargo;
    }



    //perguntar a prof pra definir esse metodo.
    @Override
    public String toString() {
        return String.format("Nome: %s, Cargo: %s, Idade: %d, Nacionalidade: %s", getNome(), cargo, getIdade(), getNacionalidade());
    }
}
