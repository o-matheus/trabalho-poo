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
        return String.format(
                Main.AZUL + "\nNome: " + Main.AMARELO + "%s\n" + Main.AZUL + "Cargo: " + Main.AMARELO +
                "%s\n" + Main.AZUL + "Idade: " + Main.AMARELO + "%d\n" + Main.AZUL + "Nacionalidade: "
                + Main.AMARELO + "%s", getNome(), cargo, getIdade(), getNacionalidade());
    }
}
