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
        return String.format(
                Main.AZUL + "\nNome: " + Main.AMARELO + "%s\n" + Main.AZUL + "Cargo: " + Main.AMARELO +
                "%s\n" + Main.AZUL + "Idade: " + Main.AMARELO + "%d\n" + Main.AZUL + "Nacionalidade: "
                + Main.AMARELO + "%s", getNome(), cargo, getIdade(), getNacionalidade());
    }
}
