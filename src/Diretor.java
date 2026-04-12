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
        System.out.println(super.toString());
        return "Diretor{" +
                "cargo='" + cargo + '\'' +
                '}';
    }
}
